package typings.libp2pGossipsub.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<libp2p-gossipsub.libp2p-gossipsub/src/score/peer-score-params.TopicScoreParams> */
@js.native
trait PartialTopicScoreParams extends StObject {
  
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
  implicit class PartialTopicScoreParamsMutableBuilder[Self <: PartialTopicScoreParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirstMessageDeliveriesCap(value: Double): Self = StObject.set(x, "firstMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesCapUndefined: Self = StObject.set(x, "firstMessageDeliveriesCap", js.undefined)
    
    @scala.inline
    def setFirstMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "firstMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesDecayUndefined: Self = StObject.set(x, "firstMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setFirstMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "firstMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstMessageDeliveriesWeightUndefined: Self = StObject.set(x, "firstMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveriesDecayUndefined: Self = StObject.set(x, "invalidMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setInvalidMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "invalidMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidMessageDeliveriesWeightUndefined: Self = StObject.set(x, "invalidMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setMeshFailurePenaltyDecay(value: Double): Self = StObject.set(x, "meshFailurePenaltyDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenaltyDecayUndefined: Self = StObject.set(x, "meshFailurePenaltyDecay", js.undefined)
    
    @scala.inline
    def setMeshFailurePenaltyWeight(value: Double): Self = StObject.set(x, "meshFailurePenaltyWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshFailurePenaltyWeightUndefined: Self = StObject.set(x, "meshFailurePenaltyWeight", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesActivation(value: Double): Self = StObject.set(x, "meshMessageDeliveriesActivation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesActivationUndefined: Self = StObject.set(x, "meshMessageDeliveriesActivation", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesCap(value: Double): Self = StObject.set(x, "meshMessageDeliveriesCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesCapUndefined: Self = StObject.set(x, "meshMessageDeliveriesCap", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesDecay(value: Double): Self = StObject.set(x, "meshMessageDeliveriesDecay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesDecayUndefined: Self = StObject.set(x, "meshMessageDeliveriesDecay", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesThreshold(value: Double): Self = StObject.set(x, "meshMessageDeliveriesThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesThresholdUndefined: Self = StObject.set(x, "meshMessageDeliveriesThreshold", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesWeight(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesWeightUndefined: Self = StObject.set(x, "meshMessageDeliveriesWeight", js.undefined)
    
    @scala.inline
    def setMeshMessageDeliveriesWindow(value: Double): Self = StObject.set(x, "meshMessageDeliveriesWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeshMessageDeliveriesWindowUndefined: Self = StObject.set(x, "meshMessageDeliveriesWindow", js.undefined)
    
    @scala.inline
    def setTimeInMeshCap(value: Double): Self = StObject.set(x, "timeInMeshCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshCapUndefined: Self = StObject.set(x, "timeInMeshCap", js.undefined)
    
    @scala.inline
    def setTimeInMeshQuantum(value: Double): Self = StObject.set(x, "timeInMeshQuantum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshQuantumUndefined: Self = StObject.set(x, "timeInMeshQuantum", js.undefined)
    
    @scala.inline
    def setTimeInMeshWeight(value: Double): Self = StObject.set(x, "timeInMeshWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInMeshWeightUndefined: Self = StObject.set(x, "timeInMeshWeight", js.undefined)
    
    @scala.inline
    def setTopicWeight(value: Double): Self = StObject.set(x, "topicWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicWeightUndefined: Self = StObject.set(x, "topicWeight", js.undefined)
  }
}
