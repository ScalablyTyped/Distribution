package typings.googleapis.v1managementMod.gamesManagementV1management

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScoresResetforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.undefined
}
object ParamsResourceScoresResetforallplayers {
  
  inline def apply(): ParamsResourceScoresResetforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresResetforallplayers]
  }
  
  extension [Self <: ParamsResourceScoresResetforallplayers](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    inline def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
  }
}
