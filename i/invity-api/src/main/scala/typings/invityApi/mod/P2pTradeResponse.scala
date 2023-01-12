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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: P2pTradeResponse] (val x: Self) extends AnyVal {
    
    inline def setTradeForm(value: FormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
  }
}
