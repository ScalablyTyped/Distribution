package typings.maximMazurokGapiClientAndroidenterprise.gapi.client.androidenterprise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSigningCertificate extends StObject {
  
  /** The base64 urlsafe encoded SHA1 hash of the certificate. (This field is deprecated in favor of SHA2-256. It should not be used and may be removed at any time.) */
  var certificateHashSha1: js.UndefOr[String] = js.undefined
  
  /** The base64 urlsafe encoded SHA2-256 hash of the certificate. */
  var certificateHashSha256: js.UndefOr[String] = js.undefined
}
object ProductSigningCertificate {
  
  inline def apply(): ProductSigningCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSigningCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProductSigningCertificate] (val x: Self) extends AnyVal {
    
    inline def setCertificateHashSha1(value: String): Self = StObject.set(x, "certificateHashSha1", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSha1Undefined: Self = StObject.set(x, "certificateHashSha1", js.undefined)
    
    inline def setCertificateHashSha256(value: String): Self = StObject.set(x, "certificateHashSha256", value.asInstanceOf[js.Any])
    
    inline def setCertificateHashSha256Undefined: Self = StObject.set(x, "certificateHashSha256", js.undefined)
  }
}
