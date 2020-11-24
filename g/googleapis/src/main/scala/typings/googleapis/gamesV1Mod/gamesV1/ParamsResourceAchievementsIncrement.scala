package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceAchievementsIncrement extends StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.native
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * A randomly generated numeric ID for each request specified by the caller.
    * This number is used at the server to ensure that the request is handled
    * correctly across retries.
    */
  var requestId: js.UndefOr[String] = js.native
  
  /**
    * The number of steps to increment.
    */
  var stepsToIncrement: js.UndefOr[Double] = js.native
}
object ParamsResourceAchievementsIncrement {
  
  @scala.inline
  def apply(): ParamsResourceAchievementsIncrement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsIncrement]
  }
  
  @scala.inline
  implicit class ParamsResourceAchievementsIncrementOps[Self <: ParamsResourceAchievementsIncrement] (val x: Self) extends AnyVal {
    
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
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
    
    @scala.inline
    def setStepsToIncrement(value: Double): Self = this.set("stepsToIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepsToIncrement: Self = this.set("stepsToIncrement", js.undefined)
  }
}
