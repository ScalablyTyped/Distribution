package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagementUnsampledreportsDelete extends StandardParameters {
  /**
    * Account ID to delete the unsampled report for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * View (Profile) ID to delete the unsampled report for.
    */
  var profileId: js.UndefOr[String] = js.native
  /**
    * ID of the unsampled report to be deleted.
    */
  var unsampledReportId: js.UndefOr[String] = js.native
  /**
    * Web property ID to delete the unsampled reports for.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object ParamsResourceManagementUnsampledreportsDelete {
  @scala.inline
  def apply(): ParamsResourceManagementUnsampledreportsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUnsampledreportsDelete]
  }
  @scala.inline
  implicit class ParamsResourceManagementUnsampledreportsDeleteOps[Self <: ParamsResourceManagementUnsampledreportsDelete] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setProfileId(value: String): Self = this.set("profileId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileId: Self = this.set("profileId", js.undefined)
    @scala.inline
    def setUnsampledReportId(value: String): Self = this.set("unsampledReportId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnsampledReportId: Self = this.set("unsampledReportId", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

