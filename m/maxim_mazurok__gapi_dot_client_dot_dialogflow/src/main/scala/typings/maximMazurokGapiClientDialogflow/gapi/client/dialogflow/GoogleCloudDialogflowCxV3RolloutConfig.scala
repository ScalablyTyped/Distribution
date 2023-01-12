package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RolloutConfig extends StObject {
  
  /**
    * The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See
    * the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var failureCondition: js.UndefOr[String] = js.undefined
  
  /**
    * The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g.
    * "containment_rate > 60% AND callback_rate < 20%". See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var rolloutCondition: js.UndefOr[String] = js.undefined
  
  /** Steps to roll out a flow version. Steps should be sorted by percentage in ascending order. */
  var rolloutSteps: js.UndefOr[js.Array[GoogleCloudDialogflowCxV3RolloutConfigRolloutStep]] = js.undefined
}
object GoogleCloudDialogflowCxV3RolloutConfig {
  
  inline def apply(): GoogleCloudDialogflowCxV3RolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RolloutConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3RolloutConfig] (val x: Self) extends AnyVal {
    
    inline def setFailureCondition(value: String): Self = StObject.set(x, "failureCondition", value.asInstanceOf[js.Any])
    
    inline def setFailureConditionUndefined: Self = StObject.set(x, "failureCondition", js.undefined)
    
    inline def setRolloutCondition(value: String): Self = StObject.set(x, "rolloutCondition", value.asInstanceOf[js.Any])
    
    inline def setRolloutConditionUndefined: Self = StObject.set(x, "rolloutCondition", js.undefined)
    
    inline def setRolloutSteps(value: js.Array[GoogleCloudDialogflowCxV3RolloutConfigRolloutStep]): Self = StObject.set(x, "rolloutSteps", value.asInstanceOf[js.Any])
    
    inline def setRolloutStepsUndefined: Self = StObject.set(x, "rolloutSteps", js.undefined)
    
    inline def setRolloutStepsVarargs(value: GoogleCloudDialogflowCxV3RolloutConfigRolloutStep*): Self = StObject.set(x, "rolloutSteps", js.Array(value*))
  }
}
