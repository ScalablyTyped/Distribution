package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfirmExchangeTradeRequest extends StObject {
  
  // address hash (optional because Changelly doesn't support it)
  var extraField: js.UndefOr[String] = js.undefined
  
  var receiveAddress: String
  
  // address hash
  var refundAddress: String
  
  var trade: ExchangeTrade
}
object ConfirmExchangeTradeRequest {
  
  inline def apply(receiveAddress: String, refundAddress: String, trade: ExchangeTrade): ConfirmExchangeTradeRequest = {
    val __obj = js.Dynamic.literal(receiveAddress = receiveAddress.asInstanceOf[js.Any], refundAddress = refundAddress.asInstanceOf[js.Any], trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmExchangeTradeRequest]
  }
  
  extension [Self <: ConfirmExchangeTradeRequest](x: Self) {
    
    inline def setExtraField(value: String): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    inline def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
    
    inline def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    inline def setRefundAddress(value: String): Self = StObject.set(x, "refundAddress", value.asInstanceOf[js.Any])
    
    inline def setTrade(value: ExchangeTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
