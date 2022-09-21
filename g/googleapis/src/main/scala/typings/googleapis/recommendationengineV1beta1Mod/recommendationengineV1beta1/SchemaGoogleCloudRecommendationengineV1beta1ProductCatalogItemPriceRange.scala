package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange extends StObject {
  
  /**
    * Required. The maximum product price.
    */
  var max: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The minimum product price.
    */
  var min: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemPriceRange](x: Self) {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinNull: Self = StObject.set(x, "min", null)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
