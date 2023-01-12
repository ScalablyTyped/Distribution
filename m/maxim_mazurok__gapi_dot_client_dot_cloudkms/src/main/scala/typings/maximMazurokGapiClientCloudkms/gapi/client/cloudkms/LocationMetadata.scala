package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationMetadata extends StObject {
  
  /** Indicates whether CryptoKeys with protection_level EXTERNAL can be created in this location. */
  var ekmAvailable: js.UndefOr[Boolean] = js.undefined
  
  /** Indicates whether CryptoKeys with protection_level HSM can be created in this location. */
  var hsmAvailable: js.UndefOr[Boolean] = js.undefined
}
object LocationMetadata {
  
  inline def apply(): LocationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationMetadata] (val x: Self) extends AnyVal {
    
    inline def setEkmAvailable(value: Boolean): Self = StObject.set(x, "ekmAvailable", value.asInstanceOf[js.Any])
    
    inline def setEkmAvailableUndefined: Self = StObject.set(x, "ekmAvailable", js.undefined)
    
    inline def setHsmAvailable(value: Boolean): Self = StObject.set(x, "hsmAvailable", value.asInstanceOf[js.Any])
    
    inline def setHsmAvailableUndefined: Self = StObject.set(x, "hsmAvailable", js.undefined)
  }
}
