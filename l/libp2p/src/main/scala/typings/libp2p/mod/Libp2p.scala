package typings.libp2p.mod

import typings.libp2p.distSrcKeychainMod.KeyChain
import typings.libp2pInterfaceConnection.mod.Connection
import typings.libp2pInterfaceConnection.mod.Stream
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaceRegistrar.mod.StreamHandler
import typings.libp2pInterfaceRegistrar.mod.StreamHandlerOptions
import typings.libp2pInterfaces.distSrcStartableMod.Startable
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.libp2pInterfaces.mod.AbortOptions
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Libp2p
  extends EventEmitter[Libp2pEvents]
     with Startable {
  
  var connectionManager: ConnectionManager = js.native
  
  var contentRouting: ContentRouting = js.native
  
  var dht: DualDHT = js.native
  
  /**
    * Dials to the provided peer. If successful, the known metadata of the
    * peer will be added to the nodes `peerStore`
    */
  def dial(peer: PeerId): js.Promise[Connection] = js.native
  def dial(peer: PeerId, options: AbortOptions): js.Promise[Connection] = js.native
  def dial(peer: Multiaddr_): js.Promise[Connection] = js.native
  def dial(peer: Multiaddr_, options: AbortOptions): js.Promise[Connection] = js.native
  
  /**
    * Dials to the provided peer and tries to handshake with the given protocols in order.
    * If successful, the known metadata of the peer will be added to the nodes `peerStore`,
    * and the `MuxedStream` will be returned together with the successful negotiated protocol.
    */
  def dialProtocol(peer: PeerId, protocols: String): js.Promise[Stream] = js.native
  def dialProtocol(peer: PeerId, protocols: String, options: AbortOptions): js.Promise[Stream] = js.native
  def dialProtocol(peer: PeerId, protocols: js.Array[String]): js.Promise[Stream] = js.native
  def dialProtocol(peer: PeerId, protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
  def dialProtocol(peer: Multiaddr_, protocols: String): js.Promise[Stream] = js.native
  def dialProtocol(peer: Multiaddr_, protocols: String, options: AbortOptions): js.Promise[Stream] = js.native
  def dialProtocol(peer: Multiaddr_, protocols: js.Array[String]): js.Promise[Stream] = js.native
  def dialProtocol(peer: Multiaddr_, protocols: js.Array[String], options: AbortOptions): js.Promise[Stream] = js.native
  
  def fetch(peer: String, key: String): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  def fetch(peer: String, key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  /**
    * Sends a request to fetch the value associated with the given key from the given peer.
    */
  def fetch(peer: PeerId, key: String): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  def fetch(peer: PeerId, key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  def fetch(peer: Multiaddr_, key: String): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  def fetch(peer: Multiaddr_, key: String, options: AbortOptions): js.Promise[js.typedarray.Uint8Array | Null] = js.native
  
  /**
    * Return a list of all connections this node has open, optionally filtering
    * by a PeerId
    */
  def getConnections(): js.Array[Connection] = js.native
  def getConnections(peerId: PeerId): js.Array[Connection] = js.native
  
  /**
    * Get a deduplicated list of peer advertising multiaddrs by concatenating
    * the listen addresses used by transports with any configured
    * announce addresses as well as observed addresses reported by peers.
    *
    * If Announce addrs are specified, configured listen addresses will be
    * ignored though observed addresses will still be included.
    */
  def getMultiaddrs(): js.Array[Multiaddr_] = js.native
  
  /**
    * Return a list of all peers we currently have a connection open to
    */
  def getPeers(): js.Array[PeerId] = js.native
  
  /**
    * Returns the public key for the passed PeerId. If the PeerId is of the 'RSA' type
    * this may mean searching the DHT if the key is not present in the KeyStore.
    */
  def getPublicKey(peer: PeerId): js.Promise[js.typedarray.Uint8Array] = js.native
  def getPublicKey(peer: PeerId, options: AbortOptions): js.Promise[js.typedarray.Uint8Array] = js.native
  
  /**
    * Registers the `handler` for each protocol
    */
  def handle(protocol: String, handler: StreamHandler): js.Promise[Unit] = js.native
  def handle(protocol: String, handler: StreamHandler, options: StreamHandlerOptions): js.Promise[Unit] = js.native
  def handle(protocol: js.Array[String], handler: StreamHandler): js.Promise[Unit] = js.native
  def handle(protocol: js.Array[String], handler: StreamHandler, options: StreamHandlerOptions): js.Promise[Unit] = js.native
  
  def hangUp(peer: String): js.Promise[Unit] = js.native
  /**
    * Disconnects all connections to the given `peer`
    */
  def hangUp(peer: PeerId): js.Promise[Unit] = js.native
  def hangUp(peer: Multiaddr_): js.Promise[Unit] = js.native
  
  var keychain: KeyChain = js.native
  
  var metrics: js.UndefOr[Metrics] = js.native
  
  var peerId: PeerId = js.native
  
  var peerRouting: PeerRouting = js.native
  
  var peerStore: PeerStore = js.native
  
  def ping(peer: PeerId): js.Promise[Double] = js.native
  def ping(peer: PeerId, options: AbortOptions): js.Promise[Double] = js.native
  /**
    * Pings the given peer in order to obtain the operation latency
    */
  def ping(peer: Multiaddr_): js.Promise[Double] = js.native
  def ping(peer: Multiaddr_, options: AbortOptions): js.Promise[Double] = js.native
  
  var pubsub: PubSub[PubSubEvents] = js.native
  
  var registrar: Registrar = js.native
  
  def unhandle(protocols: String): js.Promise[Unit] = js.native
  /**
    * Removes the handler for each protocol. The protocol
    * will no longer be supported on streams.
    */
  def unhandle(protocols: js.Array[String]): js.Promise[Unit] = js.native
}
