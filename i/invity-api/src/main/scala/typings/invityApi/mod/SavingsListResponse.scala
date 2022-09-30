package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingsListResponse extends StObject {
  
  var country: String
  
  var providers: js.Array[SavingsProviderInfo]
}
object SavingsListResponse {
  
  inline def apply(country: String, providers: js.Array[SavingsProviderInfo]): SavingsListResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsListResponse]
  }
  
  extension [Self <: SavingsListResponse](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[SavingsProviderInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: SavingsProviderInfo*): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
