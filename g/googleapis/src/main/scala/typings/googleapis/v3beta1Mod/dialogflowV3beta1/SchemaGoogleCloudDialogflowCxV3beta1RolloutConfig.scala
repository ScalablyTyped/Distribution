package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1RolloutConfig extends StObject {
  
  /**
    * The conditions that are used to evaluate the failure of a rollout step. If not specified, no rollout steps will fail. E.g. "containment_rate < 10% OR average_turn_count < 3". See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var failureCondition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The conditions that are used to evaluate the success of a rollout step. If not specified, all rollout steps will proceed to the next one unless failure conditions are met. E.g. "containment_rate \> 60% AND callback_rate < 20%". See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition).
    */
  var rolloutCondition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Steps to roll out a flow version. Steps should be sorted by percentage in ascending order.
    */
  var rolloutSteps: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStep]] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1RolloutConfig {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1RolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1RolloutConfig]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1RolloutConfig](x: Self) {
    
    inline def setFailureCondition(value: String): Self = StObject.set(x, "failureCondition", value.asInstanceOf[js.Any])
    
    inline def setFailureConditionNull: Self = StObject.set(x, "failureCondition", null)
    
    inline def setFailureConditionUndefined: Self = StObject.set(x, "failureCondition", js.undefined)
    
    inline def setRolloutCondition(value: String): Self = StObject.set(x, "rolloutCondition", value.asInstanceOf[js.Any])
    
    inline def setRolloutConditionNull: Self = StObject.set(x, "rolloutCondition", null)
    
    inline def setRolloutConditionUndefined: Self = StObject.set(x, "rolloutCondition", js.undefined)
    
    inline def setRolloutSteps(value: js.Array[SchemaGoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStep]): Self = StObject.set(x, "rolloutSteps", value.asInstanceOf[js.Any])
    
    inline def setRolloutStepsUndefined: Self = StObject.set(x, "rolloutSteps", js.undefined)
    
    inline def setRolloutStepsVarargs(value: SchemaGoogleCloudDialogflowCxV3beta1RolloutConfigRolloutStep*): Self = StObject.set(x, "rolloutSteps", js.Array(value*))
  }
}
