package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageRbmText extends StObject {
  
  /** Optional. One or more suggestions to show to the user. */
  var rbmSuggestion: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]] = js.undefined
  
  /** Required. Text sent and displayed to the user. */
  var text: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageRbmText {
  
  inline def apply(): GoogleCloudDialogflowV2beta1IntentMessageRbmText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageRbmText]
  }
  
  extension [Self <: GoogleCloudDialogflowV2beta1IntentMessageRbmText](x: Self) {
    
    inline def setRbmSuggestion(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion]): Self = StObject.set(x, "rbmSuggestion", value.asInstanceOf[js.Any])
    
    inline def setRbmSuggestionUndefined: Self = StObject.set(x, "rbmSuggestion", js.undefined)
    
    inline def setRbmSuggestionVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageRbmSuggestion*): Self = StObject.set(x, "rbmSuggestion", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
