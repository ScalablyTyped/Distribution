package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult extends StObject {
  
  /**
    * ID of the recommended product
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional product metadata / annotations. Possible values: * `product`: JSON representation of the product. Is set if `returnProduct` is set to true in `PredictRequest.params`. * `score`: Prediction score in double value. Is set if `returnScore` is set to true in `PredictRequest.params`.
    */
  var metadata: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaPredictResponsePredictionResult](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadata(value: StringDictionary[Any]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataNull: Self = StObject.set(x, "metadata", null)
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
  }
}
