package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all details associated with a given filtered
  * bid reason.
  */
@js.native
trait SchemaListCreativeStatusBreakdownByDetailResponse extends js.Object {
  /**
    * The type of detail that the detail IDs represent.
    */
  var detailType: js.UndefOr[String] = js.native
  /**
    * List of rows, with counts of bids with a given creative status aggregated
    * by detail.
    */
  var filteredBidDetailRows: js.UndefOr[js.Array[SchemaFilteredBidDetailRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListCreativeStatusBreakdownByDetailRequest.pageToken field in the
    * subsequent call to the filteredBids.details.list method to retrieve the
    * next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListCreativeStatusBreakdownByDetailResponse {
  @scala.inline
  def apply(
    detailType: String = null,
    filteredBidDetailRows: js.Array[SchemaFilteredBidDetailRow] = null,
    nextPageToken: String = null
  ): SchemaListCreativeStatusBreakdownByDetailResponse = {
    val __obj = js.Dynamic.literal()
    if (detailType != null) __obj.updateDynamic("detailType")(detailType.asInstanceOf[js.Any])
    if (filteredBidDetailRows != null) __obj.updateDynamic("filteredBidDetailRows")(filteredBidDetailRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListCreativeStatusBreakdownByDetailResponse]
  }
}

