package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `AddProductToProductSet` method.
  */
@js.native
trait SchemaAddProductToProductSetRequest extends StObject {
  
  /**
    * The resource name for the Product to be added to this ProductSet.  Format
    * is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.native
}
object SchemaAddProductToProductSetRequest {
  
  @scala.inline
  def apply(): SchemaAddProductToProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProductToProductSetRequest]
  }
  
  @scala.inline
  implicit class SchemaAddProductToProductSetRequestMutableBuilder[Self <: SchemaAddProductToProductSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
