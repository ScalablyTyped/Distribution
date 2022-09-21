package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WatchExchangeTradeResponse extends StObject {
  
  // "0.01"
  var error: js.UndefOr[String] = js.undefined
  
  var rate: js.UndefOr[Double] = js.undefined
  
  var receiveStringAmount: js.UndefOr[String] = js.undefined
  
  // state of trade after confirmTrade
  var receiveTxHash: js.UndefOr[String] = js.undefined
  
  var status: js.UndefOr[ExchangeTradeStatus] = js.undefined
}
object WatchExchangeTradeResponse {
  
  inline def apply(): WatchExchangeTradeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WatchExchangeTradeResponse]
  }
  
  extension [Self <: WatchExchangeTradeResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    
    inline def setRateUndefined: Self = StObject.set(x, "rate", js.undefined)
    
    inline def setReceiveStringAmount(value: String): Self = StObject.set(x, "receiveStringAmount", value.asInstanceOf[js.Any])
    
    inline def setReceiveStringAmountUndefined: Self = StObject.set(x, "receiveStringAmount", js.undefined)
    
    inline def setReceiveTxHash(value: String): Self = StObject.set(x, "receiveTxHash", value.asInstanceOf[js.Any])
    
    inline def setReceiveTxHashUndefined: Self = StObject.set(x, "receiveTxHash", js.undefined)
    
    inline def setStatus(value: ExchangeTradeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
