package typings.jupyterlabLogconsole

import typings.jupyterlabLogconsole.anon.LastModel
import typings.jupyterlabLogconsole.anon.Level
import typings.jupyterlabLogconsole.loggerMod.LogOutputModel.IOptions
import typings.jupyterlabLogconsole.tokensMod.IContentChange
import typings.jupyterlabLogconsole.tokensMod.ILogPayload
import typings.jupyterlabLogconsole.tokensMod.ILogger
import typings.jupyterlabLogconsole.tokensMod.ILoggerOutputAreaModel
import typings.jupyterlabLogconsole.tokensMod.IStateChange
import typings.jupyterlabLogconsole.tokensMod.LogLevel
import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.jupyterlabNbformat.mod.IOutput
import typings.jupyterlabOutputarea.mod.OutputAreaModel
import typings.jupyterlabRendermime.mod.OutputModel
import typings.jupyterlabRendermime.outputmodelMod.IOutputModel
import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.jupyterlabRendermimeInterfaces.mod.IRenderMime.IMimeModel.ISetDataOptions
import typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject
import typings.luminoSignaling.mod.ISignal
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @JSImport("@jupyterlab/logconsole/lib/logger", "LogOutputModel")
  @js.native
  class LogOutputModel protected ()
    extends OutputModel
       with ILogOutputModel {
    /**
      * Construct a LogOutputModel.
      *
      * @param options - The model initialization options.
      */
    def this(options: IOptions) = this()
    
    /**
      * A signal emitted when the output model changes.
      */
    /* CompleteClass */
    override val changed: ISignal[this.type, Unit] = js.native
    
    /**
      * The data associated with the model.
      */
    /* CompleteClass */
    override val data: ReadonlyPartialJSONObject = js.native
    
    /**
      * Dispose of the resources used by the output model.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def dispose(): Unit = js.native
    
    /**
      * The execution count of the model.
      */
    /* CompleteClass */
    override val executionCount: ExecutionCount = js.native
    
    /**
      * Log level
      */
    /* CompleteClass */
    override val level: FullLogLevel = js.native
    
    /**
      * The metadata associated with the model.
      *
      * Among others, it can include an attribute named `fragment`
      * that stores a URI fragment identifier for the MIME resource.
      */
    /* CompleteClass */
    override val metadata: ReadonlyPartialJSONObject = js.native
    
    /**
      * Set the data associated with the model.
      *
      * #### Notes
      * Calling this function may trigger an asynchronous operation
      * that could cause the renderer to be rendered with a new model
      * containing the new data.
      */
    /* InferMemberOverrides */
    override def setData(options: ISetDataOptions): Unit = js.native
    
    /**
      * Date & time when output is logged.
      */
    /* CompleteClass */
    override val timestamp: Date = js.native
    
    /**
      * Serialize the model to JSON.
      */
    /* CompleteClass */
    /* InferMemberOverrides */
    override def toJSON(): IOutput = js.native
    
    /**
      * Whether the data in the model is trusted.
      */
    /* CompleteClass */
    override val trusted: Boolean = js.native
    
    /**
      * The output type.
      */
    /* CompleteClass */
    override val `type`: String = js.native
  }
  /**
    * Log Output Model namespace that defines initialization options.
    */
  object LogOutputModel {
    
    trait IOptions
      extends StObject
         with typings.jupyterlabRendermime.outputmodelMod.IOutputModel.IOptions
    object IOptions {
      
      inline def apply(value: IOutput): IOptions = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
    }
  }
  
  @JSImport("@jupyterlab/logconsole/lib/logger", "Logger")
  @js.native
  class Logger protected ()
    extends StObject
       with ILogger {
    /**
      * Construct a Logger.
      *
      * @param source - The name of the log source.
      */
    def this(options: typings.jupyterlabLogconsole.loggerMod.Logger.IOptions) = this()
    
    /* private */ var _contentChanged: js.Any = js.native
    
    /* private */ var _isDisposed: js.Any = js.native
    
    /* private */ var _level: js.Any = js.native
    
    /* private */ var _log: js.Any = js.native
    
    /* private */ var _rendermime: js.Any = js.native
    
    /* private */ var _stateChanged: js.Any = js.native
    
    /* private */ var _version: js.Any = js.native
    
    /**
      * Add a checkpoint in the log.
      */
    /* CompleteClass */
    override def checkpoint(): Unit = js.native
    
    /**
      * Clear all outputs logged.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * A signal emitted when the log model changes.
      */
    /* CompleteClass */
    override val contentChanged: ISignal[this.type, IContentChange] = js.native
    /**
      * A signal emitted when the list of log messages changes.
      */
    @JSName("contentChanged")
    def contentChanged_MLogger: ISignal[this.type, IContentChange] = js.native
    
    /**
      * Dispose of the resources held by the object.
      *
      * #### Notes
      * If the object's `dispose` method is called more than once, all
      * calls made after the first will be a no-op.
      *
      * #### Undefined Behavior
      * It is undefined behavior to use any functionality of the object
      * after it has been disposed unless otherwise explicitly noted.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Whether the logger is disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MLogger: Boolean = js.native
    
    /**
      * Number of outputs logged.
      */
    /* CompleteClass */
    override val length: Double = js.native
    /**
      * Number of outputs logged.
      */
    @JSName("length")
    def length_MLogger: Double = js.native
    
    /**
      * Log level.
      */
    /* CompleteClass */
    var level: LogLevel = js.native
    /**
      * The level of outputs logged
      */
    @JSName("level")
    def level_MLogger: LogLevel = js.native
    
    /**
      * Log an output to logger.
      *
      * @param log - The output to be logged.
      */
    /* CompleteClass */
    override def log(log: ILogPayload): Unit = js.native
    
    /**
      * Max number of messages.
      */
    /* CompleteClass */
    var maxLength: Double = js.native
    /**
      * The maximum number of outputs stored.
      *
      * #### Notes
      * Oldest entries will be trimmed to ensure the length is at most
      * `.maxLength`.
      */
    @JSName("maxLength")
    def maxLength_MLogger: Double = js.native
    
    /**
      * Output Area Model used to manage log storage in memory.
      */
    /* CompleteClass */
    override val outputAreaModel: ILoggerOutputAreaModel = js.native
    /**
      * The output area model used for the logger.
      *
      * #### Notes
      * This will usually not be accessed directly. It is a public attribute so
      * that the renderer can access it.
      */
    @JSName("outputAreaModel")
    val outputAreaModel_Logger: LoggerOutputAreaModel = js.native
    
    /**
      * Rendermime to use when rendering outputs logged.
      */
    /* CompleteClass */
    var rendermime: IRenderMimeRegistry | Null = js.native
    /**
      * Rendermime to use when rendering outputs logged.
      */
    @JSName("rendermime")
    def rendermime_MLogger: IRenderMimeRegistry | Null = js.native
    
    /**
      * The name of the log source.
      */
    /* CompleteClass */
    override val source: String = js.native
    
    /**
      * A signal emitted when the rendermime changes.
      */
    /* CompleteClass */
    override val stateChanged: ISignal[this.type, IStateChange] = js.native
    /**
      * A signal emitted when the log state changes.
      */
    @JSName("stateChanged")
    def stateChanged_MLogger: ISignal[this.type, IStateChange] = js.native
    
    /**
      * The cumulative number of messages the log has stored.
      */
    /* CompleteClass */
    override val version: Double = js.native
    /**
      * The number of messages that have ever been stored.
      */
    @JSName("version")
    def version_MLogger: Double = js.native
  }
  object Logger {
    
    trait IOptions extends StObject {
      
      /**
        * The maximum number of messages to store.
        */
      var maxLength: Double
      
      /**
        * The log source identifier.
        */
      var source: String
    }
    object IOptions {
      
      inline def apply(maxLength: Double, source: String): typings.jupyterlabLogconsole.loggerMod.Logger.IOptions = {
        val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabLogconsole.loggerMod.Logger.IOptions]
      }
      
      extension [Self <: typings.jupyterlabLogconsole.loggerMod.Logger.IOptions](x: Self) {
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
        
        inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.jupyterlabOutputarea.modelMod.IOutputAreaModel because Already inherited
  - typings.jupyterlabLogconsole.tokensMod.ILoggerOutputAreaModel because var conflicts: trusted. Inlined maxLength */ @JSImport("@jupyterlab/logconsole/lib/logger", "LoggerOutputAreaModel")
  @js.native
  class LoggerOutputAreaModel protected () extends OutputAreaModel {
    def this(hasMaxLengthOptions: typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions) = this()
    
    /**
      * Manually apply length limit.
      */
    /* private */ var _applyMaxLength: js.Any = js.native
    
    /* private */ var _maxLength: js.Any = js.native
    
    /**
      * Maximum number of outputs to store in the model.
      */
    def maxLength: Double = js.native
    def maxLength_=(value: Double): Unit = js.native
    /**
      * The maximum number of outputs to store.
      */
    @JSName("maxLength")
    var maxLength_FLoggerOutputAreaModel: Double = js.native
    
    /**
      * Whether an output should combine with the previous output.
      *
      * We combine if the two outputs are in the same second, which is the
      * resolution for our time display.
      */
    /* protected */ def shouldCombine(options: LastModel): Boolean = js.native
  }
  object LoggerOutputAreaModel {
    
    trait IOptions
      extends StObject
         with typings.jupyterlabOutputarea.modelMod.IOutputAreaModel.IOptions {
      
      /**
        * The maximum number of messages stored.
        */
      var maxLength: Double
    }
    object IOptions {
      
      inline def apply(maxLength: Double): typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions = {
        val __obj = js.Dynamic.literal(maxLength = maxLength.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions]
      }
      
      extension [Self <: typings.jupyterlabLogconsole.loggerMod.LoggerOutputAreaModel.IOptions](x: Self) {
        
        inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /**
    * All severity levels, including an internal one for metadata.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info
    - typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug
  */
  trait FullLogLevel extends StObject
  object FullLogLevel {
    
    inline def critical: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical = "critical".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.critical]
    
    inline def debug: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug = "debug".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.debug]
    
    inline def error: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error = "error".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.error]
    
    inline def info: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info = "info".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.info]
    
    inline def metadata: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata = "metadata".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.metadata]
    
    inline def warning: typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning = "warning".asInstanceOf[typings.jupyterlabLogconsole.jupyterlabLogconsoleStrings.warning]
  }
  
  /**
    * Custom Notebook Output with log info.
    */
  type ILogOutput = IOutput & Level
  
  trait ILogOutputModel
    extends StObject
       with IOutputModel {
    
    /**
      * Log level
      */
    val level: FullLogLevel
    
    /**
      * Date & time when output is logged.
      */
    val timestamp: Date
  }
  object ILogOutputModel {
    
    inline def apply(
      changed: ISignal[ILogOutputModel, Unit],
      data: ReadonlyPartialJSONObject,
      dispose: () => Unit,
      level: FullLogLevel,
      metadata: ReadonlyPartialJSONObject,
      setData: ISetDataOptions => Unit,
      timestamp: Date,
      toJSON: () => IOutput,
      trusted: Boolean,
      `type`: String
    ): ILogOutputModel = {
      val __obj = js.Dynamic.literal(changed = changed.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), level = level.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData), timestamp = timestamp.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), trusted = trusted.asInstanceOf[js.Any], executionCount = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILogOutputModel]
    }
    
    extension [Self <: ILogOutputModel](x: Self) {
      
      inline def setLevel(value: FullLogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
}
