package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaPredictResponse extends StObject {
  
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
  var results: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult]] = js.undefined
  
  /**
    * True if the validateOnly property was set in the request.
    */
  var validateOnly: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaPredictResponse {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaPredictResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaPredictResponse]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaPredictResponse](x: Self) {
    
    inline def setAttributionToken(value: String): Self = StObject.set(x, "attributionToken", value.asInstanceOf[js.Any])
    
    inline def setAttributionTokenNull: Self = StObject.set(x, "attributionToken", null)
    
    inline def setAttributionTokenUndefined: Self = StObject.set(x, "attributionToken", js.undefined)
    
    inline def setMissingIds(value: js.Array[String]): Self = StObject.set(x, "missingIds", value.asInstanceOf[js.Any])
    
    inline def setMissingIdsNull: Self = StObject.set(x, "missingIds", null)
    
    inline def setMissingIdsUndefined: Self = StObject.set(x, "missingIds", js.undefined)
    
    inline def setMissingIdsVarargs(value: String*): Self = StObject.set(x, "missingIds", js.Array(value*))
    
    inline def setResults(value: js.Array[SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult*): Self = StObject.set(x, "results", js.Array(value*))
    
    inline def setValidateOnly(value: Boolean): Self = StObject.set(x, "validateOnly", value.asInstanceOf[js.Any])
    
    inline def setValidateOnlyNull: Self = StObject.set(x, "validateOnly", null)
    
    inline def setValidateOnlyUndefined: Self = StObject.set(x, "validateOnly", js.undefined)
  }
}
