package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementCustomdimensionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Account ID for the custom dimension to update.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Custom dimension ID for the custom dimension to update.
    */
  var customDimensionId: js.UndefOr[String] = js.undefined
  
  /**
    * Force the update and ignore any warnings related to the custom dimension
    * being linked to a custom data source / data set.
    */
  var ignoreCustomDataSourceLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaCustomDimension] = js.undefined
  
  /**
    * Web property ID for the custom dimension to update.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementCustomdimensionsPatch {
  
  @scala.inline
  def apply(): ParamsResourceManagementCustomdimensionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementCustomdimensionsPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceManagementCustomdimensionsPatchMutableBuilder[Self <: ParamsResourceManagementCustomdimensionsPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setCustomDimensionId(value: String): Self = StObject.set(x, "customDimensionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomDimensionIdUndefined: Self = StObject.set(x, "customDimensionId", js.undefined)
    
    @scala.inline
    def setIgnoreCustomDataSourceLinks(value: Boolean): Self = StObject.set(x, "ignoreCustomDataSourceLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreCustomDataSourceLinksUndefined: Self = StObject.set(x, "ignoreCustomDataSourceLinks", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaCustomDimension): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
