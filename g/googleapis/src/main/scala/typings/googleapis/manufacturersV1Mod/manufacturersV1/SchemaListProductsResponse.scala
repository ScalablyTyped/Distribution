package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaListProductsResponse extends js.Object {
  /**
    * The token for the retrieval of the next page of product statuses.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of the products.
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

