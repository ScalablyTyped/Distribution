package typings.invityApi.mod

import typings.invityApi.invityApiStrings.QUOTE_TIMEOUT
import typings.invityApi.invityApiStrings.UNKNOWN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeResponse extends js.Object {
  
  var newQuote: js.UndefOr[BuyTrade] = js.native
  
  var requestTradeErrorType: js.UndefOr[QUOTE_TIMEOUT | UNKNOWN] = js.native
  
  var trade: BuyTrade = js.native
  
  var tradeForm: js.UndefOr[BuyTradeFormResponse] = js.native
}
object BuyTradeResponse {
  
  @scala.inline
  def apply(trade: BuyTrade): BuyTradeResponse = {
    val __obj = js.Dynamic.literal(trade = trade.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeResponse]
  }
  
  @scala.inline
  implicit class BuyTradeResponseOps[Self <: BuyTradeResponse] (val x: Self) extends AnyVal {
    
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
    def setTrade(value: BuyTrade): Self = this.set("trade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewQuote(value: BuyTrade): Self = this.set("newQuote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewQuote: Self = this.set("newQuote", js.undefined)
    
    @scala.inline
    def setRequestTradeErrorType(value: QUOTE_TIMEOUT | UNKNOWN): Self = this.set("requestTradeErrorType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestTradeErrorType: Self = this.set("requestTradeErrorType", js.undefined)
    
    @scala.inline
    def setTradeForm(value: BuyTradeFormResponse): Self = this.set("tradeForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTradeForm: Self = this.set("tradeForm", js.undefined)
  }
}
