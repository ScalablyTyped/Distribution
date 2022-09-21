package typings.googleapis.datamigrationV1Mod.datamigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSslConfig extends StObject {
  
  /**
    * Required. Input only. The x509 PEM-encoded certificate of the CA that signed the source database server's certificate. The replica will use this certificate to verify it's connecting to the right host.
    */
  var caCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The x509 PEM-encoded certificate that will be used by the replica to authenticate against the source database server.If this field is used then the 'client_key' field is mandatory.
    */
  var clientCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Input only. The unencrypted PKCS#1 or PKCS#8 PEM-encoded private key associated with the Client Certificate. If this field is used then the 'client_certificate' field is mandatory.
    */
  var clientKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The ssl config type according to 'client_key', 'client_certificate' and 'ca_certificate'.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaSslConfig {
  
  inline def apply(): SchemaSslConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSslConfig]
  }
  
  extension [Self <: SchemaSslConfig](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateNull: Self = StObject.set(x, "caCertificate", null)
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyNull: Self = StObject.set(x, "clientKey", null)
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
