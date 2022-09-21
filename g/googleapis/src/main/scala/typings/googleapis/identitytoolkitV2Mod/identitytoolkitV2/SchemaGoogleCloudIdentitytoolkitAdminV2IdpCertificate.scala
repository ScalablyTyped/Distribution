package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate extends StObject {
  
  /**
    * The x509 certificate
    */
  var x509Certificate: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate](x: Self) {
    
    inline def setX509Certificate(value: String): Self = StObject.set(x, "x509Certificate", value.asInstanceOf[js.Any])
    
    inline def setX509CertificateNull: Self = StObject.set(x, "x509Certificate", null)
    
    inline def setX509CertificateUndefined: Self = StObject.set(x, "x509Certificate", js.undefined)
  }
}
