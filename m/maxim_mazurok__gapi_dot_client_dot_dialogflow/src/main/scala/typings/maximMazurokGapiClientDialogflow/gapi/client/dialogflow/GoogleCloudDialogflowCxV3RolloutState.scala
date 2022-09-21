package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RolloutState extends StObject {
  
  /** Start time of the current step. */
  var startTime: js.UndefOr[String] = js.undefined
  
  /** Display name of the current auto rollout step. */
  var step: js.UndefOr[String] = js.undefined
  
  /** Index of the current step in the auto rollout steps list. */
  var stepIndex: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowCxV3RolloutState {
  
  inline def apply(): GoogleCloudDialogflowCxV3RolloutState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RolloutState]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3RolloutState](x: Self) {
    
    inline def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStep(value: String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepIndex(value: Double): Self = StObject.set(x, "stepIndex", value.asInstanceOf[js.Any])
    
    inline def setStepIndexUndefined: Self = StObject.set(x, "stepIndex", js.undefined)
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
  }
}
