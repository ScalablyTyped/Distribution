package typings.libp2p

import typings.libp2p.distSrcConnectionManagerAutoDialMod.AutoDial
import typings.libp2p.distSrcConnectionManagerConnectionPrunerMod.ConnectionPruner
import typings.libp2p.distSrcConnectionManagerDialQueueMod.DialQueue
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionGater.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`-1`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`0`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`1`
import typings.libp2pInterfaceLibp2p.mod.AddressSorter
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.multiformatsMultiaddr.mod.Resolver
import typings.std.CustomEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerMod {
  
  @JSImport("libp2p/dist/src/connection-manager", "DefaultConnectionManager")
  @js.native
  open class DefaultConnectionManager protected ()
    extends StObject
       with ConnectionManager
       with Startable {
    def this(components: DefaultConnectionManagerComponents) = this()
    def this(components: DefaultConnectionManagerComponents, init: ConnectionManagerInit) = this()
    
    /**
      * Tracks the incoming connection and check the connection limit
      */
    def _onConnect(evt: CustomEvent[Connection]): js.Promise[Unit] = js.native
    
    @JSName("afterStart")
    def afterStart_MDefaultConnectionManager(): js.Promise[Unit] = js.native
    
    /* private */ val allow: Any = js.native
    
    val autoDial: AutoDial = js.native
    
    val connectionPruner: ConnectionPruner = js.native
    
    /* private */ val connections: Any = js.native
    
    /* private */ val deny: Any = js.native
    
    val dialQueue: DialQueue = js.native
    
    /* private */ val events: Any = js.native
    
    /* private */ val inboundConnectionRateLimiter: Any = js.native
    
    /* private */ var incomingPendingConnections: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val maxConnections: Any = js.native
    
    /* private */ val maxIncomingPendingConnections: Any = js.native
    
    /* private */ val metrics: Any = js.native
    
    def onConnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /**
      * Removes the connection from tracking
      */
    def onDisconnect(evt: CustomEvent[Connection]): Unit = js.native
    
    def openConnection(peerIdOrMultiaddr: js.Array[Multiaddr_], options: OpenConnectionOptions): js.Promise[Connection] = js.native
    def openConnection(peerIdOrMultiaddr: PeerId, options: OpenConnectionOptions): js.Promise[Connection] = js.native
    def openConnection(peerIdOrMultiaddr: Multiaddr_, options: OpenConnectionOptions): js.Promise[Connection] = js.native
    
    /* private */ val peerStore: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
  }
  
  trait ConnectionManagerInit extends StObject {
    
    /**
      * Sort the known addresses of a peer before trying to dial, By default public
      * addresses will be dialled before private (e.g. loopback or LAN) addresses.
      */
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
    
    /**
      * A list of multiaddrs that will always be allowed (except if they are in the
      * deny list) to open connections to this node even if we've reached maxConnections
      */
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * When dialling peers from the peer book to keep the number of open connections
      * above `minConnections`, add dials for this many peers to the dial queue
      * at once. (default: 25)
      */
    var autoDialConcurrency: js.UndefOr[Double] = js.undefined
    
    /**
      * How long to wait between attempting to keep our number of concurrent connections
      * above minConnections (default: 5000)
      */
    var autoDialInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * To allow user dials to take priority over auto dials, use this value as the
      * dial priority. (default: 0)
      */
    var autoDialPriority: js.UndefOr[Double] = js.undefined
    
    /**
      * A list of multiaddrs that will never be allowed to open connections to
      * this node under any circumstances
      */
    var deny: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * How long a dial attempt is allowed to take, including DNS resolution
      * of the multiaddr, opening a socket and upgrading it to a Connection.
      */
    var dialTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * If more than this many connections are opened per second by a single
      * host, reject subsequent connections. (default: 5)
      */
    var inboundConnectionThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * When a new inbound connection is opened, the upgrade process (e.g. protect,
      * encrypt, multiplex etc) must complete within this number of ms. (default: 30s)
      */
    var inboundUpgradeTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of connections libp2p is willing to have before it starts
      * pruning connections to reduce resource usage. (default: 300)
      */
    var maxConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of parallel incoming connections allowed that have yet to
      * complete the connection upgrade - e.g. choosing connection encryption, muxer, etc.
      * (default: 10)
      */
    var maxIncomingPendingConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of dials across all peers to execute in parallel.
      * (default: 100)
      */
    var maxParallelDials: js.UndefOr[Double] = js.undefined
    
    /**
      * To prevent individual peers with large amounts of multiaddrs swamping the
      * dial queue, this value controls how many addresses to dial in parallel per
      * peer. So for example if two peers have 10 addresses and this value is set
      * at 5, we will dial 5 addresses from each at a time. (default: 10)
      */
    var maxParallelDialsPerPeer: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum number of addresses allowed for a given peer - if a peer has more
      * addresses than this then the dial will fail. (default: 25)
      */
    var maxPeerAddrsToDial: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of connections below which libp2p will start to dial peers
      * from the peer book. Setting this to 0 effectively disables this behaviour.
      * (default: 50)
      */
    var minConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiaddr resolvers to use when dialling
      */
    var resolvers: js.UndefOr[Record[String, Resolver]] = js.undefined
  }
  object ConnectionManagerInit {
    
    inline def apply(): ConnectionManagerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionManagerInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionManagerInit] (val x: Self) extends AnyVal {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
      
      inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setAutoDialConcurrency(value: Double): Self = StObject.set(x, "autoDialConcurrency", value.asInstanceOf[js.Any])
      
      inline def setAutoDialConcurrencyUndefined: Self = StObject.set(x, "autoDialConcurrency", js.undefined)
      
      inline def setAutoDialInterval(value: Double): Self = StObject.set(x, "autoDialInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoDialIntervalUndefined: Self = StObject.set(x, "autoDialInterval", js.undefined)
      
      inline def setAutoDialPriority(value: Double): Self = StObject.set(x, "autoDialPriority", value.asInstanceOf[js.Any])
      
      inline def setAutoDialPriorityUndefined: Self = StObject.set(x, "autoDialPriority", js.undefined)
      
      inline def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      inline def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value*))
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialTimeoutUndefined: Self = StObject.set(x, "dialTimeout", js.undefined)
      
      inline def setInboundConnectionThreshold(value: Double): Self = StObject.set(x, "inboundConnectionThreshold", value.asInstanceOf[js.Any])
      
      inline def setInboundConnectionThresholdUndefined: Self = StObject.set(x, "inboundConnectionThreshold", js.undefined)
      
      inline def setInboundUpgradeTimeout(value: Double): Self = StObject.set(x, "inboundUpgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setInboundUpgradeTimeoutUndefined: Self = StObject.set(x, "inboundUpgradeTimeout", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxConnectionsUndefined: Self = StObject.set(x, "maxConnections", js.undefined)
      
      inline def setMaxIncomingPendingConnections(value: Double): Self = StObject.set(x, "maxIncomingPendingConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxIncomingPendingConnectionsUndefined: Self = StObject.set(x, "maxIncomingPendingConnections", js.undefined)
      
      inline def setMaxParallelDials(value: Double): Self = StObject.set(x, "maxParallelDials", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsPerPeer(value: Double): Self = StObject.set(x, "maxParallelDialsPerPeer", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsPerPeerUndefined: Self = StObject.set(x, "maxParallelDialsPerPeer", js.undefined)
      
      inline def setMaxParallelDialsUndefined: Self = StObject.set(x, "maxParallelDials", js.undefined)
      
      inline def setMaxPeerAddrsToDial(value: Double): Self = StObject.set(x, "maxPeerAddrsToDial", value.asInstanceOf[js.Any])
      
      inline def setMaxPeerAddrsToDialUndefined: Self = StObject.set(x, "maxPeerAddrsToDial", js.undefined)
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      inline def setMinConnectionsUndefined: Self = StObject.set(x, "minConnections", js.undefined)
      
      inline def setResolvers(value: Record[String, Resolver]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    }
  }
  
  trait DefaultConnectionManagerComponents extends StObject {
    
    var connectionGater: ConnectionGater
    
    var events: EventEmitter[Libp2pEvents]
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object DefaultConnectionManagerComponents {
    
    inline def apply(
      connectionGater: ConnectionGater,
      events: EventEmitter[Libp2pEvents],
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): DefaultConnectionManagerComponents = {
      val __obj = js.Dynamic.literal(connectionGater = connectionGater.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultConnectionManagerComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultConnectionManagerComponents] (val x: Self) extends AnyVal {
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenConnectionOptions
    extends StObject
       with AbortOptions {
    
    var priority: js.UndefOr[Double] = js.undefined
  }
  object OpenConnectionOptions {
    
    inline def apply(): OpenConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
