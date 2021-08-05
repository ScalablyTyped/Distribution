package typings.googleapis.directoryV1Mod.adminDirectoryV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVerificationcodesList
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Identifies the user in the API request. The value can be the user's
    * primary email address, alias email address, or unique user ID.
    */
  var userKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceVerificationcodesList {
  
  inline def apply(): ParamsResourceVerificationcodesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVerificationcodesList]
  }
  
  extension [Self <: ParamsResourceVerificationcodesList](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setUserKey(value: String): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    inline def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
