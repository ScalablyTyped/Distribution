package typings.invityApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SellListResponse extends StObject {
  
  var country: String
  
  var providers: js.Array[SellProviderInfo]
}
object SellListResponse {
  
  inline def apply(country: String, providers: js.Array[SellProviderInfo]): SellListResponse = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SellListResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SellListResponse] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[SellProviderInfo]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: SellProviderInfo*): Self = StObject.set(x, "providers", js.Array(value*))
  }
}
