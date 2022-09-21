package typings.indySdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerRequest extends StObject {
  
  var identifier: String
  
  var operation: Record[String, Any]
  
  var protocolVersion: Double
  
  var reqId: Double
}
object LedgerRequest {
  
  inline def apply(identifier: String, operation: Record[String, Any], protocolVersion: Double, reqId: Double): LedgerRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerRequest]
  }
  
  extension [Self <: LedgerRequest](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: Record[String, Any]): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: Double): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setReqId(value: Double): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
  }
}
