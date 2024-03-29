package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportRequest extends StObject {
  
  /**
    * Operations to be reported. Typically the service should report one operation per request. Putting multiple operations into a single request is allowed, but should be used only when multiple operations are natually available at the time of the report. There is no limit on the number of operations in the same ReportRequest, however the ReportRequest size should be no larger than 1MB. See ReportResponse.report_errors for partial failure behavior.
    */
  var operations: js.UndefOr[js.Array[SchemaOperation]] = js.undefined
  
  /**
    * Specifies which version of service config should be used to process the request. If unspecified or no matching version can be found, the latest one will be used.
    */
  var serviceConfigId: js.UndefOr[String | Null] = js.undefined
}
object SchemaReportRequest {
  
  inline def apply(): SchemaReportRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportRequest]
  }
  
  extension [Self <: SchemaReportRequest](x: Self) {
    
    inline def setOperations(value: js.Array[SchemaOperation]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: SchemaOperation*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setServiceConfigId(value: String): Self = StObject.set(x, "serviceConfigId", value.asInstanceOf[js.Any])
    
    inline def setServiceConfigIdNull: Self = StObject.set(x, "serviceConfigId", null)
    
    inline def setServiceConfigIdUndefined: Self = StObject.set(x, "serviceConfigId", js.undefined)
  }
}
