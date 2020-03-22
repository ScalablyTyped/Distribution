package typings.jupyterlabLogconsole.tokensMod

import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILogger extends IDisposable {
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
  /**
    * Add a checkpoint in the log.
    */
  def checkpoint(): Unit
  /**
    * Clear all outputs logged.
    */
  def clear(): Unit
  /**
    * Log an output to logger.
    *
    * @param log - The output to be logged.
    */
  def log(log: ILogPayload): Unit
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
    version: Double,
    rendermime: IRenderMimeRegistry = null
  ): ILogger = {
    val __obj = js.Dynamic.literal(checkpoint = js.Any.fromFunction0(checkpoint), clear = js.Any.fromFunction0(clear), contentChanged = contentChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], log = js.Any.fromFunction1(log), maxLength = maxLength.asInstanceOf[js.Any], outputAreaModel = outputAreaModel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], stateChanged = stateChanged.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (rendermime != null) __obj.updateDynamic("rendermime")(rendermime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILogger]
  }
}

