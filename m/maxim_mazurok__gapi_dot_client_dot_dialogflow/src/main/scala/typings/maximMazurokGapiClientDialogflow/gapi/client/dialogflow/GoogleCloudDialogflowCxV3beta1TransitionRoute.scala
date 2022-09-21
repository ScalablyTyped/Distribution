package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1TransitionRoute extends StObject {
  
  /**
    * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least
    * one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
    */
  var condition: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of
    * `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
    */
  var intent: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique identifier of this transition route. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The target flow to transition to. Format: `projects//locations//agents//flows/`. */
  var targetFlow: js.UndefOr[String] = js.undefined
  
  /** The target page to transition to. Format: `projects//locations//agents//flows//pages/`. */
  var targetPage: js.UndefOr[String] = js.undefined
  
  /**
    * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is
    * executed first.
    */
  var triggerFulfillment: js.UndefOr[GoogleCloudDialogflowCxV3beta1Fulfillment] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1TransitionRoute {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1TransitionRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1TransitionRoute]
  }
  
  extension [Self <: GoogleCloudDialogflowCxV3beta1TransitionRoute](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetFlow(value: String): Self = StObject.set(x, "targetFlow", value.asInstanceOf[js.Any])
    
    inline def setTargetFlowUndefined: Self = StObject.set(x, "targetFlow", js.undefined)
    
    inline def setTargetPage(value: String): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
    
    inline def setTriggerFulfillment(value: GoogleCloudDialogflowCxV3beta1Fulfillment): Self = StObject.set(x, "triggerFulfillment", value.asInstanceOf[js.Any])
    
    inline def setTriggerFulfillmentUndefined: Self = StObject.set(x, "triggerFulfillment", js.undefined)
  }
}
