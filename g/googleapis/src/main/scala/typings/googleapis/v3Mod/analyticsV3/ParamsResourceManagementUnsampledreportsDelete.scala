package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementUnsampledreportsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to delete the unsampled report for.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * View (Profile) ID to delete the unsampled report for.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the unsampled report to be deleted.
    */
  var unsampledReportId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID to delete the unsampled reports for.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementUnsampledreportsDelete {
  
  inline def apply(): ParamsResourceManagementUnsampledreportsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUnsampledreportsDelete]
  }
  
  extension [Self <: ParamsResourceManagementUnsampledreportsDelete](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def setUnsampledReportId(value: String): Self = StObject.set(x, "unsampledReportId", value.asInstanceOf[js.Any])
    
    inline def setUnsampledReportIdUndefined: Self = StObject.set(x, "unsampledReportId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
