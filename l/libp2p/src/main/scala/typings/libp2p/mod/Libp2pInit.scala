package typings.libp2p.mod

import typings.interfaceDatastore.mod.Datastore
import typings.libp2p.anon.PartialConnectionGater
import typings.libp2p.distSrcConnectionManagerMod.ConnectionManagerInit
import typings.libp2p.distSrcFetchMod.FetchServiceInit
import typings.libp2p.distSrcIdentifyMod.IdentifyServiceInit
import typings.libp2p.distSrcPingMod.PingServiceInit
import typings.libp2pInterfaceConnection.mod.ConnectionProtector
import typings.libp2pInterfaceConnectionEncrypter.mod.ConnectionEncrypter
import typings.libp2pInterfaceContentRouting.mod.ContentRouting
import typings.libp2pInterfaceDht.mod.DualDHT
import typings.libp2pInterfaceMetrics.mod.MetricsInit
import typings.libp2pInterfacePeerDiscovery.mod.PeerDiscovery
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerRouting.mod.PeerRouting
import typings.libp2pInterfacePeerStore.mod.PeerStoreInit
import typings.libp2pInterfacePubsub.mod.PubSub
import typings.libp2pInterfacePubsub.mod.PubSubEvents
import typings.libp2pInterfaceStreamMuxer.mod.StreamMuxerFactory
import typings.libp2pInterfaceTransport.mod.Transport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Libp2pInit extends StObject {
  
  var addresses: AddressesConfig
  
  var connectionEncryption: js.UndefOr[js.Array[ConnectionEncrypter]] = js.undefined
  
  var connectionGater: PartialConnectionGater
  
  var connectionManager: ConnectionManagerInit
  
  var connectionProtector: js.UndefOr[ConnectionProtector] = js.undefined
  
  var contentRouters: js.UndefOr[js.Array[ContentRouting]] = js.undefined
  
  var datastore: Datastore
  
  var dht: js.UndefOr[DualDHT] = js.undefined
  
  var fetch: FetchServiceInit
  
  var identify: IdentifyServiceInit
  
  var keychain: KeychainConfig
  
  var metrics: MetricsInit
  
  var nat: NatManagerConfig
  
  var peerDiscovery: js.UndefOr[js.Array[PeerDiscovery]] = js.undefined
  
  var peerId: PeerId
  
  var peerRouters: js.UndefOr[js.Array[PeerRouting]] = js.undefined
  
  var peerRouting: PeerRoutingConfig
  
  var peerStore: PeerStoreInit
  
  var ping: PingServiceInit
  
  var pubsub: js.UndefOr[PubSub[PubSubEvents]] = js.undefined
  
  var relay: RelayConfig
  
  var streamMuxers: js.UndefOr[js.Array[StreamMuxerFactory]] = js.undefined
  
  var transportManager: TransportManagerConfig
  
  var transports: js.Array[Transport]
}
object Libp2pInit {
  
  inline def apply(
    addresses: AddressesConfig,
    connectionGater: PartialConnectionGater,
    connectionManager: ConnectionManagerInit,
    datastore: Datastore,
    fetch: FetchServiceInit,
    identify: IdentifyServiceInit,
    keychain: KeychainConfig,
    metrics: MetricsInit,
    nat: NatManagerConfig,
    peerId: PeerId,
    peerRouting: PeerRoutingConfig,
    peerStore: PeerStoreInit,
    ping: PingServiceInit,
    relay: RelayConfig,
    transportManager: TransportManagerConfig,
    transports: js.Array[Transport]
  ): Libp2pInit = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], connectionGater = connectionGater.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], fetch = fetch.asInstanceOf[js.Any], identify = identify.asInstanceOf[js.Any], keychain = keychain.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], nat = nat.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerRouting = peerRouting.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], relay = relay.asInstanceOf[js.Any], transportManager = transportManager.asInstanceOf[js.Any], transports = transports.asInstanceOf[js.Any])
    __obj.asInstanceOf[Libp2pInit]
  }
  
  extension [Self <: Libp2pInit](x: Self) {
    
    inline def setAddresses(value: AddressesConfig): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
    
    inline def setConnectionEncryption(value: js.Array[ConnectionEncrypter]): Self = StObject.set(x, "connectionEncryption", value.asInstanceOf[js.Any])
    
    inline def setConnectionEncryptionUndefined: Self = StObject.set(x, "connectionEncryption", js.undefined)
    
    inline def setConnectionEncryptionVarargs(value: ConnectionEncrypter*): Self = StObject.set(x, "connectionEncryption", js.Array(value*))
    
    inline def setConnectionGater(value: PartialConnectionGater): Self = StObject.set(x, "connectionGater", value.asInstanceOf[js.Any])
    
    inline def setConnectionManager(value: ConnectionManagerInit): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
    
    inline def setConnectionProtector(value: ConnectionProtector): Self = StObject.set(x, "connectionProtector", value.asInstanceOf[js.Any])
    
    inline def setConnectionProtectorUndefined: Self = StObject.set(x, "connectionProtector", js.undefined)
    
    inline def setContentRouters(value: js.Array[ContentRouting]): Self = StObject.set(x, "contentRouters", value.asInstanceOf[js.Any])
    
    inline def setContentRoutersUndefined: Self = StObject.set(x, "contentRouters", js.undefined)
    
    inline def setContentRoutersVarargs(value: ContentRouting*): Self = StObject.set(x, "contentRouters", js.Array(value*))
    
    inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setDht(value: DualDHT): Self = StObject.set(x, "dht", value.asInstanceOf[js.Any])
    
    inline def setDhtUndefined: Self = StObject.set(x, "dht", js.undefined)
    
    inline def setFetch(value: FetchServiceInit): Self = StObject.set(x, "fetch", value.asInstanceOf[js.Any])
    
    inline def setIdentify(value: IdentifyServiceInit): Self = StObject.set(x, "identify", value.asInstanceOf[js.Any])
    
    inline def setKeychain(value: KeychainConfig): Self = StObject.set(x, "keychain", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: MetricsInit): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setNat(value: NatManagerConfig): Self = StObject.set(x, "nat", value.asInstanceOf[js.Any])
    
    inline def setPeerDiscovery(value: js.Array[PeerDiscovery]): Self = StObject.set(x, "peerDiscovery", value.asInstanceOf[js.Any])
    
    inline def setPeerDiscoveryUndefined: Self = StObject.set(x, "peerDiscovery", js.undefined)
    
    inline def setPeerDiscoveryVarargs(value: PeerDiscovery*): Self = StObject.set(x, "peerDiscovery", js.Array(value*))
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerRouters(value: js.Array[PeerRouting]): Self = StObject.set(x, "peerRouters", value.asInstanceOf[js.Any])
    
    inline def setPeerRoutersUndefined: Self = StObject.set(x, "peerRouters", js.undefined)
    
    inline def setPeerRoutersVarargs(value: PeerRouting*): Self = StObject.set(x, "peerRouters", js.Array(value*))
    
    inline def setPeerRouting(value: PeerRoutingConfig): Self = StObject.set(x, "peerRouting", value.asInstanceOf[js.Any])
    
    inline def setPeerStore(value: PeerStoreInit): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    
    inline def setPing(value: PingServiceInit): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    inline def setPubsub(value: PubSub[PubSubEvents]): Self = StObject.set(x, "pubsub", value.asInstanceOf[js.Any])
    
    inline def setPubsubUndefined: Self = StObject.set(x, "pubsub", js.undefined)
    
    inline def setRelay(value: RelayConfig): Self = StObject.set(x, "relay", value.asInstanceOf[js.Any])
    
    inline def setStreamMuxers(value: js.Array[StreamMuxerFactory]): Self = StObject.set(x, "streamMuxers", value.asInstanceOf[js.Any])
    
    inline def setStreamMuxersUndefined: Self = StObject.set(x, "streamMuxers", js.undefined)
    
    inline def setStreamMuxersVarargs(value: StreamMuxerFactory*): Self = StObject.set(x, "streamMuxers", js.Array(value*))
    
    inline def setTransportManager(value: TransportManagerConfig): Self = StObject.set(x, "transportManager", value.asInstanceOf[js.Any])
    
    inline def setTransports(value: js.Array[Transport]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
    
    inline def setTransportsVarargs(value: Transport*): Self = StObject.set(x, "transports", js.Array(value*))
  }
}
