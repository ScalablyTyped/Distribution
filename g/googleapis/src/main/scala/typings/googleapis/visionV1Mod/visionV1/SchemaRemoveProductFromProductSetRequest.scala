package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for the `RemoveProductFromProductSet` method.
  */
@js.native
trait SchemaRemoveProductFromProductSetRequest extends StObject {
  
  /**
    * The resource name for the Product to be removed from this ProductSet.
    * Format is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.native
}
object SchemaRemoveProductFromProductSetRequest {
  
  @scala.inline
  def apply(): SchemaRemoveProductFromProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemoveProductFromProductSetRequest]
  }
  
  @scala.inline
  implicit class SchemaRemoveProductFromProductSetRequestMutableBuilder[Self <: SchemaRemoveProductFromProductSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
