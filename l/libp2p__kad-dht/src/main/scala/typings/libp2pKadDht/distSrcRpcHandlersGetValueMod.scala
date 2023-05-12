package typings.libp2pKadDht

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
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
    def this(components: GetValueHandlerComponents, init: GetValueHandlerInit) = this()
    
    /**
      * Try to fetch a given record by from the local datastore.
      * Returns the record if it is still valid, meaning
      * - it was either authored by this node, or
      * - it was received less than `MAX_RECORD_AGE` ago.
      */
    def _checkLocalDatastore(key: js.typedarray.Uint8Array): js.Promise[js.UndefOr[Libp2pRecord]] = js.native
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* private */ val peerRouting: Any = js.native
  }
  
  trait GetValueHandlerComponents extends StObject {
    
    var datastore: Datastore[
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object, 
        js.Object
      ]
    
    var peerStore: PeerStore
  }
  object GetValueHandlerComponents {
    
    inline def apply(
      datastore: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ],
      peerStore: PeerStore
    ): GetValueHandlerComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetValueHandlerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetValueHandlerComponents] (val x: Self) extends AnyVal {
      
      inline def setDatastore(
        value: Datastore[
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object, 
              js.Object
            ]
      ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetValueHandlerInit extends StObject {
    
    var peerRouting: PeerRouting
  }
  object GetValueHandlerInit {
    
    inline def apply(peerRouting: PeerRouting): GetValueHandlerInit = {
      val __obj = js.Dynamic.literal(peerRouting = peerRouting.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetValueHandlerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GetValueHandlerInit] (val x: Self) extends AnyVal {
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
    }
  }
}
