package typings.libp2pKadDht

import typings.libp2pInterfaceDht.mod.DHTRecord
import typings.libp2pInterfaceDht.mod.DialingPeerEvent
import typings.libp2pInterfaceDht.mod.PeerResponseEvent
import typings.libp2pInterfaceDht.mod.QueryErrorEvent
import typings.libp2pInterfaceDht.mod.QueryEvent
import typings.libp2pInterfaceDht.mod.QueryOptions
import typings.libp2pInterfaceDht.mod.SendingQueryEvent
import typings.libp2pInterfaceDht.mod.Validators
import typings.libp2pInterfaceDht.mod.ValueEvent
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfaces.mod.AbortOptions
import typings.libp2pKadDht.distSrcNetworkMod.Network
import typings.libp2pKadDht.distSrcQueryManagerMod.QueryManager
import typings.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerRoutingMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/peer-routing", "PeerRouting")
  @js.native
  open class PeerRouting protected () extends StObject {
    def this(components: KadDHTComponents, init: PeerRoutingInit) = this()
    
    /**
      * Get a value via rpc call for the given parameters
      */
    def _getValueSingle(peer: PeerId, key: js.typedarray.Uint8Array): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def _getValueSingle(peer: PeerId, key: js.typedarray.Uint8Array, options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
    /**
      * Verify a record, fetching missing public keys from the network.
      * Throws an error if the record is invalid.
      */
    def _verifyRecordOnline(record: DHTRecord): js.Promise[Unit] = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Search for a peer with the given ID
      */
    def findPeer(id: PeerId): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    def findPeer(id: PeerId, options: QueryOptions): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    
    /**
      * Look if we are connected to a peer with the given id.
      * Returns its id and addresses, if found, otherwise `undefined`.
      */
    def findPeerLocal(peer: PeerId): js.Promise[js.UndefOr[PeerInfo]] = js.native
    
    /**
      * Get the nearest peers to the given query, but if closer
      * than self
      */
    def getCloserPeersOffline(key: js.typedarray.Uint8Array, closerThan: PeerId): js.Promise[js.Array[PeerInfo]] = js.native
    
    /**
      * Kademlia 'node lookup' operation on a key, which could be a the
      * bytes from a multihash or a peer ID
      */
    def getClosestPeers(key: js.typedarray.Uint8Array): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    def getClosestPeers(key: js.typedarray.Uint8Array, options: QueryOptions): AsyncGenerator[QueryEvent, Unit, Any] = js.native
    
    /**
      * Get the public key directly from a node
      */
    def getPublicKeyFromNode(peer: PeerId): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ValueEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def getPublicKeyFromNode(peer: PeerId, options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | ValueEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
    /**
      * Query a particular peer for the value for the given key.
      * It will either return the value or a list of closer peers.
      *
      * Note: The peerStore is updated with new addresses found for the given peer.
      */
    def getValueOrPeers(peer: PeerId, key: js.typedarray.Uint8Array): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    def getValueOrPeers(peer: PeerId, key: js.typedarray.Uint8Array, options: AbortOptions): AsyncGenerator[
        SendingQueryEvent | PeerResponseEvent | QueryErrorEvent | DialingPeerEvent, 
        Unit, 
        Any
      ] = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val network: Any = js.native
    
    /* private */ val queryManager: Any = js.native
    
    /* private */ val routingTable: Any = js.native
    
    /* private */ val validators: Any = js.native
  }
  
  trait PeerRoutingInit extends StObject {
    
    var lan: Boolean
    
    var network: Network
    
    var queryManager: QueryManager
    
    var routingTable: RoutingTable
    
    var validators: Validators
  }
  object PeerRoutingInit {
    
    inline def apply(
      lan: Boolean,
      network: Network,
      queryManager: QueryManager,
      routingTable: RoutingTable,
      validators: Validators
    ): PeerRoutingInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any], validators = validators.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerRoutingInit]
    }
    
    extension [Self <: PeerRoutingInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setQueryManager(value: QueryManager): Self = StObject.set(x, "queryManager", value.asInstanceOf[js.Any])
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
      
      inline def setValidators(value: Validators): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
    }
  }
}
