package typings.libp2pGossipsub.peerScoreParamsMod

import typings.std.Record
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PeerScoreParams extends js.Object {
  
  var IPColocationFactorThreshold: Double = js.native
  
  /**
    * P6: IP-colocation factor.
    * The parameter has an associated counter which counts the number of peers with the same IP.
    * If the number of peers in the same IP exceeds IPColocationFactorThreshold, then the value
    * is the square of the difference, ie (PeersInSameIP - IPColocationThreshold)^2.
    * If the number of peers in the same IP is less than the threshold, then the value is 0.
    * The weight of the parameter MUST be negative, unless you want to disable for testing.
    * Note: In order to simulate many IPs in a managable manner when testing, you can set the weight to 0
    *       thus disabling the IP colocation penalty.
    */
  var IPColocationFactorWeight: Double = js.native
  
  var IPColocationFactorWhitelist: Set[String] = js.native
  
  /**
    * P5: Application-specific peer scoring
    */
  def appSpecificScore(p: String): Double = js.native
  
  var appSpecificWeight: Double = js.native
  
  var behaviourPenaltyDecay: Double = js.native
  
  /**
    * P7: behavioural pattern penalties.
    * This parameter has an associated counter which tracks misbehaviour as detected by the
    * router. The router currently applies penalties for the following behaviors:
    * - attempting to re-graft before the prune backoff time has elapsed.
    * - not following up in IWANT requests for messages advertised with IHAVE.
    *
    * The value of the parameter is the square of the counter, which decays with  BehaviourPenaltyDecay.
    * The weight of the parameter MUST be negative (or zero to disable).
    */
  var behaviourPenaltyWeight: Double = js.native
  
  /**
    * the decay interval for parameter counters.
    */
  var decayInterval: Double = js.native
  
  /**
    * counter value below which it is considered 0.
    */
  var decayToZero: Double = js.native
  
  /**
    * time to remember counters for a disconnected peer.
    */
  var retainScore: Double = js.native
  
  /**
    * Aggregate topic score cap; this limits the total contribution of topics towards a positive
    * score. It must be positive (or 0 for no cap).
    */
  var topicScoreCap: Double = js.native
  
  /**
    * Score parameters per topic.
    */
  var topics: Record[String, TopicScoreParams] = js.native
}
object PeerScoreParams {
  
  @scala.inline
  def apply(
    IPColocationFactorThreshold: Double,
    IPColocationFactorWeight: Double,
    IPColocationFactorWhitelist: Set[String],
    appSpecificScore: String => Double,
    appSpecificWeight: Double,
    behaviourPenaltyDecay: Double,
    behaviourPenaltyWeight: Double,
    decayInterval: Double,
    decayToZero: Double,
    retainScore: Double,
    topicScoreCap: Double,
    topics: Record[String, TopicScoreParams]
  ): PeerScoreParams = {
    val __obj = js.Dynamic.literal(IPColocationFactorThreshold = IPColocationFactorThreshold.asInstanceOf[js.Any], IPColocationFactorWeight = IPColocationFactorWeight.asInstanceOf[js.Any], IPColocationFactorWhitelist = IPColocationFactorWhitelist.asInstanceOf[js.Any], appSpecificScore = js.Any.fromFunction1(appSpecificScore), appSpecificWeight = appSpecificWeight.asInstanceOf[js.Any], behaviourPenaltyDecay = behaviourPenaltyDecay.asInstanceOf[js.Any], behaviourPenaltyWeight = behaviourPenaltyWeight.asInstanceOf[js.Any], decayInterval = decayInterval.asInstanceOf[js.Any], decayToZero = decayToZero.asInstanceOf[js.Any], retainScore = retainScore.asInstanceOf[js.Any], topicScoreCap = topicScoreCap.asInstanceOf[js.Any], topics = topics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerScoreParams]
  }
  
  @scala.inline
  implicit class PeerScoreParamsOps[Self <: PeerScoreParams] (val x: Self) extends AnyVal {
    
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
    def setIPColocationFactorWeight(value: Double): Self = this.set("IPColocationFactorWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPColocationFactorWhitelist(value: Set[String]): Self = this.set("IPColocationFactorWhitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppSpecificScore(value: String => Double): Self = this.set("appSpecificScore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAppSpecificWeight(value: Double): Self = this.set("appSpecificWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourPenaltyDecay(value: Double): Self = this.set("behaviourPenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBehaviourPenaltyWeight(value: Double): Self = this.set("behaviourPenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayInterval(value: Double): Self = this.set("decayInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecayToZero(value: Double): Self = this.set("decayToZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetainScore(value: Double): Self = this.set("retainScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicScoreCap(value: Double): Self = this.set("topicScoreCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopics(value: Record[String, TopicScoreParams]): Self = this.set("topics", value.asInstanceOf[js.Any])
  }
}
