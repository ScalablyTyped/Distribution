package typings.googleapis.sqladminV1Mod.sqladminV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDemoteMasterMySqlReplicaConfiguration extends StObject {
  
  /**
    * PEM representation of the trusted CA's x509 certificate.
    */
  var caCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM representation of the replica's x509 certificate.
    */
  var clientCertificate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM representation of the replica's private key. The corresponsing public key is encoded in the client's certificate. The format of the replica's private key can be either PKCS #1 or PKCS #8.
    */
  var clientKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always `sql#demoteMasterMysqlReplicaConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The password for the replication connection.
    */
  var password: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The username for the replication connection.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaDemoteMasterMySqlReplicaConfiguration {
  
  inline def apply(): SchemaDemoteMasterMySqlReplicaConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDemoteMasterMySqlReplicaConfiguration]
  }
  
  extension [Self <: SchemaDemoteMasterMySqlReplicaConfiguration](x: Self) {
    
    inline def setCaCertificate(value: String): Self = StObject.set(x, "caCertificate", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateNull: Self = StObject.set(x, "caCertificate", null)
    
    inline def setCaCertificateUndefined: Self = StObject.set(x, "caCertificate", js.undefined)
    
    inline def setClientCertificate(value: String): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
    
    inline def setClientCertificateNull: Self = StObject.set(x, "clientCertificate", null)
    
    inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
    
    inline def setClientKey(value: String): Self = StObject.set(x, "clientKey", value.asInstanceOf[js.Any])
    
    inline def setClientKeyNull: Self = StObject.set(x, "clientKey", null)
    
    inline def setClientKeyUndefined: Self = StObject.set(x, "clientKey", js.undefined)
    
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
