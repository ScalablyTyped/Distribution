package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaPredictResponse extends StObject {
  
  /**
    * A unique attribution token. This should be included in the UserEvent logs resulting from this recommendation, which enables accurate attribution of recommendation model performance.
    */
  var attributionToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * IDs of products in the request that were missing from the inventory.
    */
  var missingIds: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A list of recommended products. The order represents the ranking (from the most relevant product to the least).
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaPredictResponsePredictionResult]] = js.undefined
  
  /**
    * True if the validateOnly property was set in the request.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaPredictResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaPredictResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaPredictResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaPredictResponse](x: Self) {
    
    inline def setAttributionToken(value: String): Self = StObject.set(x, "attributionToken", value.asInstanceOf[js.Any])
    
    inline def setAttributionTokenNull: Self = StObject.set(x, "attributionToken", null)
    
    inline def setAttributionTokenUndefined: Self = StObject.set(x, "attributionToken", js.undefined)
    
    inline def setMissingIds(value: js.Array[String]): Self = StObject.set(x, "missingIds", value.asInstanceOf[js.Any])
    
    inline def setMissingIdsNull: Self = StObject.set(x, "missingIds", null)
    
    inline def setMissingIdsUndefined: Self = StObject.set(x, "missingIds", js.undefined)
    
    inline def setMissingIdsVarargs(value: String*): Self = StObject.set(x, "missingIds", js.Array(value*))
    
    inline def setResults(value: js.Array[SchemaGoogleCloudRetailV2alphaPredictResponsePredictionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudRetailV2alphaPredictResponsePredictionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
