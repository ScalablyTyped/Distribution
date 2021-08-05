package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsUnlock
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Override used only by built-in games in Play Games application.
    */
  var builtinGameId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAchievementsUnlock {
  
  inline def apply(): ParamsResourceAchievementsUnlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsUnlock]
  }
  
  extension [Self <: ParamsResourceAchievementsUnlock](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setBuiltinGameId(value: String): Self = StObject.set(x, "builtinGameId", value.asInstanceOf[js.Any])
    
    inline def setBuiltinGameIdUndefined: Self = StObject.set(x, "builtinGameId", js.undefined)
  }
}
