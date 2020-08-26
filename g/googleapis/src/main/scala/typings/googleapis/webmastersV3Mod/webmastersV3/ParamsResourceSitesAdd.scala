package typings.googleapis.webmastersV3Mod.webmastersV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesAdd extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The URL of the site to add.
    */
  var siteUrl: js.UndefOr[String] = js.native
}

object ParamsResourceSitesAdd {
  @scala.inline
  def apply(): ParamsResourceSitesAdd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesAdd]
  }
  @scala.inline
  implicit class ParamsResourceSitesAddOps[Self <: ParamsResourceSitesAdd] (val x: Self) extends AnyVal {
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
    def setSiteUrl(value: String): Self = this.set("siteUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiteUrl: Self = this.set("siteUrl", js.undefined)
  }
  
}

