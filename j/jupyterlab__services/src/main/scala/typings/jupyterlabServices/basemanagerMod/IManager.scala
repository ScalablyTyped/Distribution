package typings.jupyterlabServices.basemanagerMod

import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManager extends IObservableDisposable {
  
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError] = js.native
  
  /**
    * Whether the manager is ready.
    */
  val isReady: Boolean = js.native
  
  /**
    * A promise that resolves when the manager is initially ready.
    */
  val ready: js.Promise[Unit] = js.native
  
  /**
    * The server settings for the manager.
    */
  val serverSettings: ISettings = js.native
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
  
  @scala.inline
  implicit class IManagerOps[Self <: IManager] (val x: Self) extends AnyVal {
    
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
    def setConnectionFailure(value: ISignal[IManager, NetworkError]): Self = this.set("connectionFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsReady(value: Boolean): Self = this.set("isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: js.Promise[Unit]): Self = this.set("ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerSettings(value: ISettings): Self = this.set("serverSettings", value.asInstanceOf[js.Any])
  }
}
