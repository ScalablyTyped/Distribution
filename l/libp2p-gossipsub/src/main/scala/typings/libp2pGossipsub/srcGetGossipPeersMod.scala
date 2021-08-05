package typings.libp2pGossipsub

import typings.libp2pGossipsub.peerMod.Peer
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcGetGossipPeersMod {
  
  @JSImport("libp2p-gossipsub/src/getGossipPeers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGossipPeers(router: typings.libp2pGossipsub.mod.^, topic: String, count: Double): Set[Peer] = (^.asInstanceOf[js.Dynamic].applyDynamic("getGossipPeers")(router.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], count.asInstanceOf[js.Any])).asInstanceOf[Set[Peer]]
}
