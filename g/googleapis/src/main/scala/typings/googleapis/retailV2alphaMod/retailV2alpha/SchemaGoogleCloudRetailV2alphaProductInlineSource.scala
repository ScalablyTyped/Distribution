package typings.googleapis.retailV2alphaMod.retailV2alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2alphaProductInlineSource extends StObject {
  
  /**
    * Required. A list of products to update/create. Each product must have a valid Product.id. Recommended max of 100 items.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2alphaProduct]] = js.undefined
}
object SchemaGoogleCloudRetailV2alphaProductInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2alphaProductInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2alphaProductInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2alphaProductInlineSource](x: Self) {
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudRetailV2alphaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudRetailV2alphaProduct*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
