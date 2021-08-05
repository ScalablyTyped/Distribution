package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPosDataProvidersPosDataProvider extends StObject {
  
  /**
    * The display name of Pos data Provider.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The full name of this POS data Provider.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the account.
    */
  var providerId: js.UndefOr[String] = js.undefined
}
object SchemaPosDataProvidersPosDataProvider {
  
  inline def apply(): SchemaPosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProvidersPosDataProvider]
  }
  
  extension [Self <: SchemaPosDataProvidersPosDataProvider](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
