package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeTradeQuoteRequest extends StObject {
  
  // BTC
  var receive: String
  
  var send: String
  
  // LTC
  var sendStringAmount: String
}
object ExchangeTradeQuoteRequest {
  
  inline def apply(receive: String, send: String, sendStringAmount: String): ExchangeTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any], sendStringAmount = sendStringAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeTradeQuoteRequest]
  }
  
  extension [Self <: ExchangeTradeQuoteRequest](x: Self) {
    
    inline def setReceive(value: String): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendStringAmount(value: String): Self = StObject.set(x, "sendStringAmount", value.asInstanceOf[js.Any])
  }
}
