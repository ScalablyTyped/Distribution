package typings.googleapis.retailV2betaMod.retailV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2betaProductInlineSource extends StObject {
  
  /**
    * Required. A list of products to update/create. Each product must have a valid Product.id. Recommended max of 100 items.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2betaProduct]] = js.undefined
}
object SchemaGoogleCloudRetailV2betaProductInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2betaProductInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2betaProductInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2betaProductInlineSource](x: Self) {
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudRetailV2betaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudRetailV2betaProduct*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
