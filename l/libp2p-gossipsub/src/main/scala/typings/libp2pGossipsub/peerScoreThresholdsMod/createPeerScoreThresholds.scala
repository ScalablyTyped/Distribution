package typings.libp2pGossipsub.peerScoreThresholdsMod

import typings.libp2pGossipsub.anon.PartialPeerScoreThreshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/peer-score-thresholds", "createPeerScoreThresholds")
@js.native
object createPeerScoreThresholds extends js.Object {
  
  def apply(): PeerScoreThresholds = js.native
  def apply(p: PartialPeerScoreThreshold): PeerScoreThresholds = js.native
}
