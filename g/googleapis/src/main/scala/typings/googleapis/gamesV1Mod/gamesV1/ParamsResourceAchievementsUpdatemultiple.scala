package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAchievementsUpdatemultiple extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Override used only by built-in games in Play Games application.
    */
  var builtinGameId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAchievementUpdateMultipleRequest] = js.native
}

object ParamsResourceAchievementsUpdatemultiple {
  @scala.inline
  def apply(): ParamsResourceAchievementsUpdatemultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsUpdatemultiple]
  }
  @scala.inline
  implicit class ParamsResourceAchievementsUpdatemultipleOps[Self <: ParamsResourceAchievementsUpdatemultiple] (val x: Self) extends AnyVal {
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
    def setBuiltinGameId(value: String): Self = this.set("builtinGameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinGameId: Self = this.set("builtinGameId", js.undefined)
    @scala.inline
    def setRequestBody(value: SchemaAchievementUpdateMultipleRequest): Self = this.set("requestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestBody: Self = this.set("requestBody", js.undefined)
  }
  
}

