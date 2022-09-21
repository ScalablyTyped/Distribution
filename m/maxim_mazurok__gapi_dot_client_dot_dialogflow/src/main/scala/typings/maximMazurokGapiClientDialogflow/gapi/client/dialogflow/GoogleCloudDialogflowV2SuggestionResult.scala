package typings.maximMazurokGapiClientDialogflow.gapi.client.dialogflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2SuggestionResult extends StObject {
  
  /** Error status if the request failed. */
  var error: js.UndefOr[GoogleRpcStatus] = js.undefined
  
  /** SuggestArticlesResponse if request is for ARTICLE_SUGGESTION. */
  var suggestArticlesResponse: js.UndefOr[GoogleCloudDialogflowV2SuggestArticlesResponse] = js.undefined
  
  /** SuggestFaqAnswersResponse if request is for FAQ_ANSWER. */
  var suggestFaqAnswersResponse: js.UndefOr[GoogleCloudDialogflowV2SuggestFaqAnswersResponse] = js.undefined
  
  /** SuggestSmartRepliesResponse if request is for SMART_REPLY. */
  var suggestSmartRepliesResponse: js.UndefOr[GoogleCloudDialogflowV2SuggestSmartRepliesResponse] = js.undefined
}
object GoogleCloudDialogflowV2SuggestionResult {
  
  inline def apply(): GoogleCloudDialogflowV2SuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2SuggestionResult]
  }
  
  extension [Self <: GoogleCloudDialogflowV2SuggestionResult](x: Self) {
    
    inline def setError(value: GoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuggestArticlesResponse(value: GoogleCloudDialogflowV2SuggestArticlesResponse): Self = StObject.set(x, "suggestArticlesResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestArticlesResponseUndefined: Self = StObject.set(x, "suggestArticlesResponse", js.undefined)
    
    inline def setSuggestFaqAnswersResponse(value: GoogleCloudDialogflowV2SuggestFaqAnswersResponse): Self = StObject.set(x, "suggestFaqAnswersResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestFaqAnswersResponseUndefined: Self = StObject.set(x, "suggestFaqAnswersResponse", js.undefined)
    
    inline def setSuggestSmartRepliesResponse(value: GoogleCloudDialogflowV2SuggestSmartRepliesResponse): Self = StObject.set(x, "suggestSmartRepliesResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestSmartRepliesResponseUndefined: Self = StObject.set(x, "suggestSmartRepliesResponse", js.undefined)
  }
}
