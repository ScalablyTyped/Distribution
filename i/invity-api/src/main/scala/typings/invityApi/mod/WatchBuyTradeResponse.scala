package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchBuyTradeResponse extends StObject {
  
  // state of trade after confirmTrade
  var error: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[BuyTradeStatus] = js.undefined
}
object WatchBuyTradeResponse {
  
  @scala.inline
  def apply(): WatchBuyTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchBuyTradeResponse]
  }
  
  @scala.inline
  implicit class WatchBuyTradeResponseMutableBuilder[Self <: WatchBuyTradeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setStatus(value: BuyTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
