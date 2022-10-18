package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.MetadataBook
import typings.libp2pPeerStore.distSrcStoreMod.Store
import typings.std.Event
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMetadataBookMod {
  
  @JSImport("@libp2p/peer-store/dist/src/metadata-book", "PeerStoreMetadataBook")
  @js.native
  open class PeerStoreMetadataBook protected ()
    extends StObject
       with MetadataBook {
    /**
      * The MetadataBook is responsible for keeping metadata
      * about known peers
      */
    def this(dispatchEvent: js.Function1[/* event */ Event, Boolean], store: Store) = this()
    
    /**
      * Remove the known data of a peer
      */
    /* CompleteClass */
    override def delete(peerId: PeerId): js.Promise[Unit] = js.native
    
    /**
      * Deletes the provided peer metadata key from the book
      */
    /* CompleteClass */
    override def deleteValue(peerId: PeerId, key: String): js.Promise[Unit] = js.native
    
    /* private */ val dispatchEvent: Any = js.native
    
    /**
      * Get the known data of a peer
      */
    /* CompleteClass */
    override def get(peerId: PeerId): js.Promise[Map[String, js.typedarray.Uint8Array]] = js.native
    
    /**
      * Get specific metadata value, if it exists
      */
    /* CompleteClass */
    override def getValue(peerId: PeerId, key: String): js.Promise[js.UndefOr[js.typedarray.Uint8Array]] = js.native
    
    /**
      * Set the known data of a peer
      */
    /* CompleteClass */
    override def set(peerId: PeerId, data: Map[String, js.typedarray.Uint8Array]): js.Promise[Unit] = js.native
    
    /**
      * Set a specific metadata value
      */
    /* CompleteClass */
    override def setValue(peerId: PeerId, key: String, value: js.typedarray.Uint8Array): js.Promise[Unit] = js.native
    
    /* private */ val store: Any = js.native
  }
}
