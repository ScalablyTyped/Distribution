package typings.matrixBotSdk.mod

import typings.matrixBotSdk.libLoggingIloggerMod.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-bot-sdk", "LogService")
@js.native
/* private */ open class LogService ()
  extends typings.matrixBotSdk.libLoggingLogServiceMod.LogService
/* static members */
object LogService {
  
  @JSImport("matrix-bot-sdk", "LogService")
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
  
  @JSImport("matrix-bot-sdk", "LogService.logLevel")
  @js.native
  def logLevel: Any = js.native
  inline def logLevel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logLevel")(x.asInstanceOf[js.Any])
  
  @JSImport("matrix-bot-sdk", "LogService.logger")
  @js.native
  def logger: Any = js.native
  inline def logger_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logger")(x.asInstanceOf[js.Any])
  
  /**
    * Mutes a module from the logger.
    * @param {string} name The module name to mute.
    */
  inline def muteModule(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("muteModule")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("matrix-bot-sdk", "LogService.mutedModules")
  @js.native
  def mutedModules: Any = js.native
  inline def mutedModules_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mutedModules")(x.asInstanceOf[js.Any])
  
  /**
    * Sets the log level for this logger. Defaults to DEBUG.
    * @param {LogLevel} level the new log level
    */
  inline def setLevel(level: typings.matrixBotSdk.libLoggingLogServiceMod.LogLevel): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setLevel")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
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
