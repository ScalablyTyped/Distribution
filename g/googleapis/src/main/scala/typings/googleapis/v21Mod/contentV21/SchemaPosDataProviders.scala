package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosDataProviders extends StObject {
  
  /**
    * Country code.
    */
  var country: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProvidersPosDataProvider]] = js.undefined
}
object SchemaPosDataProviders {
  
  inline def apply(): SchemaPosDataProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProviders]
  }
  
  extension [Self <: SchemaPosDataProviders](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setPosDataProviders(value: js.Array[SchemaPosDataProvidersPosDataProvider]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    inline def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    inline def setPosDataProvidersVarargs(value: SchemaPosDataProvidersPosDataProvider*): Self = StObject.set(x, "posDataProviders", js.Array(value*))
  }
}
