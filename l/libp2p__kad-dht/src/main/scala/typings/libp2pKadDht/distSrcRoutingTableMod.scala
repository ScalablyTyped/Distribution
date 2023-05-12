package typings.libp2pKadDht

import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pKadDht.distSrcRoutingTableKBucketMod.KBucket
import typings.libp2pKadDht.distSrcRoutingTableKBucketMod.PingEventDetails
import typings.pQueue.distOptionsMod.QueueAddOptions
import typings.pQueue.distPriorityQueueMod.default
import typings.std.CustomEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRoutingTableMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "KAD_CLOSE_TAG_NAME")
  @js.native
  val KAD_CLOSE_TAG_NAME: /* "kad-close" */ String = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "KAD_CLOSE_TAG_VALUE")
  @js.native
  val KAD_CLOSE_TAG_VALUE: /* 50 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "KBUCKET_SIZE")
  @js.native
  val KBUCKET_SIZE: /* 20 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "PING_CONCURRENCY")
  @js.native
  val PING_CONCURRENCY: /* 10 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "PING_TIMEOUT")
  @js.native
  val PING_TIMEOUT: /* 10000 */ Double = js.native
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "RoutingTable")
  @js.native
  open class RoutingTable protected ()
    extends StObject
       with Startable {
    def this(components: RoutingTableComponents, init: RoutingTableInit) = this()
    
    /**
      * Called on the `ping` event from `k-bucket` when a bucket is full
      * and cannot split.
      *
      * `oldContacts.length` is defined by the `numberOfNodesToPing` param
      * passed to the `k-bucket` constructor.
      *
      * `oldContacts` will not be empty and is the list of contacts that
      * have not been contacted for the longest.
      */
    def _onPing(evt: CustomEvent[PingEventDetails]): Unit = js.native
    
    /**
      * Keep track of our k-closest peers and tag them in the peer store as such
      * - this will lower the chances that connections to them get closed when
      * we reach connection limits
      */
    def _tagPeers(kBuck: KBucket): Unit = js.native
    
    /**
      * Add or update the routing table with the given peer
      */
    def add(peer: PeerId): js.Promise[Unit] = js.native
    
    /**
      * Retrieve the closest peers to the given key
      */
    def closestPeer(key: js.typedarray.Uint8Array): js.UndefOr[PeerId] = js.native
    
    /**
      * Retrieve the `count`-closest peers to the given key
      */
    def closestPeers(key: js.typedarray.Uint8Array): js.Array[PeerId] = js.native
    def closestPeers(key: js.typedarray.Uint8Array, count: Double): js.Array[PeerId] = js.native
    
    /* private */ val components: Any = js.native
    
    /**
      * Find a specific peer by id
      */
    def find(peer: PeerId): js.Promise[js.UndefOr[PeerId]] = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    var kBucketSize: Double = js.native
    
    var kb: js.UndefOr[KBucket] = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val log: Any = js.native
    
    /* private */ var metrics: Any = js.native
    
    /* private */ val pingConcurrency: Any = js.native
    
    var pingQueue: typings.pQueue.mod.default[default, QueueAddOptions] = js.native
    
    /* private */ val pingTimeout: Any = js.native
    
    /* private */ val protocol: Any = js.native
    
    /**
      * Remove a given peer from the table
      */
    def remove(peer: PeerId): js.Promise[Unit] = js.native
    
    /* private */ var running: Any = js.native
    
    /**
      * Amount of currently stored peers
      */
    def size: Double = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ val tagName: Any = js.native
    
    /* private */ val tagValue: Any = js.native
  }
  
  trait RoutingTableComponents extends StObject {
    
    var connectionManager: ConnectionManager
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
  }
  object RoutingTableComponents {
    
    inline def apply(connectionManager: ConnectionManager, peerId: PeerId, peerStore: PeerStore): RoutingTableComponents = {
      val __obj = js.Dynamic.literal(connectionManager = connectionManager.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingTableComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingTableComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    }
  }
  
  trait RoutingTableInit extends StObject {
    
    var kBucketSize: js.UndefOr[Double] = js.undefined
    
    var lan: Boolean
    
    var pingConcurrency: js.UndefOr[Double] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var tagValue: js.UndefOr[Double] = js.undefined
  }
  object RoutingTableInit {
    
    inline def apply(lan: Boolean, protocol: String): RoutingTableInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingTableInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoutingTableInit] (val x: Self) extends AnyVal {
      
      inline def setKBucketSize(value: Double): Self = StObject.set(x, "kBucketSize", value.asInstanceOf[js.Any])
      
      inline def setKBucketSizeUndefined: Self = StObject.set(x, "kBucketSize", js.undefined)
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPingConcurrency(value: Double): Self = StObject.set(x, "pingConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPingConcurrencyUndefined: Self = StObject.set(x, "pingConcurrency", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTagValue(value: Double): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
      
      inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
    }
  }
}
