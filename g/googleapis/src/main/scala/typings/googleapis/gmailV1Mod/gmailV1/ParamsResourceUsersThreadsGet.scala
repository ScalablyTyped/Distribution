package typings.googleapis.gmailV1Mod.gmailV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceUsersThreadsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The format to return the messages in.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the thread to retrieve.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * When given and format is METADATA, only include headers specified.
    */
  var metadataHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The user's email address. The special value me can be used to indicate
    * the authenticated user.
    */
  var userId: js.UndefOr[String] = js.undefined
}
object ParamsResourceUsersThreadsGet {
  
  inline def apply(): ParamsResourceUsersThreadsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceUsersThreadsGet]
  }
  
  extension [Self <: ParamsResourceUsersThreadsGet](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMetadataHeaders(value: js.Array[String]): Self = StObject.set(x, "metadataHeaders", value.asInstanceOf[js.Any])
    
    inline def setMetadataHeadersUndefined: Self = StObject.set(x, "metadataHeaders", js.undefined)
    
    inline def setMetadataHeadersVarargs(value: String*): Self = StObject.set(x, "metadataHeaders", js.Array(value :_*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
