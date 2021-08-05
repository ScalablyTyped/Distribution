package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScoresSubmit
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.undefined
  
  /**
    * The score you're submitting. The submitted score is ignored if it is
    * worse than a previously submitted score, where worse depends on the
    * leaderboard sort order. The meaning of the score value depends on the
    * leaderboard format type. For fixed-point, the score represents the raw
    * value. For time, the score represents elapsed time in milliseconds. For
    * currency, the score represents a value in micro units.
    */
  var score: js.UndefOr[String] = js.undefined
  
  /**
    * Additional information about the score you're submitting. Values must
    * contain no more than 64 URI-safe characters as defined by section 2.3 of
    * RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.undefined
}
object ParamsResourceScoresSubmit {
  
  inline def apply(): ParamsResourceScoresSubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresSubmit]
  }
  
  extension [Self <: ParamsResourceScoresSubmit](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    inline def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
    
    inline def setScore(value: String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreTag(value: String): Self = StObject.set(x, "scoreTag", value.asInstanceOf[js.Any])
    
    inline def setScoreTagUndefined: Self = StObject.set(x, "scoreTag", js.undefined)
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
