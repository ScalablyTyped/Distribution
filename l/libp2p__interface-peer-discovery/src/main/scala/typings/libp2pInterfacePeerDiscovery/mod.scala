package typings.libp2pInterfacePeerDiscovery

import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/interface-peer-discovery", "peerDiscovery")
  @js.native
  val peerDiscovery: js.Symbol = js.native
  
  trait PeerDiscoveryEvents extends StObject {
    
    var peer: CustomEvent[PeerInfo]
  }
  object PeerDiscoveryEvents {
    
    inline def apply(peer: CustomEvent[PeerInfo]): PeerDiscoveryEvents = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerDiscoveryEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerDiscoveryEvents] (val x: Self) extends AnyVal {
      
      inline def setPeer(value: CustomEvent[PeerInfo]): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  type PeerDiscovery_ = EventEmitter[PeerDiscoveryEvents]
}
