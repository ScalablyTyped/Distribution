package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmExchangeTradeRequest extends StObject {
  
  // address hash (optional because Changelly doesn't support it)
  var extraField: js.UndefOr[String] = js.native
  
  var receiveAddress: String = js.native
  
  // address hash
  var refundAddress: String = js.native
  
  var trade: ExchangeTrade = js.native
}
object ConfirmExchangeTradeRequest {
  
  @scala.inline
  def apply(receiveAddress: String, refundAddress: String, trade: ExchangeTrade): ConfirmExchangeTradeRequest = {
    val __obj = js.Dynamic.literal(receiveAddress = receiveAddress.asInstanceOf[js.Any], refundAddress = refundAddress.asInstanceOf[js.Any], trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmExchangeTradeRequest]
  }
  
  @scala.inline
  implicit class ConfirmExchangeTradeRequestMutableBuilder[Self <: ConfirmExchangeTradeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExtraField(value: String): Self = StObject.set(x, "extraField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraFieldUndefined: Self = StObject.set(x, "extraField", js.undefined)
    
    @scala.inline
    def setReceiveAddress(value: String): Self = StObject.set(x, "receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundAddress(value: String): Self = StObject.set(x, "refundAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrade(value: ExchangeTrade): Self = StObject.set(x, "trade", value.asInstanceOf[js.Any])
  }
}
