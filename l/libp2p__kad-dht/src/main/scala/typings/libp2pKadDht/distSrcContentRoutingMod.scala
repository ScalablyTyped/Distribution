package typings.libp2pKadDht

import typings.libp2pKadDht.distSrcNetworkMod.Network
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcProvidersMod.Providers
import typings.libp2pKadDht.distSrcQueryManagerMod.QueryManager
import typings.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typings.libp2pKadDht.mod.KadDHTComponents
import typings.libp2pKadDht.mod.PeerResponseEvent
import typings.libp2pKadDht.mod.ProviderEvent
import typings.libp2pKadDht.mod.QueryEvent
import typings.libp2pKadDht.mod.QueryOptions
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcContentRoutingMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/content-routing", "ContentRouting")
  @js.native
  open class ContentRouting protected () extends StObject {
    def this(components: KadDHTComponents, init: ContentRoutingInit) = this()
    
    /* private */ val components: Any = js.native
    
    /**
      * Search the dht for up to `K` providers of the given CID.
      */
    def findProviders(key: CID[Any, Double, Double, Version], options: QueryOptions): AsyncGenerator[PeerResponseEvent | ProviderEvent | QueryEvent, Any, Any] = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val network: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /**
      * Announce to the network that we can provide the value for a given key and
      * are contactable on the given multiaddrs
      */
    def provide(key: CID[Any, Double, Double, Version], multiaddrs: js.Array[Multiaddr_]): AsyncGenerator[QueryEvent, Unit, Unit] = js.native
    def provide(key: CID[Any, Double, Double, Version], multiaddrs: js.Array[Multiaddr_], options: QueryOptions): AsyncGenerator[QueryEvent, Unit, Unit] = js.native
    
    /* private */ val providers: Any = js.native
    
    /* private */ val queryManager: Any = js.native
    
    /* private */ val routingTable: Any = js.native
  }
  
  trait ContentRoutingInit extends StObject {
    
    var lan: Boolean
    
    var network: Network
    
    var peerRouting: PeerRouting
    
    var providers: Providers
    
    var queryManager: QueryManager
    
    var routingTable: RoutingTable
  }
  object ContentRoutingInit {
    
    inline def apply(
      lan: Boolean,
      network: Network,
      peerRouting: PeerRouting,
      providers: Providers,
      queryManager: QueryManager,
      routingTable: RoutingTable
    ): ContentRoutingInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queryManager = queryManager.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentRoutingInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContentRoutingInit] (val x: Self) extends AnyVal {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setNetwork(value: Network): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setProviders(value: Providers): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
      
      inline def setQueryManager(value: QueryManager): Self = StObject.set(x, "queryManager", value.asInstanceOf[js.Any])
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
    }
  }
}
