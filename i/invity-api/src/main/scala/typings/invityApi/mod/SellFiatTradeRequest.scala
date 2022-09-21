package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellFiatTradeRequest extends StObject {
  
  /**
    * URL where to return after the trade is done
    */
  var returnUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The trade object
    */
  var trade: SellFiatTrade
}
object SellFiatTradeRequest {
  
  inline def apply(trade: SellFiatTrade): SellFiatTradeRequest = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellFiatTradeRequest]
  }
  
  extension [Self <: SellFiatTradeRequest](x: Self) {
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
    
    inline def setTrade(value: SellFiatTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
