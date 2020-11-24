package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyTradeQuoteRequest extends js.Object {
  
   // BTC
  var country: js.UndefOr[String] = js.native
  
   // 1000 - will pay fiat amount
  var cryptoStringAmount: js.UndefOr[String] = js.native
  
   // 0.3 - requested amount in crypto currency
  var fiatCurrency: String = js.native
  
   // true for cryptoAmount, false for fiatAmount
  var fiatStringAmount: js.UndefOr[String] = js.native
  
  var paymentMethod: js.UndefOr[BuyCryptoPaymentMethod] = js.native
  
   // USD
  var receiveCurrency: String = js.native
  
  var wantCrypto: Boolean = js.native
}
object BuyTradeQuoteRequest {
  
  @scala.inline
  def apply(fiatCurrency: String, receiveCurrency: String, wantCrypto: Boolean): BuyTradeQuoteRequest = {
    val __obj = js.Dynamic.literal(fiatCurrency = fiatCurrency.asInstanceOf[js.Any], receiveCurrency = receiveCurrency.asInstanceOf[js.Any], wantCrypto = wantCrypto.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyTradeQuoteRequest]
  }
  
  @scala.inline
  implicit class BuyTradeQuoteRequestOps[Self <: BuyTradeQuoteRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiatCurrency(value: String): Self = this.set("fiatCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiveCurrency(value: String): Self = this.set("receiveCurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWantCrypto(value: Boolean): Self = this.set("wantCrypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setCryptoStringAmount(value: String): Self = this.set("cryptoStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCryptoStringAmount: Self = this.set("cryptoStringAmount", js.undefined)
    
    @scala.inline
    def setFiatStringAmount(value: String): Self = this.set("fiatStringAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFiatStringAmount: Self = this.set("fiatStringAmount", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: BuyCryptoPaymentMethod): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
  }
}
