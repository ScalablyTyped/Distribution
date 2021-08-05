package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementFiltersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve filters for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Filter ID to retrieve filters for.
    */
  var filterId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementFiltersGet {
  
  inline def apply(): ParamsResourceManagementFiltersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementFiltersGet]
  }
  
  extension [Self <: ParamsResourceManagementFiltersGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setFilterId(value: String): Self = StObject.set(x, "filterId", value.asInstanceOf[js.Any])
    
    inline def setFilterIdUndefined: Self = StObject.set(x, "filterId", js.undefined)
  }
}
