package typings.libp2pPeerCollections

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcMapMod {
  
  @JSImport("@libp2p/peer-collections/dist/src/map", "PeerMap")
  @js.native
  open class PeerMap[T] () extends StObject {
    def this(map: PeerMap[T]) = this()
    
    def clear(): Unit = js.native
    
    def delete(peer: PeerId): Unit = js.native
    
    def entries(): IterableIterator[js.Tuple2[PeerId, T]] = js.native
    
    def forEach(fn: js.Function3[/* value */ T, /* key */ PeerId, /* map */ PeerMap[T], Unit]): Unit = js.native
    
    def get(peer: PeerId): js.UndefOr[T] = js.native
    
    def has(peer: PeerId): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator: js.Function0[IterableIterator[js.Tuple2[PeerId, T]]] = js.native
    
    def keys(): IterableIterator[PeerId] = js.native
    
    /* private */ val map: Any = js.native
    
    def set(peer: PeerId, value: T): Unit = js.native
    
    def size: Double = js.native
    
    def values(): IterableIterator[T] = js.native
  }
}
