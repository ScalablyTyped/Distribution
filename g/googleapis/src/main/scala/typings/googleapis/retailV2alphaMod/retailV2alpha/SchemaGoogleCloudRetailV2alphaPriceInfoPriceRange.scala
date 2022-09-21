package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaPriceInfoPriceRange extends StObject {
  
  /**
    * The inclusive Product.pricing_info.original_price internal of all variant Product having the same Product.primary_product_id.
    */
  var originalPrice: js.UndefOr[SchemaGoogleCloudRetailV2alphaInterval] = js.undefined
  
  /**
    * The inclusive Product.pricing_info.price interval of all variant Product having the same Product.primary_product_id.
    */
  var price: js.UndefOr[SchemaGoogleCloudRetailV2alphaInterval] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaPriceInfoPriceRange {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaPriceInfoPriceRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaPriceInfoPriceRange]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaPriceInfoPriceRange](x: Self) {
    
    inline def setOriginalPrice(value: SchemaGoogleCloudRetailV2alphaInterval): Self = StObject.set(x, "originalPrice", value.asInstanceOf[js.Any])
    
    inline def setOriginalPriceUndefined: Self = StObject.set(x, "originalPrice", js.undefined)
    
    inline def setPrice(value: SchemaGoogleCloudRetailV2alphaInterval): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
