package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to list.
  */
@js.native
trait SchemaListUserAssetsResponse extends js.Object {
  /**
    * The continuation token for retrieving the next page. If empty, indicates
    * that there are no more pages. To get the next page, submit the same
    * request specifying this value as the page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The total number of assets in the list, without pagination.
    */
  var totalSize: js.UndefOr[Double] = js.native
  /**
    * A list of UserAssets matching the request.
    */
  var userAssets: js.UndefOr[js.Array[SchemaUserAsset]] = js.native
}

object SchemaListUserAssetsResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    totalSize: js.UndefOr[Double] = js.undefined,
    userAssets: js.Array[SchemaUserAsset] = null
  ): SchemaListUserAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    if (userAssets != null) __obj.updateDynamic("userAssets")(userAssets.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListUserAssetsResponse]
  }
}

