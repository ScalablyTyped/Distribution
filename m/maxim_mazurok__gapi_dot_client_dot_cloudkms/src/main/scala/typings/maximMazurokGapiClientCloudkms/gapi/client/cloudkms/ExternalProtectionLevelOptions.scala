package typings.maximMazurokGapiClientCloudkms.gapi.client.cloudkms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExternalProtectionLevelOptions extends StObject {
  
  /** The URI for an external resource that this CryptoKeyVersion represents. */
  var externalKeyUri: js.UndefOr[String] = js.undefined
}
object ExternalProtectionLevelOptions {
  
  @scala.inline
  def apply(): ExternalProtectionLevelOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExternalProtectionLevelOptions]
  }
  
  @scala.inline
  implicit class ExternalProtectionLevelOptionsMutableBuilder[Self <: ExternalProtectionLevelOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExternalKeyUri(value: String): Self = StObject.set(x, "externalKeyUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalKeyUriUndefined: Self = StObject.set(x, "externalKeyUri", js.undefined)
  }
}
