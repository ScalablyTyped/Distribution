package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyProviderInfo extends StObject {
  
  // simplex
  var companyName: String
  
  // ['BTC', 'USD']
  var disabledCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  // ['EUR', 'USD']
  var disabledCurrencies: js.UndefOr[js.Array[String]] = js.undefined
  
  // simplex-icon.jpg
  var isActive: Boolean
  
  var isDisabled: js.UndefOr[Boolean] = js.undefined
  
  // Simplex
  var logo: String
  
  var name: String
  
  var paymentMethods: js.Array[BuyCryptoPaymentMethod]
  
  // https://www.simplex.com/support/
  var pendingTimeoutSeconds: js.UndefOr[Double] = js.undefined
  
  var statusUrl: String
  
  // https://payment-status.simplex.com/api/v1/user/payments?uuid={{paymentId}}
  var supportUrl: String
  
  var supportedCountries: js.Array[String]
  
  var tradedCoins: js.Array[String]
  
  // ['BTC', 'BCH', 'LTC', 'XRP', 'ETH']
  var tradedFiatCurrencies: js.Array[String]
}
object BuyProviderInfo {
  
  inline def apply(
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
  
  extension [Self <: BuyProviderInfo](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setDisabledCountries(value: js.Array[String]): Self = StObject.set(x, "disabledCountries", value.asInstanceOf[js.Any])
    
    inline def setDisabledCountriesUndefined: Self = StObject.set(x, "disabledCountries", js.undefined)
    
    inline def setDisabledCountriesVarargs(value: String*): Self = StObject.set(x, "disabledCountries", js.Array(value*))
    
    inline def setDisabledCurrencies(value: js.Array[String]): Self = StObject.set(x, "disabledCurrencies", value.asInstanceOf[js.Any])
    
    inline def setDisabledCurrenciesUndefined: Self = StObject.set(x, "disabledCurrencies", js.undefined)
    
    inline def setDisabledCurrenciesVarargs(value: String*): Self = StObject.set(x, "disabledCurrencies", js.Array(value*))
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethods(value: js.Array[BuyCryptoPaymentMethod]): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodsVarargs(value: BuyCryptoPaymentMethod*): Self = StObject.set(x, "paymentMethods", js.Array(value*))
    
    inline def setPendingTimeoutSeconds(value: Double): Self = StObject.set(x, "pendingTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setPendingTimeoutSecondsUndefined: Self = StObject.set(x, "pendingTimeoutSeconds", js.undefined)
    
    inline def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    
    inline def setTradedCoins(value: js.Array[String]): Self = StObject.set(x, "tradedCoins", value.asInstanceOf[js.Any])
    
    inline def setTradedCoinsVarargs(value: String*): Self = StObject.set(x, "tradedCoins", js.Array(value*))
    
    inline def setTradedFiatCurrencies(value: js.Array[String]): Self = StObject.set(x, "tradedFiatCurrencies", value.asInstanceOf[js.Any])
    
    inline def setTradedFiatCurrenciesVarargs(value: String*): Self = StObject.set(x, "tradedFiatCurrencies", js.Array(value*))
  }
}
