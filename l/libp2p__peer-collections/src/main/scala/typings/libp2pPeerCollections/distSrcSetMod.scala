package typings.libp2pPeerCollections

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcSetMod {
  
  @JSImport("@libp2p/peer-collections/dist/src/set", "PeerSet")
  @js.native
  open class PeerSet () extends StObject {
    def this(set: js.Iterable[PeerId]) = this()
    def this(set: PeerSet) = this()
    
    def add(peer: PeerId): Unit = js.native
    
    def clear(): Unit = js.native
    
    def delete(peer: PeerId): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[PeerId, PeerId]] = js.native
    
    def forEach(predicate: js.Function3[/* peerId */ PeerId, /* index */ PeerId, /* set */ this.type, Unit]): Unit = js.native
    
    def has(peer: PeerId): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[PeerId]] = js.native
    
    /* private */ val set: Any = js.native
    
    def size: Double = js.native
    
    def values(): IterableIterator[PeerId] = js.native
  }
}
