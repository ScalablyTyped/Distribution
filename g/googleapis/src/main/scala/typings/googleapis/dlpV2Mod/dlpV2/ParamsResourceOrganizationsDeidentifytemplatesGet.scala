package typings.googleapis.dlpV2Mod.dlpV2

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrganizationsDeidentifytemplatesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Resource name of the organization and deidentify template to be read, for
    * example `organizations/433245324/deidentifyTemplates/432452342` or
    * projects/project-id/deidentifyTemplates/432452342.
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceOrganizationsDeidentifytemplatesGet {
  @scala.inline
  def apply(): ParamsResourceOrganizationsDeidentifytemplatesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrganizationsDeidentifytemplatesGet]
  }
  @scala.inline
  implicit class ParamsResourceOrganizationsDeidentifytemplatesGetOps[Self <: ParamsResourceOrganizationsDeidentifytemplatesGet] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

