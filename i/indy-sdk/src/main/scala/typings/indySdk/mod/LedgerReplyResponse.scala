package typings.indySdk.mod

import typings.indySdk.indySdkStrings.REPLY
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerReplyResponse extends StObject {
  
  var op: REPLY
  
  var result: Record[String, Any]
}
object LedgerReplyResponse {
  
  inline def apply(result: Record[String, Any]): LedgerReplyResponse = {
    val __obj = js.Dynamic.literal(op = "REPLY", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerReplyResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LedgerReplyResponse] (val x: Self) extends AnyVal {
    
    inline def setOp(value: REPLY): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setResult(value: Record[String, Any]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
