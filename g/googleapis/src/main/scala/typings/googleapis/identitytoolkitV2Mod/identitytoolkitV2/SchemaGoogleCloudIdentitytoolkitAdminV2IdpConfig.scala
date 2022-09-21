package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig extends StObject {
  
  /**
    * IDP's public keys for verifying signature in the assertions.
    */
  var idpCertificates: js.UndefOr[js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate]] = js.undefined
  
  /**
    * Unique identifier for all SAML entities.
    */
  var idpEntityId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Indicates if outbounding SAMLRequest should be signed.
    */
  var signRequest: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * URL to send Authentication request to.
    */
  var ssoUrl: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig {
  
  inline def apply(): SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig]
  }
  
  extension [Self <: SchemaGoogleCloudIdentitytoolkitAdminV2IdpConfig](x: Self) {
    
    inline def setIdpCertificates(value: js.Array[SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate]): Self = StObject.set(x, "idpCertificates", value.asInstanceOf[js.Any])
    
    inline def setIdpCertificatesUndefined: Self = StObject.set(x, "idpCertificates", js.undefined)
    
    inline def setIdpCertificatesVarargs(value: SchemaGoogleCloudIdentitytoolkitAdminV2IdpCertificate*): Self = StObject.set(x, "idpCertificates", js.Array(value*))
    
    inline def setIdpEntityId(value: String): Self = StObject.set(x, "idpEntityId", value.asInstanceOf[js.Any])
    
    inline def setIdpEntityIdNull: Self = StObject.set(x, "idpEntityId", null)
    
    inline def setIdpEntityIdUndefined: Self = StObject.set(x, "idpEntityId", js.undefined)
    
    inline def setSignRequest(value: Boolean): Self = StObject.set(x, "signRequest", value.asInstanceOf[js.Any])
    
    inline def setSignRequestNull: Self = StObject.set(x, "signRequest", null)
    
    inline def setSignRequestUndefined: Self = StObject.set(x, "signRequest", js.undefined)
    
    inline def setSsoUrl(value: String): Self = StObject.set(x, "ssoUrl", value.asInstanceOf[js.Any])
    
    inline def setSsoUrlNull: Self = StObject.set(x, "ssoUrl", null)
    
    inline def setSsoUrlUndefined: Self = StObject.set(x, "ssoUrl", js.undefined)
  }
}
