package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertAuthorityInstalledEvent extends StObject {
  
  /** Subject of the certificate. */
  var certificate: js.UndefOr[String] = js.undefined
  
  /** Whether the installation event succeeded. */
  var success: js.UndefOr[Boolean] = js.undefined
  
  /** The user in which the certificate install event happened. Only available for devices running Android 11 and above. */
  var userId: js.UndefOr[Double] = js.undefined
}
object CertAuthorityInstalledEvent {
  
  inline def apply(): CertAuthorityInstalledEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertAuthorityInstalledEvent]
  }
  
  extension [Self <: CertAuthorityInstalledEvent](x: Self) {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
