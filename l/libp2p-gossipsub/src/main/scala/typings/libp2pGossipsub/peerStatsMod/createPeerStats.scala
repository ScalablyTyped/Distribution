package typings.libp2pGossipsub.peerStatsMod

import typings.libp2pGossipsub.anon.PartialPeerStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/peer-stats", "createPeerStats")
@js.native
object createPeerStats extends js.Object {
  
  def apply(): PeerStats = js.native
  def apply(ps: PartialPeerStats): PeerStats = js.native
}
