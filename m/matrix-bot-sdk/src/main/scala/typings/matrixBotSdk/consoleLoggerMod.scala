package typings.matrixBotSdk

import typings.matrixBotSdk.iloggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLoggerMod {
  
  @JSImport("matrix-bot-sdk/lib/logging/ConsoleLogger", "ConsoleLogger")
  @js.native
  open class ConsoleLogger ()
    extends StObject
       with ILogger {
    
    /**
      * Logs to the DEBUG channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    /* CompleteClass */
    override def debug(module: String, messageOrObject: Any*): Any = js.native
    
    /**
      * Logs to the ERROR channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    /* CompleteClass */
    override def error(module: String, messageOrObject: Any*): Any = js.native
    
    /**
      * Logs to the INFO channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    /* CompleteClass */
    override def info(module: String, messageOrObject: Any*): Any = js.native
    
    /**
      * Logs to the TRACE channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    /* CompleteClass */
    override def trace(module: String, messageOrObject: Any*): Any = js.native
    
    /**
      * Logs to the WARN channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    /* CompleteClass */
    override def warn(module: String, messageOrObject: Any*): Any = js.native
  }
}
