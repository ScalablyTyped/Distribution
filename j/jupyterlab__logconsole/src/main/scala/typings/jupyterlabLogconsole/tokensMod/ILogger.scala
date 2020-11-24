package typings.jupyterlabLogconsole.tokensMod

import typings.jupyterlabRendermime.tokensMod.IRenderMimeRegistry
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ILoggerOps[Self <: ILogger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckpoint(value: () => Unit): Self = this.set("checkpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContentChanged(value: ISignal[ILogger, IContentChange]): Self = this.set("contentChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: LogLevel): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: ILogPayload => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMaxLength(value: Double): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputAreaModel(value: ILoggerOutputAreaModel): Self = this.set("outputAreaModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateChanged(value: ISignal[ILogger, IStateChange]): Self = this.set("stateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermime(value: IRenderMimeRegistry): Self = this.set("rendermime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendermimeNull: Self = this.set("rendermime", null)
  }
}
