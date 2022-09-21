package typings.ionicCliFrameworkOutput

import typings.ionicCliFrameworkOutput.anon.PartialLoggerOptions
import typings.ionicCliFrameworkOutput.anon.PartialStreamHandlerOptio
import typings.ionicCliFrameworkOutput.colorsMod.ColorFunction
import typings.ionicCliFrameworkOutput.colorsMod.Colors
import typings.ionicUtilsTerminal.formatMod.WordWrapOptions
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import typings.std.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@ionic/cli-framework-output/dist/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework-output/dist/logger", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[StreamHandler] = js.native
  
  /* Inlined {readonly [ L in @ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerLevel ]: @ionic/cli-framework-output.@ionic/cli-framework-output/dist/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework-output/dist/logger", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output/dist/logger", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output/dist/logger", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework-output/dist/logger", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework-output/dist/logger", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework-output/dist/logger", "Logger")
  @js.native
  open class Logger () extends StObject {
    def this(hasLevelHandlers: LoggerOptions) = this()
    
    def clone(opts: PartialLoggerOptions): Logger = js.native
    
    def createRecord(msg: String): LogRecord = js.native
    def createRecord(msg: String, level: Unit, format: Boolean): LogRecord = js.native
    def createRecord(msg: String, level: LoggerLevelWeight): LogRecord = js.native
    def createRecord(msg: String, level: LoggerLevelWeight, format: Boolean): LogRecord = js.native
    
    def createWriteStream(): WritableStream[Any] = js.native
    def createWriteStream(level: Unit, format: Boolean): WritableStream[Any] = js.native
    def createWriteStream(level: LoggerLevelWeight): WritableStream[Any] = js.native
    def createWriteStream(level: LoggerLevelWeight, format: Boolean): WritableStream[Any] = js.native
    
    /**
      * Log a message using the `debug` logger level.
      *
      * @param msg The string to log.
      */
    def debug(msg: String): Unit = js.native
    
    /**
      * Log a message using the `error` logger level.
      *
      * @param msg The string to log.
      */
    def error(msg: String): Unit = js.native
    
    var handlers: Set[LoggerHandler] = js.native
    
    /**
      * Log a message using the `info` logger level.
      *
      * @param msg The string to log.
      */
    def info(msg: String): Unit = js.native
    
    var level: LoggerLevelWeight = js.native
    
    /**
      * Log a record using a logger output found via `level`.
      */
    def log(record: LogRecord): Unit = js.native
    
    /**
      * Log a message as-is.
      *
      * @param msg The string to log.
      */
    def msg(msg: String): Unit = js.native
    
    /**
      * Log newlines using a logger output found via `level`.
      *
      * @param num The number of newlines to log.
      * @param level The logger level. If omitted, the default output is used.
      */
    def nl(): Unit = js.native
    def nl(num: Double): Unit = js.native
    def nl(num: Double, level: LoggerLevelWeight): Unit = js.native
    def nl(num: Unit, level: LoggerLevelWeight): Unit = js.native
    
    /**
      * Log a message using the `warn` logger level.
      *
      * @param msg The string to log.
      */
    def warn(msg: String): Unit = js.native
  }
  /* static members */
  object Logger {
    
    @JSImport("@ionic/cli-framework-output/dist/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Set[LoggerHandler]]
  }
  
  @JSImport("@ionic/cli-framework-output/dist/logger", "StreamHandler")
  @js.native
  open class StreamHandler protected ()
    extends StObject
       with LoggerHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
    
    def clone(opts: PartialStreamHandlerOptio): StreamHandler = js.native
    
    val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
    
    /* CompleteClass */
    override def handle(record: LogRecord): Unit = js.native
    
    val stream: WritableStream[Any] = js.native
  }
  
  inline def createPrefixedFormatter(prefix: String): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  inline def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  inline def createTaggedFormatter(): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")().asInstanceOf[LoggerFormatter]
  inline def createTaggedFormatter(hasColorsPrefixTagsTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")(hasColorsPrefixTagsTitleizeWrap.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  inline def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ColorFunction]]
  inline def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ColorFunction]]
  
  inline def getLoggerLevelName(): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")().asInstanceOf[js.UndefOr[LoggerLevel]]
  inline def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LoggerLevel]]
  
  trait CreateTaggedFormatterOptions extends StObject {
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var prefix: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var tags: js.UndefOr[ReadonlyMap[LoggerLevelWeight, String]] = js.undefined
    
    var titleize: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean | WordWrapOptions] = js.undefined
  }
  object CreateTaggedFormatterOptions {
    
    inline def apply(): CreateTaggedFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTaggedFormatterOptions]
    }
    
    extension [Self <: CreateTaggedFormatterOptions](x: Self) {
      
      inline def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setPrefix(value: String | js.Function0[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction0(value: () => String): Self = StObject.set(x, "prefix", js.Any.fromFunction0(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setTags(value: ReadonlyMap[LoggerLevelWeight, String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTitleize(value: Boolean): Self = StObject.set(x, "titleize", value.asInstanceOf[js.Any])
      
      inline def setTitleizeUndefined: Self = StObject.set(x, "titleize", js.undefined)
      
      inline def setWrap(value: Boolean | WordWrapOptions): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait LogRecord extends StObject {
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[LoggerLevelWeight] = js.undefined
    
    var logger: Logger
    
    var msg: String
  }
  object LogRecord {
    
    inline def apply(logger: Logger, msg: String): LogRecord = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogRecord]
    }
    
    extension [Self <: LogRecord](x: Self) {
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type LoggerFormatter = js.Function1[/* record */ LogRecord, String]
  
  trait LoggerHandler extends StObject {
    
    var formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    def handle(record: LogRecord): Unit
  }
  object LoggerHandler {
    
    inline def apply(handle: LogRecord => Unit): LoggerHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[LoggerHandler]
    }
    
    extension [Self <: LoggerHandler](x: Self) {
      
      inline def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHandle(value: LogRecord => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.DEBUG
    - typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.INFO
    - typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.WARN
    - typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.ERROR
  */
  trait LoggerLevel extends StObject
  object LoggerLevel {
    
    inline def DEBUG: typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.DEBUG = "DEBUG".asInstanceOf[typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.DEBUG]
    
    inline def ERROR: typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.ERROR = "ERROR".asInstanceOf[typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.ERROR]
    
    inline def INFO: typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.INFO = "INFO".asInstanceOf[typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.INFO]
    
    inline def WARN: typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.WARN = "WARN".asInstanceOf[typings.ionicCliFrameworkOutput.ionicCliFrameworkOutputStrings.WARN]
  }
  
  type LoggerLevelWeight = Double
  
  trait LoggerOptions extends StObject {
    
    val handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
    
    val level: js.UndefOr[LoggerLevelWeight] = js.undefined
  }
  object LoggerOptions {
    
    inline def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    extension [Self <: LoggerOptions](x: Self) {
      
      inline def setHandlers(value: Set[LoggerHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      inline def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait StreamHandlerOptions extends StObject {
    
    val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
    
    val formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    val stream: WritableStream[Any]
  }
  object StreamHandlerOptions {
    
    inline def apply(stream: WritableStream[Any]): StreamHandlerOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamHandlerOptions]
    }
    
    extension [Self <: StreamHandlerOptions](x: Self) {
      
      inline def setFilter(value: /* record */ LogRecord => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setStream(value: WritableStream[Any]): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
