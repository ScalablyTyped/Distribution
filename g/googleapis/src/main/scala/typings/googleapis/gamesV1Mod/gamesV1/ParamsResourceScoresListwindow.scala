package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceScoresListwindow
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The collection of scores you're requesting.
    */
  var collection: js.UndefOr[String] = js.undefined
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of leaderboard scores to return in the response. For
    * any response, the actual number of leaderboard scores returned may be
    * less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * The preferred number of scores to return above the player's score. More
    * scores may be returned if the player is at the bottom of the leaderboard;
    * fewer may be returned if the player is at the top. Must be less than or
    * equal to maxResults.
    */
  var resultsAbove: js.UndefOr[Double] = js.undefined
  
  /**
    * True if the top scores should be returned when the player is not in the
    * leaderboard. Defaults to true.
    */
  var returnTopIfAbsent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The time span for the scores and ranks you're requesting.
    */
  var timeSpan: js.UndefOr[String] = js.undefined
}
object ParamsResourceScoresListwindow {
  
  @scala.inline
  def apply(): ParamsResourceScoresListwindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresListwindow]
  }
  
  @scala.inline
  implicit class ParamsResourceScoresListwindowMutableBuilder[Self <: ParamsResourceScoresListwindow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionUndefined: Self = StObject.set(x, "collection", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLeaderboardId(value: String): Self = StObject.set(x, "leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaderboardIdUndefined: Self = StObject.set(x, "leaderboardId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setResultsAbove(value: Double): Self = StObject.set(x, "resultsAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsAboveUndefined: Self = StObject.set(x, "resultsAbove", js.undefined)
    
    @scala.inline
    def setReturnTopIfAbsent(value: Boolean): Self = StObject.set(x, "returnTopIfAbsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTopIfAbsentUndefined: Self = StObject.set(x, "returnTopIfAbsent", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: String): Self = StObject.set(x, "timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSpanUndefined: Self = StObject.set(x, "timeSpan", js.undefined)
  }
}
