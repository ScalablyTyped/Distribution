package typings.jupyterlabDocprovider

import typings.jupyterlabDocprovider.libTokensMod.IDocumentProvider
import typings.jupyterlabDocprovider.libYproviderMod.WebSocketProviderWithLocks.IOptions
import typings.jupyterlabSharedModels.libApiMod.DocumentChange
import typings.jupyterlabSharedModels.mod.YDocument
import typings.yWebsocket.mod.WebsocketProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libYproviderMod {
  
  @JSImport("@jupyterlab/docprovider/lib/yprovider", "WebSocketProviderWithLocks")
  @js.native
  open class WebSocketProviderWithLocks protected ()
    extends WebsocketProvider
       with IDocumentProvider {
    /**
      * Construct a new WebSocketProviderWithLocks
      *
      * @param options The instantiation options for a WebSocketProviderWithLocks
      */
    def this(options: IOptions) = this()
    
    /* private */ var _contentType: Any = js.native
    
    /* private */ var _currentLockRequest: Any = js.native
    
    /* private */ var _initialContentRequest: Any = js.native
    
    /* private */ var _isInitialized: Any = js.native
    
    /**
      * Handle a change to the connection status.
      *
      * @param status The connection status.
      */
    /* private */ var _onConnectionStatus: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /* private */ var _requestLockInterval: Any = js.native
    
    /**
      * Send a new message to WebSocket server.
      *
      * @param message The message to send
      */
    /* private */ var _sendMessage: Any = js.native
    
    /* private */ var _serverUrl: Any = js.native
    
    /**
      * Acquire a lock.
      * Returns a Promise that resolves to the lock number.
      */
    /* CompleteClass */
    override def acquireLock(): js.Promise[Double] = js.native
    
    /**
      * Destroy the provider.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Put the initialized state.
      */
    /* CompleteClass */
    override def putInitializedState(): Unit = js.native
    
    /**
      * Release a lock.
      *
      * @param lock The lock to release.
      */
    /* CompleteClass */
    override def releaseLock(lock: Double): Unit = js.native
    
    /**
      * Resolves to true if the initial content has been initialized on the server. false otherwise.
      */
    /* CompleteClass */
    override def requestInitialContent(): js.Promise[Boolean] = js.native
    
    /**
      * This should be called by the docregistry when the file has been renamed to update the websocket connection url
      */
    /* CompleteClass */
    override def setPath(newPath: String): Unit = js.native
  }
  object WebSocketProviderWithLocks {
    
    /**
      * The instantiation options for a WebSocketProviderWithLocks.
      */
    trait IOptions
      extends StObject
         with typings.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory.IOptions {
      
      /**
        * The server URL
        */
      var url: String
    }
    object IOptions {
      
      inline def apply(contentType: String, path: String, url: String, ymodel: YDocument[DocumentChange]): IOptions = {
        val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ymodel = ymodel.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      }
    }
  }
}
