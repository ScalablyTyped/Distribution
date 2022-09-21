package typings.invityApi.mod

import typings.invityApi.invityApiStrings.QUOTE_TIMEOUT
import typings.invityApi.invityApiStrings.UNKNOWN
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendedExchangeTrade
  extends StObject
     with ExchangeTrade {
  
  var newQuote: js.UndefOr[ExchangeTrade] = js.undefined
  
  var requestTradeErrorType: js.UndefOr[QUOTE_TIMEOUT | UNKNOWN] = js.undefined
}
object ExtendedExchangeTrade {
  
  inline def apply(): ExtendedExchangeTrade = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendedExchangeTrade]
  }
  
  extension [Self <: ExtendedExchangeTrade](x: Self) {
    
    inline def setNewQuote(value: ExchangeTrade): Self = StObject.set(x, "newQuote", value.asInstanceOf[js.Any])
    
    inline def setNewQuoteUndefined: Self = StObject.set(x, "newQuote", js.undefined)
    
    inline def setRequestTradeErrorType(value: QUOTE_TIMEOUT | UNKNOWN): Self = StObject.set(x, "requestTradeErrorType", value.asInstanceOf[js.Any])
    
    inline def setRequestTradeErrorTypeUndefined: Self = StObject.set(x, "requestTradeErrorType", js.undefined)
  }
}
