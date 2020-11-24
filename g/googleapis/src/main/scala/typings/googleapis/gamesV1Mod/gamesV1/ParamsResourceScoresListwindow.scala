package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceScoresListwindow extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The collection of scores you're requesting.
    */
  var collection: js.UndefOr[String] = js.native
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of leaderboard scores to return in the response. For
    * any response, the actual number of leaderboard scores returned may be
    * less than the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  
  /**
    * The preferred number of scores to return above the player's score. More
    * scores may be returned if the player is at the bottom of the leaderboard;
    * fewer may be returned if the player is at the top. Must be less than or
    * equal to maxResults.
    */
  var resultsAbove: js.UndefOr[Double] = js.native
  
  /**
    * True if the top scores should be returned when the player is not in the
    * leaderboard. Defaults to true.
    */
  var returnTopIfAbsent: js.UndefOr[Boolean] = js.native
  
  /**
    * The time span for the scores and ranks you're requesting.
    */
  var timeSpan: js.UndefOr[String] = js.native
}
object ParamsResourceScoresListwindow {
  
  @scala.inline
  def apply(): ParamsResourceScoresListwindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresListwindow]
  }
  
  @scala.inline
  implicit class ParamsResourceScoresListwindowOps[Self <: ParamsResourceScoresListwindow] (val x: Self) extends AnyVal {
    
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
    def setCollection(value: String): Self = this.set("collection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLeaderboardId(value: String): Self = this.set("leaderboardId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeaderboardId: Self = this.set("leaderboardId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setResultsAbove(value: Double): Self = this.set("resultsAbove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultsAbove: Self = this.set("resultsAbove", js.undefined)
    
    @scala.inline
    def setReturnTopIfAbsent(value: Boolean): Self = this.set("returnTopIfAbsent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnTopIfAbsent: Self = this.set("returnTopIfAbsent", js.undefined)
    
    @scala.inline
    def setTimeSpan(value: String): Self = this.set("timeSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeSpan: Self = this.set("timeSpan", js.undefined)
  }
}
