package typings.libp2p

import typings.libp2pInterfacePeerId.mod.PeerId
import typings.libp2pInterfacePeerInfo.mod.PeerInfo
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcGetPeerMod {
  
  @JSImport("libp2p/dist/src/get-peer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPeer(peer: String): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeer")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
  inline def getPeer(peer: PeerId): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeer")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
  inline def getPeer(peer: Multiaddr_): PeerInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("getPeer")(peer.asInstanceOf[js.Any]).asInstanceOf[PeerInfo]
}
