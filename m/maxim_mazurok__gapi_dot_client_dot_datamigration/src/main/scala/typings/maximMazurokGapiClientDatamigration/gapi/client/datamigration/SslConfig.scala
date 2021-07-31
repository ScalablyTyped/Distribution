package typings.maximMazurokGapiClientDatamigration.gapi.client.datamigration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SslConfig extends StObject {
  
  /**
    * Required. Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's
    * connecting to the right host.
    */
  var caCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is
    * mandatory.
    */
  var clientCertificate: js.UndefOr[String] = js.undefined
  
  /** Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory. */
  var clientKey: js.UndefOr[String] = js.undefined
  
  /** Output only. The ssl config type according to 'client_key', 'client_certificate' and 'ca_certificate'. */
  var `type`: js.UndefOr[String] = js.undefined
}
object SslConfig {
  
  @scala.inline
  def apply(): SslConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SslConfig]
  }
  
  @scala.inline
  implicit class SslConfigMutableBuilder[Self <: SslConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    @scala.inline
    def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    @scala.inline
    def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
