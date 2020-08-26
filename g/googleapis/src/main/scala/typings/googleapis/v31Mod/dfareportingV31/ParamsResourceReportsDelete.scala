package typings.googleapis.v31Mod.dfareportingV31

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceReportsDelete extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The DFA user profile ID.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * The ID of the report.
    */
  var reportId: js.UndefOr[String] = js.native
}

object ParamsResourceReportsDelete {
  @scala.inline
  def apply(): ParamsResourceReportsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceReportsDelete]
  }
  @scala.inline
  implicit class ParamsResourceReportsDeleteOps[Self <: ParamsResourceReportsDelete] (val x: Self) extends AnyVal {
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
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setReportId(value: String): Self = this.set("reportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReportId: Self = this.set("reportId", js.undefined)
  }
  
}

