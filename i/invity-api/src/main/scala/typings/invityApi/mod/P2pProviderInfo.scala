package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pProviderInfo extends StObject {
  
  // hodlhodl
  var companyName: String
  
  // hodlhodl-icon.svg
  var isActive: Boolean
  
  // HodlHodl
  var logo: String
  
  var name: String
  
  // ['EUR', 'USD']
  var supportedCountries: js.Array[CountryCode]
  
  var tradedCoins: js.Array[Coin]
  
  // ['BTC', 'BCH', 'LTC', 'XRP', 'ETH']
  var tradedCurrencies: js.Array[Currency]
}
object P2pProviderInfo {
  
  inline def apply(
    companyName: String,
    isActive: Boolean,
    logo: String,
    name: String,
    supportedCountries: js.Array[CountryCode],
    tradedCoins: js.Array[Coin],
    tradedCurrencies: js.Array[Currency]
  ): P2pProviderInfo = {
    val __obj = js.Dynamic.literal(companyName = companyName.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], logo = logo.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], supportedCountries = supportedCountries.asInstanceOf[js.Any], tradedCoins = tradedCoins.asInstanceOf[js.Any], tradedCurrencies = tradedCurrencies.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pProviderInfo]
  }
  
  extension [Self <: P2pProviderInfo](x: Self) {
    
    inline def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setLogo(value: String): Self = StObject.set(x, "logo", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountries(value: js.Array[CountryCode]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesVarargs(value: CountryCode*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    
    inline def setTradedCoins(value: js.Array[Coin]): Self = StObject.set(x, "tradedCoins", value.asInstanceOf[js.Any])
    
    inline def setTradedCoinsVarargs(value: Coin*): Self = StObject.set(x, "tradedCoins", js.Array(value*))
    
    inline def setTradedCurrencies(value: js.Array[Currency]): Self = StObject.set(x, "tradedCurrencies", value.asInstanceOf[js.Any])
    
    inline def setTradedCurrenciesVarargs(value: Currency*): Self = StObject.set(x, "tradedCurrencies", js.Array(value*))
  }
}
