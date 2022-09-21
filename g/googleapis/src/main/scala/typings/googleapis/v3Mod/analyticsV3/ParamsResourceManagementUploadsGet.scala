package typings.googleapis.v3Mod.analyticsV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceManagementUploadsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Account Id for the upload to retrieve.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Custom data source Id for upload to retrieve.
    */
  var customDataSourceId: js.UndefOr[String] = js.undefined
  
  /**
    * Upload Id to retrieve.
    */
  var uploadId: js.UndefOr[String] = js.undefined
  
  /**
    * Web property Id for the upload to retrieve.
    */
  var webPropertyId: js.UndefOr[String] = js.undefined
}
object ParamsResourceManagementUploadsGet {
  
  inline def apply(): ParamsResourceManagementUploadsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceManagementUploadsGet]
  }
  
  extension [Self <: ParamsResourceManagementUploadsGet](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setCustomDataSourceId(value: String): Self = StObject.set(x, "customDataSourceId", value.asInstanceOf[js.Any])
    
    inline def setCustomDataSourceIdUndefined: Self = StObject.set(x, "customDataSourceId", js.undefined)
    
    inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    
    inline def setUploadIdUndefined: Self = StObject.set(x, "uploadId", js.undefined)
    
    inline def setWebPropertyId(value: String): Self = StObject.set(x, "webPropertyId", value.asInstanceOf[js.Any])
    
    inline def setWebPropertyIdUndefined: Self = StObject.set(x, "webPropertyId", js.undefined)
  }
}
