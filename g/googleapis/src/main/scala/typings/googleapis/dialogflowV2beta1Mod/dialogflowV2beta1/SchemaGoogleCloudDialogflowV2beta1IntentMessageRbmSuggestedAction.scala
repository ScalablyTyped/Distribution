package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction extends StObject {
  
  /**
    * Suggested client side action: Dial a phone number
    */
  var dial: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial
  ] = js.undefined
  
  /**
    * Suggested client side action: Open a URI on device
    */
  var openUrl: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri
  ] = js.undefined
  
  /**
    * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business logic.
    */
  var postbackData: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Suggested client side action: Share user location
    */
  var shareLocation: js.UndefOr[
    SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocation
  ] = js.undefined
  
  /**
    * Text to display alongside the action.
    */
  var text: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction](x: Self) {
    
    inline def setDial(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial): Self = StObject.set(x, "dial", value.asInstanceOf[js.Any])
    
    inline def setDialUndefined: Self = StObject.set(x, "dial", js.undefined)
    
    inline def setOpenUrl(value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri): Self = StObject.set(x, "openUrl", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlUndefined: Self = StObject.set(x, "openUrl", js.undefined)
    
    inline def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
    
    inline def setPostbackDataNull: Self = StObject.set(x, "postbackData", null)
    
    inline def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
    
    inline def setShareLocation(
      value: SchemaGoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionShareLocation
    ): Self = StObject.set(x, "shareLocation", value.asInstanceOf[js.Any])
    
    inline def setShareLocationUndefined: Self = StObject.set(x, "shareLocation", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
