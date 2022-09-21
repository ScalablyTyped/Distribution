package typings.invityApi.mod

import typings.invityApi.invityApiStrings.QUOTE_TIMEOUT
import typings.invityApi.invityApiStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellFiatTradeResponse extends StObject {
  
  var newQuote: js.UndefOr[SellFiatTrade] = js.undefined
  
  var requestTradeErrorType: js.UndefOr[QUOTE_TIMEOUT | UNKNOWN] = js.undefined
  
  var trade: SellFiatTrade
  
  var tradeForm: js.UndefOr[SellFiatTradeFormResponse] = js.undefined
}
object SellFiatTradeResponse {
  
  inline def apply(trade: SellFiatTrade): SellFiatTradeResponse = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellFiatTradeResponse]
  }
  
  extension [Self <: SellFiatTradeResponse](x: Self) {
    
    inline def setNewQuote(value: SellFiatTrade): Self = StObject.set(x, "newQuote", value.asInstanceOf[js.Any])
    
    inline def setNewQuoteUndefined: Self = StObject.set(x, "newQuote", js.undefined)
    
    inline def setRequestTradeErrorType(value: QUOTE_TIMEOUT | UNKNOWN): Self = StObject.set(x, "requestTradeErrorType", value.asInstanceOf[js.Any])
    
    inline def setRequestTradeErrorTypeUndefined: Self = StObject.set(x, "requestTradeErrorType", js.undefined)
    
    inline def setTrade(value: SellFiatTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
    
    inline def setTradeForm(value: SellFiatTradeFormResponse): Self = StObject.set(x, "tradeForm", value.asInstanceOf[js.Any])
    
    inline def setTradeFormUndefined: Self = StObject.set(x, "tradeForm", js.undefined)
  }
}
