package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bids lost in the auction.
  */
@js.native
trait SchemaListLosingBidsResponse extends js.Object {
  /**
    * List of rows, with counts of losing bids aggregated by loss reason (i.e.
    * creative status).
    */
  var creativeStatusRows: js.UndefOr[js.Array[SchemaCreativeStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListLosingBidsRequest.pageToken field in the subsequent call to the
    * losingBids.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListLosingBidsResponse {
  @scala.inline
  def apply(creativeStatusRows: js.Array[SchemaCreativeStatusRow] = null, nextPageToken: String = null): SchemaListLosingBidsResponse = {
    val __obj = js.Dynamic.literal()
    if (creativeStatusRows != null) __obj.updateDynamic("creativeStatusRows")(creativeStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListLosingBidsResponse]
  }
}

