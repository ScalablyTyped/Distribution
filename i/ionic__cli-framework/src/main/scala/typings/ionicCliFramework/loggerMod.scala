package typings.ionicCliFramework

import typings.ionicCliFramework.anon.PartialLoggerOptions
import typings.ionicCliFramework.anon.PartialStreamHandlerOptio
import typings.ionicCliFramework.colorsMod.ColorFunction
import typings.ionicCliFramework.colorsMod.Colors
import typings.ionicCliFramework.formatMod.WordWrapOptions
import typings.node.NodeJS.WritableStream
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@ionic/cli-framework/lib/logger", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ionic/cli-framework/lib/logger", "DEFAULT_LOGGER_HANDLERS")
  @js.native
  val DEFAULT_LOGGER_HANDLERS: ReadonlySet[StreamHandler] = js.native
  
  /* Inlined {readonly [ L in @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevel ]: @ionic/cli-framework.@ionic/cli-framework/lib/logger.LoggerLevelWeight} */
  object LOGGER_LEVELS {
    
    @JSImport("@ionic/cli-framework/lib/logger", "LOGGER_LEVELS.DEBUG")
    @js.native
    val DEBUG: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib/logger", "LOGGER_LEVELS.ERROR")
    @js.native
    val ERROR: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib/logger", "LOGGER_LEVELS.INFO")
    @js.native
    val INFO: LoggerLevelWeight = js.native
    
    @JSImport("@ionic/cli-framework/lib/logger", "LOGGER_LEVELS.WARN")
    @js.native
    val WARN: LoggerLevelWeight = js.native
  }
  
  @JSImport("@ionic/cli-framework/lib/logger", "LOGGER_LEVEL_NAMES")
  @js.native
  val LOGGER_LEVEL_NAMES: ReadonlyMap[LoggerLevelWeight, LoggerLevel] = js.native
  
  @JSImport("@ionic/cli-framework/lib/logger", "Logger")
  @js.native
  class Logger () extends StObject {
    def this(hasLevelHandlers: LoggerOptions) = this()
    
    def clone(opts: PartialLoggerOptions): Logger = js.native
    
    def createRecord(msg: String): LogRecord = js.native
    def createRecord(msg: String, level: Unit, format: Boolean): LogRecord = js.native
    def createRecord(msg: String, level: LoggerLevelWeight): LogRecord = js.native
    def createRecord(msg: String, level: LoggerLevelWeight, format: Boolean): LogRecord = js.native
    
    def createWriteStream(): WritableStream = js.native
    def createWriteStream(level: Unit, format: Boolean): WritableStream = js.native
    def createWriteStream(level: LoggerLevelWeight): WritableStream = js.native
    def createWriteStream(level: LoggerLevelWeight, format: Boolean): WritableStream = js.native
    
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
    
    @JSImport("@ionic/cli-framework/lib/logger", "Logger")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def cloneHandlers(handlers: ReadonlySet[LoggerHandler]): Set[LoggerHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneHandlers")(handlers.asInstanceOf[js.Any]).asInstanceOf[Set[LoggerHandler]]
  }
  
  @JSImport("@ionic/cli-framework/lib/logger", "StreamHandler")
  @js.native
  class StreamHandler protected ()
    extends StObject
       with LoggerHandler {
    def this(hasStreamFilterFormatter: StreamHandlerOptions) = this()
    
    def clone(opts: PartialStreamHandlerOptio): StreamHandler = js.native
    
    val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.native
    
    /* CompleteClass */
    override def handle(record: LogRecord): Unit = js.native
    
    val stream: WritableStream = js.native
  }
  
  @scala.inline
  def createPrefixedFormatter(prefix: String): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  @scala.inline
  def createPrefixedFormatter(prefix: js.Function0[String]): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createPrefixedFormatter")(prefix.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  @scala.inline
  def createTaggedFormatter(): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")().asInstanceOf[LoggerFormatter]
  @scala.inline
  def createTaggedFormatter(hasColorsPrefixTitleizeWrap: CreateTaggedFormatterOptions): LoggerFormatter = ^.asInstanceOf[js.Dynamic].applyDynamic("createTaggedFormatter")(hasColorsPrefixTitleizeWrap.asInstanceOf[js.Any]).asInstanceOf[LoggerFormatter]
  
  @scala.inline
  def getLoggerLevelColor(colors: Colors): js.UndefOr[ColorFunction] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[ColorFunction]]
  @scala.inline
  def getLoggerLevelColor(colors: Colors, level: LoggerLevelWeight): js.UndefOr[ColorFunction] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelColor")(colors.asInstanceOf[js.Any], level.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ColorFunction]]
  
  @scala.inline
  def getLoggerLevelName(): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")().asInstanceOf[js.UndefOr[LoggerLevel]]
  @scala.inline
  def getLoggerLevelName(level: LoggerLevelWeight): js.UndefOr[LoggerLevel] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoggerLevelName")(level.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[LoggerLevel]]
  
  trait CreateTaggedFormatterOptions extends StObject {
    
    var colors: js.UndefOr[Colors] = js.undefined
    
    var prefix: js.UndefOr[String | js.Function0[String]] = js.undefined
    
    var titleize: js.UndefOr[Boolean] = js.undefined
    
    var wrap: js.UndefOr[Boolean | WordWrapOptions] = js.undefined
  }
  object CreateTaggedFormatterOptions {
    
    @scala.inline
    def apply(): CreateTaggedFormatterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateTaggedFormatterOptions]
    }
    
    @scala.inline
    implicit class CreateTaggedFormatterOptionsMutableBuilder[Self <: CreateTaggedFormatterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      @scala.inline
      def setPrefix(value: String | js.Function0[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction0(value: () => String): Self = StObject.set(x, "prefix", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setTitleize(value: Boolean): Self = StObject.set(x, "titleize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleizeUndefined: Self = StObject.set(x, "titleize", js.undefined)
      
      @scala.inline
      def setWrap(value: Boolean | WordWrapOptions): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait LogRecord extends StObject {
    
    var format: js.UndefOr[Boolean] = js.undefined
    
    var level: js.UndefOr[LoggerLevelWeight] = js.undefined
    
    var logger: Logger
    
    var msg: String
  }
  object LogRecord {
    
    @scala.inline
    def apply(logger: Logger, msg: String): LogRecord = {
      val __obj = js.Dynamic.literal(logger = logger.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogRecord]
    }
    
    @scala.inline
    implicit class LogRecordMutableBuilder[Self <: LogRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      @scala.inline
      def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  type LoggerFormatter = js.Function1[/* record */ LogRecord, String]
  
  trait LoggerHandler extends StObject {
    
    var formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    def handle(record: LogRecord): Unit
  }
  object LoggerHandler {
    
    @scala.inline
    def apply(handle: LogRecord => Unit): LoggerHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[LoggerHandler]
    }
    
    @scala.inline
    implicit class LoggerHandlerMutableBuilder[Self <: LoggerHandler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setHandle(value: LogRecord => Unit): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCliFramework.ionicCliFrameworkStrings.DEBUG
    - typings.ionicCliFramework.ionicCliFrameworkStrings.INFO
    - typings.ionicCliFramework.ionicCliFrameworkStrings.WARN
    - typings.ionicCliFramework.ionicCliFrameworkStrings.ERROR
  */
  trait LoggerLevel extends StObject
  object LoggerLevel {
    
    @scala.inline
    def DEBUG: typings.ionicCliFramework.ionicCliFrameworkStrings.DEBUG = "DEBUG".asInstanceOf[typings.ionicCliFramework.ionicCliFrameworkStrings.DEBUG]
    
    @scala.inline
    def ERROR: typings.ionicCliFramework.ionicCliFrameworkStrings.ERROR = "ERROR".asInstanceOf[typings.ionicCliFramework.ionicCliFrameworkStrings.ERROR]
    
    @scala.inline
    def INFO: typings.ionicCliFramework.ionicCliFrameworkStrings.INFO = "INFO".asInstanceOf[typings.ionicCliFramework.ionicCliFrameworkStrings.INFO]
    
    @scala.inline
    def WARN: typings.ionicCliFramework.ionicCliFrameworkStrings.WARN = "WARN".asInstanceOf[typings.ionicCliFramework.ionicCliFrameworkStrings.WARN]
  }
  
  type LoggerLevelWeight = Double
  
  trait LoggerOptions extends StObject {
    
    val handlers: js.UndefOr[Set[LoggerHandler]] = js.undefined
    
    val level: js.UndefOr[LoggerLevelWeight] = js.undefined
  }
  object LoggerOptions {
    
    @scala.inline
    def apply(): LoggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoggerOptions]
    }
    
    @scala.inline
    implicit class LoggerOptionsMutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandlers(value: Set[LoggerHandler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
      
      @scala.inline
      def setLevel(value: LoggerLevelWeight): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    }
  }
  
  trait StreamHandlerOptions extends StObject {
    
    val filter: js.UndefOr[js.Function1[/* record */ LogRecord, Boolean]] = js.undefined
    
    val formatter: js.UndefOr[LoggerFormatter] = js.undefined
    
    val stream: WritableStream
  }
  object StreamHandlerOptions {
    
    @scala.inline
    def apply(stream: WritableStream): StreamHandlerOptions = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamHandlerOptions]
    }
    
    @scala.inline
    implicit class StreamHandlerOptionsMutableBuilder[Self <: StreamHandlerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilter(value: /* record */ LogRecord => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setFormatter(value: /* record */ LogRecord => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      @scala.inline
      def setStream(value: WritableStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
}
