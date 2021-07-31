package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersHistoryList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * History types to be returned by the function
    */
  var historyTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Only return messages with a label matching the ID.
    */
  var labelId: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of history records to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Returns history records after the specified startHistoryId. The
    * supplied startHistoryId should be obtained from the historyId of a
    * message, thread, or previous list response. History IDs increase
    * chronologically but are not contiguous with random gaps in between valid
    * IDs. Supplying an invalid or out of date startHistoryId typically returns
    * an HTTP 404 error code. A historyId is typically valid for at least a
    * week, but in some rare circumstances may be valid for only a few hours.
    * If you receive an HTTP 404 error response, your application should
    * perform a full sync. If you receive no nextPageToken in the response,
    * there are no updates to retrieve and you can store the returned historyId
    * for a future request.
    */
  var startHistoryId: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersHistoryList {
  
  @scala.inline
  def apply(): ParamsResourceUsersHistoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersHistoryList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersHistoryListMutableBuilder[Self <: ParamsResourceUsersHistoryList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setHistoryTypes(value: js.Array[String]): Self = StObject.set(x, "historyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoryTypesUndefined: Self = StObject.set(x, "historyTypes", js.undefined)
    
    @scala.inline
    def setHistoryTypesVarargs(value: String*): Self = StObject.set(x, "historyTypes", js.Array(value :_*))
    
    @scala.inline
    def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    @scala.inline
    def setStartHistoryId(value: String): Self = StObject.set(x, "startHistoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHistoryIdUndefined: Self = StObject.set(x, "startHistoryId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
