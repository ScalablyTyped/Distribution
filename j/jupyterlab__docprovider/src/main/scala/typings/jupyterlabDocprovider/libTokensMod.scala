package typings.jupyterlabDocprovider

import org.scalablytyped.runtime.Shortcut
import typings.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory.IOptions
import typings.jupyterlabSharedModels.libApiMod.DocumentChange
import typings.jupyterlabSharedModels.mod.YDocument
import typings.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  object IDocumentProviderFactory extends Shortcut {
    
    @JSImport("@jupyterlab/docprovider/lib/tokens", "IDocumentProviderFactory")
    @js.native
    val ^ : Token[IDocumentProviderFactory] = js.native
    
    /**
      * The instantiation options for a IDocumentProviderFactory.
      */
    trait IOptions extends StObject {
      
      var contentType: String
      
      /**
        * The name (id) of the room
        */
      var path: String
      
      /**
        * The YNotebook.
        */
      var ymodel: YDocument[DocumentChange]
    }
    object IOptions {
      
      inline def apply(contentType: String, path: String, ymodel: YDocument[DocumentChange]): IOptions = {
        val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ymodel = ymodel.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setYmodel(value: YDocument[DocumentChange]): Self = StObject.set(x, "ymodel", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = Token[IDocumentProviderFactory]
    
    /* This means you don't have to write `^`, but can instead just say `IDocumentProviderFactory.foo` */
    override def _to: Token[IDocumentProviderFactory] = ^
  }
  type IDocumentProviderFactory = js.Function1[/* options */ IOptions, IDocumentProvider]
  
  trait IDocumentProvider extends StObject {
    
    /**
      * Acquire a lock.
      * Returns a Promise that resolves to the lock number.
      */
    def acquireLock(): js.Promise[Double]
    
    /**
      * Destroy the provider.
      */
    def destroy(): Unit
    
    /**
      * Put the initialized state.
      */
    def putInitializedState(): Unit
    
    /**
      * Release a lock.
      *
      * @param lock The lock to release.
      */
    def releaseLock(lock: Double): Unit
    
    /**
      * Resolves to true if the initial content has been initialized on the server. false otherwise.
      */
    def requestInitialContent(): js.Promise[Boolean]
    
    /**
      * This should be called by the docregistry when the file has been renamed to update the websocket connection url
      */
    def setPath(newPath: String): Unit
  }
  object IDocumentProvider {
    
    inline def apply(
      acquireLock: () => js.Promise[Double],
      destroy: () => Unit,
      putInitializedState: () => Unit,
      releaseLock: Double => Unit,
      requestInitialContent: () => js.Promise[Boolean],
      setPath: String => Unit
    ): IDocumentProvider = {
      val __obj = js.Dynamic.literal(acquireLock = js.Any.fromFunction0(acquireLock), destroy = js.Any.fromFunction0(destroy), putInitializedState = js.Any.fromFunction0(putInitializedState), releaseLock = js.Any.fromFunction1(releaseLock), requestInitialContent = js.Any.fromFunction0(requestInitialContent), setPath = js.Any.fromFunction1(setPath))
      __obj.asInstanceOf[IDocumentProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IDocumentProvider] (val x: Self) extends AnyVal {
      
      inline def setAcquireLock(value: () => js.Promise[Double]): Self = StObject.set(x, "acquireLock", js.Any.fromFunction0(value))
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setPutInitializedState(value: () => Unit): Self = StObject.set(x, "putInitializedState", js.Any.fromFunction0(value))
      
      inline def setReleaseLock(value: Double => Unit): Self = StObject.set(x, "releaseLock", js.Any.fromFunction1(value))
      
      inline def setRequestInitialContent(value: () => js.Promise[Boolean]): Self = StObject.set(x, "requestInitialContent", js.Any.fromFunction0(value))
      
      inline def setSetPath(value: String => Unit): Self = StObject.set(x, "setPath", js.Any.fromFunction1(value))
    }
  }
}
