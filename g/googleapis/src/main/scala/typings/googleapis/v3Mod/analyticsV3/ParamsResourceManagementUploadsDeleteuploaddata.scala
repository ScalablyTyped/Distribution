package typings.googleapis.v3Mod.analyticsV3

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementUploadsDeleteuploaddata
  extends StObject
     with StandardParameters {
  
  /**
    * Account Id for the uploads to be deleted.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Custom data source Id for the uploads to be deleted.
    */
  var customDataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAnalyticsDataimportDeleteUploadDataRequest] = js.undefined
  
  /**
    * Web property Id for the uploads to be deleted.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementUploadsDeleteuploaddata {
  
  inline def apply(): ParamsResourceManagementUploadsDeleteuploaddata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUploadsDeleteuploaddata]
  }
  
  extension [Self <: ParamsResourceManagementUploadsDeleteuploaddata](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    inline def setRequestBody(value: SchemaAnalyticsDataimportDeleteUploadDataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
