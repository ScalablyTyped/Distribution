package typings.libp2pPeerStore

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerStore.mod.Peer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsBytesToPeerMod {
  
  @JSImport("@libp2p/peer-store/dist/src/utils/bytes-to-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bytesToPeer(peerId: PeerId, buf: js.typedarray.Uint8Array): js.Promise[Peer] = (^.asInstanceOf[js.Dynamic].applyDynamic("bytesToPeer")(peerId.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Peer]]
}
