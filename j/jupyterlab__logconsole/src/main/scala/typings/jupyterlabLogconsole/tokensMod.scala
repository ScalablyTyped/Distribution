package typings.jupyterlabLogconsole

import typings.jupyterlabCoreutils.interfacesMod.IChangedArgs
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.html
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.level
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.rendermime
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabOutputarea.modelMod.IOutputAreaModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tokensMod {
  
  @js.native
  trait ILoggerRegistry extends IDisposable {
    
    /**
      * Get the logger for the specified source.
      *
      * @param source - The name of the log source.
      *
      * @returns The logger for the specified source.
      */
    def getLogger(source: String): ILogger = js.native
    
    /**
      * Get all loggers registered.
      *
      * @returns The array containing all registered loggers.
      */
    def getLoggers(): js.Array[ILogger] = js.native
    
    /**
      * A signal emitted when the logger registry changes.
      */
    val registryChanged: ISignal[this.type, ILoggerRegistryChange] = js.native
  }
  object ILoggerRegistry {
    
    @JSImport("@jupyterlab/logconsole/lib/tokens", "ILoggerRegistry")
    @js.native
    val ^ : Token[ILoggerRegistry] = js.native
    
    @scala.inline
    implicit class ILoggerRegistryMutableBuilder[Self <: ILoggerRegistry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLogger(value: String => ILogger): Self = StObject.set(x, "getLogger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetLoggers(value: () => js.Array[ILogger]): Self = StObject.set(x, "getLoggers", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegistryChanged(value: ISignal[ILoggerRegistry, ILoggerRegistryChange]): Self = StObject.set(x, "registryChanged", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear
  */
  trait IContentChange extends StObject
  object IContentChange {
    
    @scala.inline
    def append: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append = "append".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append]
    
    @scala.inline
    def clear: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear = "clear".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear]
  }
  
  @js.native
  trait IHtmlLog
    extends ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as HTML string.
      */
    @JSName("data")
    var data_IHtmlLog: String = js.native
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_IHtmlLog: html = js.native
  }
  object IHtmlLog {
    
    @scala.inline
    def apply(data: String, level: LogLevel, `type`: html): IHtmlLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHtmlLog]
    }
    
    @scala.inline
    implicit class IHtmlLogMutableBuilder[Self <: IHtmlLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.tokensMod.ITextLog
    - typings.jupyterlabLogconsole.tokensMod.IHtmlLog
    - typings.jupyterlabLogconsole.tokensMod.IOutputLog
  */
  trait ILogPayload extends StObject
  object ILogPayload {
    
    @scala.inline
    def IHtmlLog(data: String, level: LogLevel, `type`: html): typings.jupyterlabLogconsole.tokensMod.IHtmlLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jupyterlabLogconsole.tokensMod.IHtmlLog]
    }
    
    @scala.inline
    def IOutputLog(data: IOutput, level: LogLevel, `type`: output): typings.jupyterlabLogconsole.tokensMod.IOutputLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jupyterlabLogconsole.tokensMod.IOutputLog]
    }
    
    @scala.inline
    def ITextLog(data: String, level: LogLevel, `type`: text): typings.jupyterlabLogconsole.tokensMod.ITextLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jupyterlabLogconsole.tokensMod.ITextLog]
    }
  }
  
  @js.native
  trait ILogPayloadBase extends StObject {
    
    /**
      * Data
      */
    var data: js.Any = js.native
    
    /**
      * Log level
      */
    var level: LogLevel = js.native
    
    /**
      * Type of log data.
      */
    var `type`: String = js.native
  }
  object ILogPayloadBase {
    
    @scala.inline
    def apply(data: js.Any, level: LogLevel, `type`: String): ILogPayloadBase = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogPayloadBase]
    }
    
    @scala.inline
    implicit class ILogPayloadBaseMutableBuilder[Self <: ILogPayloadBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILogger extends IDisposable {
    
    /**
      * Add a checkpoint in the log.
      */
    def checkpoint(): Unit = js.native
    
    /**
      * Clear all outputs logged.
      */
    def clear(): Unit = js.native
    
    /**
      * A signal emitted when the log model changes.
      */
    val contentChanged: ISignal[this.type, IContentChange] = js.native
    
    /**
      * Number of outputs logged.
      */
    val length: Double = js.native
    
    /**
      * Log level.
      */
    var level: LogLevel = js.native
    
    /**
      * Log an output to logger.
      *
      * @param log - The output to be logged.
      */
    def log(log: ILogPayload): Unit = js.native
    
    /**
      * Max number of messages.
      */
    var maxLength: Double = js.native
    
    /**
      * Output Area Model used to manage log storage in memory.
      */
    val outputAreaModel: ILoggerOutputAreaModel = js.native
    
    /**
      * Rendermime to use when rendering outputs logged.
      */
    var rendermime: IRenderMimeRegistry | Null = js.native
    
    /**
      * The name of the log source.
      */
    val source: String = js.native
    
    /**
      * A signal emitted when the rendermime changes.
      */
    val stateChanged: ISignal[this.type, IStateChange] = js.native
    
    /**
      * The cumulative number of messages the log has stored.
      */
    val version: Double = js.native
  }
  object ILogger {
    
    @scala.inline
    def apply(
      checkpoint: () => Unit,
      clear: () => Unit,
      contentChanged: ISignal[ILogger, IContentChange],
      dispose: () => Unit,
      isDisposed: Boolean,
      length: Double,
      level: LogLevel,
      log: ILogPayload => Unit,
      maxLength: Double,
      outputAreaModel: ILoggerOutputAreaModel,
      source: String,
      stateChanged: ISignal[ILogger, IStateChange],
      version: Double
    ): ILogger = {
      val __obj = js.Dynamic.literal(checkpoint = js.Any.fromFunction0(checkpoint), clear = js.Any.fromFunction0(clear), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), maxLength = maxLength.asInstanceOf[js.Any], outputAreaModel = outputAreaModel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogger]
    }
    
    @scala.inline
    implicit class ILoggerMutableBuilder[Self <: ILogger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckpoint(value: () => Unit): Self = StObject.set(x, "checkpoint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentChanged(value: ISignal[ILogger, IContentChange]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLog(value: ILogPayload => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputAreaModel(value: ILoggerOutputAreaModel): Self = StObject.set(x, "outputAreaModel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendermimeNull: Self = StObject.set(x, "rendermime", null)
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateChanged(value: ISignal[ILogger, IStateChange]): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILoggerOutputAreaModel extends IOutputAreaModel {
    
    /**
      * The maximum number of outputs to store.
      */
    var maxLength: Double = js.native
  }
  
  type ILoggerRegistryChange = append
  
  @js.native
  trait IOutputLog
    extends ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as Notebook kernel output.
      */
    @JSName("data")
    var data_IOutputLog: IOutput = js.native
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_IOutputLog: output = js.native
  }
  object IOutputLog {
    
    @scala.inline
    def apply(data: IOutput, level: LogLevel, `type`: output): IOutputLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOutputLog]
    }
    
    @scala.inline
    implicit class IOutputLogMutableBuilder[Self <: IOutputLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: IOutput): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: output): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IStateChange = IChangedArgs[
    IRenderMimeRegistry | LogLevel | Null, 
    IRenderMimeRegistry | LogLevel | Null, 
    rendermime | level
  ]
  
  @js.native
  trait ITextLog
    extends ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as plain text.
      */
    @JSName("data")
    var data_ITextLog: String = js.native
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_ITextLog: text = js.native
  }
  object ITextLog {
    
    @scala.inline
    def apply(data: String, level: LogLevel, `type`: text): ITextLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextLog]
    }
    
    @scala.inline
    implicit class ITextLogMutableBuilder[Self <: ITextLog] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def critical: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = "critical".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical]
    
    @scala.inline
    def debug: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = "debug".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug]
    
    @scala.inline
    def error: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = "error".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error]
    
    @scala.inline
    def info: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = "info".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info]
    
    @scala.inline
    def warning: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = "warning".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning]
  }
}
