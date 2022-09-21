package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataMetadata extends StObject {
  
  /**
    * Output only. The time the operation was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time the operation finished running.
    */
  var endTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Partial errors during export operation that might cause the operation output to be incomplete.
    */
  var partialErrors: js.UndefOr[js.Array[SchemaGoogleRpcStatus]] = js.undefined
  
  /**
    * The original request for export.
    */
  var request: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataMetadata {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataMetadata]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataMetadata](x: Self) {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setPartialErrors(value: js.Array[SchemaGoogleRpcStatus]): Self = StObject.set(x, "partialErrors", value.asInstanceOf[js.Any])
    
    inline def setPartialErrorsUndefined: Self = StObject.set(x, "partialErrors", js.undefined)
    
    inline def setPartialErrorsVarargs(value: SchemaGoogleRpcStatus*): Self = StObject.set(x, "partialErrors", js.Array(value*))
    
    inline def setRequest(value: SchemaGoogleCloudContactcenterinsightsV1ExportInsightsDataRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
  }
}
