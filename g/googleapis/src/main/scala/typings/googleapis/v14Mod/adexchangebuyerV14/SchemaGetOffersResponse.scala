package typings.googleapis.v14Mod.adexchangebuyerV14

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetOffersResponse extends StObject {
  
  /**
    * The returned list of products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.undefined
}
object SchemaGetOffersResponse {
  
  inline def apply(): SchemaGetOffersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetOffersResponse]
  }
  
  extension [Self <: SchemaGetOffersResponse](x: Self) {
    
    inline def setProducts(value: js.Array[SchemaProduct]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: SchemaProduct*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
