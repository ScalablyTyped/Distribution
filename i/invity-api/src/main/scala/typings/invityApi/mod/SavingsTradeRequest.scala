package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeRequest extends StObject {
  
  var trade: SavingsTrade
}
object SavingsTradeRequest {
  
  inline def apply(trade: SavingsTrade): SavingsTradeRequest = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeRequest]
  }
  
  extension [Self <: SavingsTradeRequest](x: Self) {
    
    inline def setTrade(value: SavingsTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
