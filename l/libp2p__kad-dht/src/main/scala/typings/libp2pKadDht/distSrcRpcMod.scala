package typings.libp2pKadDht

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceDht.mod.Validators
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.IncomingStreamData
import typings.libp2pKadDht.distSrcMessageMod.Message
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcProvidersMod.Providers
import typings.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typings.libp2pKadDht.distSrcRpcHandlersFindNodeMod.FindNodeHandlerComponents
import typings.libp2pKadDht.distSrcRpcHandlersGetValueMod.GetValueHandlerComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRpcMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/rpc", "RPC")
  @js.native
  open class RPC protected () extends StObject {
    def this(components: RPCComponents, init: RPCInit) = this()
    
    /**
      * Process incoming DHT messages
      */
    def handleMessage(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]] = js.native
    
    /* private */ val handlers: Any = js.native
    
    /* private */ val log: Any = js.native
    
    /**
      * Handle incoming streams on the dht protocol
      */
    def onIncomingStream(data: IncomingStreamData): Unit = js.native
    
    /* private */ val routingTable: Any = js.native
  }
  
  trait DHTMessageHandler extends StObject {
    
    def handle(peerId: PeerId, msg: Message): js.Promise[js.UndefOr[Message]]
  }
  object DHTMessageHandler {
    
    inline def apply(handle: (PeerId, Message) => js.Promise[js.UndefOr[Message]]): DHTMessageHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction2(handle))
      __obj.asInstanceOf[DHTMessageHandler]
    }
    
    extension [Self <: DHTMessageHandler](x: Self) {
      
      inline def setHandle(value: (PeerId, Message) => js.Promise[js.UndefOr[Message]]): Self = StObject.set(x, "handle", js.Any.fromFunction2(value))
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.libp2pKadDht.distSrcRpcHandlersGetProvidersMod.GetProvidersHandlerComponents because var conflicts: peerStore. Inlined 
  - typings.libp2pKadDht.distSrcRpcHandlersPutValueMod.PutValueHandlerComponents because var conflicts: datastore. Inlined  */ trait RPCComponents
    extends StObject
       with GetValueHandlerComponents
       with FindNodeHandlerComponents
  object RPCComponents {
    
    inline def apply(addressManager: AddressManager, datastore: Datastore, peerId: PeerId, peerStore: PeerStore): RPCComponents = {
      val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCComponents]
    }
  }
  
  trait RPCInit extends StObject {
    
    var lan: Boolean
    
    var peerRouting: PeerRouting
    
    var providers: Providers
    
    var routingTable: RoutingTable
    
    var validators: Validators
  }
  object RPCInit {
    
    inline def apply(
      lan: Boolean,
      peerRouting: PeerRouting,
      providers: Providers,
      routingTable: RoutingTable,
      validators: Validators
    ): RPCInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[RPCInit]
    }
    
    extension [Self <: RPCInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: Providers): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
}
