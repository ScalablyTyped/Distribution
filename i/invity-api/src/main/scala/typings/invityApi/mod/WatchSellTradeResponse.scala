package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchSellTradeResponse extends StObject {
  
  // something went wrong
  var destinationAddress: js.UndefOr[String] = js.undefined
  
  // crypto address to which sent crypto currency to sell
  var destinationPaymentExtraId: js.UndefOr[String] = js.undefined
  
  // new state of trade
  var error: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[SellTradeStatus] = js.undefined
}
object WatchSellTradeResponse {
  
  inline def apply(): WatchSellTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchSellTradeResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WatchSellTradeResponse] (val x: Self) extends AnyVal {
    
    inline def setDestinationAddress(value: String): Self = StObject.set(x, "destinationAddress", value.asInstanceOf[js.Any])
    
    inline def setDestinationAddressUndefined: Self = StObject.set(x, "destinationAddress", js.undefined)
    
    inline def setDestinationPaymentExtraId(value: String): Self = StObject.set(x, "destinationPaymentExtraId", value.asInstanceOf[js.Any])
    
    inline def setDestinationPaymentExtraIdUndefined: Self = StObject.set(x, "destinationPaymentExtraId", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: SellTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
