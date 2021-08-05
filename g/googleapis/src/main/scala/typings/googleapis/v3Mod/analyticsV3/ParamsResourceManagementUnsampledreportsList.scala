package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementUnsampledreportsList
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID to retrieve unsampled reports for. Must be a specific account
    * ID, ~all is not supported.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The maximum number of unsampled reports to include in this response.
    */
  var `max-results`: js.UndefOr[Double] = js.undefined
  
  /**
    * View (Profile) ID to retrieve unsampled reports for. Must be a specific
    * view (profile) ID, ~all is not supported.
    */
  var profileId: js.UndefOr[String] = js.undefined
  
  /**
    * An index of the first unsampled report to retrieve. Use this parameter as
    * a pagination mechanism along with the max-results parameter.
    */
  var `start-index`: js.UndefOr[Double] = js.undefined
  
  /**
    * Web property ID to retrieve unsampled reports for. Must be a specific web
    * property ID, ~all is not supported.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementUnsampledreportsList {
  
  inline def apply(): ParamsResourceManagementUnsampledreportsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUnsampledreportsList]
  }
  
  extension [Self <: ParamsResourceManagementUnsampledreportsList](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def `setMax-results`(value: Double): Self = StObject.set(x, "max-results", value.asInstanceOf[js.Any])
    
    inline def `setMax-resultsUndefined`: Self = StObject.set(x, "max-results", js.undefined)
    
    inline def setProfileId(value: String): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProfileIdUndefined: Self = StObject.set(x, "profileId", js.undefined)
    
    inline def `setStart-index`(value: Double): Self = StObject.set(x, "start-index", value.asInstanceOf[js.Any])
    
    inline def `setStart-indexUndefined`: Self = StObject.set(x, "start-index", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
