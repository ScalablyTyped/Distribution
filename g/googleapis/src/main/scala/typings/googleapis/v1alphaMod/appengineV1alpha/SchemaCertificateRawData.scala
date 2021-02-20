package typings.googleapis.v1alphaMod.appengineV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An SSL certificate obtained from a certificate authority.
  */
@js.native
trait SchemaCertificateRawData extends StObject {
  
  /**
    * Unencrypted PEM encoded RSA private key. This field is set once on
    * certificate creation and then encrypted. The key size must be 2048 bits
    * or fewer. Must include the header and footer. Example: &lt;pre&gt;
    * -----BEGIN RSA PRIVATE KEY----- &lt;unencrypted_key_value&gt; -----END
    * RSA PRIVATE KEY----- &lt;/pre&gt; @InputOnly
    */
  var privateKey: js.UndefOr[String] = js.native
  
  /**
    * PEM encoded x.509 public key certificate. This field is set once on
    * certificate creation. Must include the header and footer. Example:
    * &lt;pre&gt; -----BEGIN CERTIFICATE----- &lt;certificate_value&gt;
    * -----END CERTIFICATE----- &lt;/pre&gt;
    */
  var publicCertificate: js.UndefOr[String] = js.native
}
object SchemaCertificateRawData {
  
  @scala.inline
  def apply(): SchemaCertificateRawData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCertificateRawData]
  }
  
  @scala.inline
  implicit class SchemaCertificateRawDataMutableBuilder[Self <: SchemaCertificateRawData] (val x: Self) extends AnyVal {
    
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
