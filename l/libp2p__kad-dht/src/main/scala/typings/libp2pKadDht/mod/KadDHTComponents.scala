package typings.libp2pKadDht.mod

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceAddressManager.mod.AddressManager
import typings.libp2pInterfaceConnectionManager.mod.ConnectionManager
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfaceMetrics.mod.Metrics
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaceRegistrar.mod.Registrar
import typings.libp2pInterfaces.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KadDHTComponents extends StObject {
  
  var addressManager: AddressManager
  
  var connectionManager: ConnectionManager
  
  var datastore: Datastore[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object
  ]
  
  var events: EventEmitter[Libp2pEvents]
  
  var metrics: js.UndefOr[Metrics] = js.undefined
  
  var peerId: PeerId
  
  var peerStore: PeerStore
  
  var registrar: Registrar
}
object KadDHTComponents {
  
  inline def apply(
    addressManager: AddressManager,
    connectionManager: ConnectionManager,
    datastore: Datastore[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object
    ],
    events: EventEmitter[Libp2pEvents],
    peerId: PeerId,
    peerStore: PeerStore,
    registrar: Registrar
  ): KadDHTComponents = {
    val __obj = js.Dynamic.literal(addressManager = addressManager.asInstanceOf[js.Any], connectionManager = connectionManager.asInstanceOf[js.Any], datastore = datastore.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], peerStore = peerStore.asInstanceOf[js.Any], registrar = registrar.asInstanceOf[js.Any])
    __obj.asInstanceOf[KadDHTComponents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KadDHTComponents] (val x: Self) extends AnyVal {
    
    inline def setAddressManager(value: AddressManager): Self = StObject.set(x, "addressManager", value.asInstanceOf[js.Any])
    
    inline def setConnectionManager(value: ConnectionManager): Self = StObject.set(x, "connectionManager", value.asInstanceOf[js.Any])
    
    inline def setDatastore(
      value: Datastore[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object
        ]
    ): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: EventEmitter[Libp2pEvents]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    
    inline def setPeerStore(value: PeerStore): Self = StObject.set(x, "peerStore", value.asInstanceOf[js.Any])
    
    inline def setRegistrar(value: Registrar): Self = StObject.set(x, "registrar", value.asInstanceOf[js.Any])
  }
}
