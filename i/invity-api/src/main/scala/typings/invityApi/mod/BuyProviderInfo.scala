package typings.invityApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyProviderInfo extends js.Object {
  
   // simplex
  var companyName: String = js.native
  
   // simplex-icon.jpg
  var isActive: Boolean = js.native
  
   // Simplex
  var logo: String = js.native
  
  var name: String = js.native
  
   // ['AT', 'BE']
  var paymentMethods: js.Array[BuyCryptoPaymentMethod] = js.native
  
  var statusUrl: String = js.native
  
   // https://payment-status.simplex.com/api/v1/user/payments?uuid={{paymentId}}
  var supportUrl: String = js.native
  
   // ['EUR', 'USD']
  var supportedCountries: js.Array[String] = js.native
  
  var tradedCoins: js.Array[String] = js.native
  
   // ['BTC', 'BCH', 'LTC', 'XRP', 'ETH']
  var tradedFiatCurrencies: js.Array[String] = js.native
}
object BuyProviderInfo {
  
  @scala.inline
  def apply(
    companyName: String,
    isActive: Boolean,
    logo: String,
    name: String,
    paymentMethods: js.Array[BuyCryptoPaymentMethod],
    statusUrl: String,
    supportUrl: String,
    supportedCountries: js.Array[String],
    tradedCoins: js.Array[String],
    tradedFiatCurrencies: js.Array[String]
  ): BuyProviderInfo = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], paymentMethods = paymentMethods.asInstanceOf[js.Any], statusUrl = statusUrl.asInstanceOf[js.Any], supportUrl = supportUrl.asInstanceOf[js.Any], supportedCountries = supportedCountries.asInstanceOf[js.Any], tradedCoins = tradedCoins.asInstanceOf[js.Any], tradedFiatCurrencies = tradedFiatCurrencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyProviderInfo]
  }
  
  @scala.inline
  implicit class BuyProviderInfoOps[Self <: BuyProviderInfo] (val x: Self) extends AnyVal {
    
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
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = this.set("logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodsVarargs(value: BuyCryptoPaymentMethod*): Self = this.set("paymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setPaymentMethods(value: js.Array[BuyCryptoPaymentMethod]): Self = this.set("paymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUrl(value: String): Self = this.set("statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrl(value: String): Self = this.set("supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = this.set("supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = this.set("supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradedCoinsVarargs(value: String*): Self = this.set("tradedCoins", js.Array(value :_*))
    
    @scala.inline
    def setTradedCoins(value: js.Array[String]): Self = this.set("tradedCoins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradedFiatCurrenciesVarargs(value: String*): Self = this.set("tradedFiatCurrencies", js.Array(value :_*))
    
    @scala.inline
    def setTradedFiatCurrencies(value: js.Array[String]): Self = this.set("tradedFiatCurrencies", value.asInstanceOf[js.Any])
  }
}
