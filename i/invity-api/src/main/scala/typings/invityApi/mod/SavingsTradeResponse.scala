package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeResponse
  extends StObject
     with SavingsTradeErrorResponse {
  
  /** Payments in savings plan. */
  var payments: js.UndefOr[js.Array[SavingsTradePlannedPayment]] = js.undefined
  
  var trade: js.UndefOr[SavingsTrade] = js.undefined
}
object SavingsTradeResponse {
  
  inline def apply(): SavingsTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsTradeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeResponse] (val x: Self) extends AnyVal {
    
    inline def setPayments(value: js.Array[SavingsTradePlannedPayment]): Self = StObject.set(x, "payments", value.asInstanceOf[js.Any])
    
    inline def setPaymentsUndefined: Self = StObject.set(x, "payments", js.undefined)
    
    inline def setPaymentsVarargs(value: SavingsTradePlannedPayment*): Self = StObject.set(x, "payments", js.Array(value*))
    
    inline def setTrade(value: SavingsTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
    
    inline def setTradeUndefined: Self = StObject.set(x, "trade", js.undefined)
  }
}
