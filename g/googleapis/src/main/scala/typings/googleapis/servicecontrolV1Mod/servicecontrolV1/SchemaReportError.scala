package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReportError extends StObject {
  
  /**
    * The Operation.operation_id value from the request.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Details of the error when processing the Operation.
    */
  var status: js.UndefOr[SchemaStatus] = js.undefined
}
object SchemaReportError {
  
  inline def apply(): SchemaReportError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportError]
  }
  
  extension [Self <: SchemaReportError](x: Self) {
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setStatus(value: SchemaStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
