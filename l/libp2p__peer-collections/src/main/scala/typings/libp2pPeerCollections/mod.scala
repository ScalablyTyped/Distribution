package typings.libp2pPeerCollections

import typings.libp2pInterfacePeerId.mod.PeerId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/peer-collections", "PeerList")
  @js.native
  open class PeerList ()
    extends typings.libp2pPeerCollections.distSrcListMod.PeerList {
    def this(list: typings.libp2pPeerCollections.distSrcListMod.PeerList) = this()
  }
  
  @JSImport("@libp2p/peer-collections", "PeerMap")
  @js.native
  open class PeerMap[T] ()
    extends typings.libp2pPeerCollections.distSrcMapMod.PeerMap[T] {
    def this(map: typings.libp2pPeerCollections.distSrcMapMod.PeerMap[T]) = this()
  }
  
  @JSImport("@libp2p/peer-collections", "PeerSet")
  @js.native
  open class PeerSet ()
    extends typings.libp2pPeerCollections.distSrcSetMod.PeerSet {
    def this(set: js.Iterable[PeerId]) = this()
    def this(set: typings.libp2pPeerCollections.distSrcSetMod.PeerSet) = this()
  }
}
