package typings.googleapis.fitnessV1Mod.fitnessV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersSessionsList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * An RFC3339 timestamp. Only sessions ending between the start and end
    * times will be included in the response.
    */
  var endTime: js.UndefOr[String] = js.undefined
  
  /**
    * If true, deleted sessions will be returned. When set to true, sessions
    * returned in this response will only have an ID and will not have any
    * other fields.
    */
  var includeDeleted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The continuation token, which is used for incremental syncing. To get the
    * next batch of changes, set this parameter to the value of nextPageToken
    * from the previous response. This token is treated as a timestamp (in
    * millis since epoch). If specified, the API returns sessions modified
    * since this time. The page token is ignored if either start or end time is
    * specified. If none of start time, end time, and the page token is
    * specified, sessions modified in the last 30 days are returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * An RFC3339 timestamp. Only sessions ending between the start and end
    * times will be included in the response.
    */
  var startTime: js.UndefOr[String] = js.undefined
  
  /**
    * List sessions for the person identified. Use me to indicate the
    * authenticated user. Only me is supported at this time.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersSessionsList {
  
  @scala.inline
  def apply(): ParamsResourceUsersSessionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersSessionsList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersSessionsListMutableBuilder[Self <: ParamsResourceUsersSessionsList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setIncludeDeleted(value: Boolean): Self = StObject.set(x, "includeDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDeletedUndefined: Self = StObject.set(x, "includeDeleted", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
