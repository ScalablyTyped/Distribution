package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2beta1IntentMessageSuggestions extends StObject {
  
  /** Required. The list of suggested replies. */
  var suggestions: js.UndefOr[js.Array[GoogleCloudDialogflowV2beta1IntentMessageSuggestion]] = js.undefined
}
object GoogleCloudDialogflowV2beta1IntentMessageSuggestions {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2beta1IntentMessageSuggestions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2beta1IntentMessageSuggestions]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2beta1IntentMessageSuggestionsMutableBuilder[Self <: GoogleCloudDialogflowV2beta1IntentMessageSuggestions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuggestions(value: js.Array[GoogleCloudDialogflowV2beta1IntentMessageSuggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: GoogleCloudDialogflowV2beta1IntentMessageSuggestion*): Self = StObject.set(x, "suggestions", js.Array(value :_*))
  }
}
