package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pTradeResponse extends StObject {
  
  var tradeForm: FormResponse
}
object P2pTradeResponse {
  
  inline def apply(tradeForm: FormResponse): P2pTradeResponse = {
    val __obj = js.Dynamic.literal(tradeForm = tradeForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pTradeResponse]
  }
  
  extension [Self <: P2pTradeResponse](x: Self) {
    
    inline def setTradeForm(value: FormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
  }
}
