package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcRpcMod.DHTMessageHandler
import typings.libp2pRecord.mod.Libp2pRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcHandlersGetValueMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc/handlers/get-value", "GetValueHandler")
  @js.native
  open class GetValueHandler protected ()
    extends StObject
       with DHTMessageHandler {
    def this(init: GetValueHandlerInit) = this()
    
    /**
      * Try to fetch a given record by from the local datastore.
      * Returns the record iff it is still valid, meaning
      * - it was either authored by this node, or
      * - it was received less than `MAX_RECORD_AGE` ago.
      */
    def _checkLocalDatastore(key: js.typedarray.Uint8Array): js.Promise[js.UndefOr[Libp2pRecord]] = js.native
    
    /* private */ var components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val peerRouting: Any = js.native
  }
  
  trait GetValueHandlerInit extends StObject {
    
    var peerRouting: PeerRouting
  }
  object GetValueHandlerInit {
    
    inline def apply(peerRouting: PeerRouting): GetValueHandlerInit = {
      val __obj = js.Dynamic.literal(peerRouting = peerRouting.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetValueHandlerInit]
    }
    
    extension [Self <: GetValueHandlerInit](x: Self) {
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
    }
  }
}
