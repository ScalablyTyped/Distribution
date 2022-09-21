package typings.googleapis.sqlV1beta4Mod.sqlV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOnPremisesConfiguration extends StObject {
  
  /**
    * PEM representation of the trusted CA&#39;s x509 certificate.
    */
  var caCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM representation of the replica&#39;s x509 certificate.
    */
  var clientCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM representation of the replica&#39;s private key. The corresponsing public key is encoded in the client&#39;s certificate.
    */
  var clientKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The dump file to create the Cloud SQL replica.
    */
  var dumpFilePath: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The host and port of the on-premises instance in host:port format
    */
  var hostPort: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always *sql#onPremisesConfiguration*.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The password for connecting to on-premises instance.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username for connecting to on-premises instance.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaOnPremisesConfiguration {
  
  inline def apply(): SchemaOnPremisesConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOnPremisesConfiguration]
  }
  
  extension [Self <: SchemaOnPremisesConfiguration](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateNull: Self = StObject.set(x, "caCertificate", null)
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyNull: Self = StObject.set(x, "clientKey", null)
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
    inline def setDumpFilePath(value: String): Self = StObject.set(x, "dumpFilePath", value.asInstanceOf[js.Any])
    
    inline def setDumpFilePathNull: Self = StObject.set(x, "dumpFilePath", null)
    
    inline def setDumpFilePathUndefined: Self = StObject.set(x, "dumpFilePath", js.undefined)
    
    inline def setHostPort(value: String): Self = StObject.set(x, "hostPort", value.asInstanceOf[js.Any])
    
    inline def setHostPortNull: Self = StObject.set(x, "hostPort", null)
    
    inline def setHostPortUndefined: Self = StObject.set(x, "hostPort", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordNull: Self = StObject.set(x, "password", null)
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
