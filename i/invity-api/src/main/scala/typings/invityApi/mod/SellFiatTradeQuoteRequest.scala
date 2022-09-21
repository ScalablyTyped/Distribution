package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellFiatTradeQuoteRequest extends StObject {
  
  var amountInCrypto: Boolean
  
  // BTC
  var country: js.UndefOr[String] = js.undefined
  
  // 0.3 - requested amount in crypto currency
  var cryptoCurrency: String
  
  // USD
  var cryptoStringAmount: js.UndefOr[String] = js.undefined
  
  // 1000 - will pay fiat amount
  var fiatCurrency: String
  
  // true for cryptoAmount, false for fiatAmount
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  var flows: js.UndefOr[js.Array[SellFiatFlowType]] = js.undefined
  
  var paymentMethod: js.UndefOr[SellCryptoPaymentMethod] = js.undefined
}
object SellFiatTradeQuoteRequest {
  
  inline def apply(amountInCrypto: Boolean, cryptoCurrency: String, fiatCurrency: String): SellFiatTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(amountInCrypto = amountInCrypto.asInstanceOf[js.Any], cryptoCurrency = cryptoCurrency.asInstanceOf[js.Any], fiatCurrency = fiatCurrency.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellFiatTradeQuoteRequest]
  }
  
  extension [Self <: SellFiatTradeQuoteRequest](x: Self) {
    
    inline def setAmountInCrypto(value: Boolean): Self = StObject.set(x, "amountInCrypto", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setCryptoCurrency(value: String): Self = StObject.set(x, "cryptoCurrency", value.asInstanceOf[js.Any])
    
    inline def setCryptoStringAmount(value: String): Self = StObject.set(x, "cryptoStringAmount", value.asInstanceOf[js.Any])
    
    inline def setCryptoStringAmountUndefined: Self = StObject.set(x, "cryptoStringAmount", js.undefined)
    
    inline def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    inline def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    inline def setFlows(value: js.Array[SellFiatFlowType]): Self = StObject.set(x, "flows", value.asInstanceOf[js.Any])
    
    inline def setFlowsUndefined: Self = StObject.set(x, "flows", js.undefined)
    
    inline def setFlowsVarargs(value: SellFiatFlowType*): Self = StObject.set(x, "flows", js.Array(value*))
    
    inline def setPaymentMethod(value: SellCryptoPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
  }
}
