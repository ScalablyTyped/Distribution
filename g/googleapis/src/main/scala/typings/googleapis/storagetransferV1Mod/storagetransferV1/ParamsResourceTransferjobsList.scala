package typings.googleapis.storagetransferV1Mod.storagetransferV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceTransferjobsList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * A list of query parameters specified as JSON text in the form of
    * {"project_id":"my_project_id", "job_names":["jobid1","jobid2",...],
    * "job_statuses":["status1","status2",...]}. Since `job_names` and
    * `job_statuses` support multiple values, their values must be specified
    * with array notation. `project_id` is required. `job_names` and
    * `job_statuses` are optional.  The valid values for `job_statuses` are
    * case-insensitive: `ENABLED`, `DISABLED`, and `DELETED`.
    */
  var filter: js.UndefOr[String] = js.native
  /**
    * The list page size. The max allowed value is 256.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * The list page token.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceTransferjobsList {
  @scala.inline
  def apply(): ParamsResourceTransferjobsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTransferjobsList]
  }
  @scala.inline
  implicit class ParamsResourceTransferjobsListOps[Self <: ParamsResourceTransferjobsList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setFilter(value: String): Self = this.set("filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setPageSize(value: Double): Self = this.set("pageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSize: Self = this.set("pageSize", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
  
}

