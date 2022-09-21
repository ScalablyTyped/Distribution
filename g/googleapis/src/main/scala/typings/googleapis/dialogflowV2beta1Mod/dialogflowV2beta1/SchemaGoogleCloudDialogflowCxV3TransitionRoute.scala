package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3TransitionRoute extends StObject {
  
  /**
    * The condition to evaluate against form parameters or session parameters. See the [conditions reference](https://cloud.google.com/dialogflow/cx/docs/reference/condition). At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The unique identifier of an Intent. Format: `projects//locations//agents//intents/`. Indicates that the transition can only happen when the given intent is matched. At least one of `intent` or `condition` must be specified. When both `intent` and `condition` are specified, the transition can only happen when both are fulfilled.
    */
  var intent: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier of this transition route.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target flow to transition to. Format: `projects//locations//agents//flows/`.
    */
  var targetFlow: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The target page to transition to. Format: `projects//locations//agents//flows//pages/`.
    */
  var targetPage: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fulfillment to call when the condition is satisfied. At least one of `trigger_fulfillment` and `target` must be specified. When both are defined, `trigger_fulfillment` is executed first.
    */
  var triggerFulfillment: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Fulfillment] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3TransitionRoute {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3TransitionRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3TransitionRoute]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3TransitionRoute](x: Self) {
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setIntent(value: String): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentNull: Self = StObject.set(x, "intent", null)
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTargetFlow(value: String): Self = StObject.set(x, "targetFlow", value.asInstanceOf[js.Any])
    
    inline def setTargetFlowNull: Self = StObject.set(x, "targetFlow", null)
    
    inline def setTargetFlowUndefined: Self = StObject.set(x, "targetFlow", js.undefined)
    
    inline def setTargetPage(value: String): Self = StObject.set(x, "targetPage", value.asInstanceOf[js.Any])
    
    inline def setTargetPageNull: Self = StObject.set(x, "targetPage", null)
    
    inline def setTargetPageUndefined: Self = StObject.set(x, "targetPage", js.undefined)
    
    inline def setTriggerFulfillment(value: SchemaGoogleCloudDialogflowCxV3Fulfillment): Self = StObject.set(x, "triggerFulfillment", value.asInstanceOf[js.Any])
    
    inline def setTriggerFulfillmentUndefined: Self = StObject.set(x, "triggerFulfillment", js.undefined)
  }
}
