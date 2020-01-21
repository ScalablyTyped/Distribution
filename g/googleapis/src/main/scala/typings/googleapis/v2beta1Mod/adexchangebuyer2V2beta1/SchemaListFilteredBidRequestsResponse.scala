package typings.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for listing all reasons that bid requests were filtered
  * and not sent to the buyer.
  */
@js.native
trait SchemaListFilteredBidRequestsResponse extends js.Object {
  /**
    * List of rows, with counts of filtered bid requests aggregated by callout
    * status.
    */
  var calloutStatusRows: js.UndefOr[js.Array[SchemaCalloutStatusRow]] = js.native
  /**
    * A token to retrieve the next page of results. Pass this value in the
    * ListFilteredBidRequestsRequest.pageToken field in the subsequent call to
    * the filteredBidRequests.list method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListFilteredBidRequestsResponse {
  @scala.inline
  def apply(calloutStatusRows: js.Array[SchemaCalloutStatusRow] = null, nextPageToken: String = null): SchemaListFilteredBidRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (calloutStatusRows != null) __obj.updateDynamic("calloutStatusRows")(calloutStatusRows.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListFilteredBidRequestsResponse]
  }
}

