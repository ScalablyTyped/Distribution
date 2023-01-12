package typings.maximMazurokGapiClientContent.gapi.client.content

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PosDataProvidersPosDataProvider extends StObject {
  
  /** The display name of Pos data Provider. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** The full name of this POS data Provider. */
  var fullName: js.UndefOr[String] = js.undefined
  
  /** The ID of the account. */
  var providerId: js.UndefOr[String] = js.undefined
}
object PosDataProvidersPosDataProvider {
  
  inline def apply(): PosDataProvidersPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PosDataProvidersPosDataProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PosDataProvidersPosDataProvider] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
    inline def setProviderId(value: String): Self = StObject.set(x, "providerId", value.asInstanceOf[js.Any])
    
    inline def setProviderIdUndefined: Self = StObject.set(x, "providerId", js.undefined)
  }
}
