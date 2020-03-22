package typings.jupyterlabLogconsole.registryMod

import typings.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions
import typings.jupyterlabLogconsole.tokensMod.ILogger
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistryChange
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/logconsole/lib/registry", "LoggerRegistry")
@js.native
class LoggerRegistry_ protected () extends ILoggerRegistry {
  /**
    * Construct a LoggerRegistry.
    *
    * @param defaultRendermime - Default rendermime to render outputs
    * with when logger is not supplied with one.
    */
  def this(options: IOptions) = this()
  var _defaultRendermime: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _loggers: js.Any = js.native
  var _maxLength: js.Any = js.native
  var _registryChanged: js.Any = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * A signal emitted when the logger registry changes.
    */
  /* CompleteClass */
  override val registryChanged: ISignal[this.type, ILoggerRegistryChange] = js.native
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
    * Get the logger for the specified source.
    *
    * @param source - The name of the log source.
    *
    * @returns The logger for the specified source.
    */
  /* CompleteClass */
  override def getLogger(source: String): ILogger = js.native
  /**
    * Get all loggers registered.
    *
    * @returns The array containing all registered loggers.
    */
  /* CompleteClass */
  override def getLoggers(): js.Array[ILogger] = js.native
  /**
    * Whether the register is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MLoggerRegistry_(): Boolean = js.native
  /**
    * The max length for loggers.
    */
  def maxLength(): Double = js.native
  def maxLength(value: Double): js.Any = js.native
  /**
    * A signal emitted when the logger registry changes.
    */
  @JSName("registryChanged")
  def registryChanged_MLoggerRegistry_(): ISignal[this.type, ILoggerRegistryChange] = js.native
}

