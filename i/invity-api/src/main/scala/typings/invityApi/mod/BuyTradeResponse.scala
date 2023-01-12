package typings.invityApi.mod

import typings.invityApi.invityApiStrings.QUOTE_TIMEOUT
import typings.invityApi.invityApiStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTradeResponse extends StObject {
  
  var newQuote: js.UndefOr[BuyTrade] = js.undefined
  
  var requestTradeErrorType: js.UndefOr[QUOTE_TIMEOUT | UNKNOWN] = js.undefined
  
  var trade: BuyTrade
  
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.undefined
}
object BuyTradeResponse {
  
  inline def apply(trade: BuyTrade): BuyTradeResponse = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuyTradeResponse] (val x: Self) extends AnyVal {
    
    inline def setNewQuote(value: BuyTrade): Self = StObject.set(x, "newQuote", value.asInstanceOf[js.Any])
    
    inline def setNewQuoteUndefined: Self = StObject.set(x, "newQuote", js.undefined)
    
    inline def setRequestTradeErrorType(value: QUOTE_TIMEOUT | UNKNOWN): Self = StObject.set(x, "requestTradeErrorType", value.asInstanceOf[js.Any])
    
    inline def setRequestTradeErrorTypeUndefined: Self = StObject.set(x, "requestTradeErrorType", js.undefined)
    
    inline def setTrade(value: BuyTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
    
    inline def setTradeForm(value: BuyTradeFormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
    
    inline def setTradeFormUndefined: Self = StObject.set(x, "tradeForm", js.undefined)
  }
}
