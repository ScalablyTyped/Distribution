package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProtectionLevelOptions extends StObject {
  
  /** The URI for an external resource that this CryptoKeyVersion represents. */
  var externalKeyUri: js.UndefOr[String] = js.undefined
}
object ExternalProtectionLevelOptions {
  
  inline def apply(): ExternalProtectionLevelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProtectionLevelOptions]
  }
  
  extension [Self <: ExternalProtectionLevelOptions](x: Self) {
    
    inline def setExternalKeyUri(value: String): Self = StObject.set(x, "externalKeyUri", value.asInstanceOf[js.Any])
    
    inline def setExternalKeyUriUndefined: Self = StObject.set(x, "externalKeyUri", js.undefined)
  }
}
