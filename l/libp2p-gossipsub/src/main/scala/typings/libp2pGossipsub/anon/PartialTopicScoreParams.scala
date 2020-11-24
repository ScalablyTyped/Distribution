package typings.libp2pGossipsub.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-params.TopicScoreParams> */
@js.native
trait PartialTopicScoreParams extends js.Object {
  
  var firstMessageDeliveriesCap: js.UndefOr[Double] = js.native
  
  var firstMessageDeliveriesDecay: js.UndefOr[Double] = js.native
  
  var firstMessageDeliveriesWeight: js.UndefOr[Double] = js.native
  
  var invalidMessageDeliveriesDecay: js.UndefOr[Double] = js.native
  
  var invalidMessageDeliveriesWeight: js.UndefOr[Double] = js.native
  
  var meshFailurePenaltyDecay: js.UndefOr[Double] = js.native
  
  var meshFailurePenaltyWeight: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesActivation: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesCap: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesDecay: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesThreshold: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesWeight: js.UndefOr[Double] = js.native
  
  var meshMessageDeliveriesWindow: js.UndefOr[Double] = js.native
  
  var timeInMeshCap: js.UndefOr[Double] = js.native
  
  var timeInMeshQuantum: js.UndefOr[Double] = js.native
  
  var timeInMeshWeight: js.UndefOr[Double] = js.native
  
  var topicWeight: js.UndefOr[Double] = js.native
}
object PartialTopicScoreParams {
  
  @scala.inline
  def apply(): PartialTopicScoreParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTopicScoreParams]
  }
  
  @scala.inline
  implicit class PartialTopicScoreParamsOps[Self <: PartialTopicScoreParams] (val x: Self) extends AnyVal {
    
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
    def deleteFirstMessageDeliveriesCap: Self = this.set("firstMessageDeliveriesCap", js.undefined)
    
    @scala.inline
    def setFirstMessageDeliveriesDecay(value: Double): Self = this.set("firstMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstMessageDeliveriesDecay: Self = this.set("firstMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setFirstMessageDeliveriesWeight(value: Double): Self = this.set("firstMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstMessageDeliveriesWeight: Self = this.set("firstMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveriesDecay(value: Double): Self = this.set("invalidMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMessageDeliveriesDecay: Self = this.set("invalidMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveriesWeight(value: Double): Self = this.set("invalidMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMessageDeliveriesWeight: Self = this.set("invalidMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setMeshFailurePenaltyDecay(value: Double): Self = this.set("meshFailurePenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshFailurePenaltyDecay: Self = this.set("meshFailurePenaltyDecay", js.undefined)
    
    @scala.inline
    def setMeshFailurePenaltyWeight(value: Double): Self = this.set("meshFailurePenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshFailurePenaltyWeight: Self = this.set("meshFailurePenaltyWeight", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesActivation(value: Double): Self = this.set("meshMessageDeliveriesActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesActivation: Self = this.set("meshMessageDeliveriesActivation", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesCap(value: Double): Self = this.set("meshMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesCap: Self = this.set("meshMessageDeliveriesCap", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesDecay(value: Double): Self = this.set("meshMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesDecay: Self = this.set("meshMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesThreshold(value: Double): Self = this.set("meshMessageDeliveriesThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesThreshold: Self = this.set("meshMessageDeliveriesThreshold", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesWeight(value: Double): Self = this.set("meshMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesWeight: Self = this.set("meshMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesWindow(value: Double): Self = this.set("meshMessageDeliveriesWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeshMessageDeliveriesWindow: Self = this.set("meshMessageDeliveriesWindow", js.undefined)
    
    @scala.inline
    def setTimeInMeshCap(value: Double): Self = this.set("timeInMeshCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInMeshCap: Self = this.set("timeInMeshCap", js.undefined)
    
    @scala.inline
    def setTimeInMeshQuantum(value: Double): Self = this.set("timeInMeshQuantum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInMeshQuantum: Self = this.set("timeInMeshQuantum", js.undefined)
    
    @scala.inline
    def setTimeInMeshWeight(value: Double): Self = this.set("timeInMeshWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInMeshWeight: Self = this.set("timeInMeshWeight", js.undefined)
    
    @scala.inline
    def setTopicWeight(value: Double): Self = this.set("topicWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopicWeight: Self = this.set("topicWeight", js.undefined)
  }
}
