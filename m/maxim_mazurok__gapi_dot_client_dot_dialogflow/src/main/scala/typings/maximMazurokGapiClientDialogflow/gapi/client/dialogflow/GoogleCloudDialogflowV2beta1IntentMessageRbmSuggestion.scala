package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion extends StObject {
  
  /** Predefined client side actions that user can choose */
  var action: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction] = js.undefined
  
  /** Predefined replies for user to select instead of typing */
  var reply: js.UndefOr[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion] (val x: Self) extends AnyVal {
    
    inline def setAction(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setReply(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestedReply): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setReplyUndefined: Self = StObject.set(x, "reply", js.undefined)
  }
}
