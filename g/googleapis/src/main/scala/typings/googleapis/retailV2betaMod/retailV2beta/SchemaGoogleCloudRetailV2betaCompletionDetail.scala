package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaCompletionDetail extends StObject {
  
  /**
    * Completion attribution token in CompleteQueryResponse.attribution_token.
    */
  var completionAttributionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * End user selected CompleteQueryResponse.CompletionResult.suggestion position, starting from 0.
    */
  var selectedPosition: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * End user selected CompleteQueryResponse.CompletionResult.suggestion.
    */
  var selectedSuggestion: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaCompletionDetail {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaCompletionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaCompletionDetail]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaCompletionDetail](x: Self) {
    
    inline def setCompletionAttributionToken(value: String): Self = StObject.set(x, "completionAttributionToken", value.asInstanceOf[js.Any])
    
    inline def setCompletionAttributionTokenNull: Self = StObject.set(x, "completionAttributionToken", null)
    
    inline def setCompletionAttributionTokenUndefined: Self = StObject.set(x, "completionAttributionToken", js.undefined)
    
    inline def setSelectedPosition(value: Double): Self = StObject.set(x, "selectedPosition", value.asInstanceOf[js.Any])
    
    inline def setSelectedPositionNull: Self = StObject.set(x, "selectedPosition", null)
    
    inline def setSelectedPositionUndefined: Self = StObject.set(x, "selectedPosition", js.undefined)
    
    inline def setSelectedSuggestion(value: String): Self = StObject.set(x, "selectedSuggestion", value.asInstanceOf[js.Any])
    
    inline def setSelectedSuggestionNull: Self = StObject.set(x, "selectedSuggestion", null)
    
    inline def setSelectedSuggestionUndefined: Self = StObject.set(x, "selectedSuggestion", js.undefined)
  }
}
