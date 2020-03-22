package typings.jupyterlabServices.basemanagerMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManager extends IObservableDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError]
  /**
    * Whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * A promise that resolves when the manager is initially ready.
    */
  val ready: js.Promise[Unit]
  /**
    * The server settings for the manager.
    */
  val serverSettings: ISettings
}

object IManager {
  @scala.inline
  def apply(
    connectionFailure: ISignal[IManager, NetworkError],
    dispose: () => Unit,
    disposed: ISignal[IManager, Unit],
    isDisposed: Boolean,
    isReady: Boolean,
    ready: js.Promise[Unit],
    serverSettings: ISettings
  ): IManager = {
    val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IManager]
  }
}

