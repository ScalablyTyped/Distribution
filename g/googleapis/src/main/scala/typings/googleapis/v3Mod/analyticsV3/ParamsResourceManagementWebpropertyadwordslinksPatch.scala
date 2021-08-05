package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementWebpropertyadwordslinksPatch
  extends StObject
     with StandardParameters {
  
  /**
    * ID of the account which the given web property belongs to.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaEntityAdWordsLink] = js.undefined
  
  /**
    * Web property-Google Ads link ID.
    */
  var webPropertyAdWordsLinkId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to retrieve the Google Ads link for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementWebpropertyadwordslinksPatch {
  
  inline def apply(): ParamsResourceManagementWebpropertyadwordslinksPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementWebpropertyadwordslinksPatch]
  }
  
  extension [Self <: ParamsResourceManagementWebpropertyadwordslinksPatch](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRequestBody(value: SchemaEntityAdWordsLink): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyAdWordsLinkId(value: String): Self = StObject.set(x, "webPropertyAdWordsLinkId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyAdWordsLinkIdUndefined: Self = StObject.set(x, "webPropertyAdWordsLinkId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
