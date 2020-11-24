package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTurnbasedmatchesSync extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * True if match data should be returned in the response. Note that not all
    * data will necessarily be returned if include_match_data is true; the
    * server may decide to only return data for some of the matches to limit
    * download size for the client. The remainder of the data for these matches
    * will be retrievable on request.
    */
  var includeMatchData: js.UndefOr[Boolean] = js.native
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of completed or canceled matches to return in the
    * response. If not set, all matches returned could be completed or
    * canceled.
    */
  var maxCompletedMatches: js.UndefOr[Double] = js.native
  
  /**
    * The maximum number of matches to return in the response, used for paging.
    * For any response, the actual number of matches to return may be less than
    * the specified maxResults.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object ParamsResourceTurnbasedmatchesSync {
  
  @scala.inline
  def apply(): ParamsResourceTurnbasedmatchesSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesSync]
  }
  
  @scala.inline
  implicit class ParamsResourceTurnbasedmatchesSyncOps[Self <: ParamsResourceTurnbasedmatchesSync] (val x: Self) extends AnyVal {
    
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
    def setIncludeMatchData(value: Boolean): Self = this.set("includeMatchData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeMatchData: Self = this.set("includeMatchData", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMaxCompletedMatches(value: Double): Self = this.set("maxCompletedMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCompletedMatches: Self = this.set("maxCompletedMatches", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
  }
}
