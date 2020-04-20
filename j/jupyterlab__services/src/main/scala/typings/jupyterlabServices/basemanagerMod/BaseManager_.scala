package typings.jupyterlabServices.basemanagerMod

import typings.jupyterlabServices.basemanagerMod.BaseManager.IOptions
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError
import typings.luminoSignaling.mod.ISignal
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/basemanager", "BaseManager")
@js.native
abstract class BaseManager_ protected () extends IManager {
  def this(options: IOptions) = this()
  var _disposed: js.Any = js.native
  var _isDisposed: js.Any = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  /* CompleteClass */
  override var connectionFailure: ISignal[IManager, NetworkError] = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  var connectionFailure_BaseManager_ : ISignal[this.type, Error] = js.native
  /**
    * A signal emitted when the object is disposed.
    */
  /* CompleteClass */
  override val disposed: ISignal[this.type, Unit] = js.native
  /**
    * Test whether the object has been disposed.
    *
    * #### Notes
    * This property is always safe to access.
    */
  /* CompleteClass */
  override val isDisposed: Boolean = js.native
  /**
    * Whether the manager is ready.
    */
  /* CompleteClass */
  override val isReady: Boolean = js.native
  /**
    * A promise that resolves when the manager is initially ready.
    */
  /* CompleteClass */
  override val ready: js.Promise[Unit] = js.native
  /**
    * The server settings for the manager.
    */
  /* CompleteClass */
  override val serverSettings: ISettings = js.native
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

