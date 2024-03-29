package typings.instagramPrivateApi

import typings.instagramPrivateApi.anon.Countrycode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object userLookupOptionsMod {
  
  trait UserLookupOptions extends StObject {
    
    var countryCodes: js.UndefOr[js.Array[Countrycode]] = js.undefined
    
    var directlySignIn: js.UndefOr[Boolean] = js.undefined
    
    var query: String
    
    var waterfallId: js.UndefOr[String] = js.undefined
  }
  object UserLookupOptions {
    
    inline def apply(query: String): UserLookupOptions = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserLookupOptions]
    }
    
    extension [Self <: UserLookupOptions](x: Self) {
      
      inline def setCountryCodes(value: js.Array[Countrycode]): Self = StObject.set(x, "countryCodes", value.asInstanceOf[js.Any])
      
      inline def setCountryCodesUndefined: Self = StObject.set(x, "countryCodes", js.undefined)
      
      inline def setCountryCodesVarargs(value: Countrycode*): Self = StObject.set(x, "countryCodes", js.Array(value :_*))
      
      inline def setDirectlySignIn(value: Boolean): Self = StObject.set(x, "directlySignIn", value.asInstanceOf[js.Any])
      
      inline def setDirectlySignInUndefined: Self = StObject.set(x, "directlySignIn", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setWaterfallId(value: String): Self = StObject.set(x, "waterfallId", value.asInstanceOf[js.Any])
      
      inline def setWaterfallIdUndefined: Self = StObject.set(x, "waterfallId", js.undefined)
    }
  }
}
