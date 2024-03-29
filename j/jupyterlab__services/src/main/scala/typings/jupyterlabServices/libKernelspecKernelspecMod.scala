package typings.jupyterlabServices

import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.NetworkError
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecKernelspecMod {
  
  trait IManager
    extends StObject
       with typings.jupyterlabServices.libBasemanagerMod.IManager {
    
    /**
      * Force a refresh of the specs from the server.
      *
      * @returns A promise that resolves when the specs are fetched.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshSpecs(): js.Promise[Unit]
    
    /**
      * The kernel spec models.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    val specs: ISpecModels | Null
    
    /**
      * A signal emitted when the kernel specs change.
      */
    var specsChanged: ISignal[IManager, ISpecModels]
  }
  object IManager {
    
    inline def apply(
      connectionFailure: ISignal[typings.jupyterlabServices.libBasemanagerMod.IManager, NetworkError],
      dispose: () => Unit,
      disposed: ISignal[IManager, Unit],
      isDisposed: Boolean,
      isReady: Boolean,
      ready: js.Promise[Unit],
      refreshSpecs: () => js.Promise[Unit],
      serverSettings: ISettings,
      specsChanged: ISignal[IManager, ISpecModels]
    ): IManager = {
      val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], refreshSpecs = js.Any.fromFunction0(refreshSpecs), serverSettings = serverSettings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any], specs = null)
      __obj.asInstanceOf[IManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
      
      inline def setRefreshSpecs(value: () => js.Promise[Unit]): Self = StObject.set(x, "refreshSpecs", js.Any.fromFunction0(value))
      
      inline def setSpecs(value: ISpecModels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
      
      inline def setSpecsChanged(value: ISignal[IManager, ISpecModels]): Self = StObject.set(x, "specsChanged", value.asInstanceOf[js.Any])
      
      inline def setSpecsNull: Self = StObject.set(x, "specs", null)
    }
  }
}
