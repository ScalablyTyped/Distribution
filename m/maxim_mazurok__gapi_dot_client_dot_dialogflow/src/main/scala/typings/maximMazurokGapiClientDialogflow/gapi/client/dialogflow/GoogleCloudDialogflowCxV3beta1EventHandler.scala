package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowCxV3beta1EventHandler extends StObject {
  
  /** Required. The name of the event to handle. */
  var event: js.UndefOr[String] = js.undefined
  
  /** Output only. The unique identifier of this event handler. */
  var name: js.UndefOr[String] = js.undefined
  
  /** The target flow to transition to. Format: `projects//locations//agents//flows/`. */
  var targetFlow: js.UndefOr[String] = js.undefined
  
  /** The target page to transition to. Format: `projects//locations//agents//flows//pages/`. */
  var targetPage: js.UndefOr[String] = js.undefined
  
  /**
    * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment
    * for a handler handling webhooks.
    */
  var triggerFulfillment: js.UndefOr[GoogleCloudDialogflowCxV3beta1Fulfillment] = js.undefined
}
object GoogleCloudDialogflowCxV3beta1EventHandler {
  
  inline def apply(): GoogleCloudDialogflowCxV3beta1EventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowCxV3beta1EventHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowCxV3beta1EventHandler] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
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
