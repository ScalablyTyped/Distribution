package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult extends StObject {
  
  /**
    * ID of the recommended catalog item
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional item metadata / annotations. Possible values: * `catalogItem`: JSON representation of the catalogItem. Will be set if `returnCatalogItem` is set to true in `PredictRequest.params`. * `score`: Prediction score in double value. Will be set if `returnItemScore` is set to true in `PredictRequest.params`.
    */
  var itemMetadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1PredictResponsePredictionResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setItemMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "itemMetadata", value.asInstanceOf[js.Any])
    
    inline def setItemMetadataNull: Self = StObject.set(x, "itemMetadata", null)
    
    inline def setItemMetadataUndefined: Self = StObject.set(x, "itemMetadata", js.undefined)
  }
}
