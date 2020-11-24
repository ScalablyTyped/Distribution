package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SslConfig extends js.Object {
  
  /**
    * Required. Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's
    * connecting to the right host.
    */
  var caCertificate: js.UndefOr[String] = js.native
  
  /**
    * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is
    * mandatory.
    */
  var clientCertificate: js.UndefOr[String] = js.native
  
  /** Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory. */
  var clientKey: js.UndefOr[String] = js.native
  
  /** Output only. The ssl config type according to 'client_key', 'client_certificate' and 'ca_certificate'. */
  var `type`: js.UndefOr[String] = js.native
}
object SslConfig {
  
  @scala.inline
  def apply(): SslConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslConfig]
  }
  
  @scala.inline
  implicit class SslConfigOps[Self <: SslConfig] (val x: Self) extends AnyVal {
    
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
    def setCaCertificate(value: String): Self = this.set("caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificate: Self = this.set("caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = this.set("clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificate: Self = this.set("clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = this.set("clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientKey: Self = this.set("clientKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
