package typings.googleapis.recommendationengineV1beta1Mod.recommendationengineV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice extends StObject {
  
  /**
    * Optional. Display price of the product.
    */
  var displayPrice: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Optional. Price of the product without any discount. If zero, by default set to be the 'displayPrice'.
    */
  var originalPrice: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice {
  
  inline def apply(): SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice]
  }
  
  extension [Self <: SchemaGoogleCloudRecommendationengineV1beta1ProductCatalogItemExactPrice](x: Self) {
    
    inline def setDisplayPrice(value: Double): Self = StObject.set(x, "displayPrice", value.asInstanceOf[js.Any])
    
    inline def setDisplayPriceNull: Self = StObject.set(x, "displayPrice", null)
    
    inline def setDisplayPriceUndefined: Self = StObject.set(x, "displayPrice", js.undefined)
    
    inline def setOriginalPrice(value: Double): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalPriceNull: Self = StObject.set(x, "originalPrice", null)
    
    inline def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
  }
}
