package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudMlV1SuggestTrialsRequest extends StObject {
  
  /**
    * Required. The identifier of the client that is requesting the suggestion. If multiple SuggestTrialsRequests have the same `client_id`, the service will return the identical suggested trial if the trial is pending, and provide a new trial if the last suggested trial was completed.
    */
  var clientId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The number of suggestions requested.
    */
  var suggestionCount: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudMlV1SuggestTrialsRequest {
  
  inline def apply(): SchemaGoogleCloudMlV1SuggestTrialsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1SuggestTrialsRequest]
  }
  
  extension [Self <: SchemaGoogleCloudMlV1SuggestTrialsRequest](x: Self) {
    
    inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    inline def setClientIdNull: Self = StObject.set(x, "clientId", null)
    
    inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    inline def setSuggestionCount(value: Double): Self = StObject.set(x, "suggestionCount", value.asInstanceOf[js.Any])
    
    inline def setSuggestionCountNull: Self = StObject.set(x, "suggestionCount", null)
    
    inline def setSuggestionCountUndefined: Self = StObject.set(x, "suggestionCount", js.undefined)
  }
}
