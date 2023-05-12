package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting_
import typings.libp2pInterfacePeerStore.mod.PeerStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRoutingMod {
  
  @JSImport("libp2p/dist/src/peer-routing", "DefaultPeerRouting")
  @js.native
  open class DefaultPeerRouting protected ()
    extends StObject
       with PeerRouting_ {
    def this(components: DefaultPeerRoutingComponents, init: PeerRoutingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* private */ val routers: Any = js.native
  }
  
  trait DefaultPeerRoutingComponents extends StObject {
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object DefaultPeerRoutingComponents {
    
    inline def apply(peerId: PeerId, peerStore: PeerStore): DefaultPeerRoutingComponents = {
      val __obj = js.Dynamic.literal(peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultPeerRoutingComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultPeerRoutingComponents] (val x: Self) extends AnyVal {
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerRoutingInit extends StObject {
    
    var routers: js.UndefOr[js.Array[PeerRouting_]] = js.undefined
  }
  object PeerRoutingInit {
    
    inline def apply(): PeerRoutingInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PeerRoutingInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerRoutingInit] (val x: Self) extends AnyVal {
      
      inline def setRouters(value: js.Array[PeerRouting_]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
      
      inline def setRoutersUndefined: Self = StObject.set(x, "routers", js.undefined)
      
      inline def setRoutersVarargs(value: PeerRouting_ *): Self = StObject.set(x, "routers", js.Array(value*))
    }
  }
}
