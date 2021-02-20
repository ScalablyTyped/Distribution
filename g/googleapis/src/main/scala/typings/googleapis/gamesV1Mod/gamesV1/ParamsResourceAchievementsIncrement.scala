package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
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
  implicit class ParamsResourceAchievementsIncrementMutableBuilder[Self <: ParamsResourceAchievementsIncrement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    @scala.inline
    def setStepsToIncrement(value: Double): Self = StObject.set(x, "stepsToIncrement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsToIncrementUndefined: Self = StObject.set(x, "stepsToIncrement", js.undefined)
  }
}
