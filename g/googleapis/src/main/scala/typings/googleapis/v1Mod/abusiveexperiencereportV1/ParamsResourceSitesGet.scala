package typings.googleapis.v1Mod.abusiveexperiencereportV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSitesGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The required site name. This is the site property whose abusive
    * experiences have been reviewed, and it must be URL-encoded. For example,
    * sites/https%3A%2F%2Fwww.google.com. The server will return an error of
    * BAD_REQUEST if this field is not filled in. Note that if the site
    * property is not yet verified in Search Console, the reportUrl field
    * returned by the API will lead to the verification page, prompting the
    * user to go through that process before they can gain access to the
    * Abusive Experience Report.
    */
  var name: js.UndefOr[String] = js.native
}

object ParamsResourceSitesGet {
  @scala.inline
  def apply(): ParamsResourceSitesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSitesGet]
  }
  @scala.inline
  implicit class ParamsResourceSitesGetOps[Self <: ParamsResourceSitesGet] (val x: Self) extends AnyVal {
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

