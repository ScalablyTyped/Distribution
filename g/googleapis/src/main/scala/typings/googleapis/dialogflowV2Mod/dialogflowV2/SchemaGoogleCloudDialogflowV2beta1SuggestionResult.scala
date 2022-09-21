package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1SuggestionResult extends StObject {
  
  /**
    * Error status if the request failed.
    */
  var error: js.UndefOr[SchemaGoogleRpcStatus] = js.undefined
  
  /**
    * SuggestArticlesResponse if request is for ARTICLE_SUGGESTION.
    */
  var suggestArticlesResponse: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse] = js.undefined
  
  /**
    * SuggestFaqAnswersResponse if request is for FAQ_ANSWER.
    */
  var suggestFaqAnswersResponse: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse] = js.undefined
  
  /**
    * SuggestSmartRepliesResponse if request is for SMART_REPLY.
    */
  var suggestSmartRepliesResponse: js.UndefOr[SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1SuggestionResult {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1SuggestionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1SuggestionResult]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1SuggestionResult](x: Self) {
    
    inline def setError(value: SchemaGoogleRpcStatus): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setSuggestArticlesResponse(value: SchemaGoogleCloudDialogflowV2beta1SuggestArticlesResponse): Self = StObject.set(x, "suggestArticlesResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestArticlesResponseUndefined: Self = StObject.set(x, "suggestArticlesResponse", js.undefined)
    
    inline def setSuggestFaqAnswersResponse(value: SchemaGoogleCloudDialogflowV2beta1SuggestFaqAnswersResponse): Self = StObject.set(x, "suggestFaqAnswersResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestFaqAnswersResponseUndefined: Self = StObject.set(x, "suggestFaqAnswersResponse", js.undefined)
    
    inline def setSuggestSmartRepliesResponse(value: SchemaGoogleCloudDialogflowV2beta1SuggestSmartRepliesResponse): Self = StObject.set(x, "suggestSmartRepliesResponse", value.asInstanceOf[js.Any])
    
    inline def setSuggestSmartRepliesResponseUndefined: Self = StObject.set(x, "suggestSmartRepliesResponse", js.undefined)
  }
}
