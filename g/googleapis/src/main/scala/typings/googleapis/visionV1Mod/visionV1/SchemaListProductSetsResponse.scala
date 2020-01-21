package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for the `ListProductSets` method.
  */
@js.native
trait SchemaListProductSetsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * List of ProductSets.
    */
  var productSets: js.UndefOr[js.Array[SchemaProductSet]] = js.native
}

object SchemaListProductSetsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, productSets: js.Array[SchemaProductSet] = null): SchemaListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (productSets != null) __obj.updateDynamic("productSets")(productSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListProductSetsResponse]
  }
}

