package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReports.
  */
@js.native
trait SchemaListReportsResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportsRequest.page_token field in the subsequent call to
    * `ListReports` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reports: js.UndefOr[js.Array[SchemaReport]] = js.native
}

object SchemaListReportsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, reports: js.Array[SchemaReport] = null): SchemaListReportsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (reports != null) __obj.updateDynamic("reports")(reports.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListReportsResponse]
  }
}

