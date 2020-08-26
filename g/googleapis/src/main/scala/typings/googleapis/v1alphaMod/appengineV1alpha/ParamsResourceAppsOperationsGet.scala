package typings.googleapis.v1alphaMod.appengineV1alpha

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAppsOperationsGet extends StandardParameters {
  /**
    * Part of `name`. The name of the operation resource.
    */
  var appsId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var operationsId: js.UndefOr[String] = js.native
}

object ParamsResourceAppsOperationsGet {
  @scala.inline
  def apply(): ParamsResourceAppsOperationsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsOperationsGet]
  }
  @scala.inline
  implicit class ParamsResourceAppsOperationsGetOps[Self <: ParamsResourceAppsOperationsGet] (val x: Self) extends AnyVal {
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
    def setOperationsId(value: String): Self = this.set("operationsId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationsId: Self = this.set("operationsId", js.undefined)
  }
  
}

