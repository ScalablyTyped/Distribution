package typings.googleapis.youtubereportingV1Mod.youtubereportingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response message for ReportingService.ListReportTypes.
  */
@js.native
trait SchemaListReportTypesResponse extends js.Object {
  /**
    * A token to retrieve next page of results. Pass this value in the
    * ListReportTypesRequest.page_token field in the subsequent call to
    * `ListReportTypes` method to retrieve the next page of results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of report types.
    */
  var reportTypes: js.UndefOr[js.Array[SchemaReportType]] = js.native
}

object SchemaListReportTypesResponse {
  @scala.inline
  def apply(nextPageToken: String = null, reportTypes: js.Array[SchemaReportType] = null): SchemaListReportTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (reportTypes != null) __obj.updateDynamic("reportTypes")(reportTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListReportTypesResponse]
  }
}

