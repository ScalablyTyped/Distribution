package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTradeRequest extends StObject {
  
  var returnUrl: String
  
  var trade: BuyTrade
}
object BuyTradeRequest {
  
  @scala.inline
  def apply(returnUrl: String, trade: BuyTrade): BuyTradeRequest = {
    val __obj = js.Dynamic.literal(returnUrl = returnUrl.asInstanceOf[js.Any], trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeRequest]
  }
  
  @scala.inline
  implicit class BuyTradeRequestMutableBuilder[Self <: BuyTradeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrade(value: BuyTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
