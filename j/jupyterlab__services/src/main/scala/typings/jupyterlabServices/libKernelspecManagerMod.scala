package typings.jupyterlabServices

import typings.jupyterlabServices.libBasemanagerMod.BaseManager
import typings.jupyterlabServices.libKernelspecKernelspecMod.IManager
import typings.jupyterlabServices.libKernelspecManagerMod.KernelSpecManager.IOptions
import typings.jupyterlabServices.libKernelspecRestapiMod.ISpecModels
import typings.luminoPolling.typesPollMod.Poll.Standby
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecManagerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.luminoDisposable.mod.IDisposable because Already inherited
  - typings.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typings.jupyterlabServices.libBasemanagerMod.IManager because Already inherited
  - typings.jupyterlabServices.libKernelspecKernelspecMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined specsChanged, specs, refreshSpecs */ @JSImport("@jupyterlab/services/lib/kernelspec/manager", "KernelSpecManager")
  @js.native
  /**
    * Construct a new kernel spec manager.
    *
    * @param options - The default options for kernel.
    */
  open class KernelSpecManager () extends BaseManager {
    def this(options: IOptions) = this()
    
    /* private */ var _connectionFailure: Any = js.native
    
    /* private */ var _isReady: Any = js.native
    
    /* private */ var _pollSpecs: Any = js.native
    
    /* private */ var _ready: Any = js.native
    
    /* private */ var _specs: Any = js.native
    
    /* private */ var _specsChanged: Any = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MKernelSpecManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MKernelSpecManager: Boolean = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MKernelSpecManager: js.Promise[Unit] = js.native
    
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
      * Execute a request to the server to poll specs and update state.
      */
    /* protected */ def requestSpecs(): js.Promise[Unit] = js.native
    
    /**
      * Get the most recently fetched kernel specs.
      */
    def specs: ISpecModels | Null = js.native
    
    /**
      * A signal emitted when the specs change.
      */
    def specsChanged: ISignal[this.type, ISpecModels] = js.native
    /**
      * A signal emitted when the kernel specs change.
      */
    @JSName("specsChanged")
    var specsChanged_FKernelSpecManager: ISignal[IManager, ISpecModels] = js.native
    
    /**
      * The kernel spec models.
      *
      * #### Notes
      * The value will be null until the manager is ready.
      */
    @JSName("specs")
    val specs_FKernelSpecManager: ISpecModels | Null = js.native
  }
  object KernelSpecManager {
    
    /**
      * The options used to initialize a KernelManager.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabServices.libBasemanagerMod.BaseManager.IOptions {
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        inline def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}
