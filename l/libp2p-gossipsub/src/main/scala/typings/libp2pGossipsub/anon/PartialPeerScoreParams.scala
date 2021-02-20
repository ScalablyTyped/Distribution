package typings.libp2pGossipsub.anon

import typings.libp2pGossipsub.peerScoreParamsMod.TopicScoreParams
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-params.PeerScoreParams> */
@js.native
trait PartialPeerScoreParams extends StObject {
  
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
  implicit class PartialPeerScoreParamsMutableBuilder[Self <: PartialPeerScoreParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppSpecificScore(value: /* p */ String => Double): Self = StObject.set(x, "appSpecificScore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppSpecificScoreUndefined: Self = StObject.set(x, "appSpecificScore", js.undefined)
    
    @scala.inline
    def setAppSpecificWeight(value: Double): Self = StObject.set(x, "appSpecificWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSpecificWeightUndefined: Self = StObject.set(x, "appSpecificWeight", js.undefined)
    
    @scala.inline
    def setBehaviourPenaltyDecay(value: Double): Self = StObject.set(x, "behaviourPenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourPenaltyDecayUndefined: Self = StObject.set(x, "behaviourPenaltyDecay", js.undefined)
    
    @scala.inline
    def setBehaviourPenaltyWeight(value: Double): Self = StObject.set(x, "behaviourPenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourPenaltyWeightUndefined: Self = StObject.set(x, "behaviourPenaltyWeight", js.undefined)
    
    @scala.inline
    def setDecayInterval(value: Double): Self = StObject.set(x, "decayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayIntervalUndefined: Self = StObject.set(x, "decayInterval", js.undefined)
    
    @scala.inline
    def setDecayToZero(value: Double): Self = StObject.set(x, "decayToZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayToZeroUndefined: Self = StObject.set(x, "decayToZero", js.undefined)
    
    @scala.inline
    def setIPColocationFactorThreshold(value: Double): Self = StObject.set(x, "IPColocationFactorThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPColocationFactorThresholdUndefined: Self = StObject.set(x, "IPColocationFactorThreshold", js.undefined)
    
    @scala.inline
    def setIPColocationFactorWeight(value: Double): Self = StObject.set(x, "IPColocationFactorWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPColocationFactorWeightUndefined: Self = StObject.set(x, "IPColocationFactorWeight", js.undefined)
    
    @scala.inline
    def setIPColocationFactorWhitelist(value: Set[String]): Self = StObject.set(x, "IPColocationFactorWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPColocationFactorWhitelistUndefined: Self = StObject.set(x, "IPColocationFactorWhitelist", js.undefined)
    
    @scala.inline
    def setRetainScore(value: Double): Self = StObject.set(x, "retainScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainScoreUndefined: Self = StObject.set(x, "retainScore", js.undefined)
    
    @scala.inline
    def setTopicScoreCap(value: Double): Self = StObject.set(x, "topicScoreCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicScoreCapUndefined: Self = StObject.set(x, "topicScoreCap", js.undefined)
    
    @scala.inline
    def setTopics(value: Record[String, TopicScoreParams]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicsUndefined: Self = StObject.set(x, "topics", js.undefined)
  }
}
