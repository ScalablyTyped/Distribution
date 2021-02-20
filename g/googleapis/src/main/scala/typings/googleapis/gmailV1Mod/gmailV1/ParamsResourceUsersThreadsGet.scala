package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceUsersThreadsGet extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The format to return the messages in.
    */
  var format: js.UndefOr[String] = js.native
  
  /**
    * The ID of the thread to retrieve.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * When given and format is METADATA, only include headers specified.
    */
  var metadataHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.native
}
object ParamsResourceUsersThreadsGet {
  
  @scala.inline
  def apply(): ParamsResourceUsersThreadsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersThreadsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceUsersThreadsGetMutableBuilder[Self <: ParamsResourceUsersThreadsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMetadataHeaders(value: js.Array[String]): Self = StObject.set(x, "metadataHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataHeadersUndefined: Self = StObject.set(x, "metadataHeaders", js.undefined)
    
    @scala.inline
    def setMetadataHeadersVarargs(value: String*): Self = StObject.set(x, "metadataHeaders", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
