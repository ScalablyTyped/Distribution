package typings.googleapis.dataprocV1Mod.dataprocV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of jobs in a project.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  /**
    * Output only. Jobs list.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  /**
    * Optional. This token is included in the response if there are more
    * results to fetch. To fetch additional results, provide this value as the
    * page_token in a subsequent &lt;code&gt;ListJobsRequest&lt;/code&gt;.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListJobsResponse {
  @scala.inline
  def apply(jobs: js.Array[SchemaJob] = null, nextPageToken: String = null): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (jobs != null) __obj.updateDynamic("jobs")(jobs.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
}

