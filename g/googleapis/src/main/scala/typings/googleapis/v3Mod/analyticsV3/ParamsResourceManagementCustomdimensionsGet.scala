package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustomdimensionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID for the custom dimension to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the custom dimension to retrieve.
    */
  var customDimensionId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID for the custom dimension to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustomdimensionsGet {
  
  inline def apply(): ParamsResourceManagementCustomdimensionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustomdimensionsGet]
  }
  
  extension [Self <: ParamsResourceManagementCustomdimensionsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomDimensionId(value: String): Self = StObject.set(x, "customDimensionId", value.asInstanceOf[js.Any])
    
    inline def setCustomDimensionIdUndefined: Self = StObject.set(x, "customDimensionId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
