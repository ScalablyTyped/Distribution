package typings.libp2pKadDht

import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersFindNodeMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/find-node", "FindNodeHandler")
  @js.native
  open class FindNodeHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(components: FindNodeHandlerComponents, init: FindNodeHandlerInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
  }
  
  trait FindNodeHandlerComponents extends StObject {
    
    var addressManager: AddressManager
    
    var peerId: PeerId
  }
  object FindNodeHandlerComponents {
    
    inline def apply(addressManager: AddressManager, peerId: PeerId): FindNodeHandlerComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindNodeHandlerComponents]
    }
    
    extension [Self <: FindNodeHandlerComponents](x: Self) {
      
      inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindNodeHandlerInit extends StObject {
    
    var lan: Boolean
    
    var peerRouting: PeerRouting
  }
  object FindNodeHandlerInit {
    
    inline def apply(lan: Boolean, peerRouting: PeerRouting): FindNodeHandlerInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindNodeHandlerInit]
    }
    
    extension [Self <: FindNodeHandlerInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
    }
  }
}
