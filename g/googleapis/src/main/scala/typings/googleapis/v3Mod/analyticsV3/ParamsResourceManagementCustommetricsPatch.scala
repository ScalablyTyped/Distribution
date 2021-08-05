package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustommetricsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID for the custom metric to update.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Custom metric ID for the custom metric to update.
    */
  var customMetricId: js.UndefOr[String] = js.undefined
  
  /**
    * Force the update and ignore any warnings related to the custom metric
    * being linked to a custom data source / data set.
    */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomMetric] = js.undefined
  
  /**
    * Web property ID for the custom metric to update.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustommetricsPatch {
  
  inline def apply(): ParamsResourceManagementCustommetricsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustommetricsPatch]
  }
  
  extension [Self <: ParamsResourceManagementCustommetricsPatch](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomMetricId(value: String): Self = StObject.set(x, "customMetricId", value.asInstanceOf[js.Any])
    
    inline def setCustomMetricIdUndefined: Self = StObject.set(x, "customMetricId", js.undefined)
    
    inline def setIgnoreCustomDataSourceLinks(value: Boolean): Self = StObject.set(x, "ignoreCustomDataSourceLinks", value.asInstanceOf[js.Any])
    
    inline def setIgnoreCustomDataSourceLinksUndefined: Self = StObject.set(x, "ignoreCustomDataSourceLinks", js.undefined)
    
    inline def setRequestBody(value: SchemaCustomMetric): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
