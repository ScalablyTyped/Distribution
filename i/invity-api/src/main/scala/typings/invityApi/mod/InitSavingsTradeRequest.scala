package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitSavingsTradeRequest extends StObject {
  
  var amount: String
  
  var country: String
  
  var cryptoCurrency: String
  
  var exchange: String
  
  var fiatCurrency: String
  
  var paymentFrequency: PaymentFrequency
  
  var returnUrl: String
}
object InitSavingsTradeRequest {
  
  inline def apply(
    amount: String,
    country: String,
    cryptoCurrency: String,
    exchange: String,
    fiatCurrency: String,
    paymentFrequency: PaymentFrequency,
    returnUrl: String
  ): InitSavingsTradeRequest = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cryptoCurrency = cryptoCurrency.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], fiatCurrency = fiatCurrency.asInstanceOf[js.Any], paymentFrequency = paymentFrequency.asInstanceOf[js.Any], returnUrl = returnUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitSavingsTradeRequest]
  }
  
  extension [Self <: InitSavingsTradeRequest](x: Self) {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setPaymentFrequency(value: PaymentFrequency): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
  }
}
