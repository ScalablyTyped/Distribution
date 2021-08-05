package typings.logger

import typings.logger.loggerBooleans.`false`
import typings.logger.loggerStrings.debug
import typings.logger.loggerStrings.error
import typings.logger.loggerStrings.fatal
import typings.logger.loggerStrings.info
import typings.logger.loggerStrings.warn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("logger", "Logger")
  @js.native
  class Logger () extends StObject {
    def this(logFilePath: String) = this()
    
    def debug(args: String*): String | `false` = js.native
    @JSName("debug")
    var debug_Original: Args = js.native
    
    def error(args: String*): String | `false` = js.native
    @JSName("error")
    var error_Original: Args = js.native
    
    def fatal(args: String*): String | `false` = js.native
    @JSName("fatal")
    var fatal_Original: Args = js.native
    
    def format(level: LogLevel, data: String, message: String): String = js.native
    
    def info(args: String*): String | `false` = js.native
    @JSName("info")
    var info_Original: Args = js.native
    
    def log(level: LogLevel, args: String*): String | `false` = js.native
    
    def setLevel(level: LogLevel): Double | `false` = js.native
    
    def warn(args: String*): String | `false` = js.native
    @JSName("warn")
    var warn_Original: Args = js.native
  }
  object Logger {
    
    @JSImport("logger", "Logger.levels")
    @js.native
    val levels: js.Tuple5[fatal, error, warn, info, debug] = js.native
  }
  
  inline def createLogger(): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")().asInstanceOf[Logger]
  inline def createLogger(logFilePath: String): Logger = ^.asInstanceOf[js.Dynamic].applyDynamic("createLogger")(logFilePath.asInstanceOf[js.Any]).asInstanceOf[Logger]
  
  @js.native
  trait Args extends StObject {
    
    def apply(args: String*): String | `false` = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.logger.loggerStrings.fatal
    - typings.logger.loggerStrings.error
    - typings.logger.loggerStrings.warn
    - typings.logger.loggerStrings.info
    - typings.logger.loggerStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.logger.loggerStrings.debug = "debug".asInstanceOf[typings.logger.loggerStrings.debug]
    
    inline def error: typings.logger.loggerStrings.error = "error".asInstanceOf[typings.logger.loggerStrings.error]
    
    inline def fatal: typings.logger.loggerStrings.fatal = "fatal".asInstanceOf[typings.logger.loggerStrings.fatal]
    
    inline def info: typings.logger.loggerStrings.info = "info".asInstanceOf[typings.logger.loggerStrings.info]
    
    inline def warn: typings.logger.loggerStrings.warn = "warn".asInstanceOf[typings.logger.loggerStrings.warn]
  }
}
