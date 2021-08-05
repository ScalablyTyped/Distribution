package typings.googleapis.v1Dot4Mod.adsenseV14

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAccountsSavedadstylesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account for which to get the saved ad style.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Saved ad style to retrieve.
    */
  var savedAdStyleId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAccountsSavedadstylesGet {
  
  inline def apply(): ParamsResourceAccountsSavedadstylesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAccountsSavedadstylesGet]
  }
  
  extension [Self <: ParamsResourceAccountsSavedadstylesGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setSavedAdStyleId(value: String): Self = StObject.set(x, "savedAdStyleId", value.asInstanceOf[js.Any])
    
    inline def setSavedAdStyleIdUndefined: Self = StObject.set(x, "savedAdStyleId", js.undefined)
  }
}
