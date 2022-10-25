package typings.libp2p

import typings.libp2p.anon.From
import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingMod {
  
  @JSImport("libp2p/dist/src/content-routing", "CompoundContentRouting")
  @js.native
  open class CompoundContentRouting protected ()
    extends StObject
       with ContentRouting
       with Startable {
    def this(components: CompoundContentRoutingComponents, init: CompoundContentRoutingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * Get the `n` values to the given key without sorting
      */
    def getMany(key: js.typedarray.Uint8Array, nVals: Double, options: AbortOptions): AsyncGenerator[From, Unit, Any] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val routers: Any = js.native
    
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
  }
  
  trait CompoundContentRoutingComponents extends StObject {
    
    var dht: js.UndefOr[DualDHT] = js.undefined
    
    var peerStore: PeerStore
  }
  object CompoundContentRoutingComponents {
    
    inline def apply(peerStore: PeerStore): CompoundContentRoutingComponents = {
      val __obj = js.Dynamic.literal(peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundContentRoutingComponents]
    }
    
    extension [Self <: CompoundContentRoutingComponents](x: Self) {
      
      inline def setDht(value: DualDHT): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
      
      inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait CompoundContentRoutingInit extends StObject {
    
    var routers: js.Array[ContentRouting]
  }
  object CompoundContentRoutingInit {
    
    inline def apply(routers: js.Array[ContentRouting]): CompoundContentRoutingInit = {
      val __obj = js.Dynamic.literal(routers = routers.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompoundContentRoutingInit]
    }
    
    extension [Self <: CompoundContentRoutingInit](x: Self) {
      
      inline def setRouters(value: js.Array[ContentRouting]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
      
      inline def setRoutersVarargs(value: ContentRouting*): Self = StObject.set(x, "routers", js.Array(value*))
    }
  }
}
