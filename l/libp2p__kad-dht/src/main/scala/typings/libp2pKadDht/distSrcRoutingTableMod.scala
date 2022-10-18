package typings.libp2pKadDht

import typings.libp2pComponents.mod.Components
import typings.libp2pComponents.mod.Initializable
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pKadDht.libp2pKadDhtStrings.ping
import typings.pQueue.distOptionsMod.QueueAddOptions
import typings.pQueue.distPriorityQueueMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRoutingTableMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/routing-table", "RoutingTable")
  @js.native
  open class RoutingTable protected ()
    extends StObject
       with Startable
       with Initializable {
    def this(init: RoutingTableInit) = this()
    
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
    def _onPing(oldContacts: js.Array[KBucketPeer], newContact: KBucketPeer): Unit = js.native
    
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
    
    /* private */ var components: Any = js.native
    
    /**
      * Find a specific peer by id
      */
    def find(peer: PeerId): js.Promise[js.UndefOr[PeerId]] = js.native
    
    /* CompleteClass */
    override def init(components: Components): Unit = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    var kBucketSize: Double = js.native
    
    var kb: js.UndefOr[KBucketTree] = js.native
    
    /* private */ val lan: Any = js.native
    
    /* private */ val log: Any = js.native
    
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
  }
  
  trait KBucket extends StObject {
    
    var contacts: js.Array[KBucketPeer]
    
    var dontSplit: Boolean
    
    var id: js.typedarray.Uint8Array
    
    var left: KBucket
    
    var right: KBucket
  }
  object KBucket {
    
    inline def apply(
      contacts: js.Array[KBucketPeer],
      dontSplit: Boolean,
      id: js.typedarray.Uint8Array,
      left: KBucket,
      right: KBucket
    ): KBucket = {
      val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], dontSplit = dontSplit.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBucket]
    }
    
    extension [Self <: KBucket](x: Self) {
      
      inline def setContacts(value: js.Array[KBucketPeer]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
      
      inline def setContactsVarargs(value: KBucketPeer*): Self = StObject.set(x, "contacts", js.Array(value*))
      
      inline def setDontSplit(value: Boolean): Self = StObject.set(x, "dontSplit", value.asInstanceOf[js.Any])
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: KBucket): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: KBucket): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait KBucketPeer extends StObject {
    
    var id: js.typedarray.Uint8Array
    
    var peer: PeerId
  }
  object KBucketPeer {
    
    inline def apply(id: js.typedarray.Uint8Array, peer: PeerId): KBucketPeer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[KBucketPeer]
    }
    
    extension [Self <: KBucketPeer](x: Self) {
      
      inline def setId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPeer(value: PeerId): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
    }
  }
  
  trait KBucketTree extends StObject {
    
    def add(peer: KBucketPeer): Unit
    
    def closest(key: js.typedarray.Uint8Array, count: Double): js.Array[KBucketPeer]
    
    def closestPeer(key: js.typedarray.Uint8Array): KBucketPeer
    
    def count(): Double
    
    def get(key: js.typedarray.Uint8Array): js.typedarray.Uint8Array
    
    var localNodeId: js.typedarray.Uint8Array
    
    @JSName("on")
    def on_ping(
      event: ping,
      callback: js.Function2[/* oldContacts */ js.Array[KBucketPeer], /* newContact */ KBucketPeer, Unit]
    ): Unit
    
    def remove(key: js.typedarray.Uint8Array): Unit
    
    var root: KBucket
    
    def toIterable(): js.Iterable[KBucket]
  }
  object KBucketTree {
    
    inline def apply(
      add: KBucketPeer => Unit,
      closest: (js.typedarray.Uint8Array, Double) => js.Array[KBucketPeer],
      closestPeer: js.typedarray.Uint8Array => KBucketPeer,
      count: () => Double,
      get: js.typedarray.Uint8Array => js.typedarray.Uint8Array,
      localNodeId: js.typedarray.Uint8Array,
      on: (ping, js.Function2[/* oldContacts */ js.Array[KBucketPeer], /* newContact */ KBucketPeer, Unit]) => Unit,
      remove: js.typedarray.Uint8Array => Unit,
      root: KBucket,
      toIterable: () => js.Iterable[KBucket]
    ): KBucketTree = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), closest = js.Any.fromFunction2(closest), closestPeer = js.Any.fromFunction1(closestPeer), count = js.Any.fromFunction0(count), get = js.Any.fromFunction1(get), localNodeId = localNodeId.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), remove = js.Any.fromFunction1(remove), root = root.asInstanceOf[js.Any], toIterable = js.Any.fromFunction0(toIterable))
      __obj.asInstanceOf[KBucketTree]
    }
    
    extension [Self <: KBucketTree](x: Self) {
      
      inline def setAdd(value: KBucketPeer => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setClosest(value: (js.typedarray.Uint8Array, Double) => js.Array[KBucketPeer]): Self = StObject.set(x, "closest", js.Any.fromFunction2(value))
      
      inline def setClosestPeer(value: js.typedarray.Uint8Array => KBucketPeer): Self = StObject.set(x, "closestPeer", js.Any.fromFunction1(value))
      
      inline def setCount(value: () => Double): Self = StObject.set(x, "count", js.Any.fromFunction0(value))
      
      inline def setGet(value: js.typedarray.Uint8Array => js.typedarray.Uint8Array): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setLocalNodeId(value: js.typedarray.Uint8Array): Self = StObject.set(x, "localNodeId", value.asInstanceOf[js.Any])
      
      inline def setOn(
        value: (ping, js.Function2[/* oldContacts */ js.Array[KBucketPeer], /* newContact */ KBucketPeer, Unit]) => Unit
      ): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRemove(value: js.typedarray.Uint8Array => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRoot(value: KBucket): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setToIterable(value: () => js.Iterable[KBucket]): Self = StObject.set(x, "toIterable", js.Any.fromFunction0(value))
    }
  }
  
  trait RoutingTableInit extends StObject {
    
    var kBucketSize: js.UndefOr[Double] = js.undefined
    
    var lan: Boolean
    
    var pingConcurrency: js.UndefOr[Double] = js.undefined
    
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    var protocol: String
  }
  object RoutingTableInit {
    
    inline def apply(lan: Boolean, protocol: String): RoutingTableInit = {
      val __obj = js.Dynamic.literal(lan = lan.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoutingTableInit]
    }
    
    extension [Self <: RoutingTableInit](x: Self) {
      
      inline def setKBucketSize(value: Double): Self = StObject.set(x, "kBucketSize", value.asInstanceOf[js.Any])
      
      inline def setKBucketSizeUndefined: Self = StObject.set(x, "kBucketSize", js.undefined)
      
      inline def setLan(value: Boolean): Self = StObject.set(x, "lan", value.asInstanceOf[js.Any])
      
      inline def setPingConcurrency(value: Double): Self = StObject.set(x, "pingConcurrency", value.asInstanceOf[js.Any])
      
      inline def setPingConcurrencyUndefined: Self = StObject.set(x, "pingConcurrency", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
}
