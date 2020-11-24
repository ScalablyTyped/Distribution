package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersHistoryList extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * History types to be returned by the function
    */
  var historyTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Only return messages with a label matching the ID.
    */
  var labelId: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of history records to return.
    */
  var maxResults: js.UndefOr[Double] = js.native
  
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.native
  
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
  var startHistoryId: js.UndefOr[String] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersHistoryList {
  
  @scala.inline
  def apply(): ParamsResourceUsersHistoryList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersHistoryList]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersHistoryListOps[Self <: ParamsResourceUsersHistoryList] (val x: Self) extends AnyVal {
    
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
    def setHistoryTypesVarargs(value: String*): Self = this.set("historyTypes", js.Array(value :_*))
    
    @scala.inline
    def setHistoryTypes(value: js.Array[String]): Self = this.set("historyTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryTypes: Self = this.set("historyTypes", js.undefined)
    
    @scala.inline
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelId: Self = this.set("labelId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    
    @scala.inline
    def setStartHistoryId(value: String): Self = this.set("startHistoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartHistoryId: Self = this.set("startHistoryId", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
