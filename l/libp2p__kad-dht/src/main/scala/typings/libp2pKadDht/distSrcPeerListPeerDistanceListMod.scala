package typings.libp2pKadDht

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPeerListPeerDistanceListMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/peer-list/peer-distance-list", "PeerDistanceList")
  @js.native
  open class PeerDistanceList protected () extends StObject {
    def this(originDhtKey: js.typedarray.Uint8Array, capacity: Double) = this()
    
    /**
      * Add a peerId to the list.
      */
    def add(peerId: PeerId): js.Promise[Unit] = js.native
    
    /**
      * Indicates whether any of the peerIds passed as a parameter are closer
      * to the origin key than the furthest peerId in the PeerDistanceList.
      */
    def anyCloser(peerIds: js.Array[PeerId]): js.Promise[Boolean] = js.native
    
    /**
      * The maximum size of the list
      */
    /* private */ val capacity: Any = js.native
    
    /**
      * The length of the list
      */
    def length: Double = js.native
    
    /**
      * The DHT key from which distance is calculated
      */
    /* private */ val originDhtKey: Any = js.native
    
    /* private */ var peerDistances: Any = js.native
    
    /**
      * The peerIds in the list, in order of distance from the origin key
      */
    def peers: js.Array[PeerId] = js.native
  }
}
