package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsLocationsGet extends StandardParameters {
  /**
    * Part of `name`. Resource name for the location.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var locationsId: js.UndefOr[String] = js.native
}

object ParamsResourceAppsLocationsGet {
  @scala.inline
  def apply(): ParamsResourceAppsLocationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsLocationsGet]
  }
  @scala.inline
  implicit class ParamsResourceAppsLocationsGetOps[Self <: ParamsResourceAppsLocationsGet] (val x: Self) extends AnyVal {
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
    def setAppsId(value: String): Self = this.set("appsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppsId: Self = this.set("appsId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setLocationsId(value: String): Self = this.set("locationsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationsId: Self = this.set("locationsId", js.undefined)
  }
  
}

