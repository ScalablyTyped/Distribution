package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAddProductToProductSetRequest extends StObject {
  
  /**
    * Required. The resource name for the Product to be added to this ProductSet. Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String | Null] = js.undefined
}
object SchemaAddProductToProductSetRequest {
  
  inline def apply(): SchemaAddProductToProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProductToProductSetRequest]
  }
  
  extension [Self <: SchemaAddProductToProductSetRequest](x: Self) {
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductNull: Self = StObject.set(x, "product", null)
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
