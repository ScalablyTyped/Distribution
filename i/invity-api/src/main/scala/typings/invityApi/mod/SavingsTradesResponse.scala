package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradesResponse
  extends StObject
     with SavingsTradeErrorResponse {
  
  var trades: js.Array[SavingsTrade]
}
object SavingsTradesResponse {
  
  inline def apply(trades: js.Array[SavingsTrade]): SavingsTradesResponse = {
    val __obj = js.Dynamic.literal(trades = trades.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradesResponse]
  }
  
  extension [Self <: SavingsTradesResponse](x: Self) {
    
    inline def setTrades(value: js.Array[SavingsTrade]): Self = StObject.set(x, "trades", value.asInstanceOf[js.Any])
    
    inline def setTradesVarargs(value: SavingsTrade*): Self = StObject.set(x, "trades", js.Array(value*))
  }
}
