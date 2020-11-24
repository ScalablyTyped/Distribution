package typings.jupyterlabLogconsole.registryMod

import typings.jupyterlabLogconsole.registryMod.LoggerRegistry.IOptions
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistry
import typings.jupyterlabLogconsole.tokensMod.ILoggerRegistryChange
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Whether the register is disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MLoggerRegistry_ : Boolean = js.native
  
  /**
    * The max length for loggers.
    */
  def maxLength: Double = js.native
  def maxLength_=(value: Double): Unit = js.native
  
  /**
    * A signal emitted when the logger registry changes.
    */
  @JSName("registryChanged")
  def registryChanged_MLoggerRegistry_ : ISignal[this.type, ILoggerRegistryChange] = js.native
}
