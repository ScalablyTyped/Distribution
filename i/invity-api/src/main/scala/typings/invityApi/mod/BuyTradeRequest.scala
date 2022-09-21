package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTradeRequest extends StObject {
  
  /**
    * URL where to return after the trade is done
    */
  var returnUrl: String
  
  /**
    * The trade object
    */
  var trade: BuyTrade
}
object BuyTradeRequest {
  
  inline def apply(returnUrl: String, trade: BuyTrade): BuyTradeRequest = {
    val __obj = js.Dynamic.literal(returnUrl = returnUrl.asInstanceOf[js.Any], trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeRequest]
  }
  
  extension [Self <: BuyTradeRequest](x: Self) {
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setTrade(value: BuyTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
