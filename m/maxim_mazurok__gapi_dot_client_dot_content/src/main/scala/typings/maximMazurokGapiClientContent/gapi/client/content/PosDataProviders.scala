package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosDataProviders extends StObject {
  
  /** Country code. */
  var country: js.UndefOr[String] = js.undefined
  
  /** A list of POS data providers. */
  var posDataProviders: js.UndefOr[js.Array[PosDataProvidersPosDataProvider]] = js.undefined
}
object PosDataProviders {
  
  inline def apply(): PosDataProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosDataProviders]
  }
  
  extension [Self <: PosDataProviders](x: Self) {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setPosDataProviders(value: js.Array[PosDataProvidersPosDataProvider]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    inline def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    inline def setPosDataProvidersVarargs(value: PosDataProvidersPosDataProvider*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
