package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeRequest extends js.Object {
  
  var returnUrl: String = js.native
  
  var trade: BuyTrade = js.native
}
object BuyTradeRequest {
  
  @scala.inline
  def apply(returnUrl: String, trade: BuyTrade): BuyTradeRequest = {
    val __obj = js.Dynamic.literal(returnUrl = returnUrl.asInstanceOf[js.Any], trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeRequest]
  }
  
  @scala.inline
  implicit class BuyTradeRequestOps[Self <: BuyTradeRequest] (val x: Self) extends AnyVal {
    
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
    def setReturnUrl(value: String): Self = this.set("returnUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrade(value: BuyTrade): Self = this.set("trade", value.asInstanceOf[js.Any])
  }
}
