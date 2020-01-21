package typings.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from ListTransferJobs.
  */
@js.native
trait SchemaListTransferJobsResponse extends js.Object {
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * A list of transfer jobs.
    */
  var transferJobs: js.UndefOr[js.Array[SchemaTransferJob]] = js.native
}

object SchemaListTransferJobsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, transferJobs: js.Array[SchemaTransferJob] = null): SchemaListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (transferJobs != null) __obj.updateDynamic("transferJobs")(transferJobs.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListTransferJobsResponse]
  }
}

