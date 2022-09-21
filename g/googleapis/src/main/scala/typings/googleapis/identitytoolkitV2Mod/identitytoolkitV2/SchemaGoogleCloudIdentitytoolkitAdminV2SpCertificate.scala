package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2SpCertificate extends StObject {
  
  /**
    * Timestamp of the cert expiration instance.
    */
  var expiresAt: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Self-signed public certificate.
    */
  var x509Certificate: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2SpCertificate {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2SpCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2SpCertificate]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2SpCertificate](x: Self) {
    
    inline def setExpiresAt(value: String): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
    
    inline def setExpiresAtNull: Self = StObject.set(x, "expiresAt", null)
    
    inline def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
    
    inline def setX509Certificate(value: String): Self = StObject.set(x, "x509Certificate", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateNull: Self = StObject.set(x, "x509Certificate", null)
    
    inline def setX509CertificateUndefined: Self = StObject.set(x, "x509Certificate", js.undefined)
  }
}
