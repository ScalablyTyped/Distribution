package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.ProtoBook
import typings.libp2pPeerStore.distSrcStoreMod.Store
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcProtoBookMod {
  
  @JSImport("@libp2p/peer-store/dist/src/proto-book", "PeerStoreProtoBook")
  @js.native
  open class PeerStoreProtoBook protected ()
    extends StObject
       with ProtoBook {
    /**
      * The ProtoBook is responsible for keeping the known supported
      * protocols of a peer
      */
    def this(dispatchEvent: js.Function1[/* event */ Event, Boolean], store: Store) = this()
    
    /**
      * Adds known protocols of a provided peer.
      * If the peer was not known before, it will be added.
      */
    /* CompleteClass */
    override def add(peerId: PeerId, protocols: js.Array[String]): js.Promise[Unit] = js.native
    
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
    override def get(peerId: PeerId): js.Promise[js.Array[String]] = js.native
    
    /**
      * Removes known protocols of a provided peer.
      * If the protocols did not exist before, nothing will be done.
      */
    /* CompleteClass */
    override def remove(peerId: PeerId, protocols: js.Array[String]): js.Promise[Unit] = js.native
    
    /**
      * Set the known data of a peer
      */
    /* CompleteClass */
    override def set(peerId: PeerId, data: js.Array[String]): js.Promise[Unit] = js.native
    
    /* private */ val store: Any = js.native
  }
}
