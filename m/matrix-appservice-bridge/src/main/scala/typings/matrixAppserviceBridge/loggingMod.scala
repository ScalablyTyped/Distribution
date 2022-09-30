package typings.matrixAppserviceBridge

import org.scalablytyped.runtime.StringDictionary
import typings.logform.mod.TransformableInfo
import typings.matrixAppserviceBridge.anon.Error
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.off
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace
import typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn
import typings.matrixBotSdk.iloggerMod.ILogger
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "GlobalLogger")
  @js.native
  open class GlobalLogger () extends StObject {
    
    /**
      * Logging implementation which can be provided to a bot-sdk LogService
      * instance to pipe logs through this component. **Note**: This is done automatically
      * for the `matrix-appservice-bridge`'s instance of the bot-sdk, but if you
      * use the bot-sdk directly in your bridge you should use the example code below
      * @example
      * ```
      * import { LogService } from "matrix-bot-sdk";
      * Logger.configure({...})
      * LogService.setLogger(Logger.logServiceLogger);
      * ```
      */
    def botSdkLogger: ILogger = js.native
    
    def configureLogging(cfg: LoggingOpts): Unit = js.native
    def configureLogging(cfg: LoggingOptsFile): Unit = js.native
    def configureLogging(cfg: LoggingOptsFile, debugStream: WritableStream[Any]): Unit = js.native
    def configureLogging(cfg: LoggingOpts, debugStream: WritableStream[Any]): Unit = js.native
    
    def configured: Boolean = js.native
    
    /* private */ var isConfigured: Any = js.native
    
    def winston: js.UndefOr[typings.winston.mod.Logger] = js.native
    
    /* private */ var winstonLog: Any = js.native
  }
  
  @JSImport("matrix-appservice-bridge/lib/components/logging", "Logger")
  @js.native
  open class Logger protected () extends StObject {
    def this(module: String) = this()
    def this(module: String, additionalMeta: LoggerMetadata) = this()
    def this(module: String, additionalMeta: Unit, logger: GlobalLogger) = this()
    def this(module: String, additionalMeta: LoggerMetadata, logger: GlobalLogger) = this()
    
    /* private */ val additionalMeta: Any = js.native
    
    /**
      * Logs to the DEBUG channel
      * @param msg The message or data to log.
      * @param additionalData Additional context.
      */
    def debug(msg: LogEntryPart, additionalData: LogEntryPart*): Unit = js.native
    
    /**
      * Logs to the ERROR channel
      * @param msg The message or data to log.
      * @param additionalData Additional context.
      */
    def error(msg: LogEntryPart, additionalData: LogEntryPart*): Unit = js.native
    
    /**
      * Logs to the INFO channel
      * @param msg The message or data to log.
      * @param additionalData Additional context.
      */
    def info(msg: LogEntryPart, additionalData: LogEntryPart*): Unit = js.native
    
    /* private */ def logMeta: Any = js.native
    
    /* private */ val logger: Any = js.native
    
    /* private */ val module: Any = js.native
    
    /**
      * Logs to the WARN channel
      * @param msg The message or data to log.
      * @param additionalData Additional context.
      */
    def warn(msg: LogEntryPart, additionalData: LogEntryPart*): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Configure the root logger instance.
      * @param cfg The configuration parameters
      */
    inline def configure(cfg: LoggingOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def configure(cfg: LoggingOptsFile): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(cfg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def formatLogEntryPartArray(data: LogEntryPart*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatLogEntryPartArray")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
    
    inline def messageFormatter(info: LogEntry): String = ^.asInstanceOf[js.Dynamic].applyDynamic("messageFormatter")(info.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("matrix-appservice-bridge/lib/components/logging", "Logger.root")
    @js.native
    val root: GlobalLogger = js.native
  }
  
  trait CustomLogger extends StObject {
    
    def debug(message: String, metadata: Any*): Unit
    
    def error(message: String, metadata: Any*): Unit
    
    def info(message: String, metadata: Any*): Unit
    
    def verbose(message: String, metadata: Any*): Unit
    
    def warn(message: String, metadata: Any*): Unit
  }
  object CustomLogger {
    
    inline def apply(
      debug: (String, /* repeated */ Any) => Unit,
      error: (String, /* repeated */ Any) => Unit,
      info: (String, /* repeated */ Any) => Unit,
      verbose: (String, /* repeated */ Any) => Unit,
      warn: (String, /* repeated */ Any) => Unit
    ): CustomLogger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), info = js.Any.fromFunction2(info), verbose = js.Any.fromFunction2(verbose), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[CustomLogger]
    }
    
    extension [Self <: CustomLogger](x: Self) {
      
      inline def setDebug(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      inline def setError(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      inline def setInfo(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      inline def setVerbose(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction2(value))
      
      inline def setWarn(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
  
  trait CustomLoggingOpts extends StObject {
    
    /**
      * An object which implements the required functions for log output.
      */
    var logger: CustomLogger
  }
  object CustomLoggingOpts {
    
    inline def apply(logger: CustomLogger): CustomLoggingOpts = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomLoggingOpts]
    }
    
    extension [Self <: CustomLoggingOpts](x: Self) {
      
      inline def setLogger(value: CustomLogger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogEntry
    extends StObject
       with TransformableInfo {
    
    var data: js.Array[LogEntryPart]
    
    var module: String
    
    var requestId: String
  }
  object LogEntry {
    
    inline def apply(data: js.Array[LogEntryPart], level: String, message: Any, module: String, requestId: String): LogEntry = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogEntry]
    }
    
    extension [Self <: LogEntry](x: Self) {
      
      inline def setData(value: js.Array[LogEntryPart]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: LogEntryPart*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Acceptable values for a log line entry.
    */
  type LogEntryPart = String | js.Error | Any | Error
  
  /* Rewritten from type alias, can be one of: 
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error
    - typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    inline def debug: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug = "debug".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.debug]
    
    inline def error: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error = "error".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.error]
    
    inline def info: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info = "info".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.info]
    
    inline def trace: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace = "trace".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.trace]
    
    inline def warn: typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn = "warn".asInstanceOf[typings.matrixAppserviceBridge.matrixAppserviceBridgeStrings.warn]
  }
  
  trait LoggerMetadata extends StObject {
    
    var requestId: js.UndefOr[String] = js.undefined
  }
  object LoggerMetadata {
    
    inline def apply(): LoggerMetadata = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerMetadata]
    }
    
    extension [Self <: LoggerMetadata](x: Self) {
      
      inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    }
  }
  
  trait LoggingOpts extends StObject {
    
    /**
      * Should the logs color-code the level strings in the output.
      */
    var colorize: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The log level used by the console output.
      */
    var console: js.UndefOr[debug | info | warn | error | trace | off] = js.undefined
    
    /**
      * Should the logs be outputted in JSON format, for consumption by a collector.
      */
    var json: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Timestamp format used in the log output.
      * @default "HH:mm:ss:SSS"
      */
    var timestampFormat: js.UndefOr[String] = js.undefined
  }
  object LoggingOpts {
    
    inline def apply(): LoggingOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggingOpts]
    }
    
    extension [Self <: LoggingOpts](x: Self) {
      
      inline def setColorize(value: Boolean): Self = StObject.set(x, "colorize", value.asInstanceOf[js.Any])
      
      inline def setColorizeUndefined: Self = StObject.set(x, "colorize", js.undefined)
      
      inline def setConsole(value: debug | info | warn | error | trace | off): Self = StObject.set(x, "console", value.asInstanceOf[js.Any])
      
      inline def setConsoleUndefined: Self = StObject.set(x, "console", js.undefined)
      
      inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
      
      inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    }
  }
  
  trait LoggingOptsFile
    extends StObject
       with LoggingOpts {
    
    /**
      * The moment.js compatible date string to use when naming files.
      */
    var fileDatePattern: js.UndefOr[String] = js.undefined
    
    /**
      * An object mapping a file name to a logging level. The file will contain
      * all logs for that level inclusive up to the highest level. (`info` will contain `warn`, `error` etc)
      * Use `%DATE%` to set the date of the file within the string.
      * Use the `fileDatePattern` to set the date format.
      * @example {"info-%DATE%.log": "info"}
      */
    var files: StringDictionary[LogLevel]
    
    /**
      * The number of files to keep before the last file is rotated.
      * If not set, no files are deleted.
      */
    var maxFiles: js.UndefOr[Double] = js.undefined
  }
  object LoggingOptsFile {
    
    inline def apply(files: StringDictionary[LogLevel]): LoggingOptsFile = {
      val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoggingOptsFile]
    }
    
    extension [Self <: LoggingOptsFile](x: Self) {
      
      inline def setFileDatePattern(value: String): Self = StObject.set(x, "fileDatePattern", value.asInstanceOf[js.Any])
      
      inline def setFileDatePatternUndefined: Self = StObject.set(x, "fileDatePattern", js.undefined)
      
      inline def setFiles(value: StringDictionary[LogLevel]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setMaxFiles(value: Double): Self = StObject.set(x, "maxFiles", value.asInstanceOf[js.Any])
      
      inline def setMaxFilesUndefined: Self = StObject.set(x, "maxFiles", js.undefined)
    }
  }
}
