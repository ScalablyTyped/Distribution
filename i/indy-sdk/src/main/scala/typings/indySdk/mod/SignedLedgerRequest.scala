package typings.indySdk.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedLedgerRequest
  extends StObject
     with LedgerRequest {
  
  var signature: String
}
object SignedLedgerRequest {
  
  inline def apply(
    identifier: String,
    operation: Record[String, Any],
    protocolVersion: Double,
    reqId: Double,
    signature: String
  ): SignedLedgerRequest = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], protocolVersion = protocolVersion.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedLedgerRequest]
  }
  
  extension [Self <: SignedLedgerRequest](x: Self) {
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
