package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceActivitiesGet extends StandardParameters {
  /**
    * The ID of the activity to get.
    */
  var activityId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
}

object ParamsResourceActivitiesGet {
  @scala.inline
  def apply(): ParamsResourceActivitiesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceActivitiesGet]
  }
  @scala.inline
  implicit class ParamsResourceActivitiesGetOps[Self <: ParamsResourceActivitiesGet] (val x: Self) extends AnyVal {
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
    def setActivityId(value: String): Self = this.set("activityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActivityId: Self = this.set("activityId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
  }
  
}

