package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3EventHandler extends StObject {
  
  /**
    * Required. The name of the event to handle.
    */
  var event: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The unique identifier of this event handler.
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
    * The fulfillment to call when the event occurs. Handling webhook errors with a fulfillment enabled with webhook could cause infinite loop. It is invalid to specify such fulfillment for a handler handling webhooks.
    */
  var triggerFulfillment: js.UndefOr[SchemaGoogleCloudDialogflowCxV3Fulfillment] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3EventHandler {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3EventHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3EventHandler]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3EventHandler](x: Self) {
    
    inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventNull: Self = StObject.set(x, "event", null)
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
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
