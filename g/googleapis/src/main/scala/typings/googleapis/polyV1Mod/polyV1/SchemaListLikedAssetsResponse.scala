package typings.googleapis.polyV1Mod.polyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from a request to list.
  */
@js.native
trait SchemaListLikedAssetsResponse extends js.Object {
  /**
    * A list of assets that match the criteria specified in the request.
    */
  var assets: js.UndefOr[js.Array[SchemaAsset]] = js.native
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
}

object SchemaListLikedAssetsResponse {
  @scala.inline
  def apply(assets: js.Array[SchemaAsset] = null, nextPageToken: String = null, totalSize: Int | Double = null): SchemaListLikedAssetsResponse = {
    val __obj = js.Dynamic.literal()
    if (assets != null) __obj.updateDynamic("assets")(assets.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (totalSize != null) __obj.updateDynamic("totalSize")(totalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLikedAssetsResponse]
  }
}

