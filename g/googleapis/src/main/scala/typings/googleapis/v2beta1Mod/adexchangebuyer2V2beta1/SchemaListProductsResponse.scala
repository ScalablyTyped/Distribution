package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing products visible to the buyer.
  */
@js.native
trait SchemaListProductsResponse extends js.Object {
  /**
    * List pagination support.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of matching products at their head revision number.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.native
}

object SchemaListProductsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, products: js.Array[SchemaProduct] = null): SchemaListProductsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListProductsResponse]
  }
}

