package typings.indySdk.mod

import typings.indySdk.indySdkStrings.REQNACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerReqnackResponse
  extends StObject
     with LedgerResponse {
  
  var identifier: String
  
  var op: REQNACK
  
  var reason: String
  
  var reqId: Double
}
object LedgerReqnackResponse {
  
  inline def apply(identifier: String, reason: String, reqId: Double): LedgerReqnackResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], op = "REQNACK", reason = reason.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerReqnackResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LedgerReqnackResponse] (val x: Self) extends AnyVal {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setOp(value: REQNACK): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReqId(value: Double): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
  }
}
