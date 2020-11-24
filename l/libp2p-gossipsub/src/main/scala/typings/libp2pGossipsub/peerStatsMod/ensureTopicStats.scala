package typings.libp2pGossipsub.peerStatsMod

import typings.libp2pGossipsub.peerScoreParamsMod.PeerScoreParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("libp2p-gossipsub/src/score/peer-stats", "ensureTopicStats")
@js.native
object ensureTopicStats extends js.Object {
  
  def apply(topic: String, ps: PeerStats, params: PeerScoreParams): js.UndefOr[TopicStats] = js.native
}
