package typings.googleapis.websecurityscannerV1betaMod.websecurityscannerV1beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for the `ListScanRuns` method.
  */
@js.native
trait SchemaListScanRunsResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of ScanRuns returned.
    */
  var scanRuns: js.UndefOr[js.Array[SchemaScanRun]] = js.native
}

object SchemaListScanRunsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, scanRuns: js.Array[SchemaScanRun] = null): SchemaListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (scanRuns != null) __obj.updateDynamic("scanRuns")(scanRuns.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListScanRunsResponse]
  }
}

