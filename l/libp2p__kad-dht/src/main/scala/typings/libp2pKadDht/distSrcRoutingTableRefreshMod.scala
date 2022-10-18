package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pKadDht.distSrcPeerRoutingMod.PeerRouting
import typings.libp2pKadDht.distSrcRoutingTableMod.RoutingTable
import typings.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRoutingTableRefreshMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table/refresh", "RoutingTableRefresh")
  @js.native
  open class RoutingTableRefresh protected ()
    extends StObject
       with Initializable {
    def this(init: RoutingTableRefreshInit) = this()
    
    def _generateRandomPeerId(targetCommonPrefixLength: Double): js.Promise[PeerId] = js.native
    
    def _getTrackedCommonPrefixLengthsForRefresh(maxCommonPrefix: Double): js.Array[js.Date] = js.native
    
    def _makePeerId(localKadId: js.typedarray.Uint8Array, randomPrefix: Double, targetCommonPrefixLength: Double): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * returns the maximum common prefix length between any peer in the table
      * and the current peer
      */
    def _maxCommonPrefix(): Double = js.native
    
    /**
      * Returns the number of peers in the table with a given prefix length
      */
    def _numPeersForCpl(prefixLength: Double): Double = js.native
    
    /**
      * Yields the common prefix length of every peer in the table
      */
    def _prefixLengths(): Generator[Double, Unit, Any] = js.native
    
    def _refreshCommonPrefixLength(cpl: Double, lastRefresh: js.Date, force: Boolean): js.Promise[Unit] = js.native
    
    /* private */ val commonPrefixLengthRefreshedAt: Any = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ val peerRouting: Any = js.native
    
    /* private */ val refreshInterval: Any = js.native
    
    /* private */ val refreshQueryTimeout: Any = js.native
    
    /**
      * To speed lookups, we seed the table with random PeerIds. This means
      * when we are asked to locate a peer on the network, we can find a KadId
      * that is close to the requested peer ID and query that, then network
      * peers will tell us who they know who is close to the fake ID
      */
    def refreshTable(): Unit = js.native
    def refreshTable(force: Boolean): Unit = js.native
    
    /* private */ var refreshTimeoutId: Any = js.native
    
    /* private */ val routingTable: Any = js.native
    
    def start(): js.Promise[Unit] = js.native
    
    def stop(): js.Promise[Unit] = js.native
  }
  
  trait RoutingTableRefreshInit extends StObject {
    
    var lan: Boolean
    
    var peerRouting: PeerRouting
    
    var refreshInterval: js.UndefOr[Double] = js.undefined
    
    var refreshQueryTimeout: js.UndefOr[Double] = js.undefined
    
    var routingTable: RoutingTable
  }
  object RoutingTableRefreshInit {
    
    inline def apply(lan: Boolean, peerRouting: PeerRouting, routingTable: RoutingTable): RoutingTableRefreshInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], routingTable = routingTable.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingTableRefreshInit]
    }
    
    extension [Self <: RoutingTableRefreshInit](x: Self) {
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPeerRouting(value: PeerRouting): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
      
      inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
      
      inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
      
      inline def setRefreshQueryTimeout(value: Double): Self = StObject.set(x, "refreshQueryTimeout", value.asInstanceOf[js.Any])
      
      inline def setRefreshQueryTimeoutUndefined: Self = StObject.set(x, "refreshQueryTimeout", js.undefined)
      
      inline def setRoutingTable(value: RoutingTable): Self = StObject.set(x, "routingTable", value.asInstanceOf[js.Any])
    }
  }
}
