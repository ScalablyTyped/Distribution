package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementRemarketingaudienceGet
  extends StObject
     with StandardParameters {
  
  /**
    * The account ID of the remarketing audience to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the remarketing audience to retrieve.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * The web property ID of the remarketing audience to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementRemarketingaudienceGet {
  
  inline def apply(): ParamsResourceManagementRemarketingaudienceGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudienceGet]
  }
  
  extension [Self <: ParamsResourceManagementRemarketingaudienceGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
