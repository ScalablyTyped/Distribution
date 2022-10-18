package typings.jupyterlabServices

import typings.jupyterlabServices.libBasemanagerMod.BaseManager.IOptions
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.NetworkError
import typings.luminoDisposable.mod.IObservableDisposable
import typings.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBasemanagerMod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/services/lib/basemanager", "BaseManager")
  @js.native
  open class BaseManager protected ()
    extends StObject
       with IManager {
    def this(options: IOptions) = this()
    
    /* private */ var _disposed: Any = js.native
    
    /* private */ var _isDisposed: Any = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    /* CompleteClass */
    var connectionFailure: ISignal[IManager, NetworkError] = js.native
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    var connectionFailure_BaseManager: ISignal[this.type, js.Error] = js.native
    
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
      * A signal emitted when the object is disposed.
      */
    /* CompleteClass */
    override val disposed: ISignal[this.type, Unit] = js.native
    /**
      * A signal emitted when the delegate is disposed.
      */
    @JSName("disposed")
    def disposed_MBaseManager: ISignal[this.type, Unit] = js.native
    
    /**
      * Test whether the object has been disposed.
      *
      * #### Notes
      * This property is always safe to access.
      */
    /* CompleteClass */
    override val isDisposed: Boolean = js.native
    /**
      * Test whether the delegate has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MBaseManager: Boolean = js.native
    
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
  }
  object BaseManager {
    
    /**
      * The options used to initialize a SessionManager.
      */
    trait IOptions extends StObject {
      
      /**
        * The server settings for the manager.
        */
      var serverSettings: js.UndefOr[ISettings] = js.undefined
    }
    object IOptions {
      
      inline def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        inline def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  trait IManager
    extends StObject
       with IObservableDisposable {
    
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
    
    inline def apply(
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
    
    extension [Self <: IManager](x: Self) {
      
      inline def setConnectionFailure(value: ISignal[IManager, NetworkError]): Self = StObject.set(x, "connectionFailure", value.asInstanceOf[js.Any])
      
      inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      inline def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
    }
  }
}
