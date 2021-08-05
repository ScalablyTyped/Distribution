package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains additional info about the report operation.
  */
trait SchemaReportInfo extends StObject {
  
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String] = js.undefined
  
  /**
    * Quota usage info when processing the `Operation`.
    */
  var quotaInfo: js.UndefOr[SchemaQuotaInfo] = js.undefined
}
object SchemaReportInfo {
  
  inline def apply(): SchemaReportInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportInfo]
  }
  
  extension [Self <: SchemaReportInfo](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setQuotaInfo(value: SchemaQuotaInfo): Self = StObject.set(x, "quotaInfo", value.asInstanceOf[js.Any])
    
    inline def setQuotaInfoUndefined: Self = StObject.set(x, "quotaInfo", js.undefined)
  }
}
