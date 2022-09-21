package typings.indySdk.mod

import typings.indySdk.indySdkStrings.REJECT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerRejectResponse
  extends StObject
     with LedgerResponse {
  
  var identifier: String
  
  var op: REJECT
  
  var reason: String
  
  var reqId: Double
}
object LedgerRejectResponse {
  
  inline def apply(identifier: String, reason: String, reqId: Double): LedgerRejectResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], op = "REJECT", reason = reason.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerRejectResponse]
  }
  
  extension [Self <: LedgerRejectResponse](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setOp(value: REJECT): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReqId(value: Double): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
  }
}
