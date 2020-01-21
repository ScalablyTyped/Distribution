package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for the `AddProductToProductSet` method.
  */
@js.native
trait SchemaAddProductToProductSetRequest extends js.Object {
  /**
    * The resource name for the Product to be added to this ProductSet.  Format
    * is: `projects/PROJECT_ID/locations/LOC_ID/products/PRODUCT_ID`
    */
  var product: js.UndefOr[String] = js.native
}

object SchemaAddProductToProductSetRequest {
  @scala.inline
  def apply(product: String = null): SchemaAddProductToProductSetRequest = {
    val __obj = js.Dynamic.literal()
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAddProductToProductSetRequest]
  }
}

