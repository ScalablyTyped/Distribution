package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsTradeInitParameters extends StObject {
  
  var amount: String
  
  var appType: String
  
  var clientAppId: String
  
  var country: String
  
  var cryptoCurrency: String
  
  var exchange: String
  
  var fiatCurrency: String
  
  var paymentFrequency: PaymentFrequency
  
  var returnUrl: String
  
  var savingsTradeId: String
}
object SavingsTradeInitParameters {
  
  inline def apply(
    amount: String,
    appType: String,
    clientAppId: String,
    country: String,
    cryptoCurrency: String,
    exchange: String,
    fiatCurrency: String,
    paymentFrequency: PaymentFrequency,
    returnUrl: String,
    savingsTradeId: String
  ): SavingsTradeInitParameters = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], appType = appType.asInstanceOf[js.Any], clientAppId = clientAppId.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cryptoCurrency = cryptoCurrency.asInstanceOf[js.Any], exchange = exchange.asInstanceOf[js.Any], fiatCurrency = fiatCurrency.asInstanceOf[js.Any], paymentFrequency = paymentFrequency.asInstanceOf[js.Any], returnUrl = returnUrl.asInstanceOf[js.Any], savingsTradeId = savingsTradeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsTradeInitParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SavingsTradeInitParameters] (val x: Self) extends AnyVal {
    
    inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setAppType(value: String): Self = StObject.set(x, "appType", value.asInstanceOf[js.Any])
    
    inline def setClientAppId(value: String): Self = StObject.set(x, "clientAppId", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setExchange(value: String): Self = StObject.set(x, "exchange", value.asInstanceOf[js.Any])
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setPaymentFrequency(value: PaymentFrequency): Self = StObject.set(x, "paymentFrequency", value.asInstanceOf[js.Any])
    
    inline def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
    
    inline def setSavingsTradeId(value: String): Self = StObject.set(x, "savingsTradeId", value.asInstanceOf[js.Any])
  }
}
