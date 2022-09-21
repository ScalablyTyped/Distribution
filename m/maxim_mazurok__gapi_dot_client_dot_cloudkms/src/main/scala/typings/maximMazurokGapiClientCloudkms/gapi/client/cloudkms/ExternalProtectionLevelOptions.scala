package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProtectionLevelOptions extends StObject {
  
  /** The path to the external key material on the EKM when using EkmConnection e.g., "v0/my/key". Set this field instead of external_key_uri when using an EkmConnection. */
  var ekmConnectionKeyPath: js.UndefOr[String] = js.undefined
  
  /** The URI for an external resource that this CryptoKeyVersion represents. */
  var externalKeyUri: js.UndefOr[String] = js.undefined
}
object ExternalProtectionLevelOptions {
  
  inline def apply(): ExternalProtectionLevelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProtectionLevelOptions]
  }
  
  extension [Self <: ExternalProtectionLevelOptions](x: Self) {
    
    inline def setEkmConnectionKeyPath(value: String): Self = StObject.set(x, "ekmConnectionKeyPath", value.asInstanceOf[js.Any])
    
    inline def setEkmConnectionKeyPathUndefined: Self = StObject.set(x, "ekmConnectionKeyPath", js.undefined)
    
    inline def setExternalKeyUri(value: String): Self = StObject.set(x, "externalKeyUri", value.asInstanceOf[js.Any])
    
    inline def setExternalKeyUriUndefined: Self = StObject.set(x, "externalKeyUri", js.undefined)
  }
}
