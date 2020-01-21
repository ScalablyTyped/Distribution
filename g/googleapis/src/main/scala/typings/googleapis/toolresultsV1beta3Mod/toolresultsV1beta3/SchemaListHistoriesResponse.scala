package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for HistoryService.List
  */
@js.native
trait SchemaListHistoriesResponse extends js.Object {
  /**
    * Histories.
    */
  var histories: js.UndefOr[js.Array[SchemaHistory]] = js.native
  /**
    * A continuation token to resume the query at the next item.  Will only be
    * set if there are more histories to fetch.  Tokens are valid for up to one
    * hour from the time of the first list request. For instance, if you make a
    * list request at 1PM and use the token from this first request 10 minutes
    * later, the token from this second response will only be valid for 50
    * minutes.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListHistoriesResponse {
  @scala.inline
  def apply(histories: js.Array[SchemaHistory] = null, nextPageToken: String = null): SchemaListHistoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (histories != null) __obj.updateDynamic("histories")(histories.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListHistoriesResponse]
  }
}

