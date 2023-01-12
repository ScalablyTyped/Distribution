package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertAuthorityRemovedEvent extends StObject {
  
  /** Subject of the certificate. */
  var certificate: js.UndefOr[String] = js.undefined
  
  /** Whether the removal succeeded. */
  var success: js.UndefOr[Boolean] = js.undefined
  
  /** The user in which the certificate removal event occurred. Only available for devices running Android 11 and above. */
  var userId: js.UndefOr[Double] = js.undefined
}
object CertAuthorityRemovedEvent {
  
  inline def apply(): CertAuthorityRemovedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertAuthorityRemovedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertAuthorityRemovedEvent] (val x: Self) extends AnyVal {
    
    inline def setCertificate(value: String): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "certificate", js.undefined)
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUserId(value: Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
