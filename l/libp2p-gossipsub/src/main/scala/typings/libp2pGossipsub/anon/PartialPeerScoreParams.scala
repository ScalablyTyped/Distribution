package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.peerScoreParamsMod.TopicScoreParams
import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-params.PeerScoreParams> */
@js.native
trait PartialPeerScoreParams extends js.Object {
  
  var IPColocationFactorThreshold: js.UndefOr[Double] = js.native
  
  var IPColocationFactorWeight: js.UndefOr[Double] = js.native
  
  var IPColocationFactorWhitelist: js.UndefOr[Set[String]] = js.native
  
  var appSpecificScore: js.UndefOr[js.Function1[/* p */ String, Double]] = js.native
  
  var appSpecificWeight: js.UndefOr[Double] = js.native
  
  var behaviourPenaltyDecay: js.UndefOr[Double] = js.native
  
  var behaviourPenaltyWeight: js.UndefOr[Double] = js.native
  
  var decayInterval: js.UndefOr[Double] = js.native
  
  var decayToZero: js.UndefOr[Double] = js.native
  
  var retainScore: js.UndefOr[Double] = js.native
  
  var topicScoreCap: js.UndefOr[Double] = js.native
  
  var topics: js.UndefOr[Record[String, TopicScoreParams]] = js.native
}
object PartialPeerScoreParams {
  
  @scala.inline
  def apply(): PartialPeerScoreParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPeerScoreParams]
  }
  
  @scala.inline
  implicit class PartialPeerScoreParamsOps[Self <: PartialPeerScoreParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIPColocationFactorThreshold(value: Double): Self = this.set("IPColocationFactorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPColocationFactorThreshold: Self = this.set("IPColocationFactorThreshold", js.undefined)
    
    @scala.inline
    def setIPColocationFactorWeight(value: Double): Self = this.set("IPColocationFactorWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPColocationFactorWeight: Self = this.set("IPColocationFactorWeight", js.undefined)
    
    @scala.inline
    def setIPColocationFactorWhitelist(value: Set[String]): Self = this.set("IPColocationFactorWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPColocationFactorWhitelist: Self = this.set("IPColocationFactorWhitelist", js.undefined)
    
    @scala.inline
    def setAppSpecificScore(value: /* p */ String => Double): Self = this.set("appSpecificScore", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAppSpecificScore: Self = this.set("appSpecificScore", js.undefined)
    
    @scala.inline
    def setAppSpecificWeight(value: Double): Self = this.set("appSpecificWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppSpecificWeight: Self = this.set("appSpecificWeight", js.undefined)
    
    @scala.inline
    def setBehaviourPenaltyDecay(value: Double): Self = this.set("behaviourPenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviourPenaltyDecay: Self = this.set("behaviourPenaltyDecay", js.undefined)
    
    @scala.inline
    def setBehaviourPenaltyWeight(value: Double): Self = this.set("behaviourPenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBehaviourPenaltyWeight: Self = this.set("behaviourPenaltyWeight", js.undefined)
    
    @scala.inline
    def setDecayInterval(value: Double): Self = this.set("decayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecayInterval: Self = this.set("decayInterval", js.undefined)
    
    @scala.inline
    def setDecayToZero(value: Double): Self = this.set("decayToZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecayToZero: Self = this.set("decayToZero", js.undefined)
    
    @scala.inline
    def setRetainScore(value: Double): Self = this.set("retainScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainScore: Self = this.set("retainScore", js.undefined)
    
    @scala.inline
    def setTopicScoreCap(value: Double): Self = this.set("topicScoreCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicScoreCap: Self = this.set("topicScoreCap", js.undefined)
    
    @scala.inline
    def setTopics(value: Record[String, TopicScoreParams]): Self = this.set("topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopics: Self = this.set("topics", js.undefined)
  }
}
