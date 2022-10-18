package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
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
    def this(init: FindNodeHandlerInit) = this()
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
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
