package typings.googleapis.v3Mod.analyticsV3

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
    
    inline def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    inline def setRequestBody(value: SchemaAnalyticsDataimportDeleteUploadDataRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
