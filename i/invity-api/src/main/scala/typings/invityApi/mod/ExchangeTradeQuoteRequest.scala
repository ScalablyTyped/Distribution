package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExchangeTradeQuoteRequest extends StObject {
  
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
  implicit class ExchangeTradeQuoteRequestMutableBuilder[Self <: ExchangeTradeQuoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReceive(value: String): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendStringAmount(value: String): Self = StObject.set(x, "sendStringAmount", value.asInstanceOf[js.Any])
  }
}
