package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmExchangeTradeRequest extends js.Object {
  
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
  implicit class ConfirmExchangeTradeRequestOps[Self <: ConfirmExchangeTradeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setReceiveAddress(value: String): Self = this.set("receiveAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefundAddress(value: String): Self = this.set("refundAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrade(value: ExchangeTrade): Self = this.set("trade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraField(value: String): Self = this.set("extraField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraField: Self = this.set("extraField", js.undefined)
  }
}
