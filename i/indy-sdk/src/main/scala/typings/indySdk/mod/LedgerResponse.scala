package typings.indySdk.mod

import typings.indySdk.anon.AuditPath
import typings.indySdk.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.indySdk.mod.LedgerRejectResponse
  - typings.indySdk.mod.LedgerReqnackResponse
  - typings.indySdk.mod.LedgerReadReplyResponse
  - typings.indySdk.mod.LedgerWriteReplyResponse
*/
trait LedgerResponse extends StObject
object LedgerResponse {
  
  inline def LedgerReadReplyResponse(result: Data): typings.indySdk.mod.LedgerReadReplyResponse = {
    val __obj = js.Dynamic.literal(op = "REPLY", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.indySdk.mod.LedgerReadReplyResponse]
  }
  
  inline def LedgerRejectResponse(identifier: String, reason: String, reqId: Double): typings.indySdk.mod.LedgerRejectResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], op = "REJECT", reason = reason.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.indySdk.mod.LedgerRejectResponse]
  }
  
  inline def LedgerReqnackResponse(identifier: String, reason: String, reqId: Double): typings.indySdk.mod.LedgerReqnackResponse = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], op = "REQNACK", reason = reason.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.indySdk.mod.LedgerReqnackResponse]
  }
  
  inline def LedgerWriteReplyResponse(result: AuditPath): typings.indySdk.mod.LedgerWriteReplyResponse = {
    val __obj = js.Dynamic.literal(op = "REPLY", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.indySdk.mod.LedgerWriteReplyResponse]
  }
}
