package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse extends StObject {
  
  /**
    * Optional. Token to retrieve the next page of results or empty if there are no more results in the list.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The list of suggestions. There will be a maximum number of items returned based on the page_size field in the request. `suggestions` is sorted by `create_time` in descending order.
    */
  var suggestions: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2beta1Suggestion]] = js.undefined
}
object SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse {
  
  inline def apply(): SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse]
  }
  
  extension [Self <: SchemaGoogleCloudDialogflowV2beta1ListSuggestionsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setSuggestions(value: js.Array[SchemaGoogleCloudDialogflowV2beta1Suggestion]): Self = StObject.set(x, "suggestions", value.asInstanceOf[js.Any])
    
    inline def setSuggestionsUndefined: Self = StObject.set(x, "suggestions", js.undefined)
    
    inline def setSuggestionsVarargs(value: SchemaGoogleCloudDialogflowV2beta1Suggestion*): Self = StObject.set(x, "suggestions", js.Array(value*))
  }
}
