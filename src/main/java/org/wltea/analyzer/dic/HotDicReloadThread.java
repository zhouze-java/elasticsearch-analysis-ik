package org.wltea.analyzer.dic;


import org.apache.logging.log4j.Logger;
import org.elasticsearch.common.logging.ESLoggerFactory;

/**
 * @author 周泽
 * @date Create in 10:31 2019/1/5
 * @Description
 */
public class HotDicReloadThread implements Runnable {

    private static final Logger logger = ESLoggerFactory.getLogger(HotDicReloadThread.class.getName());

    @Override
    public void run() {
        while (true){
            logger.info("-------reload hot dic from mysql--------");
            Dictionary.getSingleton().reLoadMainDict();
        }
    }
}
