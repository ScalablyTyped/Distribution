package typings.libp2pKadDht

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformats.mod.CID
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProvidersMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/providers", "Providers")
  @js.native
  open class Providers protected ()
    extends StObject
       with Startable {
    def this(components: ProvidersComponents) = this()
    def this(components: ProvidersComponents, init: ProvidersInit) = this()
    
    /**
      * Check all providers if they are still valid, and if not delete them
      */
    def _cleanup(): js.Promise[Unit] = js.native
    
    /**
      * Get the currently known provider peer ids for a given CID
      */
    def _getProvidersMap(cid: CID[Any, Double, Double, Version]): js.Promise[Map[String, js.Date]] = js.native
    
    /**
      * Add a new provider for the given CID
      */
    def addProvider(cid: CID[Any, Double, Double, Version], provider: PeerId): js.Promise[Unit] = js.native
    
    /* private */ val cache: Any = js.native
    
    /* private */ var cleaner: Any = js.native
    
    /* private */ val cleanupInterval: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Get a list of providers for the given CID
      */
    def getProviders(cid: CID[Any, Double, Double, Version]): js.Promise[js.Array[PeerId]] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val provideValidity: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val syncQueue: Any = js.native
  }
  
  trait ProvidersComponents extends StObject {
    
    var datastore: Datastore
  }
  object ProvidersComponents {
    
    inline def apply(datastore: Datastore): ProvidersComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProvidersComponents]
    }
    
    extension [Self <: ProvidersComponents](x: Self) {
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProvidersInit extends StObject {
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * How often invalid records are cleaned. (in seconds)
      */
    var cleanupInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * How long is a provider valid for. (in seconds)
      */
    var provideValidity: js.UndefOr[Double] = js.undefined
  }
  object ProvidersInit {
    
    inline def apply(): ProvidersInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProvidersInit]
    }
    
    extension [Self <: ProvidersInit](x: Self) {
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCleanupInterval(value: Double): Self = StObject.set(x, "cleanupInterval", value.asInstanceOf[js.Any])
      
      inline def setCleanupIntervalUndefined: Self = StObject.set(x, "cleanupInterval", js.undefined)
      
      inline def setProvideValidity(value: Double): Self = StObject.set(x, "provideValidity", value.asInstanceOf[js.Any])
      
      inline def setProvideValidityUndefined: Self = StObject.set(x, "provideValidity", js.undefined)
    }
  }
}
