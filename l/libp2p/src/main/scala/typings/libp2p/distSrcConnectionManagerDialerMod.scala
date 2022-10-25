package typings.libp2p

import typings.libp2p.distSrcConnectionManagerDialerDialRequestMod.DialRequest
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.ConnectionGater
import typings.libp2pInterfaceConnectionManager.mod.Dialer
import typings.libp2pInterfaceMetrics.mod.ComponentMetricsTracker
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`-1`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`0`
import typings.libp2pInterfacePeerStore.libp2pInterfacePeerStoreInts.`1`
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.AddressSorter
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceTransport.mod.TransportManager
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.multiformatsMultiaddr.mod.Resolver
import typings.std.Map
import typings.std.Record
import typings.timeoutAbortController.mod.TimeoutController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConnectionManagerDialerMod {
  
  @JSImport("libp2p/dist/src/connection-manager/dialer", "DefaultDialer")
  @js.native
  open class DefaultDialer protected ()
    extends StObject
       with Startable
       with Dialer {
    def this(components: DefaultDialerComponents) = this()
    def this(components: DefaultDialerComponents, init: DialerInit) = this()
    
    /**
      * Connects to a given `peer` by dialing all of its known addresses.
      * The dial to the first address that is successfully able to upgrade a connection
      * will be used.
      */
    def _createCancellableDialTarget(peer: PeerId, options: AbortOptions): js.Promise[DialTarget] = js.native
    
    /**
      * Creates a DialTarget. The DialTarget is used to create and track
      * the DialRequest to a given peer.
      * If a multiaddr is received it should be the first address attempted.
      * Multiaddrs not supported by the available transports will be filtered out.
      */
    def _createDialTarget(peer: PeerId, options: AbortOptions): js.Promise[DialTarget] = js.native
    
    /**
      * Creates a PendingDial that wraps the underlying DialRequest
      */
    def _createPendingDial(dialTarget: DialTarget): PendingDial = js.native
    def _createPendingDial(dialTarget: DialTarget, options: AbortOptions): PendingDial = js.native
    
    /**
      * Resolve multiaddr recursively
      */
    def _resolve(ma: Multiaddr_, options: AbortOptions): js.Promise[js.Array[Multiaddr_]] = js.native
    
    /**
      * Resolve a given multiaddr. If this fails, an empty array will be returned
      */
    def _resolveRecord(ma: Multiaddr_, options: AbortOptions): js.Promise[js.Array[Multiaddr_]] = js.native
    
    /* private */ val addressSorter: Any = js.native
    
    /* private */ val components: Any = js.native
    
    /* CompleteClass */
    override def isStarted(): Boolean = js.native
    
    /* private */ val maxAddrsToDial: Any = js.native
    
    /* private */ val maxDialsPerPeer: Any = js.native
    
    var pendingDialTargets: Map[String, PendingDialTarget] = js.native
    
    var pendingDials: Map[String, PendingDial] = js.native
    
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
    
    /* private */ val timeout: Any = js.native
    
    var tokens: js.Array[Double] = js.native
  }
  
  trait DefaultDialerComponents extends StObject {
    
    var connectionGater: ConnectionGater
    
    var metrics: js.UndefOr[Metrics] = js.undefined
    
    var peerId: PeerId
    
    var peerStore: PeerStore
    
    var transportManager: TransportManager
  }
  object DefaultDialerComponents {
    
    inline def apply(
      connectionGater: ConnectionGater,
      peerId: PeerId,
      peerStore: PeerStore,
      transportManager: TransportManager
    ): DefaultDialerComponents = {
      val __obj = js.Dynamic.literal(connectionGater = connectionGater.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultDialerComponents]
    }
    
    extension [Self <: DefaultDialerComponents](x: Self) {
      
      inline def setConnectionGater(value: ConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
      
      inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
      
      inline def setTransportManager(value: TransportManager): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialTarget extends StObject {
    
    var addrs: js.Array[Multiaddr_]
    
    var id: String
  }
  object DialTarget {
    
    inline def apply(addrs: js.Array[Multiaddr_], id: String): DialTarget = {
      val __obj = js.Dynamic.literal(addrs = addrs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DialTarget]
    }
    
    extension [Self <: DialTarget](x: Self) {
      
      inline def setAddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addrs", value.asInstanceOf[js.Any])
      
      inline def setAddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addrs", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DialerInit extends StObject {
    
    /**
      * Sort the known addresses of a peer before trying to dial
      */
    var addressSorter: js.UndefOr[AddressSorter] = js.undefined
    
    /**
      * How long a dial attempt is allowed to take
      */
    var dialTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of max addresses to dial for a given peer
      */
    var maxAddrsToDial: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of max concurrent dials per peer
      */
    var maxDialsPerPeer: js.UndefOr[Double] = js.undefined
    
    /**
      * Number of max concurrent dials
      */
    var maxParallelDials: js.UndefOr[Double] = js.undefined
    
    var metrics: js.UndefOr[ComponentMetricsTracker] = js.undefined
    
    /**
      * Multiaddr resolvers to use when dialing
      */
    var resolvers: js.UndefOr[Record[String, Resolver]] = js.undefined
  }
  object DialerInit {
    
    inline def apply(): DialerInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialerInit]
    }
    
    extension [Self <: DialerInit](x: Self) {
      
      inline def setAddressSorter(value: (/* a */ Address, /* b */ Address) => `-1` | `0` | `1`): Self = StObject.set(x, "addressSorter", js.Any.fromFunction2(value))
      
      inline def setAddressSorterUndefined: Self = StObject.set(x, "addressSorter", js.undefined)
      
      inline def setDialTimeout(value: Double): Self = StObject.set(x, "dialTimeout", value.asInstanceOf[js.Any])
      
      inline def setDialTimeoutUndefined: Self = StObject.set(x, "dialTimeout", js.undefined)
      
      inline def setMaxAddrsToDial(value: Double): Self = StObject.set(x, "maxAddrsToDial", value.asInstanceOf[js.Any])
      
      inline def setMaxAddrsToDialUndefined: Self = StObject.set(x, "maxAddrsToDial", js.undefined)
      
      inline def setMaxDialsPerPeer(value: Double): Self = StObject.set(x, "maxDialsPerPeer", value.asInstanceOf[js.Any])
      
      inline def setMaxDialsPerPeerUndefined: Self = StObject.set(x, "maxDialsPerPeer", js.undefined)
      
      inline def setMaxParallelDials(value: Double): Self = StObject.set(x, "maxParallelDials", value.asInstanceOf[js.Any])
      
      inline def setMaxParallelDialsUndefined: Self = StObject.set(x, "maxParallelDials", js.undefined)
      
      inline def setMetrics(value: ComponentMetricsTracker): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
      
      inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
      
      inline def setResolvers(value: Record[String, Resolver]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
    }
  }
  
  trait PendingDial extends StObject {
    
    var controller: TimeoutController
    
    def destroy(): Unit
    
    var dialRequest: DialRequest
    
    var promise: js.Promise[Connection]
  }
  object PendingDial {
    
    inline def apply(
      controller: TimeoutController,
      destroy: () => Unit,
      dialRequest: DialRequest,
      promise: js.Promise[Connection]
    ): PendingDial = {
      val __obj = js.Dynamic.literal(controller = controller.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), dialRequest = dialRequest.asInstanceOf[js.Any], promise = promise.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingDial]
    }
    
    extension [Self <: PendingDial](x: Self) {
      
      inline def setController(value: TimeoutController): Self = StObject.set(x, "controller", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDialRequest(value: DialRequest): Self = StObject.set(x, "dialRequest", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: js.Promise[Connection]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    }
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
    
    extension [Self <: PendingDialTarget](x: Self) {
      
      inline def setReject(value: js.Error => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
