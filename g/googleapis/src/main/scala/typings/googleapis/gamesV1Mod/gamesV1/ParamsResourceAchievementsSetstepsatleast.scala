package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceAchievementsSetstepsatleast extends StandardParameters {
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The minimum value to set the steps to.
    */
  var steps: js.UndefOr[Double] = js.native
}

object ParamsResourceAchievementsSetstepsatleast {
  @scala.inline
  def apply(): ParamsResourceAchievementsSetstepsatleast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsSetstepsatleast]
  }
  @scala.inline
  implicit class ParamsResourceAchievementsSetstepsatleastOps[Self <: ParamsResourceAchievementsSetstepsatleast] (val x: Self) extends AnyVal {
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
    def setSteps(value: Double): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
  
}

