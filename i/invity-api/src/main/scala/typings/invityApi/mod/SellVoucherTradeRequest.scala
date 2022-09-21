package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellVoucherTradeRequest extends StObject {
  
  // which exchange this trade belongs to, used for discrimination in ExchangeService
  var cryptoCurrency: String
  
  var data: Any
  
  var exchange: String
}
object SellVoucherTradeRequest {
  
  inline def apply(cryptoCurrency: String, data: Any, exchange: String): SellVoucherTradeRequest = {
    val __obj = js.Dynamic.literal(cryptoCurrency = cryptoCurrency.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellVoucherTradeRequest]
  }
  
  extension [Self <: SellVoucherTradeRequest](x: Self) {
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
  }
}
