package typings.googleapis.v3p1beta1Mod.jobsV3p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Batch delete jobs request.
  */
@js.native
trait SchemaBatchDeleteJobsRequest extends js.Object {
  /**
    * Required.  The filter string specifies the jobs to be deleted.  Supported
    * operator: =, AND  The fields eligible for filtering are:  * `companyName`
    * (Required) * `requisitionId` (Required)  Sample Query: companyName =
    * &quot;projects/api-test-project/companies/123&quot; AND requisitionId =
    * &quot;req-1&quot;
    */
  var filter: js.UndefOr[String] = js.native
}

object SchemaBatchDeleteJobsRequest {
  @scala.inline
  def apply(filter: String = null): SchemaBatchDeleteJobsRequest = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaBatchDeleteJobsRequest]
  }
}

