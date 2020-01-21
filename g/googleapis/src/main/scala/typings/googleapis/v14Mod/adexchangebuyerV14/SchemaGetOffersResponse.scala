package typings.googleapis.v14Mod.adexchangebuyerV14

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaGetOffersResponse extends js.Object {
  /**
    * The returned list of products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.native
}

object SchemaGetOffersResponse {
  @scala.inline
  def apply(products: js.Array[SchemaProduct] = null): SchemaGetOffersResponse = {
    val __obj = js.Dynamic.literal()
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetOffersResponse]
  }
}

