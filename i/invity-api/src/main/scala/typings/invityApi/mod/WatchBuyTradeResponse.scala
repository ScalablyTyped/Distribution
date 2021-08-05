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
  
  inline def apply(): WatchBuyTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchBuyTradeResponse]
  }
  
  extension [Self <: WatchBuyTradeResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setStatus(value: BuyTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
