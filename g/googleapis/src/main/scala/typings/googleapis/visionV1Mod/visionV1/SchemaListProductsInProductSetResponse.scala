package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListProductsInProductSet` method.
  */
@js.native
trait SchemaListProductsInProductSetResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of Products.
    */
  var products: js.UndefOr[js.Array[SchemaProduct]] = js.native
}

object SchemaListProductsInProductSetResponse {
  @scala.inline
  def apply(nextPageToken: String = null, products: js.Array[SchemaProduct] = null): SchemaListProductsInProductSetResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (products != null) __obj.updateDynamic("products")(products.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListProductsInProductSetResponse]
  }
}

