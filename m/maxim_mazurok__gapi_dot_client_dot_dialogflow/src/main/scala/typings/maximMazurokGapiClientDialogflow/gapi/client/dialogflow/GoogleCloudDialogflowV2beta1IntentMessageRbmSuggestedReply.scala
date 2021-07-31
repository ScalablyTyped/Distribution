package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply extends StObject {
  
  /**
    * Opaque payload that the Dialogflow receives in a user event when the user taps the suggested reply. This data will be also forwarded to webhook to allow performing custom business
    * logic.
    */
  var postbackData: js.UndefOr[String] = js.undefined
  
  /** Suggested reply text. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReplyMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostbackData(value: String): Self = StObject.set(x, "postbackData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostbackDataUndefined: Self = StObject.set(x, "postbackData", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
