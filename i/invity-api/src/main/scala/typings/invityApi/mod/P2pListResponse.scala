package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait P2pListResponse extends StObject {
  
  var country: String
  
  // optional field, fiat currency based on user's IP
  var providers: js.Array[P2pProviderInfo]
  
  var suggestedFiatCurrency: js.UndefOr[String] = js.undefined
}
object P2pListResponse {
  
  inline def apply(country: String, providers: js.Array[P2pProviderInfo]): P2pListResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[P2pListResponse]
  }
  
  extension [Self <: P2pListResponse](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[P2pProviderInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: P2pProviderInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSuggestedFiatCurrency(value: String): Self = StObject.set(x, "suggestedFiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setSuggestedFiatCurrencyUndefined: Self = StObject.set(x, "suggestedFiatCurrency", js.undefined)
  }
}
