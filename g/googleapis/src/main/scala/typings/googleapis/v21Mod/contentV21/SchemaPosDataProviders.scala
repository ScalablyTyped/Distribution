package typings.googleapis.v21Mod.contentV21

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPosDataProviders extends StObject {
  
  /**
    * Country code.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProvidersPosDataProvider]] = js.native
}
object SchemaPosDataProviders {
  
  @scala.inline
  def apply(): SchemaPosDataProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProviders]
  }
  
  @scala.inline
  implicit class SchemaPosDataProvidersMutableBuilder[Self <: SchemaPosDataProviders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setPosDataProviders(value: js.Array[SchemaPosDataProvidersPosDataProvider]): Self = StObject.set(x, "posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProvidersUndefined: Self = StObject.set(x, "posDataProviders", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: SchemaPosDataProvidersPosDataProvider*): Self = StObject.set(x, "posDataProviders", js.Array(value :_*))
  }
}
