package typings.libp2pPeerStore

import typings.interfaceDatastore.mod.Datastore
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.PeerStore
import typings.libp2pInterfacePeerStore.mod.PeerStoreInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-store", "PersistentPeerStore")
  @js.native
  open class PersistentPeerStore protected () extends PeerStore {
    def this(components: PersistentPeerStoreComponents) = this()
    def this(components: PersistentPeerStoreComponents, init: PeerStoreInit) = this()
    
    /* private */ val components: Any = js.native
    
    /* private */ val store: Any = js.native
  }
  
  trait PersistentPeerStoreComponents extends StObject {
    
    var datastore: Datastore
    
    var peerId: PeerId
  }
  object PersistentPeerStoreComponents {
    
    inline def apply(datastore: Datastore, peerId: PeerId): PersistentPeerStoreComponents = {
      val __obj = js.Dynamic.literal(datastore = datastore.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistentPeerStoreComponents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PersistentPeerStoreComponents] (val x: Self) extends AnyVal {
      
      inline def setDatastore(value: Datastore): Self = StObject.set(x, "datastore", value.asInstanceOf[js.Any])
      
      inline def setPeerId(value: PeerId): Self = StObject.set(x, "peerId", value.asInstanceOf[js.Any])
    }
  }
}
