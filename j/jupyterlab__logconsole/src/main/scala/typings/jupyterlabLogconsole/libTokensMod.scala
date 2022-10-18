package typings.jupyterlabLogconsole

import typings.jupyterlabCoreutils.libInterfacesMod.IChangedArgs
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.html
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.level
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.output
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.rendermime
import typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.text
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabOutputarea.libModelMod.IOutputAreaModel
import typings.jupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.luminoCoreutils.mod.Token
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  trait ILoggerRegistry
    extends StObject
       with IDisposable {
    
    /**
      * Get the logger for the specified source.
      *
      * @param source - The name of the log source.
      *
      * @returns The logger for the specified source.
      */
    def getLogger(source: String): ILogger
    
    /**
      * Get all loggers registered.
      *
      * @returns The array containing all registered loggers.
      */
    def getLoggers(): js.Array[ILogger]
    
    /**
      * A signal emitted when the logger registry changes.
      */
    val registryChanged: ISignal[this.type, ILoggerRegistryChange]
  }
  object ILoggerRegistry {
    
    @JSImport("@jupyterlab/logconsole/lib/tokens", "ILoggerRegistry")
    @js.native
    val ^ : Token[ILoggerRegistry] = js.native
    
    extension [Self <: ILoggerRegistry](x: Self) {
      
      inline def setGetLogger(value: String => ILogger): Self = StObject.set(x, "getLogger", js.Any.fromFunction1(value))
      
      inline def setGetLoggers(value: () => js.Array[ILogger]): Self = StObject.set(x, "getLoggers", js.Any.fromFunction0(value))
      
      inline def setRegistryChanged(value: ISignal[ILoggerRegistry, ILoggerRegistryChange]): Self = StObject.set(x, "registryChanged", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear
  */
  trait IContentChange extends StObject
  object IContentChange {
    
    inline def append: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append = "append".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.append]
    
    inline def clear: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear = "clear".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.clear]
  }
  
  trait IHtmlLog
    extends StObject
       with ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as HTML string.
      */
    @JSName("data")
    var data_IHtmlLog: String
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_IHtmlLog: html
  }
  object IHtmlLog {
    
    inline def apply(data: String, level: LogLevel): IHtmlLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("html")
      __obj.asInstanceOf[IHtmlLog]
    }
    
    extension [Self <: IHtmlLog](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: html): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.libTokensMod.ITextLog
    - typings.jupyterlabLogconsole.libTokensMod.IHtmlLog
    - typings.jupyterlabLogconsole.libTokensMod.IOutputLog
  */
  trait ILogPayload extends StObject
  object ILogPayload {
    
    inline def IHtmlLog(data: String, level: LogLevel): typings.jupyterlabLogconsole.libTokensMod.IHtmlLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("html")
      __obj.asInstanceOf[typings.jupyterlabLogconsole.libTokensMod.IHtmlLog]
    }
    
    inline def IOutputLog(data: IOutput, level: LogLevel): typings.jupyterlabLogconsole.libTokensMod.IOutputLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("output")
      __obj.asInstanceOf[typings.jupyterlabLogconsole.libTokensMod.IOutputLog]
    }
    
    inline def ITextLog(data: String, level: LogLevel): typings.jupyterlabLogconsole.libTokensMod.ITextLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.jupyterlabLogconsole.libTokensMod.ITextLog]
    }
  }
  
  trait ILogPayloadBase extends StObject {
    
    /**
      * Data
      */
    var data: Any
    
    /**
      * Log level
      */
    var level: LogLevel
    
    /**
      * Type of log data.
      */
    var `type`: String
  }
  object ILogPayloadBase {
    
    inline def apply(data: Any, level: LogLevel, `type`: String): ILogPayloadBase = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogPayloadBase]
    }
    
    extension [Self <: ILogPayloadBase](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILogger
    extends StObject
       with IDisposable {
    
    /**
      * Add a checkpoint in the log.
      */
    def checkpoint(): Unit
    
    /**
      * Clear all outputs logged.
      */
    def clear(): Unit
    
    /**
      * A signal emitted when the log model changes.
      */
    val contentChanged: ISignal[this.type, IContentChange]
    
    /**
      * Number of outputs logged.
      */
    val length: Double
    
    /**
      * Log level.
      */
    var level: LogLevel
    
    /**
      * Log an output to logger.
      *
      * @param log - The output to be logged.
      */
    def log(log: ILogPayload): Unit
    
    /**
      * Max number of messages.
      */
    var maxLength: Double
    
    /**
      * Output Area Model used to manage log storage in memory.
      */
    val outputAreaModel: ILoggerOutputAreaModel
    
    /**
      * Rendermime to use when rendering outputs logged.
      */
    var rendermime: IRenderMimeRegistry | Null
    
    /**
      * The name of the log source.
      */
    val source: String
    
    /**
      * A signal emitted when the rendermime changes.
      */
    val stateChanged: ISignal[this.type, IStateChange]
    
    /**
      * The cumulative number of messages the log has stored.
      */
    val version: Double
  }
  object ILogger {
    
    inline def apply(
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
      val __obj = js.Dynamic.literal(checkpoint = js.Any.fromFunction0(checkpoint), clear = js.Any.fromFunction0(clear), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), maxLength = maxLength.asInstanceOf[js.Any], outputAreaModel = outputAreaModel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], rendermime = null)
      __obj.asInstanceOf[ILogger]
    }
    
    extension [Self <: ILogger](x: Self) {
      
      inline def setCheckpoint(value: () => Unit): Self = StObject.set(x, "checkpoint", js.Any.fromFunction0(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setContentChanged(value: ISignal[ILogger, IContentChange]): Self = StObject.set(x, "contentChanged", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLog(value: ILogPayload => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setOutputAreaModel(value: ILoggerOutputAreaModel): Self = StObject.set(x, "outputAreaModel", value.asInstanceOf[js.Any])
      
      inline def setRendermime(value: IRenderMimeRegistry): Self = StObject.set(x, "rendermime", value.asInstanceOf[js.Any])
      
      inline def setRendermimeNull: Self = StObject.set(x, "rendermime", null)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStateChanged(value: ISignal[ILogger, IStateChange]): Self = StObject.set(x, "stateChanged", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ILoggerOutputAreaModel
    extends StObject
       with IOutputAreaModel {
    
    /**
      * The maximum number of outputs to store.
      */
    var maxLength: Double = js.native
  }
  
  type ILoggerRegistryChange = append
  
  trait IOutputLog
    extends StObject
       with ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as Notebook kernel output.
      */
    @JSName("data")
    var data_IOutputLog: IOutput
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_IOutputLog: output
  }
  object IOutputLog {
    
    inline def apply(data: IOutput, level: LogLevel): IOutputLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("output")
      __obj.asInstanceOf[IOutputLog]
    }
    
    extension [Self <: IOutputLog](x: Self) {
      
      inline def setData(value: IOutput): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: output): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type IStateChange = IChangedArgs[
    IRenderMimeRegistry | LogLevel | Null, 
    IRenderMimeRegistry | LogLevel | Null, 
    rendermime | level
  ]
  
  trait ITextLog
    extends StObject
       with ILogPayloadBase
       with ILogPayload {
    
    /**
      * Log data as plain text.
      */
    @JSName("data")
    var data_ITextLog: String
    
    /**
      * Type of log data.
      */
    @JSName("type")
    var type_ITextLog: text
  }
  object ITextLog {
    
    inline def apply(data: String, level: LogLevel): ITextLog = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[ITextLog]
    }
    
    extension [Self <: ITextLog](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def critical: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = "critical".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical]
    
    inline def debug: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = "debug".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug]
    
    inline def error: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = "error".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error]
    
    inline def info: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = "info".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info]
    
    inline def warning: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = "warning".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning]
  }
}
