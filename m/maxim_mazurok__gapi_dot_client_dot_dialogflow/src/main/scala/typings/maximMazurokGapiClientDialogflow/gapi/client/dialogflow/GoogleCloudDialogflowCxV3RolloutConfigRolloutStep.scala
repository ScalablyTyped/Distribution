package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3RolloutConfigRolloutStep extends StObject {
  
  /** The name of the rollout step; */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The minimum time that this step should last. Should be longer than 1 hour. If not set, the default minimum duration for each step will be 1 hour. */
  var minDuration: js.UndefOr[String] = js.undefined
  
  /** The percentage of traffic allocated to the flow version of this rollout step. (0%, 100%]. */
  var trafficPercent: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDialogflowCxV3RolloutConfigRolloutStep {
  
  inline def apply(): GoogleCloudDialogflowCxV3RolloutConfigRolloutStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3RolloutConfigRolloutStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3RolloutConfigRolloutStep] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMinDuration(value: String): Self = StObject.set(x, "minDuration", value.asInstanceOf[js.Any])
    
    inline def setMinDurationUndefined: Self = StObject.set(x, "minDuration", js.undefined)
    
    inline def setTrafficPercent(value: Double): Self = StObject.set(x, "trafficPercent", value.asInstanceOf[js.Any])
    
    inline def setTrafficPercentUndefined: Self = StObject.set(x, "trafficPercent", js.undefined)
  }
}
