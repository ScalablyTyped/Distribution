package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateRawData extends StObject {
  
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on certificate creation and then encrypted. The key size must be 2048 bits or fewer. Must include the header and
    * footer. Example: -----BEGIN RSA PRIVATE KEY----- -----END RSA PRIVATE KEY----- @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.native
  
  /**
    * PEM encoded x.509 public key certificate. This field is set once on certificate creation. Must include the header and footer. Example: -----BEGIN CERTIFICATE----- -----END
    * CERTIFICATE-----
    */
  var publicCertificate: js.UndefOr[String] = js.native
}
object CertificateRawData {
  
  @scala.inline
  def apply(): CertificateRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateRawData]
  }
  
  @scala.inline
  implicit class CertificateRawDataMutableBuilder[Self <: CertificateRawData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
    
    @scala.inline
    def setPublicCertificate(value: String): Self = StObject.set(x, "publicCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicCertificateUndefined: Self = StObject.set(x, "publicCertificate", js.undefined)
  }
}
