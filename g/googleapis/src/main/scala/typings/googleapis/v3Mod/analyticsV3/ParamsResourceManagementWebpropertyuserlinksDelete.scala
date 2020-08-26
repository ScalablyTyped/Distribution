package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceManagementWebpropertyuserlinksDelete extends StandardParameters {
  /**
    * Account ID to delete the user link for.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Link ID to delete the user link for.
    */
  var linkId: js.UndefOr[String] = js.native
  /**
    * Web Property ID to delete the user link for.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object ParamsResourceManagementWebpropertyuserlinksDelete {
  @scala.inline
  def apply(): ParamsResourceManagementWebpropertyuserlinksDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementWebpropertyuserlinksDelete]
  }
  @scala.inline
  implicit class ParamsResourceManagementWebpropertyuserlinksDeleteOps[Self <: ParamsResourceManagementWebpropertyuserlinksDelete] (val x: Self) extends AnyVal {
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
    def setLinkId(value: String): Self = this.set("linkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkId: Self = this.set("linkId", js.undefined)
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
  
}

