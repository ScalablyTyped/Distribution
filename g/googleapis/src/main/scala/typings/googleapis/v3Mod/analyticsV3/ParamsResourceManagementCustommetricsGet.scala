package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustommetricsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID for the custom metric to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The ID of the custom metric to retrieve.
    */
  var customMetricId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property ID for the custom metric to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustommetricsGet {
  
  @scala.inline
  def apply(): ParamsResourceManagementCustommetricsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustommetricsGet]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementCustommetricsGetMutableBuilder[Self <: ParamsResourceManagementCustommetricsGet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomMetricId(value: String): Self = StObject.set(x, "customMetricId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMetricIdUndefined: Self = StObject.set(x, "customMetricId", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
