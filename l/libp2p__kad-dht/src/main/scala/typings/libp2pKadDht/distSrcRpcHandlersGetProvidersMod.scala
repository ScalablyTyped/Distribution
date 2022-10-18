package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcProvidersMod.Providers
import typings.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersGetProvidersMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/get-providers", "GetProvidersHandler")
  @js.native
  open class GetProvidersHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(init: GetProvidersHandlerInit) = this()
    
    def _getAddresses(peerId: PeerId): js.Promise[js.Array[Multiaddr_]] = js.native
    
    def _getPeers(peerIds: js.Array[PeerId]): js.Promise[js.Array[PeerInfo]] = js.native
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /* private */ val providers: Any = js.native
  }
  
  trait GetProvidersHandlerInit extends StObject {
    
    var lan: Boolean
    
    var peerRouting: PeerRouting
    
    var providers: Providers
  }
  object GetProvidersHandlerInit {
    
    inline def apply(lan: Boolean, peerRouting: PeerRouting, providers: Providers): GetProvidersHandlerInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProvidersHandlerInit]
    }
    
    extension [Self <: GetProvidersHandlerInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: Providers): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    }
  }
}
