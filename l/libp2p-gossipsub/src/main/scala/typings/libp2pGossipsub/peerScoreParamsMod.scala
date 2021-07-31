package typings.libp2pGossipsub

import typings.libp2pGossipsub.anon.PartialPeerScoreParams
import typings.libp2pGossipsub.anon.PartialTopicScoreParams
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object peerScoreParamsMod {
  
  @JSImport("libp2p-gossipsub/src/score/peer-score-params", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createPeerScoreParams(): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")().asInstanceOf[PeerScoreParams]
  @scala.inline
  def createPeerScoreParams(p: PartialPeerScoreParams): PeerScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createPeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[PeerScoreParams]
  
  @scala.inline
  def createTopicScoreParams(): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")().asInstanceOf[TopicScoreParams]
  @scala.inline
  def createTopicScoreParams(p: PartialTopicScoreParams): TopicScoreParams = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[TopicScoreParams]
  
  @JSImport("libp2p-gossipsub/src/score/peer-score-params", "defaultPeerScoreParams")
  @js.native
  val defaultPeerScoreParams: PeerScoreParams = js.native
  
  @JSImport("libp2p-gossipsub/src/score/peer-score-params", "defaultTopicScoreParams")
  @js.native
  val defaultTopicScoreParams: TopicScoreParams = js.native
  
  @scala.inline
  def validatePeerScoreParams(p: PeerScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validatePeerScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def validateTopicScoreParams(p: TopicScoreParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateTopicScoreParams")(p.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait PeerScoreParams extends StObject {
    
    var IPColocationFactorThreshold: Double
    
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
    var IPColocationFactorWeight: Double
    
    var IPColocationFactorWhitelist: Set[String]
    
    /**
      * P5: Application-specific peer scoring
      */
    def appSpecificScore(p: String): Double
    
    var appSpecificWeight: Double
    
    var behaviourPenaltyDecay: Double
    
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
    var behaviourPenaltyWeight: Double
    
    /**
      * the decay interval for parameter counters.
      */
    var decayInterval: Double
    
    /**
      * counter value below which it is considered 0.
      */
    var decayToZero: Double
    
    /**
      * time to remember counters for a disconnected peer.
      */
    var retainScore: Double
    
    /**
      * Aggregate topic score cap; this limits the total contribution of topics towards a positive
      * score. It must be positive (or 0 for no cap).
      */
    var topicScoreCap: Double
    
    /**
      * Score parameters per topic.
      */
    var topics: Record[String, TopicScoreParams]
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
    implicit class PeerScoreParamsMutableBuilder[Self <: PeerScoreParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppSpecificScore(value: String => Double): Self = StObject.set(x, "appSpecificScore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppSpecificWeight(value: Double): Self = StObject.set(x, "appSpecificWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviourPenaltyDecay(value: Double): Self = StObject.set(x, "behaviourPenaltyDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBehaviourPenaltyWeight(value: Double): Self = StObject.set(x, "behaviourPenaltyWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecayInterval(value: Double): Self = StObject.set(x, "decayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecayToZero(value: Double): Self = StObject.set(x, "decayToZero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPColocationFactorThreshold(value: Double): Self = StObject.set(x, "IPColocationFactorThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPColocationFactorWeight(value: Double): Self = StObject.set(x, "IPColocationFactorWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIPColocationFactorWhitelist(value: Set[String]): Self = StObject.set(x, "IPColocationFactorWhitelist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetainScore(value: Double): Self = StObject.set(x, "retainScore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicScoreCap(value: Double): Self = StObject.set(x, "topicScoreCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopics(value: Record[String, TopicScoreParams]): Self = StObject.set(x, "topics", value.asInstanceOf[js.Any])
    }
  }
  
  trait TopicScoreParams extends StObject {
    
    var firstMessageDeliveriesCap: Double
    
    var firstMessageDeliveriesDecay: Double
    
    /**
      * P2: first message deliveries
      * This is the number of message deliveries in the topic.
      * The value of the parameter is a counter, decaying with FirstMessageDeliveriesDecay, and capped
      * by FirstMessageDeliveriesCap.
      * The weight of the parameter MUST be positive (or zero to disable).
      */
    var firstMessageDeliveriesWeight: Double
    
    var invalidMessageDeliveriesDecay: Double
    
    /**
      * P4: invalid messages
      * This is the number of invalid messages in the topic.
      * The value of the parameter is the square of the counter, decaying with
      * InvalidMessageDeliveriesDecay.
      * The weight of the parameter MUST be negative (or zero to disable).
      */
    var invalidMessageDeliveriesWeight: Double
    
    var meshFailurePenaltyDecay: Double
    
    /**
      * P3b: sticky mesh propagation failures
      * This is a sticky penalty that applies when a peer gets pruned from the mesh with an active
      * mesh message delivery penalty.
      * The weight of the parameter MUST be negative (or zero to disable)
      */
    var meshFailurePenaltyWeight: Double
    
    var meshMessageDeliveriesActivation: Double
    
    var meshMessageDeliveriesCap: Double
    
    var meshMessageDeliveriesDecay: Double
    
    var meshMessageDeliveriesThreshold: Double
    
    /**
      * P3: mesh message deliveries
      * This is the number of message deliveries in the mesh, within the MeshMessageDeliveriesWindow of
      * message validation; deliveries during validation also count and are retroactively applied
      * when validation succeeds.
      * This window accounts for the minimum time before a hostile mesh peer trying to game the score
      * could replay back a valid message we just sent them.
      * It effectively tracks first and near-first deliveries, ie a message seen from a mesh peer
      * before we have forwarded it to them.
      * The parameter has an associated counter, decaying with MeshMessageDeliveriesDecay.
      * If the counter exceeds the threshold, its value is 0.
      * If the counter is below the MeshMessageDeliveriesThreshold, the value is the square of
      * the deficit, ie (MessageDeliveriesThreshold - counter)^2
      * The penalty is only activated after MeshMessageDeliveriesActivation time in the mesh.
      * The weight of the parameter MUST be negative (or zero to disable).
      */
    var meshMessageDeliveriesWeight: Double
    
    var meshMessageDeliveriesWindow: Double
    
    var timeInMeshCap: Double
    
    var timeInMeshQuantum: Double
    
    /**
      * P1: time in the mesh
      * This is the time the peer has ben grafted in the mesh.
      * The value of the parameter is the time/TimeInMeshQuantum, capped by TimeInMeshCap
      * The weight of the parameter MUST be positive (or zero to disable).
      */
    var timeInMeshWeight: Double
    
    /**
      * The weight of the topic.
      */
    var topicWeight: Double
  }
  object TopicScoreParams {
    
    @scala.inline
    def apply(
      firstMessageDeliveriesCap: Double,
      firstMessageDeliveriesDecay: Double,
      firstMessageDeliveriesWeight: Double,
      invalidMessageDeliveriesDecay: Double,
      invalidMessageDeliveriesWeight: Double,
      meshFailurePenaltyDecay: Double,
      meshFailurePenaltyWeight: Double,
      meshMessageDeliveriesActivation: Double,
      meshMessageDeliveriesCap: Double,
      meshMessageDeliveriesDecay: Double,
      meshMessageDeliveriesThreshold: Double,
      meshMessageDeliveriesWeight: Double,
      meshMessageDeliveriesWindow: Double,
      timeInMeshCap: Double,
      timeInMeshQuantum: Double,
      timeInMeshWeight: Double,
      topicWeight: Double
    ): TopicScoreParams = {
      val __obj = js.Dynamic.literal(firstMessageDeliveriesCap = firstMessageDeliveriesCap.asInstanceOf[js.Any], firstMessageDeliveriesDecay = firstMessageDeliveriesDecay.asInstanceOf[js.Any], firstMessageDeliveriesWeight = firstMessageDeliveriesWeight.asInstanceOf[js.Any], invalidMessageDeliveriesDecay = invalidMessageDeliveriesDecay.asInstanceOf[js.Any], invalidMessageDeliveriesWeight = invalidMessageDeliveriesWeight.asInstanceOf[js.Any], meshFailurePenaltyDecay = meshFailurePenaltyDecay.asInstanceOf[js.Any], meshFailurePenaltyWeight = meshFailurePenaltyWeight.asInstanceOf[js.Any], meshMessageDeliveriesActivation = meshMessageDeliveriesActivation.asInstanceOf[js.Any], meshMessageDeliveriesCap = meshMessageDeliveriesCap.asInstanceOf[js.Any], meshMessageDeliveriesDecay = meshMessageDeliveriesDecay.asInstanceOf[js.Any], meshMessageDeliveriesThreshold = meshMessageDeliveriesThreshold.asInstanceOf[js.Any], meshMessageDeliveriesWeight = meshMessageDeliveriesWeight.asInstanceOf[js.Any], meshMessageDeliveriesWindow = meshMessageDeliveriesWindow.asInstanceOf[js.Any], timeInMeshCap = timeInMeshCap.asInstanceOf[js.Any], timeInMeshQuantum = timeInMeshQuantum.asInstanceOf[js.Any], timeInMeshWeight = timeInMeshWeight.asInstanceOf[js.Any], topicWeight = topicWeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TopicScoreParams]
    }
    
    @scala.inline
    implicit class TopicScoreParamsMutableBuilder[Self <: TopicScoreParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFirstMessageDeliveriesCap(value: Double): Self = StObject.set(x, "firstMessageDeliveriesCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "firstMessageDeliveriesDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "firstMessageDeliveriesWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshFailurePenaltyDecay(value: Double): Self = StObject.set(x, "meshFailurePenaltyDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshFailurePenaltyWeight(value: Double): Self = StObject.set(x, "meshFailurePenaltyWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesActivation(value: Double): Self = StObject.set(x, "meshMessageDeliveriesActivation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesCap(value: Double): Self = StObject.set(x, "meshMessageDeliveriesCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "meshMessageDeliveriesDecay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesThreshold(value: Double): Self = StObject.set(x, "meshMessageDeliveriesThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeshMessageDeliveriesWindow(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeInMeshCap(value: Double): Self = StObject.set(x, "timeInMeshCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeInMeshQuantum(value: Double): Self = StObject.set(x, "timeInMeshQuantum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeInMeshWeight(value: Double): Self = StObject.set(x, "timeInMeshWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicWeight(value: Double): Self = StObject.set(x, "topicWeight", value.asInstanceOf[js.Any])
    }
  }
}
