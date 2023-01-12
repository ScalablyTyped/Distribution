package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyListResponse extends StObject {
  
  var country: String
  
  // optional field, fiat currency based on user's IP
  var providers: js.Array[BuyProviderInfo]
  
  var suggestedFiatCurrency: js.UndefOr[String] = js.undefined
}
object BuyListResponse {
  
  inline def apply(country: String, providers: js.Array[BuyProviderInfo]): BuyListResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuyListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuyListResponse] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[BuyProviderInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: BuyProviderInfo*): Self = StObject.set(x, "providers", js.Array(value*))
    
    inline def setSuggestedFiatCurrency(value: String): Self = StObject.set(x, "suggestedFiatCurrency", value.asInstanceOf[js.Any])
    
    inline def setSuggestedFiatCurrencyUndefined: Self = StObject.set(x, "suggestedFiatCurrency", js.undefined)
  }
}
