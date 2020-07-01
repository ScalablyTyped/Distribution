package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Paging details for lists of resources, including total number of items
  * available and number of resources returned in a single page.
  */
@js.native
trait SchemaPageInfo extends js.Object {
  /**
    * The number of results included in the API response.
    */
  var resultsPerPage: js.UndefOr[Double] = js.native
  /**
    * The total number of results in the result set.
    */
  var totalResults: js.UndefOr[Double] = js.native
}

object SchemaPageInfo {
  @scala.inline
  def apply(resultsPerPage: js.UndefOr[Double] = js.undefined, totalResults: js.UndefOr[Double] = js.undefined): SchemaPageInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(resultsPerPage)) __obj.updateDynamic("resultsPerPage")(resultsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalResults)) __obj.updateDynamic("totalResults")(totalResults.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPageInfo]
  }
}

