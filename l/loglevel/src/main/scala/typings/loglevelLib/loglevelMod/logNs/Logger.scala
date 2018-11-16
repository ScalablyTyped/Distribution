package typings
package loglevelLib.loglevelMod.logNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  /**
           * Available log levels.
           */
  val levels: LogLevel = js.native
  /**
           * Plugin API entry point. This will be called for each enabled method each time the level is set
           * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
           * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
           * recommended that this wraps the initially provided value of log.methodFactory
           */
  @JSName("methodFactory")
  var methodFactory_Original: MethodFactory = js.native
  /**
           * Output debug message to console including appropriate icons
           *
           * @param msg any data to log to the console
           */
  def debug(msg: js.Any*): scala.Unit = js.native
  /**
           * This disables all log messages, and is equivalent to log.setLevel("silent").
           *
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def disableAll(): scala.Unit = js.native
  /**
           * This disables all log messages, and is equivalent to log.setLevel("silent").
           *
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def disableAll(persist: scala.Boolean): scala.Unit = js.native
  /**
           * This enables all log messages, and is equivalent to log.setLevel("trace").
           *
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def enableAll(): scala.Unit = js.native
  /**
           * This enables all log messages, and is equivalent to log.setLevel("trace").
           *
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def enableAll(persist: scala.Boolean): scala.Unit = js.native
  /**
           * Output error message to console including appropriate icons
           *
           * @param msg any data to log to the console
           */
  def error(msg: js.Any*): scala.Unit = js.native
  /**
           * Returns the current logging level, as a value from LogLevel.
           * It's very unlikely you'll need to use this for normal application logging; it's provided partly to help plugin
           * development, and partly to let you optimize logging code as below, where debug data is only generated if the
           * level is set such that it'll actually be logged. This probably doesn't affect you, unless you've run profiling
           * on your code and you have hard numbers telling you that your log data generation is a real performance problem.
           */
  def getLevel(): /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(loglevel), TsIdentModule(None,List(loglevel)), TsIdentNamespace(log), TsIdentSimple(LogLevel))),List()),Right(TsTypeKeyOf(TsTypeRef(TsQIdent(List(TsIdentLibrarySimple(loglevel), TsIdentModule(None,List(loglevel)), TsIdentNamespace(log), TsIdentSimple(LogLevel))),List())))) */js.Any = js.native
  /**
           * This gets you a new logger object that works exactly like the root log object, but can have its level and
           * logging methods set independently. All loggers must have a name (which is a non-empty string). Calling
           * getLogger() multiple times with the same name will return an identical logger object.
           * In large applications, it can be incredibly useful to turn logging on and off for particular modules as you are
           * working with them. Using the getLogger() method lets you create a separate logger for each part of your
           * application with its own logging level. Likewise, for small, independent modules, using a named logger instead
           * of the default root logger allows developers using your module to selectively turn on deep, trace-level logging
           * when trying to debug problems, while logging only errors or silencing logging altogether under normal
           * circumstances.
           * @param name The name of the produced logger
           */
  def getLogger(name: java.lang.String): Logger = js.native
  /**
           * Output info message to console including appropriate icons
           *
           * @param msg any data to log to the console
           */
  def info(msg: js.Any*): scala.Unit = js.native
  /**
           * Plugin API entry point. This will be called for each enabled method each time the level is set
           * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
           * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
           * recommended that this wraps the initially provided value of log.methodFactory
           */
  def methodFactory(methodName: java.lang.String, level: LogLevelNumbers, loggerName: java.lang.String): LoggingMethod = js.native
  /**
           * If you're using another JavaScript library that exposes a 'log' global, you can run into conflicts with loglevel.
           * Similarly to jQuery, you can solve this by putting loglevel into no-conflict mode immediately after it is loaded
           * onto the page. This resets to 'log' global to its value before loglevel was loaded (typically undefined), and
           * returns the loglevel object, which you can then bind to another name yourself.
           */
  def noConflict(): js.Any = js.native
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
  def setDefaultLevel(level: LogLevelDesc): scala.Unit = js.native
  /**
           * This disables all logging below the given level, so that after a log.setLevel("warn") call log.warn("something")
           * or log.error("something") will output messages, but log.info("something") will not.
           *
           * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def setLevel(level: LogLevelDesc): scala.Unit = js.native
  /**
           * This disables all logging below the given level, so that after a log.setLevel("warn") call log.warn("something")
           * or log.error("something") will output messages, but log.info("something") will not.
           *
           * @param level as a string, like 'error' (case-insensitive) or as a number from 0 to 5 (or as log.levels. values)
           * @param persist Where possible the log level will be persisted. LocalStorage will be used if available, falling
           *     back to cookies if not. If neither is available in the current environment (i.e. in Node), or if you pass
           *     false as the optional 'persist' second argument, persistence will be skipped.
           */
  def setLevel(level: LogLevelDesc, persist: scala.Boolean): scala.Unit = js.native
  /**
           * Output trace message to console.
           * This will also include a full stack trace
           *
           * @param msg any data to log to the console
           */
  def trace(msg: js.Any*): scala.Unit = js.native
  /**
           * Output warn message to console including appropriate icons
           *
           * @param msg any data to log to the console
           */
  def warn(msg: js.Any*): scala.Unit = js.native
}

