package typings.matrixBotSdk

import typings.chalk.mod.Chalk
import typings.matrixBotSdk.libLoggingIloggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLoggingRichConsoleLoggerMod {
  
  @JSImport("matrix-bot-sdk/lib/logging/RichConsoleLogger", "RichConsoleLogger")
  @js.native
  open class RichConsoleLogger ()
    extends StObject
       with ILogger {
    
    /* protected */ var chalkDebug: Chalk = js.native
    
    /* protected */ var chalkError: Chalk = js.native
    
    /* protected */ var chalkInfo: Chalk = js.native
    
    /* protected */ var chalkModule: Chalk = js.native
    
    /* protected */ var chalkTimestamp: Chalk = js.native
    
    /* protected */ var chalkWarning: Chalk = js.native
    
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
    
    /* protected */ def getTimestamp(): String = js.native
    
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
