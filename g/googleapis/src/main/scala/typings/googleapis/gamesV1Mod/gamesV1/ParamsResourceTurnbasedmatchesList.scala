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
trait ParamsResourceTurnbasedmatchesList extends StandardParameters {
  
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
object ParamsResourceTurnbasedmatchesList {
  
  @scala.inline
  def apply(): ParamsResourceTurnbasedmatchesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesList]
  }
  
  @scala.inline
  implicit class ParamsResourceTurnbasedmatchesListMutableBuilder[Self <: ParamsResourceTurnbasedmatchesList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIncludeMatchData(value: Boolean): Self = StObject.set(x, "includeMatchData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeMatchDataUndefined: Self = StObject.set(x, "includeMatchData", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setMaxCompletedMatches(value: Double): Self = StObject.set(x, "maxCompletedMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCompletedMatchesUndefined: Self = StObject.set(x, "maxCompletedMatches", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
