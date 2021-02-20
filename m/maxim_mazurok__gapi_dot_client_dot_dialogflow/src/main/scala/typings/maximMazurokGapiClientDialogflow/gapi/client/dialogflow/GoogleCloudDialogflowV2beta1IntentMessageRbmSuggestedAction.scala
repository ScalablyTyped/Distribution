package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction extends StObject {
  
  /** Suggested client side action: Dial a phone number */
  var dial: js.UndefOr[
    GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial
  ] = js.native
  
  /** Suggested client side action: Open a URI on device */
  var openUrl: js.UndefOr[
    GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri
  ] = js.native
  
  /**
    * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested action. This data will be also forwarded to webhook to allow performing custom business
    * logic.
    */
  var postbackData: js.UndefOr[String] = js.native
  
  /** Suggested client side action: Share user location */
  var shareLocation: js.UndefOr[js.Any] = js.native
  
  /** Text to display alongside the action. */
  var text: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDial(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionDial): Self = StObject.set(x, "dial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialUndefined: Self = StObject.set(x, "dial", js.undefined)
    
    @scala.inline
    def setOpenUrl(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedActionRbmSuggestedActionOpenUri): Self = StObject.set(x, "openUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenUrlUndefined: Self = StObject.set(x, "openUrl", js.undefined)
    
    @scala.inline
    def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
    
    @scala.inline
    def setShareLocation(value: js.Any): Self = StObject.set(x, "shareLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShareLocationUndefined: Self = StObject.set(x, "shareLocation", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
