package typings.googleapis.datastreamV1Mod.datastreamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMysqlSslConfig extends StObject {
  
  /**
    * Input only. PEM-encoded certificate of the CA that signed the source database server's certificate.
    */
  var caCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the ca_certificate field is set.
    */
  var caCertificateSet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the 'client_key' and the 'ca_certificate' fields are mandatory.
    */
  var clientCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the client_certificate field is set.
    */
  var clientCertificateSet: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' and the 'ca_certificate' fields are mandatory.
    */
  var clientKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether the client_key field is set.
    */
  var clientKeySet: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaMysqlSslConfig {
  
  inline def apply(): SchemaMysqlSslConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMysqlSslConfig]
  }
  
  extension [Self <: SchemaMysqlSslConfig](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateNull: Self = StObject.set(x, "caCertificate", null)
    
    inline def setCaCertificateSet(value: Boolean): Self = StObject.set(x, "caCertificateSet", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateSetNull: Self = StObject.set(x, "caCertificateSet", null)
    
    inline def setCaCertificateSetUndefined: Self = StObject.set(x, "caCertificateSet", js.undefined)
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    inline def setClientCertificateSet(value: Boolean): Self = StObject.set(x, "clientCertificateSet", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateSetNull: Self = StObject.set(x, "clientCertificateSet", null)
    
    inline def setClientCertificateSetUndefined: Self = StObject.set(x, "clientCertificateSet", js.undefined)
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyNull: Self = StObject.set(x, "clientKey", null)
    
    inline def setClientKeySet(value: Boolean): Self = StObject.set(x, "clientKeySet", value.asInstanceOf[js.Any])
    
    inline def setClientKeySetNull: Self = StObject.set(x, "clientKeySet", null)
    
    inline def setClientKeySetUndefined: Self = StObject.set(x, "clientKeySet", js.undefined)
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
  }
}
