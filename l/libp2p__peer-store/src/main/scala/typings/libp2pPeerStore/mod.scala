package typings.libp2pPeerStore

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfaceLibp2p.mod.Libp2pEvents
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfaces.eventsMod.EventEmitter
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-store", "PersistentPeerStore")
  @js.native
  open class PersistentPeerStore protected ()
    extends StObject
       with PeerStore {
    def this(components: PersistentPeerStoreComponents) = this()
    def this(components: PersistentPeerStoreComponents, init: PersistentPeerStoreInit) = this()
    
    /* private */ val events: Any = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    /* private */ val store: Any = js.native
  }
  
  type AddressFilter = js.Function2[/* peerId */ PeerId, /* multiaddr */ Multiaddr_, js.Promise[Boolean]]
  
  trait PersistentPeerStoreComponents extends StObject {
    
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
    
    var peerId: PeerId
  }
  object PersistentPeerStoreComponents {
    
    inline def apply(
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
      peerId: PeerId
    ): PersistentPeerStoreComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistentPeerStoreComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentPeerStoreComponents] (val x: Self) extends AnyVal {
      
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
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    }
  }
  
  trait PersistentPeerStoreInit extends StObject {
    
    var addressFilter: js.UndefOr[AddressFilter] = js.undefined
  }
  object PersistentPeerStoreInit {
    
    inline def apply(): PersistentPeerStoreInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistentPeerStoreInit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentPeerStoreInit] (val x: Self) extends AnyVal {
      
      inline def setAddressFilter(value: (/* peerId */ PeerId, /* multiaddr */ Multiaddr_) => js.Promise[Boolean]): Self = StObject.set(x, "addressFilter", js.Any.fromFunction2(value))
      
      inline def setAddressFilterUndefined: Self = StObject.set(x, "addressFilter", js.undefined)
    }
  }
}
