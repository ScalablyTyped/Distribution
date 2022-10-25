package typings.libp2p

import typings.libp2p.distSrcConnectionManagerLatencyMonitorMod.SummaryObject
import typings.libp2p.libp2pStrings.addressSorter
import typings.libp2p.libp2pStrings.autoDial
import typings.libp2p.libp2pStrings.autoDialInterval
import typings.libp2p.libp2pStrings.inboundConnectionThreshold
import typings.libp2p.libp2pStrings.inboundUpgradeTimeout
import typings.libp2p.libp2pStrings.maxAddrsToDial
import typings.libp2p.libp2pStrings.maxConnections
import typings.libp2p.libp2pStrings.maxData
import typings.libp2p.libp2pStrings.maxDialsPerPeer
import typings.libp2p.libp2pStrings.maxEventLoopDelay
import typings.libp2p.libp2pStrings.maxIncomingPendingConnections
import typings.libp2p.libp2pStrings.maxParallelDials
import typings.libp2p.libp2pStrings.maxReceivedData
import typings.libp2p.libp2pStrings.maxSentData
import typings.libp2p.libp2pStrings.minConnections
import typings.libp2p.libp2pStrings.movingAverageInterval
import typings.libp2p.libp2pStrings.pollInterval
import typings.libp2p.libp2pStrings.resolvers
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceConnectionManager.mod.Dialer
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`-1`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`0`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`1`
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.AddressSorter
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.Upgrader
import typings.libp2pInterfaces.distSrcStartableMod.Startable
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
    extends ConnectionManager
       with Startable {
    def this(components: DefaultConnectionManagerComponents, init: ConnectionManagerInit) = this()
    
    /**
      * If the `value` of `name` has exceeded its limit, maybe close a connection
      */
    def _checkMaxLimit(
      name: maxConnections | minConnections | maxData | maxSentData | maxReceivedData | maxEventLoopDelay | pollInterval | movingAverageInterval | autoDial | autoDialInterval | addressSorter | maxParallelDials | maxAddrsToDial | typings.libp2p.libp2pStrings.dialTimeout | inboundUpgradeTimeout | maxDialsPerPeer | resolvers | typings.libp2p.libp2pStrings.startupReconnectTimeout | typings.libp2p.libp2pStrings.allow | typings.libp2p.libp2pStrings.deny | inboundConnectionThreshold | maxIncomingPendingConnections,
      value: Double
    ): js.Promise[Unit] = js.native
    def _checkMaxLimit(
      name: maxConnections | minConnections | maxData | maxSentData | maxReceivedData | maxEventLoopDelay | pollInterval | movingAverageInterval | autoDial | autoDialInterval | addressSorter | maxParallelDials | maxAddrsToDial | typings.libp2p.libp2pStrings.dialTimeout | inboundUpgradeTimeout | maxDialsPerPeer | resolvers | typings.libp2p.libp2pStrings.startupReconnectTimeout | typings.libp2p.libp2pStrings.allow | typings.libp2p.libp2pStrings.deny | inboundConnectionThreshold | maxIncomingPendingConnections,
      value: Double,
      toPrune: Double
    ): js.Promise[Unit] = js.native
    
    /**
      * Checks the libp2p metrics to determine if any values have exceeded
      * the configured maximums.
      *
      * @private
      */
    def _checkMetrics(): js.Promise[Unit] = js.native
    
    /**
      * Cleans up the connections
      */
    def _close(): js.Promise[Unit] = js.native
    
    /**
      * Tracks the incoming connection and check the connection limit
      */
    def _onConnect(evt: CustomEvent[Connection]): js.Promise[Unit] = js.native
    
    /**
      * If the event loop is slow, maybe close a connection
      */
    def _onLatencyMeasure(evt: CustomEvent[SummaryObject]): Unit = js.native
    
    /**
      * If we have more connections than our maximum, select some excess connections
      * to prune based on peer value
      */
    def _pruneConnections(toPrune: Double): js.Promise[Unit] = js.native
    
    @JSName("afterStart")
    def afterStart_MDefaultConnectionManager(): js.Promise[Unit] = js.native
    
    /* private */ val allow: Any = js.native
    
    @JSName("beforeStop")
    def beforeStop_MDefaultConnectionManager(): js.Promise[Unit] = js.native
    
    /* private */ val components: Any = js.native
    
    /* private */ var connectOnStartupController: Any = js.native
    
    /* private */ val connections: Any = js.native
    
    /* private */ val deny: Any = js.native
    
    /* private */ val dialTimeout: Any = js.native
    
    /**
      * Get all open connections with a peer
      */
    def getAll(peerId: PeerId): js.Array[Connection] = js.native
    
    /* private */ val inboundConnectionRateLimiter: Any = js.native
    
    /* private */ var incomingPendingConnections: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val latencyMonitor: Any = js.native
    
    def onConnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /**
      * Removes the connection from tracking
      */
    def onDisconnect(evt: CustomEvent[Connection]): Unit = js.native
    
    /* private */ val opts: Any = js.native
    
    /**
      * This method will be invoked to start the component.
      *
      * It should not assume that any other components have been started.
      */
    /* CompleteClass */
    override def start(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var started: Any = js.native
    
    /* private */ val startupReconnectTimeout: Any = js.native
    
    /**
      * This method will be invoked to stop the component.
      *
      * It should not assume any other components are running when it is called.
      */
    /* CompleteClass */
    override def stop(): Unit | js.Promise[Unit] = js.native
    
    /* private */ var timer: Any = js.native
  }
  
  trait ConnectionManagerEvents extends StObject {
    
    @JSName("peer:connect")
    var peerColonconnect: CustomEvent[PeerId]
    
    @JSName("peer:disconnect")
    var peerColondisconnect: CustomEvent[PeerId]
  }
  object ConnectionManagerEvents {
    
    inline def apply(peerColonconnect: CustomEvent[PeerId], peerColondisconnect: CustomEvent[PeerId]): ConnectionManagerEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("peer:connect")(peerColonconnect.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:disconnect")(peerColondisconnect.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionManagerEvents]
    }
    
    extension [Self <: ConnectionManagerEvents](x: Self) {
      
      inline def setPeerColonconnect(value: CustomEvent[PeerId]): Self = StObject.set(x, "peer:connect", value.asInstanceOf[js.Any])
      
      inline def setPeerColondisconnect(value: CustomEvent[PeerId]): Self = StObject.set(x, "peer:disconnect", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionManagerInit extends StObject {
    
    /**
      * Sort the known addresses of a peer before trying to dial
      */
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
    
    /**
      * A list of multiaddrs that will always be allowed (except if they are in the
      * deny list) to open connections to this node even if we've reached maxConnections
      */
    var allow: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If true, try to connect to all discovered peers up to the connection manager limit
      */
    var autoDial: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How long to wait between attempting to keep our number of concurrent connections
      * above minConnections
      */
    var autoDialInterval: Double
    
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
      * host, reject subsequent connections
      */
    var inboundConnectionThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * When a new inbound connection is opened, the upgrade process (e.g. protect,
      * encrypt, multiplex etc) must complete within this number of ms.
      */
    var inboundUpgradeTimeout: Double
    
    /**
      * Number of max addresses to dial for a given peer
      */
    var maxAddrsToDial: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of connections to keep open
      */
    var maxConnections: Double
    
    /**
      * The max data (in and out), per average interval to allow
      */
    var maxData: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of max concurrent dials per peer
      */
    var maxDialsPerPeer: js.UndefOr[Double] = js.undefined
    
    /**
      * The upper limit the event loop can take to run
      */
    var maxEventLoopDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum number of parallel incoming connections allowed that have yet to
      * complete the connection upgrade - e.g. choosing connection encryption, muxer, etc
      */
    var maxIncomingPendingConnections: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of max concurrent dials
      */
    var maxParallelDials: js.UndefOr[Double] = js.undefined
    
    /**
      * The max incoming data, per average interval to allow
      */
    var maxReceivedData: js.UndefOr[Double] = js.undefined
    
    /**
      * The max outgoing data, per average interval to allow
      */
    var maxSentData: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of connections to keep open
      */
    var minConnections: Double
    
    /**
      * How often, in milliseconds, to compute averages
      */
    var movingAverageInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * How often, in milliseconds, metrics and latency should be checked
      */
    var pollInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Multiaddr resolvers to use when dialing
      */
    var resolvers: js.UndefOr[Record[String, Resolver]] = js.undefined
    
    /**
      * On startup we try to dial any peer that has previously been
      * tagged with KEEP_ALIVE up to this timeout in ms. (default: 60000)
      */
    var startupReconnectTimeout: js.UndefOr[Double] = js.undefined
  }
  object ConnectionManagerInit {
    
    inline def apply(
      autoDialInterval: Double,
      inboundUpgradeTimeout: Double,
      maxConnections: Double,
      minConnections: Double
    ): ConnectionManagerInit = {
      val __obj = js.Dynamic.literal(autoDialInterval = autoDialInterval.asInstanceOf[js.Any], inboundUpgradeTimeout = inboundUpgradeTimeout.asInstanceOf[js.Any], maxConnections = maxConnections.asInstanceOf[js.Any], minConnections = minConnections.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionManagerInit]
    }
    
    extension [Self <: ConnectionManagerInit](x: Self) {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
      
      inline def setAllow(value: js.Array[String]): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setAllowVarargs(value: String*): Self = StObject.set(x, "allow", js.Array(value*))
      
      inline def setAutoDial(value: Boolean): Self = StObject.set(x, "autoDial", value.asInstanceOf[js.Any])
      
      inline def setAutoDialInterval(value: Double): Self = StObject.set(x, "autoDialInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoDialUndefined: Self = StObject.set(x, "autoDial", js.undefined)
      
      inline def setDeny(value: js.Array[String]): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
      
      inline def setDenyUndefined: Self = StObject.set(x, "deny", js.undefined)
      
      inline def setDenyVarargs(value: String*): Self = StObject.set(x, "deny", js.Array(value*))
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialTimeoutUndefined: Self = StObject.set(x, "dialTimeout", js.undefined)
      
      inline def setInboundConnectionThreshold(value: Double): Self = StObject.set(x, "inboundConnectionThreshold", value.asInstanceOf[js.Any])
      
      inline def setInboundConnectionThresholdUndefined: Self = StObject.set(x, "inboundConnectionThreshold", js.undefined)
      
      inline def setInboundUpgradeTimeout(value: Double): Self = StObject.set(x, "inboundUpgradeTimeout", value.asInstanceOf[js.Any])
      
      inline def setMaxAddrsToDial(value: Double): Self = StObject.set(x, "maxAddrsToDial", value.asInstanceOf[js.Any])
      
      inline def setMaxAddrsToDialUndefined: Self = StObject.set(x, "maxAddrsToDial", js.undefined)
      
      inline def setMaxConnections(value: Double): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxData(value: Double): Self = StObject.set(x, "maxData", value.asInstanceOf[js.Any])
      
      inline def setMaxDataUndefined: Self = StObject.set(x, "maxData", js.undefined)
      
      inline def setMaxDialsPerPeer(value: Double): Self = StObject.set(x, "maxDialsPerPeer", value.asInstanceOf[js.Any])
      
      inline def setMaxDialsPerPeerUndefined: Self = StObject.set(x, "maxDialsPerPeer", js.undefined)
      
      inline def setMaxEventLoopDelay(value: Double): Self = StObject.set(x, "maxEventLoopDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxEventLoopDelayUndefined: Self = StObject.set(x, "maxEventLoopDelay", js.undefined)
      
      inline def setMaxIncomingPendingConnections(value: Double): Self = StObject.set(x, "maxIncomingPendingConnections", value.asInstanceOf[js.Any])
      
      inline def setMaxIncomingPendingConnectionsUndefined: Self = StObject.set(x, "maxIncomingPendingConnections", js.undefined)
      
      inline def setMaxParallelDials(value: Double): Self = StObject.set(x, "maxParallelDials", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsUndefined: Self = StObject.set(x, "maxParallelDials", js.undefined)
      
      inline def setMaxReceivedData(value: Double): Self = StObject.set(x, "maxReceivedData", value.asInstanceOf[js.Any])
      
      inline def setMaxReceivedDataUndefined: Self = StObject.set(x, "maxReceivedData", js.undefined)
      
      inline def setMaxSentData(value: Double): Self = StObject.set(x, "maxSentData", value.asInstanceOf[js.Any])
      
      inline def setMaxSentDataUndefined: Self = StObject.set(x, "maxSentData", js.undefined)
      
      inline def setMinConnections(value: Double): Self = StObject.set(x, "minConnections", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageInterval(value: Double): Self = StObject.set(x, "movingAverageInterval", value.asInstanceOf[js.Any])
      
      inline def setMovingAverageIntervalUndefined: Self = StObject.set(x, "movingAverageInterval", js.undefined)
      
      inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
      
      inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
      
      inline def setResolvers(value: Record[String, Resolver]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      inline def setStartupReconnectTimeout(value: Double): Self = StObject.set(x, "startupReconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setStartupReconnectTimeoutUndefined: Self = StObject.set(x, "startupReconnectTimeout", js.undefined)
    }
  }
  
  trait DefaultConnectionManagerComponents extends StObject {
    
    var dialer: Dialer
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var upgrader: Upgrader
  }
  object DefaultConnectionManagerComponents {
    
    inline def apply(dialer: Dialer, peerId: PeerId, peerStore: PeerStore, upgrader: Upgrader): DefaultConnectionManagerComponents = {
      val __obj = js.Dynamic.literal(dialer = dialer.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], upgrader = upgrader.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultConnectionManagerComponents]
    }
    
    extension [Self <: DefaultConnectionManagerComponents](x: Self) {
      
      inline def setDialer(value: Dialer): Self = StObject.set(x, "dialer", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setUpgrader(value: Upgrader): Self = StObject.set(x, "upgrader", value.asInstanceOf[js.Any])
    }
  }
}
