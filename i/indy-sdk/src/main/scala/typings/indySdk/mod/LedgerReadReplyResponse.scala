package typings.indySdk.mod

import typings.indySdk.anon.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LedgerReadReplyResponse
  extends StObject
     with LedgerReplyResponse
     with LedgerResponse {
  
  @JSName("result")
  var result_LedgerReadReplyResponse: Data
}
object LedgerReadReplyResponse {
  
  inline def apply(result: Data): LedgerReadReplyResponse = {
    val __obj = js.Dynamic.literal(op = "REPLY", result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[LedgerReadReplyResponse]
  }
  
  extension [Self <: LedgerReadReplyResponse](x: Self) {
    
    inline def setResult(value: Data): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
