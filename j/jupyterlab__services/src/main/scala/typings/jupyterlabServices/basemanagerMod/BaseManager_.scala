package typings.jupyterlabServices.basemanagerMod

import typings.jupyterlabServices.basemanagerMod.BaseManager.IOptions
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/services/lib/basemanager", "BaseManager")
@js.native
abstract class BaseManager_ protected () extends IManager {
  def this(options: IOptions) = this()
  
  var _disposed: js.Any = js.native
  
  var _isDisposed: js.Any = js.native
  
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  var connectionFailure_BaseManager_ : ISignal[this.type, Error] = js.native
  
  /**
    * A signal emitted when the delegate is disposed.
    */
  @JSName("disposed")
  def disposed_MBaseManager_ : ISignal[this.type, Unit] = js.native
  
  /**
    * Test whether the delegate has been disposed.
    */
  @JSName("isDisposed")
  def isDisposed_MBaseManager_ : Boolean = js.native
}
