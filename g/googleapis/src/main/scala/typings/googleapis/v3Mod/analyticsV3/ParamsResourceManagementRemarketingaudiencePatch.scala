package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementRemarketingaudiencePatch
  extends StObject
     with StandardParameters {
  
  /**
    * The account ID of the remarketing audience to update.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the remarketing audience to update.
    */
  var remarketingAudienceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaRemarketingAudience] = js.undefined
  
  /**
    * The web property ID of the remarketing audience to update.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementRemarketingaudiencePatch {
  
  inline def apply(): ParamsResourceManagementRemarketingaudiencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementRemarketingaudiencePatch]
  }
  
  extension [Self <: ParamsResourceManagementRemarketingaudiencePatch](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setRemarketingAudienceId(value: String): Self = StObject.set(x, "remarketingAudienceId", value.asInstanceOf[js.Any])
    
    inline def setRemarketingAudienceIdUndefined: Self = StObject.set(x, "remarketingAudienceId", js.undefined)
    
    inline def setRequestBody(value: SchemaRemarketingAudience): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
