package typings.indySdk.mod

import typings.indySdk.anon.AuditPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerWriteReplyResponse
  extends StObject
     with LedgerReplyResponse
     with LedgerResponse {
  
  @JSName("result")
  var result_LedgerWriteReplyResponse: AuditPath
}
object LedgerWriteReplyResponse {
  
  inline def apply(result: AuditPath): LedgerWriteReplyResponse = {
    val __obj = js.Dynamic.literal(op = "REPLY", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerWriteReplyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LedgerWriteReplyResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: AuditPath): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
