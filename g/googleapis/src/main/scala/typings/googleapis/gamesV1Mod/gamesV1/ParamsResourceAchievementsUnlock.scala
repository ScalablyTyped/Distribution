package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAchievementsUnlock extends StandardParameters {
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Override used only by built-in games in Play Games application.
    */
  var builtinGameId: js.UndefOr[String] = js.native
}

object ParamsResourceAchievementsUnlock {
  @scala.inline
  def apply(): ParamsResourceAchievementsUnlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsUnlock]
  }
  @scala.inline
  implicit class ParamsResourceAchievementsUnlockOps[Self <: ParamsResourceAchievementsUnlock] (val x: Self) extends AnyVal {
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
    def setAchievementId(value: String): Self = this.set("achievementId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAchievementId: Self = this.set("achievementId", js.undefined)
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setBuiltinGameId(value: String): Self = this.set("builtinGameId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuiltinGameId: Self = this.set("builtinGameId", js.undefined)
  }
  
}

