package typings.libp2pGossipsub

import typings.libp2pGossipsub.mod.^
import typings.libp2pGossipsub.peerMod.Peer
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/getGossipPeers", JSImport.Namespace)
@js.native
object srcGetGossipPeersMod extends js.Object {
  
  def getGossipPeers(router: ^, topic: String, count: Double): Set[Peer] = js.native
}
