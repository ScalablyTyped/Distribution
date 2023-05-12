package typings.libp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`-1`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`0`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`1`
import typings.libp2pInterfaceLibp2p.mod.AddressSorter
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.multiformatsMultiaddr.mod.Resolver
import typings.pQueue.distOptionsMod.QueueAddOptions
import typings.pQueue.distPriorityQueueMod.default
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerDialQueueMod {
  
  @JSImport("libp2p/dist/src/connection-manager/dial-queue", "DialQueue")
  @js.native
  open class DialQueue protected () extends StObject {
    def this(components: DialQueueComponents) = this()
    def this(components: DialQueueComponents, init: DialerInit) = this()
    
    /* private */ val addressSorter: Any = js.native
    
    /* private */ var calculateMultiaddrs: Any = js.native
    
    /* private */ val connectionGater: Any = js.native
    
    /* private */ var createDialAbortControllers: Any = js.native
    
    def dial(peerIdOrMultiaddr: js.Array[Multiaddr_]): js.Promise[Connection] = js.native
    def dial(peerIdOrMultiaddr: js.Array[Multiaddr_], options: DialOptions): js.Promise[Connection] = js.native
    /**
      * Connects to a given peer, multiaddr or list of multiaddrs.
      *
      * If a peer is passed, all known multiaddrs will be tried. If a multiaddr or
      * multiaddrs are passed only those will be dialled.
      *
      * Where a list of multiaddrs is passed, if any contain a peer id then all
      * multiaddrs in the list must contain the same peer id.
      *
      * The dial to the first address that is successfully able to upgrade a connection
      * will be used, all other dials will be aborted when that happens.
      */
    def dial(peerIdOrMultiaddr: PeerId): js.Promise[Connection] = js.native
    def dial(peerIdOrMultiaddr: PeerId, options: DialOptions): js.Promise[Connection] = js.native
    def dial(peerIdOrMultiaddr: Multiaddr_): js.Promise[Connection] = js.native
    def dial(peerIdOrMultiaddr: Multiaddr_, options: DialOptions): js.Promise[Connection] = js.native
    
    /* private */ val dialTimeout: Any = js.native
    
    /* private */ val inProgressDialCount: Any = js.native
    
    /* private */ val maxParallelDialsPerPeer: Any = js.native
    
    /* private */ val maxPeerAddrsToDial: Any = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /* private */ val pendingDialCount: Any = js.native
    
    var pendingDials: js.Array[PendingDial] = js.native
    
    /* private */ var performDial: Any = js.native
    
    var queue: typings.pQueue.mod.default[default, QueueAddOptions] = js.native
    
    /* private */ val shutDownController: Any = js.native
    
    /**
      * Clears any pending dials
      */
    def stop(): Unit = js.native
    
    /* private */ val transportManager: Any = js.native
  }
  
  trait DialOptions
    extends StObject
       with AbortOptions {
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object DialOptions {
    
    inline def apply(): DialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialOptions] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  trait DialQueueComponents extends StObject {
    
    var connectionGater: ConnectionGater
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object DialQueueComponents {
    
    inline def apply(
      connectionGater: ConnectionGater,
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): DialQueueComponents = {
      val __obj = js.Dynamic.literal(connectionGater = connectionGater.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialQueueComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialQueueComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialerInit extends StObject {
    
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
    
    var dialTimeout: js.UndefOr[Double] = js.undefined
    
    var maxParallelDials: js.UndefOr[Double] = js.undefined
    
    var maxParallelDialsPerPeer: js.UndefOr[Double] = js.undefined
    
    var maxPeerAddrsToDial: js.UndefOr[Double] = js.undefined
    
    var resolvers: js.UndefOr[Record[String, Resolver]] = js.undefined
  }
  object DialerInit {
    
    inline def apply(): DialerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialerInit] (val x: Self) extends AnyVal {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialTimeoutUndefined: Self = StObject.set(x, "dialTimeout", js.undefined)
      
      inline def setMaxParallelDials(value: Double): Self = StObject.set(x, "maxParallelDials", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsPerPeer(value: Double): Self = StObject.set(x, "maxParallelDialsPerPeer", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsPerPeerUndefined: Self = StObject.set(x, "maxParallelDialsPerPeer", js.undefined)
      
      inline def setMaxParallelDialsUndefined: Self = StObject.set(x, "maxParallelDials", js.undefined)
      
      inline def setMaxPeerAddrsToDial(value: Double): Self = StObject.set(x, "maxPeerAddrsToDial", value.asInstanceOf[js.Any])
      
      inline def setMaxPeerAddrsToDialUndefined: Self = StObject.set(x, "maxPeerAddrsToDial", js.undefined)
      
      inline def setResolvers(value: Record[String, Resolver]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    }
  }
  
  trait PendingDial extends StObject {
    
    var id: String
    
    var multiaddrs: js.Array[Multiaddr_]
    
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    var promise: js.Promise[Connection]
    
    var status: PendingDialStatus
  }
  object PendingDial {
    
    inline def apply(
      id: String,
      multiaddrs: js.Array[Multiaddr_],
      promise: js.Promise[Connection],
      status: PendingDialStatus
    ): PendingDial = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingDial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingDial] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setPromise(value: js.Promise[Connection]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: PendingDialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2p.libp2pStrings.queued
    - typings.libp2p.libp2pStrings.active
    - typings.libp2p.libp2pStrings.error
    - typings.libp2p.libp2pStrings.success
  */
  trait PendingDialStatus extends StObject
  object PendingDialStatus {
    
    inline def active: typings.libp2p.libp2pStrings.active = "active".asInstanceOf[typings.libp2p.libp2pStrings.active]
    
    inline def error: typings.libp2p.libp2pStrings.error = "error".asInstanceOf[typings.libp2p.libp2pStrings.error]
    
    inline def queued: typings.libp2p.libp2pStrings.queued = "queued".asInstanceOf[typings.libp2p.libp2pStrings.queued]
    
    inline def success: typings.libp2p.libp2pStrings.success = "success".asInstanceOf[typings.libp2p.libp2pStrings.success]
  }
  
  trait PendingDialTarget extends StObject {
    
    def reject(err: js.Error): Unit
    
    def resolve(value: Any): Unit
  }
  object PendingDialTarget {
    
    inline def apply(reject: js.Error => Unit, resolve: Any => Unit): PendingDialTarget = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[PendingDialTarget]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingDialTarget] (val x: Self) extends AnyVal {
      
      inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
