package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.KeyBook
import typings.libp2pPeerStore.distSrcStoreMod.Store
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcKeyBookMod {
  
  @JSImport("@libp2p/peer-store/dist/src/key-book", "PeerStoreKeyBook")
  @js.native
  open class PeerStoreKeyBook protected ()
    extends StObject
       with KeyBook {
    /**
      * The KeyBook is responsible for keeping the known public keys of a peer
      */
    def this(dispatchEvent: js.Function1[/* event */ Event, Boolean], store: Store) = this()
    
    /**
      * Remove the known data of a peer
      */
    /* CompleteClass */
    override def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    /* private */ val dispatchEvent: Any = js.native
    
    /**
      * Get the known data of a peer
      */
    /* CompleteClass */
    override def get(peerId: PeerId): js.Promise[js.UndefOr[js.typedarray.Uint8Array]] = js.native
    
    /**
      * Set the known data of a peer
      */
    /* CompleteClass */
    override def set(peerId: PeerId, data: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    /* private */ val store: Any = js.native
  }
}
