package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchExchangeTradeResponse extends js.Object {
  
  var error: js.UndefOr[String] = js.native
  
  var rate: js.UndefOr[Double] = js.native
  
  var receiveStringAmount: js.UndefOr[String] = js.native
  
   // state of trade after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[ExchangeTradeStatus] = js.native
}
object WatchExchangeTradeResponse {
  
  @scala.inline
  def apply(): WatchExchangeTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchExchangeTradeResponse]
  }
  
  @scala.inline
  implicit class WatchExchangeTradeResponseOps[Self <: WatchExchangeTradeResponse] (val x: Self) extends AnyVal {
    
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
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setRate(value: Double): Self = this.set("rate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRate: Self = this.set("rate", js.undefined)
    
    @scala.inline
    def setReceiveStringAmount(value: String): Self = this.set("receiveStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveStringAmount: Self = this.set("receiveStringAmount", js.undefined)
    
    @scala.inline
    def setReceiveTxHash(value: String): Self = this.set("receiveTxHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveTxHash: Self = this.set("receiveTxHash", js.undefined)
    
    @scala.inline
    def setStatus(value: ExchangeTradeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
