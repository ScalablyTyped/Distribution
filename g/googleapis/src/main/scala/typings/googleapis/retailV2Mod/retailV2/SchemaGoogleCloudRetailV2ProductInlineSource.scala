package typings.googleapis.retailV2Mod.retailV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRetailV2ProductInlineSource extends StObject {
  
  /**
    * Required. A list of products to update/create. Each product must have a valid Product.id. Recommended max of 100 items.
    */
  var products: js.UndefOr[js.Array[SchemaGoogleCloudRetailV2Product]] = js.undefined
}
object SchemaGoogleCloudRetailV2ProductInlineSource {
  
  inline def apply(): SchemaGoogleCloudRetailV2ProductInlineSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRetailV2ProductInlineSource]
  }
  
  extension [Self <: SchemaGoogleCloudRetailV2ProductInlineSource](x: Self) {
    
    inline def setProducts(value: js.Array[SchemaGoogleCloudRetailV2Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaGoogleCloudRetailV2Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
