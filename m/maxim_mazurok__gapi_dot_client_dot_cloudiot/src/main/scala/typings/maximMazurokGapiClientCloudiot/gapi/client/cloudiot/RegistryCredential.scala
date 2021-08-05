package typings.maximMazurokGapiClientCloudiot.gapi.client.cloudiot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegistryCredential extends StObject {
  
  /** A public key certificate used to verify the device credentials. */
  var publicKeyCertificate: js.UndefOr[PublicKeyCertificate] = js.undefined
}
object RegistryCredential {
  
  inline def apply(): RegistryCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegistryCredential]
  }
  
  extension [Self <: RegistryCredential](x: Self) {
    
    inline def setPublicKeyCertificate(value: PublicKeyCertificate): Self = StObject.set(x, "publicKeyCertificate", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyCertificateUndefined: Self = StObject.set(x, "publicKeyCertificate", js.undefined)
  }
}
