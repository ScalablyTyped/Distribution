package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuyProviderInfo extends StObject {
  
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
  implicit class BuyProviderInfoMutableBuilder[Self <: BuyProviderInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethods(value: js.Array[BuyCryptoPaymentMethod]): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodsVarargs(value: BuyCryptoPaymentMethod*): Self = StObject.set(x, "paymentMethods", js.Array(value :_*))
    
    @scala.inline
    def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setTradedCoins(value: js.Array[String]): Self = StObject.set(x, "tradedCoins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradedCoinsVarargs(value: String*): Self = StObject.set(x, "tradedCoins", js.Array(value :_*))
    
    @scala.inline
    def setTradedFiatCurrencies(value: js.Array[String]): Self = StObject.set(x, "tradedFiatCurrencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTradedFiatCurrenciesVarargs(value: String*): Self = StObject.set(x, "tradedFiatCurrencies", js.Array(value :_*))
  }
}
