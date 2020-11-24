package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WatchBuyTradeResponse extends js.Object {
  
   // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[BuyTradeStatus] = js.native
}
object WatchBuyTradeResponse {
  
  @scala.inline
  def apply(): WatchBuyTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchBuyTradeResponse]
  }
  
  @scala.inline
  implicit class WatchBuyTradeResponseOps[Self <: WatchBuyTradeResponse] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: BuyTradeStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
