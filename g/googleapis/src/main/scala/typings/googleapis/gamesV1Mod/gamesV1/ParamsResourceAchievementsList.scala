package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsList
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
    * The maximum number of achievement resources to return in the response,
    * used for paging. For any response, the actual number of achievement
    * resources returned may be less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A player ID. A value of me may be used in place of the authenticated
    * player's ID.
    */
  var playerId: js.UndefOr[String] = js.undefined
  
  /**
    * Tells the server to return only achievements with the specified state. If
    * this parameter isn't specified, all achievements are returned.
    */
  var state: js.UndefOr[String] = js.undefined
}
object ParamsResourceAchievementsList {
  
  @scala.inline
  def apply(): ParamsResourceAchievementsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsList]
  }
  
  @scala.inline
  implicit class ParamsResourceAchievementsListMutableBuilder[Self <: ParamsResourceAchievementsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
