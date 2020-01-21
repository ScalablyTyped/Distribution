package typings.googleapis.jobsV2Mod.jobsV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceJobsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Deprecated. This field is not working anymore.  Optional.  If set to
    * true, this call waits for all processing steps to complete before the job
    * is cleaned up. Otherwise, the call returns while some steps are still
    * taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.native
  /**
    * Required.  The resource name of the job to be deleted, such as
    * "jobs/11111111".
    */
  var name: js.UndefOr[String] = js.native
}

