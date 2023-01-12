package typings.loglevel

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.loglevel.loglevelInts.`0`
import typings.loglevel.loglevelInts.`1`
import typings.loglevel.loglevelInts.`2`
import typings.loglevel.loglevelInts.`3`
import typings.loglevel.loglevelInts.`4`
import typings.loglevel.loglevelInts.`5`
import typings.loglevel.loglevelStrings.debug_
import typings.loglevel.loglevelStrings.error_
import typings.loglevel.loglevelStrings.info_
import typings.loglevel.loglevelStrings.silent_
import typings.loglevel.loglevelStrings.trace_
import typings.loglevel.loglevelStrings.warn_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("loglevel", JSImport.Namespace)
  @js.native
  val ^ : RootLogger = js.native
  
  /**
    * Log levels
    */
  trait LogLevel extends StObject {
    
    var DEBUG: `1`
    
    var ERROR: `4`
    
    var INFO: `2`
    
    var SILENT: `5`
    
    var TRACE: `0`
    
    var WARN: `3`
  }
  object LogLevel {
    
    inline def apply(): LogLevel = {
      val __obj = js.Dynamic.literal(DEBUG = 1, ERROR = 4, INFO = 2, SILENT = 5, TRACE = 0, WARN = 3)
      __obj.asInstanceOf[LogLevel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogLevel] (val x: Self) extends AnyVal {
      
      inline def setDEBUG(value: `1`): Self = StObject.set(x, "DEBUG", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: `4`): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setINFO(value: `2`): Self = StObject.set(x, "INFO", value.asInstanceOf[js.Any])
      
      inline def setSILENT(value: `5`): Self = StObject.set(x, "SILENT", value.asInstanceOf[js.Any])
      
      inline def setTRACE(value: `0`): Self = StObject.set(x, "TRACE", value.asInstanceOf[js.Any])
      
      inline def setWARN(value: `3`): Self = StObject.set(x, "WARN", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Possible log level descriptors, may be string, lower or upper case, or number.
    */
  /* Inlined loglevel.loglevel.LogLevelNumbers | loglevel.loglevel.LogLevelNames | 'silent' | keyof loglevel.loglevel.LogLevel */
  /* Rewritten from type alias, can be one of: 
    - typings.loglevel.loglevelInts.`3`
    - typings.loglevel.loglevelInts.`2`
    - typings.loglevel.loglevelInts.`4`
    - typings.loglevel.loglevelInts.`0`
    - typings.loglevel.loglevelInts.`5`
    - typings.loglevel.loglevelInts.`1`
    - typings.loglevel.loglevelStrings.DEBUG
    - typings.loglevel.loglevelStrings.info_
    - typings.loglevel.loglevelStrings.INFO
    - typings.loglevel.loglevelStrings.warn_
    - typings.loglevel.loglevelStrings.TRACE
    - typings.loglevel.loglevelStrings.SILENT
    - typings.loglevel.loglevelStrings.silent_
    - typings.loglevel.loglevelStrings.WARN
    - typings.loglevel.loglevelStrings.debug_
    - typings.loglevel.loglevelStrings.ERROR
    - typings.loglevel.loglevelStrings.error_
    - typings.loglevel.loglevelStrings.trace_
  */
  trait LogLevelDesc extends StObject
  object LogLevelDesc {
    
    inline def `0`: typings.loglevel.loglevelInts.`0` = 0.asInstanceOf[typings.loglevel.loglevelInts.`0`]
    
    inline def `1`: typings.loglevel.loglevelInts.`1` = 1.asInstanceOf[typings.loglevel.loglevelInts.`1`]
    
    inline def `2`: typings.loglevel.loglevelInts.`2` = 2.asInstanceOf[typings.loglevel.loglevelInts.`2`]
    
    inline def `3`: typings.loglevel.loglevelInts.`3` = 3.asInstanceOf[typings.loglevel.loglevelInts.`3`]
    
    inline def `4`: typings.loglevel.loglevelInts.`4` = 4.asInstanceOf[typings.loglevel.loglevelInts.`4`]
    
    inline def `5`: typings.loglevel.loglevelInts.`5` = 5.asInstanceOf[typings.loglevel.loglevelInts.`5`]
    
    inline def DEBUG: typings.loglevel.loglevelStrings.DEBUG = "DEBUG".asInstanceOf[typings.loglevel.loglevelStrings.DEBUG]
    
    inline def ERROR: typings.loglevel.loglevelStrings.ERROR = "ERROR".asInstanceOf[typings.loglevel.loglevelStrings.ERROR]
    
    inline def INFO: typings.loglevel.loglevelStrings.INFO = "INFO".asInstanceOf[typings.loglevel.loglevelStrings.INFO]
    
    inline def SILENT: typings.loglevel.loglevelStrings.SILENT = "SILENT".asInstanceOf[typings.loglevel.loglevelStrings.SILENT]
    
    inline def TRACE: typings.loglevel.loglevelStrings.TRACE = "TRACE".asInstanceOf[typings.loglevel.loglevelStrings.TRACE]
    
    inline def WARN: typings.loglevel.loglevelStrings.WARN = "WARN".asInstanceOf[typings.loglevel.loglevelStrings.WARN]
    
    inline def debug: debug_ = "debug".asInstanceOf[debug_]
    
    inline def error: error_ = "error".asInstanceOf[error_]
    
    inline def info: info_ = "info".asInstanceOf[info_]
    
    inline def silent: silent_ = "silent".asInstanceOf[silent_]
    
    inline def trace: trace_ = "trace".asInstanceOf[trace_]
    
    inline def warn: warn_ = "warn".asInstanceOf[warn_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.loglevel.loglevelStrings.trace_
    - typings.loglevel.loglevelStrings.debug_
    - typings.loglevel.loglevelStrings.info_
    - typings.loglevel.loglevelStrings.warn_
    - typings.loglevel.loglevelStrings.error_
  */
  trait LogLevelNames extends StObject
  object LogLevelNames {
    
    inline def debug: debug_ = "debug".asInstanceOf[debug_]
    
    inline def error: error_ = "error".asInstanceOf[error_]
    
    inline def info: info_ = "info".asInstanceOf[info_]
    
    inline def trace: trace_ = "trace".asInstanceOf[trace_]
    
    inline def warn: warn_ = "warn".asInstanceOf[warn_]
  }
  
  /**
    * Possible log level numbers.
    */
  /* Inlined loglevel.loglevel.LogLevel[keyof loglevel.loglevel.LogLevel] */
  /* Rewritten from type alias, can be one of: 
    - typings.loglevel.loglevelInts.`3`
    - typings.loglevel.loglevelInts.`2`
    - typings.loglevel.loglevelInts.`4`
    - typings.loglevel.loglevelInts.`0`
    - typings.loglevel.loglevelInts.`5`
    - typings.loglevel.loglevelInts.`1`
  */
  trait LogLevelNumbers extends StObject
  object LogLevelNumbers {
    
    inline def `0`: typings.loglevel.loglevelInts.`0` = 0.asInstanceOf[typings.loglevel.loglevelInts.`0`]
    
    inline def `1`: typings.loglevel.loglevelInts.`1` = 1.asInstanceOf[typings.loglevel.loglevelInts.`1`]
    
    inline def `2`: typings.loglevel.loglevelInts.`2` = 2.asInstanceOf[typings.loglevel.loglevelInts.`2`]
    
    inline def `3`: typings.loglevel.loglevelInts.`3` = 3.asInstanceOf[typings.loglevel.loglevelInts.`3`]
    
    inline def `4`: typings.loglevel.loglevelInts.`4` = 4.asInstanceOf[typings.loglevel.loglevelInts.`4`]
    
    inline def `5`: typings.loglevel.loglevelInts.`5` = 5.asInstanceOf[typings.loglevel.loglevelInts.`5`]
  }
  
  @js.native
  trait Logger extends StObject {
    
    /**
      * Output debug message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def debug(msg: Any*): Unit = js.native
    
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
    def error(msg: Any*): Unit = js.native
    
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
    def info(msg: Any*): Unit = js.native
    
    /**
      * Available log levels.
      */
    val levels: LogLevel = js.native
    
    /**
      * Output debug message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def log(msg: Any*): Unit = js.native
    
    /**
      * Plugin API entry point. This will be called for each enabled method each time the level is set
      * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
      * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
      * recommended that this wraps the initially provided value of log.methodFactory
      */
    def methodFactory(methodName: LogLevelNames, level: LogLevelNumbers, loggerName: String): LoggingMethod = js.native
    def methodFactory(methodName: LogLevelNames, level: LogLevelNumbers, loggerName: js.Symbol): LoggingMethod = js.native
    /**
      * Plugin API entry point. This will be called for each enabled method each time the level is set
      * (including initially), and should return a MethodFactory to be used for the given log method, at the given level,
      * for a logger with the given name. If you'd like to retain all the reliability and features of loglevel, it's
      * recommended that this wraps the initially provided value of log.methodFactory
      */
    @JSName("methodFactory")
    var methodFactory_Original: MethodFactory = js.native
    
    /**
      * This resets the current log level to the default level (or `warn` if no explicit default was set) and clears
      * the persisted level if one was previously persisted.
      */
    def resetLevel(): Unit = js.native
    
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
    def trace(msg: Any*): Unit = js.native
    
    /**
      * Output warn message to console including appropriate icons
      *
      * @param msg any data to log to the console
      */
    def warn(msg: Any*): Unit = js.native
  }
  
  @js.native
  trait LoggingMethod extends StObject {
    
    def apply(message: Any*): Unit = js.native
  }
  
  type MethodFactory = js.Function3[
    /* methodName */ LogLevelNames, 
    /* level */ LogLevelNumbers, 
    /* loggerName */ String | js.Symbol, 
    LoggingMethod
  ]
  
  @js.native
  trait RootLogger
    extends StObject
       with Logger {
    
    /**
      * A .default property for ES6 default import compatibility
      */
    var default: RootLogger = js.native
    
    /**
      * This gets you a new logger object that works exactly like the root log object, but can have its level and
      * logging methods set independently. All loggers must have a name (which is a non-empty string or a symbol)
      * Calling * getLogger() multiple times with the same name will return an identical logger object.
      * In large applications, it can be incredibly useful to turn logging on and off for particular modules as you are
      * working with them. Using the getLogger() method lets you create a separate logger for each part of your
      * application with its own logging level. Likewise, for small, independent modules, using a named logger instead
      * of the default root logger allows developers using your module to selectively turn on deep, trace-level logging
      * when trying to debug problems, while logging only errors or silencing logging altogether under normal
      * circumstances.
      * @param name The name of the produced logger
      */
    def getLogger(name: String): Logger = js.native
    def getLogger(name: js.Symbol): Logger = js.native
    
    /**
      * This will return you the dictionary of all loggers created with getLogger, keyed off of their names.
      */
    def getLoggers(): StringDictionary[Logger] = js.native
    
    /**
      * If you're using another JavaScript library that exposes a 'log' global, you can run into conflicts with loglevel.
      * Similarly to jQuery, you can solve this by putting loglevel into no-conflict mode immediately after it is loaded
      * onto the page. This resets to 'log' global to its value before loglevel was loaded (typically undefined), and
      * returns the loglevel object, which you can then bind to another name yourself.
      */
    def noConflict(): Any = js.native
  }
  
  type _To = RootLogger
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RootLogger = ^
}
