package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bids were filtered from the
  * auction.
  */
@js.native
trait SchemaListFilteredBidsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bids aggregated by filtering reason
    * (i.e. creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[SchemaCreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidsRequest.pageToken field in the subsequent call to the
    * filteredBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFilteredBidsResponse {
  @scala.inline
  def apply(creativeStatusRows: js.Array[SchemaCreativeStatusRow] = null, nextPageToken: String = null): SchemaListFilteredBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeStatusRows != null) __obj.updateDynamic("creativeStatusRows")(creativeStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFilteredBidsResponse]
  }
}

