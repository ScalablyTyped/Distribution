package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `RemoveProductFromProductSet` method.
  */
trait SchemaRemoveProductFromProductSetRequest extends StObject {
  
  /**
    * The resource name for the Product to be removed from this ProductSet.
    * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.undefined
}
object SchemaRemoveProductFromProductSetRequest {
  
  inline def apply(): SchemaRemoveProductFromProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveProductFromProductSetRequest]
  }
  
  extension [Self <: SchemaRemoveProductFromProductSetRequest](x: Self) {
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
