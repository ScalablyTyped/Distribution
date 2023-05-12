package typings.libp2pInterfaceLibp2p

import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceContentRouting.mod.ContentRouting_
import typings.libp2pInterfaceKeychain.mod.KeyChain
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`-1`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`0`
import typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pInts.`1`
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.libp2pInterfacePeerRouting.mod.PeerRouting_
import typings.libp2pInterfacePeerStore.mod.Address
import typings.libp2pInterfacePeerStore.mod.Peer
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.StreamHandler
import typings.libp2pInterfaceRegistrar.mod.StreamHandlerOptions
import typings.libp2pInterfaceRegistrar.mod.Topology
import typings.libp2pInterfaceTransport.mod.Listener
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import typings.std.CustomEvent
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type AddressSorter = js.Function2[/* a */ Address, /* b */ Address, `-1` | `0` | `1`]
  
  trait IdentifyResult extends StObject {
    
    /**
      * The remote agent version
      */
    var agentVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The unsigned addresses they are listening on. Note - any multiaddrs present
      * in the signed peer record should be preferred to the value here.
      */
    var listenAddrs: js.Array[Multiaddr_]
    
    /**
      * If set this is the address that the remote peer saw the identify request
      * originate from
      */
    var observedAddr: js.UndefOr[Multiaddr_] = js.undefined
    
    /**
      * The remote Peer's PeerId
      */
    var peerId: PeerId
    
    /**
      * The remote protocol version
      */
    var protocolVersion: js.UndefOr[String] = js.undefined
    
    /**
      * The protocols the remote peer supports
      */
    var protocols: js.Array[String]
    
    /**
      * The public key part of the remote PeerId - this is only useful for older
      * RSA-based PeerIds, the more modern Ed25519 and secp256k1 types have the
      * public key embedded in them
      */
    var publicKey: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /**
      * If sent by the remote peer this is the deserialized signed peer record
      */
    var signedPeerRecord: js.UndefOr[SignedPeerRecord] = js.undefined
  }
  object IdentifyResult {
    
    inline def apply(listenAddrs: js.Array[Multiaddr_], peerId: PeerId, protocols: js.Array[String]): IdentifyResult = {
      val __obj = js.Dynamic.literal(listenAddrs = listenAddrs.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentifyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentifyResult] (val x: Self) extends AnyVal {
      
      inline def setAgentVersion(value: String): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
      
      inline def setAgentVersionUndefined: Self = StObject.set(x, "agentVersion", js.undefined)
      
      inline def setListenAddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "listenAddrs", value.asInstanceOf[js.Any])
      
      inline def setListenAddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "listenAddrs", js.Array(value*))
      
      inline def setObservedAddr(value: Multiaddr_): Self = StObject.set(x, "observedAddr", value.asInstanceOf[js.Any])
      
      inline def setObservedAddrUndefined: Self = StObject.set(x, "observedAddr", js.undefined)
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersion(value: String): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setProtocols(value: js.Array[String]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
      
      inline def setProtocolsVarargs(value: String*): Self = StObject.set(x, "protocols", js.Array(value*))
      
      inline def setPublicKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
      
      inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
      
      inline def setSignedPeerRecord(value: SignedPeerRecord): Self = StObject.set(x, "signedPeerRecord", value.asInstanceOf[js.Any])
      
      inline def setSignedPeerRecordUndefined: Self = StObject.set(x, "signedPeerRecord", js.undefined)
    }
  }
  
  @js.native
  trait Libp2p[T /* <: ServiceMap */]
    extends EventEmitter[Libp2pEvents]
       with Startable {
    
    /**
      * The content routing subsystem allows the user to find providers for content,
      * let the network know they are providers for content, and get/put values to
      * the DHT.
      *
      * @example
      *
      * ```js
      * for await (const peerInfo of libp2p.contentRouting.findProviders(cid)) {
      *   console.info(peerInfo)
      *   // { id: PeerId(12D3Foo...), multiaddrs: [] ... }
      * }
      * ```
      */
    var contentRouting: ContentRouting_ = js.native
    
    def dial(peer: js.Array[Multiaddr_]): js.Promise[Connection] = js.native
    def dial(peer: js.Array[Multiaddr_], options: AbortOptions): js.Promise[Connection] = js.native
    /**
      * Dials to the provided peer. If successful, the known metadata of the
      * peer will be added to the nodes `peerStore`.
      *
      * If a PeerId is passed as the first argument, the peer will need to have known multiaddrs for it in the PeerStore.
      *
      * @example
      *
      * ```js
      * const conn = await libp2p.dial(remotePeerId)
      *
      * // create a new stream within the connection
      * const { stream, protocol } = await conn.newStream(['/echo/1.1.0', '/echo/1.0.0'])
      *
      * // protocol negotiated: 'echo/1.0.0' means that the other party only supports the older version
      *
      * // ...
      * await conn.close()
      * ```
      */
    def dial(peer: PeerId): js.Promise[Connection] = js.native
    def dial(peer: PeerId, options: AbortOptions): js.Promise[Connection] = js.native
    def dial(peer: Multiaddr_): js.Promise[Connection] = js.native
    def dial(peer: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
    
    def dialProtocol(peer: js.Array[Multiaddr_], protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: js.Array[Multiaddr_], protocols: String, options: AbortOptions): js.Promise[Stream] = js.native
    def dialProtocol(peer: js.Array[Multiaddr_], protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: js.Array[Multiaddr_], protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    /**
      * Dials to the provided peer and tries to handshake with the given protocols in order.
      * If successful, the known metadata of the peer will be added to the nodes `peerStore`,
      * and the `MuxedStream` will be returned together with the successful negotiated protocol.
      *
      * @example
      *
      * ```js
      * import { pipe } from 'it-pipe'
      *
      * const { stream, protocol } = await libp2p.dialProtocol(remotePeerId, protocols)
      *
      * // Use this new stream like any other duplex stream
      * pipe([1, 2, 3], stream, consume)
      * ```
      */
    def dialProtocol(peer: PeerId, protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: PeerId, protocols: String, options: AbortOptions): js.Promise[Stream] = js.native
    def dialProtocol(peer: PeerId, protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: PeerId, protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    def dialProtocol(peer: Multiaddr_, protocols: String): js.Promise[Stream] = js.native
    def dialProtocol(peer: Multiaddr_, protocols: String, options: AbortOptions): js.Promise[Stream] = js.native
    def dialProtocol(peer: Multiaddr_, protocols: js.Array[String]): js.Promise[Stream] = js.native
    def dialProtocol(peer: Multiaddr_, protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
    
    /**
      * Return a list of all connections this node has open, optionally filtering
      * by a PeerId
      *
      * @example
      *
      * ```js
      * for (const connection of libp2p.getConnections()) {
      *   console.log(peerId, connection.remoteAddr.toString())
      *   // Logs the PeerId string and the observed remote multiaddr of each Connection
      * }
      * ```
      */
    def getConnections(): js.Array[Connection] = js.native
    def getConnections(peerId: PeerId): js.Array[Connection] = js.native
    
    /**
      * Return the list of dials currently in progress or queued to start
      *
      * @example
      *
      * ```js
      * for (const pendingDial of libp2p.getDialQueue()) {
      *   console.log(pendingDial)
      * }
      * ```
      */
    def getDialQueue(): js.Array[PendingDial] = js.native
    
    /**
      * Get a deduplicated list of peer advertising multiaddrs by concatenating
      * the listen addresses used by transports with any configured
      * announce addresses as well as observed addresses reported by peers.
      *
      * If Announce addrs are specified, configured listen addresses will be
      * ignored though observed addresses will still be included.
      *
      * @example
      *
      * ```js
      * const listenMa = libp2p.getMultiaddrs()
      * // [ <Multiaddr 047f00000106f9ba - /ip4/127.0.0.1/tcp/63930> ]
      * ```
      */
    def getMultiaddrs(): js.Array[Multiaddr_] = js.native
    
    /**
      * Return a list of all peers we currently have a connection open to
      */
    def getPeers(): js.Array[PeerId] = js.native
    
    /**
      * Returns a list of supported protocols
      *
      * @example
      *
      * ```js
      * const protocols = libp2p.getProtocols()
      * // [ '/ipfs/ping/1.0.0', '/ipfs/id/1.0.0' ]
      * ```
      */
    def getProtocols(): js.Array[String] = js.native
    
    /**
      * Returns the public key for the passed PeerId. If the PeerId is of the 'RSA' type
      * this may mean searching the DHT if the key is not present in the KeyStore.
      * A set of user defined services
      */
    def getPublicKey(peer: PeerId): js.Promise[js.typedarray.Uint8Array] = js.native
    def getPublicKey(peer: PeerId, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
    
    /**
      * Sets up [multistream-select routing](https://github.com/multiformats/multistream-select) of protocols to their application handlers. Whenever a stream is opened on one of the provided protocols, the handler will be called. `handle` must be called in order to register a handler and support for a given protocol. This also informs other peers of the protocols you support.
      *
      * `libp2p.handle(protocols, handler, options)`
      *
      * In the event of a new handler for the same protocol being added, the first one is discarded.
      *
      * @example
      *
      * ```js
      * const handler = ({ connection, stream, protocol }) => {
      *   // use stream or connection according to the needs
      * }
      *
      * libp2p.handle('/echo/1.0.0', handler, {
      *   maxInboundStreams: 5,
      *   maxOutboundStreams: 5
      * })
      * ```
      */
    def handle(protocol: String, handler: StreamHandler): js.Promise[Unit] = js.native
    def handle(protocol: String, handler: StreamHandler, options: StreamHandlerOptions): js.Promise[Unit] = js.native
    def handle(protocol: js.Array[String], handler: StreamHandler): js.Promise[Unit] = js.native
    def handle(protocol: js.Array[String], handler: StreamHandler, options: StreamHandlerOptions): js.Promise[Unit] = js.native
    
    /**
      * Attempts to gracefully close an open connection to the given peer. If the connection is not closed in the grace period, it will be forcefully closed.
      *
      * @example
      *
      * ```js
      * await libp2p.hangUp(remotePeerId)
      * ```
      */
    def hangUp(peer: PeerId): js.Promise[Unit] = js.native
    def hangUp(peer: Multiaddr_): js.Promise[Unit] = js.native
    
    /**
      * The keychain contains the keys used by the current node, and can create new
      * keys, export them, import them, etc.
      *
      * @example
      *
      * ```js
      * const keyInfo = await libp2p.keychain.createKey('new key')
      * console.info(keyInfo)
      * // { id: '...', name: 'new key' }
      * ```
      */
    var keychain: KeyChain = js.native
    
    /**
      * The metrics subsystem allows recording values to assess the health/performance
      * of the running node.
      *
      * @example
      *
      * ```js
      * const metric = libp2p.metrics.registerMetric({
      *   'my-metric'
      * })
      *
      * // later
      * metric.update(5)
      * ```
      */
    var metrics: js.UndefOr[Metrics] = js.native
    
    /**
      * The PeerId is a unique identifier for a node on the network.
      *
      * It is the hash of an RSA public key or, for Ed25519 or secp256k1 keys,
      * the key itself.
      *
      * @example
      *
      * ```js
      * console.info(libp2p.peerId)
      * // PeerId(12D3Foo...)
      * ````
      */
    var peerId: PeerId = js.native
    
    /**
      * The peer routing subsystem allows the user to find peers on the network
      * or to find peers close to binary keys.
      *
      * @example
      *
      * ```js
      * const peerInfo = await libp2p.peerRouting.findPeer(peerId)
      * console.info(peerInfo)
      * // { id: PeerId(12D3Foo...), multiaddrs: [] ... }
      * ```
      *
      * @example
      *
      * ```js
      * for await (const peerInfo of libp2p.peerRouting.getClosestPeers(key)) {
      *   console.info(peerInfo)
      *   // { id: PeerId(12D3Foo...), multiaddrs: [] ... }
      * }
      * ```
      */
    var peerRouting: PeerRouting_ = js.native
    
    /**
      * The peer store holds information we know about other peers on the network.
      * - multiaddrs, supported protocols, etc.
      *
      * @example
      *
      * ```js
      * const peer = await libp2p.peerStore.get(peerId)
      * console.info(peer)
      * // { id: PeerId(12D3Foo...), addresses: [] ... }
      * ```
      */
    var peerStore: PeerStore = js.native
    
    /**
      * Register a topology to be informed when peers are encountered that
      * support the specified protocol
      *
      * @example
      *
      * ```js
      * import { createTopology } from '@libp2p/topology'
      *
      * const id = await libp2p.register('/echo/1.0.0', createTopology({
      *   onConnect: (peer, connection) => {
      *     // handle connect
      *   },
      *   onDisconnect: (peer, connection) => {
      *     // handle disconnect
      *   }
      * }))
      * ```
      */
    def register(protocol: String, topology: Topology): js.Promise[String] = js.native
    
    /**
      * A set of user defined services
      */
    var services: T = js.native
    
    def unhandle(protocols: String): js.Promise[Unit] = js.native
    /**
      * Removes the handler for each protocol. The protocol
      * will no longer be supported on streams.
      *
      * @example
      *
      * ```js
      * libp2p.unhandle(['/echo/1.0.0'])
      * ```
      */
    def unhandle(protocols: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Unregister topology to no longer be informed when peers connect or
      * disconnect.
      *
      * @example
      *
      * ```js
      * const id = await libp2p.register(...)
      *
      * libp2p.unregister(id)
      * ```
      */
    def unregister(id: String): Unit = js.native
  }
  
  trait Libp2pEvents extends StObject {
    
    /**
      * This event notifies listeners when incoming or outgoing connections are
      * closed.
      */
    @JSName("connection:close")
    var connectionColonclose: CustomEvent[Connection]
    
    /**
      * This event notifies listeners when new incoming or outgoing connections
      * are opened.
      */
    @JSName("connection:open")
    var connectionColonopen: CustomEvent[Connection]
    
    /**
      * This event is dispatched when the connection manager has more than the
      * configured allowable max connections and has closed some connections to
      * bring the node back under the limit.
      */
    @JSName("connection:prune")
    var connectionColonprune: CustomEvent[js.Array[Connection]]
    
    /**
      * This event will be triggered any time a new peer connects.
      *
      * @example
      *
      * ```js
      * libp2p.addEventListener('peer:connect', (event) => {
      *   const peerId = event.detail
      *   // ...
      * })
      * ```
      */
    @JSName("peer:connect")
    var peerColonconnect: CustomEvent[PeerId]
    
    /**
      * This event will be triggered any time we are disconnected from another peer, regardless of
      * the circumstances of that disconnection. If we happen to have multiple connections to a
      * peer, this event will **only** be triggered when the last connection is closed.
      *
      * @example
      *
      * ```js
      * libp2p.addEventListener('peer:disconnect', (event) => {
      *   const peerId = event.detail
      *   // ...
      * })
      * ```
      */
    @JSName("peer:disconnect")
    var peerColondisconnect: CustomEvent[PeerId]
    
    /**
      * This event is dispatched when a new network peer is discovered.
      *
      * @example
      *
      * ```js
      * libp2p.addEventListener('peer:discovery', (event) => {
      *    const peerInfo = event.detail
      *    // ...
      * })
      * ```
      */
    @JSName("peer:discovery")
    var peerColondiscovery: CustomEvent[PeerInfo]
    
    /**
      * This event is dispatched after a remote peer has successfully responded to the identify
      * protocol. Note that for this to be emitted, both peers must have an identify service
      * configured.
      *
      * @example
      *
      * ```js
      * libp2p.addEventListener('peer:identify', (event) => {
      *   const identifyResult = event.detail
      *   // ...
      * })
      * ```
      */
    @JSName("peer:identify")
    var peerColonidentify: CustomEvent[IdentifyResult]
    
    /**
      * This event is dispatched when the peer store data for a peer has been
      * updated - e.g. their multiaddrs, protocols etc have changed.
      *
      * If they were previously known to this node, the old peer data will be
      * set in the `previous` field.
      *
      * This may be in response to the identify protocol running, a manual
      * update or some other event.
      */
    @JSName("peer:update")
    var peerColonupdate: CustomEvent[PeerUpdate]
    
    /**
      * This event is dispatched when the current node's peer record changes -
      * for example a transport started listening on a new address or a new
      * protocol handler was registered.
      *
      * @example
      *
      * ```js
      * libp2p.addEventListener('self:peer:update', (event) => {
      *   const { peer } = event.detail
      *   // ...
      * })
      * ```
      */
    @JSName("self:peer:update")
    var selfColonpeerColonupdate: CustomEvent[PeerUpdate]
    
    /**
      * This event is dispatched when a transport stops listening on an address
      */
    @JSName("transport:close")
    var transportColonclose: CustomEvent[Listener]
    
    /**
      * This event is dispatched when a transport begins listening on a new address
      */
    @JSName("transport:listening")
    var transportColonlistening: CustomEvent[Listener]
  }
  object Libp2pEvents {
    
    inline def apply(
      connectionColonclose: CustomEvent[Connection],
      connectionColonopen: CustomEvent[Connection],
      connectionColonprune: CustomEvent[js.Array[Connection]],
      peerColonconnect: CustomEvent[PeerId],
      peerColondisconnect: CustomEvent[PeerId],
      peerColondiscovery: CustomEvent[PeerInfo],
      peerColonidentify: CustomEvent[IdentifyResult],
      peerColonupdate: CustomEvent[PeerUpdate],
      selfColonpeerColonupdate: CustomEvent[PeerUpdate],
      transportColonclose: CustomEvent[Listener],
      transportColonlistening: CustomEvent[Listener]
    ): Libp2pEvents = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("connection:close")(connectionColonclose.asInstanceOf[js.Any])
      __obj.updateDynamic("connection:open")(connectionColonopen.asInstanceOf[js.Any])
      __obj.updateDynamic("connection:prune")(connectionColonprune.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:connect")(peerColonconnect.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:disconnect")(peerColondisconnect.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:discovery")(peerColondiscovery.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:identify")(peerColonidentify.asInstanceOf[js.Any])
      __obj.updateDynamic("peer:update")(peerColonupdate.asInstanceOf[js.Any])
      __obj.updateDynamic("self:peer:update")(selfColonpeerColonupdate.asInstanceOf[js.Any])
      __obj.updateDynamic("transport:close")(transportColonclose.asInstanceOf[js.Any])
      __obj.updateDynamic("transport:listening")(transportColonlistening.asInstanceOf[js.Any])
      __obj.asInstanceOf[Libp2pEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Libp2pEvents] (val x: Self) extends AnyVal {
      
      inline def setConnectionColonclose(value: CustomEvent[Connection]): Self = StObject.set(x, "connection:close", value.asInstanceOf[js.Any])
      
      inline def setConnectionColonopen(value: CustomEvent[Connection]): Self = StObject.set(x, "connection:open", value.asInstanceOf[js.Any])
      
      inline def setConnectionColonprune(value: CustomEvent[js.Array[Connection]]): Self = StObject.set(x, "connection:prune", value.asInstanceOf[js.Any])
      
      inline def setPeerColonconnect(value: CustomEvent[PeerId]): Self = StObject.set(x, "peer:connect", value.asInstanceOf[js.Any])
      
      inline def setPeerColondisconnect(value: CustomEvent[PeerId]): Self = StObject.set(x, "peer:disconnect", value.asInstanceOf[js.Any])
      
      inline def setPeerColondiscovery(value: CustomEvent[PeerInfo]): Self = StObject.set(x, "peer:discovery", value.asInstanceOf[js.Any])
      
      inline def setPeerColonidentify(value: CustomEvent[IdentifyResult]): Self = StObject.set(x, "peer:identify", value.asInstanceOf[js.Any])
      
      inline def setPeerColonupdate(value: CustomEvent[PeerUpdate]): Self = StObject.set(x, "peer:update", value.asInstanceOf[js.Any])
      
      inline def setSelfColonpeerColonupdate(value: CustomEvent[PeerUpdate]): Self = StObject.set(x, "self:peer:update", value.asInstanceOf[js.Any])
      
      inline def setTransportColonclose(value: CustomEvent[Listener]): Self = StObject.set(x, "transport:close", value.asInstanceOf[js.Any])
      
      inline def setTransportColonlistening(value: CustomEvent[Listener]): Self = StObject.set(x, "transport:listening", value.asInstanceOf[js.Any])
    }
  }
  
  trait PeerUpdate extends StObject {
    
    var peer: Peer
    
    var previous: js.UndefOr[Peer] = js.undefined
  }
  object PeerUpdate {
    
    inline def apply(peer: Peer): PeerUpdate = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerUpdate] (val x: Self) extends AnyVal {
      
      inline def setPeer(value: Peer): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
      
      inline def setPrevious(value: Peer): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
      
      inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    }
  }
  
  trait PendingDial extends StObject {
    
    /**
      * A unique identifier for this dial
      */
    var id: String
    
    /**
      * The list of multiaddrs that will be dialled. The returned connection will
      * use the first address that succeeds, all other dials part of this pending
      * dial will be cancelled.
      */
    var multiaddrs: js.Array[Multiaddr_]
    
    /**
      * If known, this is the peer id that libp2p expects to be dialling
      */
    var peerId: js.UndefOr[PeerId] = js.undefined
    
    /**
      * The current status of the dial
      */
    var status: PendingDialStatus
  }
  object PendingDial {
    
    inline def apply(id: String, multiaddrs: js.Array[Multiaddr_], status: PendingDialStatus): PendingDial = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], multiaddrs = multiaddrs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[PendingDial]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PendingDial] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrs(value: js.Array[Multiaddr_]): Self = StObject.set(x, "multiaddrs", value.asInstanceOf[js.Any])
      
      inline def setMultiaddrsVarargs(value: Multiaddr_ *): Self = StObject.set(x, "multiaddrs", js.Array(value*))
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
      
      inline def setPeerIdUndefined: Self = StObject.set(x, "peerId", js.undefined)
      
      inline def setStatus(value: PendingDialStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.queued
    - typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.active
    - typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.error
    - typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.success
  */
  trait PendingDialStatus extends StObject
  object PendingDialStatus {
    
    inline def active: typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.active = "active".asInstanceOf[typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.active]
    
    inline def error: typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.error = "error".asInstanceOf[typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.error]
    
    inline def queued: typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.queued = "queued".asInstanceOf[typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.queued]
    
    inline def success: typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.success = "success".asInstanceOf[typings.libp2pInterfaceLibp2p.libp2pInterfaceLibp2pStrings.success]
  }
  
  type ServiceMap = Record[String, Any]
  
  trait SignedPeerRecord extends StObject {
    
    var addresses: js.Array[Multiaddr_]
    
    var seq: js.BigInt
  }
  object SignedPeerRecord {
    
    inline def apply(addresses: js.Array[Multiaddr_], seq: js.BigInt): SignedPeerRecord = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
      __obj.asInstanceOf[SignedPeerRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignedPeerRecord] (val x: Self) extends AnyVal {
      
      inline def setAddresses(value: js.Array[Multiaddr_]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: Multiaddr_ *): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setSeq(value: js.BigInt): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
    }
  }
}
