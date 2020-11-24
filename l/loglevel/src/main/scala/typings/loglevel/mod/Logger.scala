package typings.loglevel.mod

import typings.loglevel.loglevelNumbers.`0`
import typings.loglevel.loglevelNumbers.`1`
import typings.loglevel.loglevelNumbers.`2`
import typings.loglevel.loglevelNumbers.`3`
import typings.loglevel.loglevelNumbers.`4`
import typings.loglevel.loglevelNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Logger extends js.Object {
  
  /**
    * Output debug message to console including appropriate icons
    *
    * @param msg any data to log to the console
    */
  def debug(msg: js.Any*): Unit = js.native
  
  /**
    * This disables all log messages, and is equivalent to log.setLevel("silent").
    *
    * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
    *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
    *     false as the optional 'persist' second argument, persistence will be skipped.
    */
  def disableAll(): Unit = js.native
  def disableAll(persist: Boolean): Unit = js.native
  
  /**
    * This enables all log messages, and is equivalent to log.setLevel("trace").
    *
    * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
    *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
    *     false as the optional 'persist' second argument, persistence will be skipped.
    */
  def enableAll(): Unit = js.native
  def enableAll(persist: Boolean): Unit = js.native
  
  /**
    * Output error message to console including appropriate icons
    *
    * @param msg any data to log to the console
    */
  def error(msg: js.Any*): Unit = js.native
  
  /**
    * Returns the current logging level, as a value from LogLevel.
    * It's very unlikely you'll need to use this for normal application logging; it's provided partly to help plugin
    * development, and partly to let you optimize logging code as below, where debug data is only generated if the
    * level is set such that it'll actually be logged. This probably doesn't affect you, unless you've run profiling
    * on your code and you have hard numbers telling you that your log data generation is a real performance problem.
    */
  def getLevel(): `3` | `2` | `4` | `0` | `5` | `1` = js.native
  
  /**
    * Output info message to console including appropriate icons
    *
    * @param msg any data to log to the console
    */
  def info(msg: js.Any*): Unit = js.native
  
  /**
    * Available log levels.
    */
  val levels: LogLevel = js.native
  
  /**
    * Output debug message to console including appropriate icons
    *
    * @param msg any data to log to the console
    */
  def log(msg: js.Any*): Unit = js.native
  
  /**
    * Plugin API entry point. This will be called for each enabled method each time the level is set
    * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
    * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
    * recommended that this wraps the initially provided value of log.methodFactory
    */
  def methodFactory(methodName: String, level: LogLevelNumbers, loggerName: String): LoggingMethod = js.native
  /**
    * Plugin API entry point. This will be called for each enabled method each time the level is set
    * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
    * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
    * recommended that this wraps the initially provided value of log.methodFactory
    */
  @JSName("methodFactory")
  var methodFactory_Original: MethodFactory = js.native
  
  /**
    * This sets the current log level only if one has not been persisted and can’t be loaded. This is useful when
    * initializing scripts; if a developer or user has previously called setLevel(), this won’t alter their settings.
    * For example, your application might set the log level to error in a production environment, but when debugging
    * an issue, you might call setLevel("trace") on the console to see all the logs. If that error setting was set
    * using setDefaultLevel(), it will still say as trace on subsequent page loads and refreshes instead of resetting
    * to error.
    *
    * The level argument takes is the same values that you might pass to setLevel(). Levels set using
    * setDefaultLevel() never persist to subsequent page loads.
    *
    * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
    */
  def setDefaultLevel(level: LogLevelDesc): Unit = js.native
  
  /**
    * This disables all logging below the given level, so that after a log.setLevel("warn") call log.warn("something")
    * or log.error("something") will output messages, but log.info("something") will not.
    *
    * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
    * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
    *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
    *     false as the optional 'persist' second argument, persistence will be skipped.
    */
  def setLevel(level: LogLevelDesc): Unit = js.native
  def setLevel(level: LogLevelDesc, persist: Boolean): Unit = js.native
  
  /**
    * Output trace message to console.
    * This will also include a full stack trace
    *
    * @param msg any data to log to the console
    */
  def trace(msg: js.Any*): Unit = js.native
  
  /**
    * Output warn message to console including appropriate icons
    *
    * @param msg any data to log to the console
    */
  def warn(msg: js.Any*): Unit = js.native
}
