package typings.googleapis.v1alphaMod.appengineV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An SSL certificate obtained from a certificate authority.
  */
@js.native
trait SchemaCertificateRawData extends js.Object {
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
  implicit class SchemaCertificateRawDataOps[Self <: SchemaCertificateRawData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateKey: Self = this.set("privateKey", js.undefined)
    @scala.inline
    def setPublicCertificate(value: String): Self = this.set("publicCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicCertificate: Self = this.set("publicCertificate", js.undefined)
  }
  
}

