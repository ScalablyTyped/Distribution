package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig extends StObject {
  
  /**
    * Optional. Level of the catalog at which events are uploaded. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details.
    */
  var eventItemLevel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Level of the catalog at which predictions are made. See https://cloud.google.com/recommendations-ai/docs/catalog#catalog-levels for more details.
    */
  var predictItemLevel: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1CatalogItemLevelConfig](x: Self) {
    
    inline def setEventItemLevel(value: String): Self = StObject.set(x, "eventItemLevel", value.asInstanceOf[js.Any])
    
    inline def setEventItemLevelNull: Self = StObject.set(x, "eventItemLevel", null)
    
    inline def setEventItemLevelUndefined: Self = StObject.set(x, "eventItemLevel", js.undefined)
    
    inline def setPredictItemLevel(value: String): Self = StObject.set(x, "predictItemLevel", value.asInstanceOf[js.Any])
    
    inline def setPredictItemLevelNull: Self = StObject.set(x, "predictItemLevel", null)
    
    inline def setPredictItemLevelUndefined: Self = StObject.set(x, "predictItemLevel", js.undefined)
  }
}
