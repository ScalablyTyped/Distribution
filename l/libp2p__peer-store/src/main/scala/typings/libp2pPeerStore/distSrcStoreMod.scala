package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.Peer
import typings.libp2pInterfacePeerStore.mod.PeerData
import typings.libp2pPeerStore.anon.PartialPeerData
import typings.libp2pPeerStore.mod.PersistentPeerStoreComponents
import typings.libp2pPeerStore.mod.PersistentPeerStoreInit
import typings.mortice.mod.Mortice
import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcStoreMod {
  
  @JSImport("@libp2p/peer-store/dist/src/store", "PersistentStore")
  @js.native
  open class PersistentStore protected () extends StObject {
    def this(components: PersistentPeerStoreComponents) = this()
    def this(components: PersistentPeerStoreComponents, init: PersistentPeerStoreInit) = this()
    
    /* private */ val addressFilter: Any = js.native
    
    def all(): AsyncGenerator[Peer, Unit, Any] = js.native
    
    /* private */ val datastore: Any = js.native
    
    def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    def has(peerId: PeerId): js.Promise[Boolean] = js.native
    
    def load(peerId: PeerId): js.Promise[Peer] = js.native
    
    val lock: Mortice = js.native
    
    def merge(peerId: PeerId, data: PeerData): js.Promise[PeerUpdate] = js.native
    
    def patch(peerId: PeerId, data: PartialPeerData): js.Promise[PeerUpdate] = js.native
    
    /* private */ val peerId: Any = js.native
    
    /* private */ var `private`: Any = js.native
    
    def save(peerId: PeerId, data: PeerData): js.Promise[PeerUpdate] = js.native
  }
  
  trait PeerUpdate
    extends StObject
       with typings.libp2pInterfaceLibp2p.mod.PeerUpdate {
    
    var updated: Boolean
  }
  object PeerUpdate {
    
    inline def apply(peer: Peer, updated: Boolean): PeerUpdate = {
      val __obj = js.Dynamic.literal(peer = peer.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[PeerUpdate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PeerUpdate] (val x: Self) extends AnyVal {
      
      inline def setUpdated(value: Boolean): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
}
