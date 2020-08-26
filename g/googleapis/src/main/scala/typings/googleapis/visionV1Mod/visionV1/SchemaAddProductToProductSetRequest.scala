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
  def apply(): SchemaAddProductToProductSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddProductToProductSetRequest]
  }
  @scala.inline
  implicit class SchemaAddProductToProductSetRequestOps[Self <: SchemaAddProductToProductSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
  }
  
}

