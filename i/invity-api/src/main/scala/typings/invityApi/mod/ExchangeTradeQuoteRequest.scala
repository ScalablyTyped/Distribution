package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeTradeQuoteRequest extends js.Object {
  
   // BTC
  var receive: String = js.native
  
  var send: String = js.native
  
   // LTC
  var sendStringAmount: String = js.native
}
object ExchangeTradeQuoteRequest {
  
  @scala.inline
  def apply(receive: String, send: String, sendStringAmount: String): ExchangeTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any], sendStringAmount = sendStringAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeTradeQuoteRequest]
  }
  
  @scala.inline
  implicit class ExchangeTradeQuoteRequestOps[Self <: ExchangeTradeQuoteRequest] (val x: Self) extends AnyVal {
    
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
    def setReceive(value: String): Self = this.set("receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: String): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendStringAmount(value: String): Self = this.set("sendStringAmount", value.asInstanceOf[js.Any])
  }
}
