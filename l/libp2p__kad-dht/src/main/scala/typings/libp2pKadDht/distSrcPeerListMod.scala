package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerListMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/peer-list", "PeerList")
  @js.native
  open class PeerList () extends StObject {
    
    /**
      * Check if this PeerInfo is already in here
      */
    def has(peerId: PeerId): Boolean = js.native
    
    /**
      * The length of the list
      */
    def length: Double = js.native
    
    /* private */ val list: Any = js.native
    
    /**
      * Remove the last element
      */
    def pop(): js.UndefOr[PeerId] = js.native
    
    /**
      * Add a new peer. Returns `true` if it was a new one
      */
    def push(peerId: PeerId): Boolean = js.native
    
    /**
      * Get the list as an array
      */
    def toArray(): js.Array[PeerId] = js.native
  }
}
