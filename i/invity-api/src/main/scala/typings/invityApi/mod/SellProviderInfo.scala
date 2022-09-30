package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellProviderInfo extends StObject {
  
  // simplex
  var companyName: String
  
  var flow: js.UndefOr[SellFiatFlowType] = js.undefined
  
  var isActive: Boolean
  
  var isRefundAddressRequired: js.UndefOr[Boolean] = js.undefined
  
  // Simplex
  var logo: String
  
  var name: String
  
  var paymentMethods: js.UndefOr[js.Array[SellCryptoPaymentMethod]] = js.undefined
  
  var pendingTimeout: js.UndefOr[Double] = js.undefined
  
  // https://www.simplex.com/support/
  var quoteInfo: js.UndefOr[String] = js.undefined
  
  // ['AT', 'BE']
  var statusUrl: js.UndefOr[String] = js.undefined
  
  // https://payment-status.simplex.com/api/v1/user/payments?uuid={{paymentId}}
  var supportUrl: js.UndefOr[String] = js.undefined
  
  // ['EUR', 'USD']
  var supportedCountries: js.Array[String]
  
  var tradedCoins: js.Array[String]
  
  // ['BTC', 'BCH', 'LTC', 'XRP', 'ETH']
  var tradedFiatCurrencies: js.UndefOr[js.Array[String]] = js.undefined
  
  // simplex-icon.jpg
  var `type`: SellProviderType
  
  // some info text shown on quote
  var voucherSiteOrigin: js.UndefOr[String] = js.undefined
}
object SellProviderInfo {
  
  inline def apply(
    companyName: String,
    isActive: Boolean,
    logo: String,
    name: String,
    supportedCountries: js.Array[String],
    tradedCoins: js.Array[String],
    `type`: SellProviderType
  ): SellProviderInfo = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedCountries = supportedCountries.asInstanceOf[js.Any], tradedCoins = tradedCoins.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellProviderInfo]
  }
  
  extension [Self <: SellProviderInfo](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setFlow(value: SellFiatFlowType): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
    
    inline def setFlowUndefined: Self = StObject.set(x, "flow", js.undefined)
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setIsRefundAddressRequired(value: Boolean): Self = StObject.set(x, "isRefundAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setIsRefundAddressRequiredUndefined: Self = StObject.set(x, "isRefundAddressRequired", js.undefined)
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethods(value: js.Array[SellCryptoPaymentMethod]): Self = StObject.set(x, "paymentMethods", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodsUndefined: Self = StObject.set(x, "paymentMethods", js.undefined)
    
    inline def setPaymentMethodsVarargs(value: SellCryptoPaymentMethod*): Self = StObject.set(x, "paymentMethods", js.Array(value*))
    
    inline def setPendingTimeout(value: Double): Self = StObject.set(x, "pendingTimeout", value.asInstanceOf[js.Any])
    
    inline def setPendingTimeoutUndefined: Self = StObject.set(x, "pendingTimeout", js.undefined)
    
    inline def setQuoteInfo(value: String): Self = StObject.set(x, "quoteInfo", value.asInstanceOf[js.Any])
    
    inline def setQuoteInfoUndefined: Self = StObject.set(x, "quoteInfo", js.undefined)
    
    inline def setStatusUrl(value: String): Self = StObject.set(x, "statusUrl", value.asInstanceOf[js.Any])
    
    inline def setStatusUrlUndefined: Self = StObject.set(x, "statusUrl", js.undefined)
    
    inline def setSupportUrl(value: String): Self = StObject.set(x, "supportUrl", value.asInstanceOf[js.Any])
    
    inline def setSupportUrlUndefined: Self = StObject.set(x, "supportUrl", js.undefined)
    
    inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    
    inline def setTradedCoins(value: js.Array[String]): Self = StObject.set(x, "tradedCoins", value.asInstanceOf[js.Any])
    
    inline def setTradedCoinsVarargs(value: String*): Self = StObject.set(x, "tradedCoins", js.Array(value*))
    
    inline def setTradedFiatCurrencies(value: js.Array[String]): Self = StObject.set(x, "tradedFiatCurrencies", value.asInstanceOf[js.Any])
    
    inline def setTradedFiatCurrenciesUndefined: Self = StObject.set(x, "tradedFiatCurrencies", js.undefined)
    
    inline def setTradedFiatCurrenciesVarargs(value: String*): Self = StObject.set(x, "tradedFiatCurrencies", js.Array(value*))
    
    inline def setType(value: SellProviderType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVoucherSiteOrigin(value: String): Self = StObject.set(x, "voucherSiteOrigin", value.asInstanceOf[js.Any])
    
    inline def setVoucherSiteOriginUndefined: Self = StObject.set(x, "voucherSiteOrigin", js.undefined)
  }
}
