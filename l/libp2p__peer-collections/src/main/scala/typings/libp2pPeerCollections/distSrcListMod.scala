package typings.libp2pPeerCollections

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcListMod {
  
  @JSImport("@libp2p/peer-collections/dist/src/list", "PeerList")
  @js.native
  open class PeerList () extends StObject {
    def this(list: js.Iterable[PeerId]) = this()
    def this(list: PeerList) = this()
    
    def concat(list: PeerList): PeerList = js.native
    
    def entries(): IterableIterator[js.Tuple2[Double, PeerId]] = js.native
    
    def every(predicate: js.Function3[/* peerId */ PeerId, /* index */ Double, /* arr */ this.type, Boolean]): Boolean = js.native
    
    def filter(predicate: js.Function3[/* peerId */ PeerId, /* index */ Double, /* arr */ this.type, Boolean]): PeerList = js.native
    
    def find(predicate: js.Function3[/* peerId */ PeerId, /* index */ Double, /* arr */ this.type, Boolean]): js.UndefOr[PeerId] = js.native
    
    def findIndex(predicate: js.Function3[/* peerId */ PeerId, /* index */ Double, /* arr */ this.type, Boolean]): Double = js.native
    
    def forEach(predicate: js.Function3[/* peerId */ PeerId, /* index */ Double, /* arr */ this.type, Unit]): Unit = js.native
    
    def includes(peerId: PeerId): Boolean = js.native
    
    def indexOf(peerId: PeerId): Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[PeerId]] = js.native
    
    def length: Double = js.native
    
    /* private */ val list: Any = js.native
    
    def pop(): js.UndefOr[PeerId] = js.native
    
    def push(peerIds: PeerId*): Unit = js.native
    
    def shift(): js.UndefOr[PeerId] = js.native
    
    def unshift(peerIds: PeerId*): Double = js.native
  }
}
