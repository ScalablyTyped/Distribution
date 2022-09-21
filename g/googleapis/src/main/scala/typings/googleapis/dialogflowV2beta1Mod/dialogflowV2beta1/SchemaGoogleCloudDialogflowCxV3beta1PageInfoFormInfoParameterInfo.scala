package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo extends StObject {
  
  /**
    * Always present for WebhookRequest. Required for WebhookResponse. The human-readable name of the parameter, unique within the form. This field cannot be modified by the webhook.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional for WebhookRequest. Ignored for WebhookResponse. Indicates if the parameter value was just collected on the last conversation turn.
    */
  var justCollected: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. Indicates whether the parameter is required. Optional parameters will not trigger prompts; however, they are filled if the user specifies them. Required parameters must be filled before form filling concludes.
    */
  var required: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Always present for WebhookRequest. Required for WebhookResponse. The state of the parameter. This field can be set to INVALID by the webhook to invalidate the parameter; other values set by the webhook will be ignored.
    */
  var state: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional for both WebhookRequest and WebhookResponse. The value of the parameter. This field can be set by the webhook to change the parameter value.
    */
  var value: js.UndefOr[Any | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo {
  
  inline def apply(): SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowCxV3beta1PageInfoFormInfoParameterInfo](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setJustCollected(value: Boolean): Self = StObject.set(x, "justCollected", value.asInstanceOf[js.Any])
    
    inline def setJustCollectedNull: Self = StObject.set(x, "justCollected", null)
    
    inline def setJustCollectedUndefined: Self = StObject.set(x, "justCollected", js.undefined)
    
    inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setRequiredNull: Self = StObject.set(x, "required", null)
    
    inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
