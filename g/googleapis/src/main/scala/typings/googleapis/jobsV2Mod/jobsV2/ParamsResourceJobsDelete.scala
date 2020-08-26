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

object ParamsResourceJobsDelete {
  @scala.inline
  def apply(): ParamsResourceJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceJobsDelete]
  }
  @scala.inline
  implicit class ParamsResourceJobsDeleteOps[Self <: ParamsResourceJobsDelete] (val x: Self) extends AnyVal {
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
    def setDisableFastProcess(value: Boolean): Self = this.set("disableFastProcess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFastProcess: Self = this.set("disableFastProcess", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

