package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaPriceInfoPriceRange extends StObject {
  
  /**
    * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
    */
  var originalPrice: js.UndefOr[SchemaGoogleCloudRetailV2betaInterval] = js.undefined
  
  /**
    * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
    */
  var price: js.UndefOr[SchemaGoogleCloudRetailV2betaInterval] = js.undefined
}
object SchemaGoogleCloudRetailV2betaPriceInfoPriceRange {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaPriceInfoPriceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaPriceInfoPriceRange]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaPriceInfoPriceRange](x: Self) {
    
    inline def setOriginalPrice(value: SchemaGoogleCloudRetailV2betaInterval): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
    
    inline def setPrice(value: SchemaGoogleCloudRetailV2betaInterval): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
