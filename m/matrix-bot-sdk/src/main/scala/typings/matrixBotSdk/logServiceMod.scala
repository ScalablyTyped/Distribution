package typings.matrixBotSdk

import typings.matrixBotSdk.iloggerMod.ILogger
import typings.matrixBotSdk.matrixErrorMod.MatrixError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logServiceMod {
  
  @JSImport("matrix-bot-sdk/lib/logging/LogService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel")
  @js.native
  /* private */ open class LogLevel () extends StObject {
    
    def includes(level: LogLevel): Boolean = js.native
    
    /* private */ var level: Any = js.native
    
    /* private */ var sequence: Any = js.native
  }
  /* static members */
  object LogLevel {
    
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The DEBUG channel
      */
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel.DEBUG")
    @js.native
    val DEBUG: LogLevel = js.native
    
    /**
      * The ERROR channel
      */
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel.ERROR")
    @js.native
    val ERROR: LogLevel = js.native
    
    /**
      * The INFO channel
      */
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel.INFO")
    @js.native
    val INFO: LogLevel = js.native
    
    /**
      * The TRACE channel
      */
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel.TRACE")
    @js.native
    val TRACE: LogLevel = js.native
    
    /**
      * The WARN channel
      */
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogLevel.WARN")
    @js.native
    val WARN: LogLevel = js.native
    
    inline def fromString(level: String): LogLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(level.asInstanceOf[js.Any]).asInstanceOf[LogLevel]
    inline def fromString(level: String, defaultLevel: LogLevel): LogLevel = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(level.asInstanceOf[js.Any], defaultLevel.asInstanceOf[js.Any])).asInstanceOf[LogLevel]
  }
  
  @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogService")
  @js.native
  /* private */ open class LogService () extends StObject
  /* static members */
  object LogService {
    
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogService")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Logs to the DEBUG channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    inline def debug(module: String, messageOrObject: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(scala.List(module.asInstanceOf[js.Any]).`++`(messageOrObject.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Logs to the ERROR channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    inline def error(module: String, messageOrObject: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(scala.List(module.asInstanceOf[js.Any]).`++`(messageOrObject.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Logs to the INFO channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    inline def info(module: String, messageOrObject: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(scala.List(module.asInstanceOf[js.Any]).`++`(messageOrObject.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogService.logLevel")
    @js.native
    def logLevel: Any = js.native
    inline def logLevel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
    
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogService.logger")
    @js.native
    def logger: Any = js.native
    inline def logger_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
    
    /**
      * Mutes a module from the logger.
      * @param {string} name The module name to mute.
      */
    inline def muteModule(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("muteModule")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSImport("matrix-bot-sdk/lib/logging/LogService", "LogService.mutedModules")
    @js.native
    def mutedModules: Any = js.native
    inline def mutedModules_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutedModules")(x.asInstanceOf[js.Any])
    
    /**
      * Sets the log level for this logger. Defaults to DEBUG.
      * @param {LogLevel} level the new log level
      */
    inline def setLevel(level: LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Sets a new logger for the Log Service
      * @param {ILogger} logger the new logger
      */
    inline def setLogger(logger: ILogger): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLogger")(logger.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Logs to the TRACE channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    inline def trace(module: String, messageOrObject: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(scala.List(module.asInstanceOf[js.Any]).`++`(messageOrObject.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
    
    /**
      * Logs to the WARN channel
      * @param {string} module The module being logged
      * @param {any[]} messageOrObject The data to log
      */
    inline def warn(module: String, messageOrObject: Any*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(scala.List(module.asInstanceOf[js.Any]).`++`(messageOrObject.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Unit]
  }
  
  inline def extractRequestError(err: js.Error): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestError")(err.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def extractRequestError(err: MatrixError): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("extractRequestError")(err.asInstanceOf[js.Any]).asInstanceOf[Any]
}
