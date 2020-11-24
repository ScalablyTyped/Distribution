package typings.libp2pGossipsub.peerScoreParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicScoreParams extends js.Object {
  
  var firstMessageDeliveriesCap: Double = js.native
  
  var firstMessageDeliveriesDecay: Double = js.native
  
  /**
    * P2: first message deliveries
    * This is the number of message deliveries in the topic.
    * The value of the parameter is a counter, decaying with FirstMessageDeliveriesDecay, and capped
    * by FirstMessageDeliveriesCap.
    * The weight of the parameter MUST be positive (or zero to disable).
    */
  var firstMessageDeliveriesWeight: Double = js.native
  
  var invalidMessageDeliveriesDecay: Double = js.native
  
  /**
    * P4: invalid messages
    * This is the number of invalid messages in the topic.
    * The value of the parameter is the square of the counter, decaying with
    * InvalidMessageDeliveriesDecay.
    * The weight of the parameter MUST be negative (or zero to disable).
    */
  var invalidMessageDeliveriesWeight: Double = js.native
  
  var meshFailurePenaltyDecay: Double = js.native
  
  /**
    * P3b: sticky mesh propagation failures
    * This is a sticky penalty that applies when a peer gets pruned from the mesh with an active
    * mesh message delivery penalty.
    * The weight of the parameter MUST be negative (or zero to disable)
    */
  var meshFailurePenaltyWeight: Double = js.native
  
  var meshMessageDeliveriesActivation: Double = js.native
  
  var meshMessageDeliveriesCap: Double = js.native
  
  var meshMessageDeliveriesDecay: Double = js.native
  
  var meshMessageDeliveriesThreshold: Double = js.native
  
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
  var meshMessageDeliveriesWeight: Double = js.native
  
  var meshMessageDeliveriesWindow: Double = js.native
  
  var timeInMeshCap: Double = js.native
  
  var timeInMeshQuantum: Double = js.native
  
  /**
    * P1: time in the mesh
    * This is the time the peer has ben grafted in the mesh.
    * The value of the parameter is the time/TimeInMeshQuantum, capped by TimeInMeshCap
    * The weight of the parameter MUST be positive (or zero to disable).
    */
  var timeInMeshWeight: Double = js.native
  
  /**
    * The weight of the topic.
    */
  var topicWeight: Double = js.native
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
  implicit class TopicScoreParamsOps[Self <: TopicScoreParams] (val x: Self) extends AnyVal {
    
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
    def setFirstMessageDeliveriesCap(value: Double): Self = this.set("firstMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesDecay(value: Double): Self = this.set("firstMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesWeight(value: Double): Self = this.set("firstMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveriesDecay(value: Double): Self = this.set("invalidMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveriesWeight(value: Double): Self = this.set("invalidMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenaltyDecay(value: Double): Self = this.set("meshFailurePenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenaltyWeight(value: Double): Self = this.set("meshFailurePenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesActivation(value: Double): Self = this.set("meshMessageDeliveriesActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesCap(value: Double): Self = this.set("meshMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesDecay(value: Double): Self = this.set("meshMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesThreshold(value: Double): Self = this.set("meshMessageDeliveriesThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesWeight(value: Double): Self = this.set("meshMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesWindow(value: Double): Self = this.set("meshMessageDeliveriesWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshCap(value: Double): Self = this.set("timeInMeshCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshQuantum(value: Double): Self = this.set("timeInMeshQuantum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshWeight(value: Double): Self = this.set("timeInMeshWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicWeight(value: Double): Self = this.set("topicWeight", value.asInstanceOf[js.Any])
  }
}
