package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCompaniesJobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Required.  The resource name of the company that owns the jobs to be
    * listed, such as, "companies/0000aaaa-1111-bbbb-2222-cccc3333dddd".
    */
  var companyName: js.UndefOr[String] = js.native
  /**
    * Optional.  If set to `true`, only job ID, job requisition ID and language
    * code will be returned.  A typical use is to synchronize job repositories.
    * Defaults to false.
    */
  var idsOnly: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated. Please DO NOT use this field except for small companies.
    * Suggest counting jobs page by page instead.  Optional.  Set to true if
    * the total number of open jobs is to be returned.  Defaults to false.
    */
  var includeJobsCount: js.UndefOr[Boolean] = js.native
  /**
    * Optional.  The requisition ID, also known as posting ID, assigned by the
    * company to the job.  The maximum number of allowable characters is 225.
    */
  var jobRequisitionId: js.UndefOr[String] = js.native
  /**
    * Optional.  The maximum number of jobs to be returned per page of results.
    * If ids_only is set to true, the maximum allowed page size is 1000.
    * Otherwise, the maximum allowed page size is 100.  Default is 100 if empty
    * or a number < 1 is specified.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * Optional.  The starting point of a query result.
    */
  var pageToken: js.UndefOr[String] = js.native
}

