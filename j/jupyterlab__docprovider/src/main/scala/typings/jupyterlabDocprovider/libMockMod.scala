package typings.jupyterlabDocprovider

import typings.jupyterlabDocprovider.libTokensMod.IDocumentProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockMod {
  
  @JSImport("@jupyterlab/docprovider/lib/mock", "ProviderMock")
  @js.native
  open class ProviderMock ()
    extends StObject
       with IDocumentProvider {
    
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
}
