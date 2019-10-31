package typings.atJupyterlabLogconsole.libLoggerMod

import typings.atJupyterlabLogconsole.libLoggerMod.Logger.IOptions
import typings.atJupyterlabLogconsole.libTokensMod.IContentChange
import typings.atJupyterlabLogconsole.libTokensMod.ILogPayload
import typings.atJupyterlabLogconsole.libTokensMod.ILogger
import typings.atJupyterlabLogconsole.libTokensMod.ILoggerOutputAreaModel
import typings.atJupyterlabLogconsole.libTokensMod.IStateChange
import typings.atJupyterlabLogconsole.libTokensMod.LogLevel
import typings.atJupyterlabRendermime.libTokensMod.IRenderMimeRegistry
import typings.atPhosphorSignaling.atPhosphorSignalingMod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/logger", "Logger")
@js.native
class Logger_ protected () extends ILogger {
  /**
    * Construct a Logger.
    *
    * @param source - The name of the log source.
    */
  def this(options: IOptions) = this()
  var _contentChanged: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _level: js.Any = js.native
  var _log: js.Any = js.native
  var _rendermime: js.Any = js.native
  var _stateChanged: js.Any = js.native
  var _version: js.Any = js.native
  /**
    * A signal emitted when the log model changes.
    */
  /* CompleteClass */
  override val contentChanged: ISignal[this.type, IContentChange] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Number of outputs logged.
    */
  /* CompleteClass */
  override val length: Double = js.native
  /**
    * Log level.
    */
  /* CompleteClass */
  override var level: LogLevel = js.native
  /**
    * Max number of messages.
    */
  /* CompleteClass */
  override var maxLength: Double = js.native
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
  val outputAreaModel_Logger_ : LoggerOutputAreaModel = js.native
  /**
    * Rendermime to use when rendering outputs logged.
    */
  /* CompleteClass */
  override var rendermime: IRenderMimeRegistry = js.native
  /**
    * Rendermime to use when rendering outputs logged.
    */
  @JSName("rendermime")
  var rendermime_Logger_ : IRenderMimeRegistry | Null = js.native
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
    * The cumulative number of messages the log has stored.
    */
  /* CompleteClass */
  override val version: Double = js.native
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
    * Log an output to logger.
    *
    * @param log - The output to be logged.
    */
  /* CompleteClass */
  override def log(log: ILogPayload): Unit = js.native
}

