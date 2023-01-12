package typings.invityApi.mod

import typings.invityApi.invityApiStrings.enable
import typings.invityApi.invityApiStrings.exclusively
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeTradeQuoteRequest extends StObject {
  
  // "0.01"
  var dex: js.UndefOr[enable | exclusively] = js.undefined
  
  // BTC
  var receive: String
  
  var send: String
  
  // LTC
  var sendStringAmount: js.UndefOr[String] = js.undefined
}
object ExchangeTradeQuoteRequest {
  
  inline def apply(receive: String, send: String): ExchangeTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(receive = receive.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeTradeQuoteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExchangeTradeQuoteRequest] (val x: Self) extends AnyVal {
    
    inline def setDex(value: enable | exclusively): Self = StObject.set(x, "dex", value.asInstanceOf[js.Any])
    
    inline def setDexUndefined: Self = StObject.set(x, "dex", js.undefined)
    
    inline def setReceive(value: String): Self = StObject.set(x, "receive", value.asInstanceOf[js.Any])
    
    inline def setSend(value: String): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    
    inline def setSendStringAmount(value: String): Self = StObject.set(x, "sendStringAmount", value.asInstanceOf[js.Any])
    
    inline def setSendStringAmountUndefined: Self = StObject.set(x, "sendStringAmount", js.undefined)
  }
}
