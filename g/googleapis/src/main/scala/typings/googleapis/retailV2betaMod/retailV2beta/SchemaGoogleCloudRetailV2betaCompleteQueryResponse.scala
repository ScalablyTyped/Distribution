package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCompleteQueryResponse extends StObject {
  
  /**
    * A unique complete token. This should be included in the UserEvent.completion_detail for search events resulting from this completion, which enables accurate attribution of complete model performance.
    */
  var attributionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Results of the matching suggestions. The result list is ordered and the first result is top suggestion.
    */
  var completionResults: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaCompleteQueryResponseCompletionResult]] = js.undefined
  
  /**
    * Matched recent searches of this user. The maximum number of recent searches is 10. This field is a restricted feature. Contact Retail Search support team if you are interested in enabling it. This feature is only available when CompleteQueryRequest.visitor_id field is set and UserEvent is imported. The recent searches satisfy the follow rules: * They are ordered from latest to oldest. * They are matched with CompleteQueryRequest.query case insensitively. * They are transformed to lower case. * They are UTF-8 safe. Recent searches are deduplicated. More recent searches will be reserved when duplication happens.
    */
  var recentSearchResults: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCompleteQueryResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCompleteQueryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCompleteQueryResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCompleteQueryResponse](x: Self) {
    
    inline def setAttributionToken(value: String): Self = StObject.set(x, "attributionToken", value.asInstanceOf[js.Any])
    
    inline def setAttributionTokenNull: Self = StObject.set(x, "attributionToken", null)
    
    inline def setAttributionTokenUndefined: Self = StObject.set(x, "attributionToken", js.undefined)
    
    inline def setCompletionResults(value: js.Array[SchemaGoogleCloudRetailV2betaCompleteQueryResponseCompletionResult]): Self = StObject.set(x, "completionResults", value.asInstanceOf[js.Any])
    
    inline def setCompletionResultsUndefined: Self = StObject.set(x, "completionResults", js.undefined)
    
    inline def setCompletionResultsVarargs(value: SchemaGoogleCloudRetailV2betaCompleteQueryResponseCompletionResult*): Self = StObject.set(x, "completionResults", js.Array(value*))
    
    inline def setRecentSearchResults(value: js.Array[SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult]): Self = StObject.set(x, "recentSearchResults", value.asInstanceOf[js.Any])
    
    inline def setRecentSearchResultsUndefined: Self = StObject.set(x, "recentSearchResults", js.undefined)
    
    inline def setRecentSearchResultsVarargs(value: SchemaGoogleCloudRetailV2betaCompleteQueryResponseRecentSearchResult*): Self = StObject.set(x, "recentSearchResults", js.Array(value*))
  }
}
