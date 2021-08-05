package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersMessagesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Include messages from SPAM and TRASH in the results.
    */
  var includeSpamTrash: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Only return messages with labels that match all of the specified label
    * IDs.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Maximum number of messages to return.
    */
  var maxResults: js.UndefOr[Double] = js.undefined
  
  /**
    * Page token to retrieve a specific page of results in the list.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Only return messages matching the specified query. Supports the same
    * query format as the Gmail search box. For example,
    * "from:someuser@example.com rfc822msgid:<somemsgid@example.com>
    * is:unread". Parameter cannot be used when accessing the api using the
    * gmail.metadata scope.
    */
  var q: js.UndefOr[String] = js.undefined
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersMessagesList {
  
  inline def apply(): ParamsResourceUsersMessagesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersMessagesList]
  }
  
  extension [Self <: ParamsResourceUsersMessagesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setIncludeSpamTrash(value: Boolean): Self = StObject.set(x, "includeSpamTrash", value.asInstanceOf[js.Any])
    
    inline def setIncludeSpamTrashUndefined: Self = StObject.set(x, "includeSpamTrash", js.undefined)
    
    inline def setLabelIds(value: js.Array[String]): Self = StObject.set(x, "labelIds", value.asInstanceOf[js.Any])
    
    inline def setLabelIdsUndefined: Self = StObject.set(x, "labelIds", js.undefined)
    
    inline def setLabelIdsVarargs(value: String*): Self = StObject.set(x, "labelIds", js.Array(value :_*))
    
    inline def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
    
    inline def setQ(value: String): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
