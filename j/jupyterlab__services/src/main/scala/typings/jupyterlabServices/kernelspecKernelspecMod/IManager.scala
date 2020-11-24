package typings.jupyterlabServices.kernelspecKernelspecMod

import typings.jupyterlabServices.restapiMod.ISpecModels
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManager
  extends typings.jupyterlabServices.basemanagerMod.IManager {
  
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshSpecs(): js.Promise[Unit] = js.native
  
  /**
    * The kernel spec models.
    *
    * #### Notes
    * The value will be null until the manager is ready.
    */
  val specs: ISpecModels | Null = js.native
  
  /**
    * A signal emitted when the kernel specs change.
    */
  var specsChanged: ISignal[IManager, ISpecModels] = js.native
}
object IManager {
  
  @scala.inline
  def apply(
    connectionFailure: ISignal[typings.jupyterlabServices.basemanagerMod.IManager, NetworkError],
    dispose: () => Unit,
    disposed: ISignal[IManager, Unit],
    isDisposed: Boolean,
    isReady: Boolean,
    ready: js.Promise[Unit],
    refreshSpecs: () => js.Promise[Unit],
    serverSettings: ISettings,
    specsChanged: ISignal[IManager, ISpecModels]
  ): IManager = {
    val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], refreshSpecs = js.Any.fromFunction0(refreshSpecs), serverSettings = serverSettings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any])
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
    def setRefreshSpecs(value: () => js.Promise[Unit]): Self = this.set("refreshSpecs", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSpecsChanged(value: ISignal[IManager, ISpecModels]): Self = this.set("specsChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecs(value: ISpecModels): Self = this.set("specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsNull: Self = this.set("specs", null)
  }
}
