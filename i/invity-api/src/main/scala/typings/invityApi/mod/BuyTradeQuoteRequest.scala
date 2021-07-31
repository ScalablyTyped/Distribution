package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyTradeQuoteRequest extends StObject {
  
  // BTC
  var country: js.UndefOr[String] = js.undefined
  
  // 1000 - will pay fiat amount
  var cryptoStringAmount: js.UndefOr[String] = js.undefined
  
  // 0.3 - requested amount in crypto currency
  var fiatCurrency: String
  
  // true for cryptoAmount, false for fiatAmount
  var fiatStringAmount: js.UndefOr[String] = js.undefined
  
  var paymentMethod: js.UndefOr[BuyCryptoPaymentMethod] = js.undefined
  
  // USD
  var receiveCurrency: String
  
  var wantCrypto: Boolean
}
object BuyTradeQuoteRequest {
  
  @scala.inline
  def apply(fiatCurrency: String, receiveCurrency: String, wantCrypto: Boolean): BuyTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(fiatCurrency = fiatCurrency.asInstanceOf[js.Any], receiveCurrency = receiveCurrency.asInstanceOf[js.Any], wantCrypto = wantCrypto.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeQuoteRequest]
  }
  
  @scala.inline
  implicit class BuyTradeQuoteRequestMutableBuilder[Self <: BuyTradeQuoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setCryptoStringAmount(value: String): Self = StObject.set(x, "cryptoStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCryptoStringAmountUndefined: Self = StObject.set(x, "cryptoStringAmount", js.undefined)
    
    @scala.inline
    def setFiatCurrency(value: String): Self = StObject.set(x, "fiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiatStringAmount(value: String): Self = StObject.set(x, "fiatStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiatStringAmountUndefined: Self = StObject.set(x, "fiatStringAmount", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: BuyCryptoPaymentMethod): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setReceiveCurrency(value: String): Self = StObject.set(x, "receiveCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantCrypto(value: Boolean): Self = StObject.set(x, "wantCrypto", value.asInstanceOf[js.Any])
  }
}
