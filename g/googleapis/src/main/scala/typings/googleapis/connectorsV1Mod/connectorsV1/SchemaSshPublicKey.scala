package typings.googleapis.connectorsV1Mod.connectorsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSshPublicKey extends StObject {
  
  /**
    * Format of SSH Client cert.
    */
  var certType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is an optional field used in case client has enabled multi-factor authentication
    */
  var password: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * SSH Client Cert. It should contain both public and private key.
    */
  var sshClientCert: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * Password (passphrase) for ssh client certificate if it has one.
    */
  var sshClientCertPass: js.UndefOr[SchemaSecret] = js.undefined
  
  /**
    * The user account used to authenticate.
    */
  var username: js.UndefOr[String | Null] = js.undefined
}
object SchemaSshPublicKey {
  
  inline def apply(): SchemaSshPublicKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSshPublicKey]
  }
  
  extension [Self <: SchemaSshPublicKey](x: Self) {
    
    inline def setCertType(value: String): Self = StObject.set(x, "certType", value.asInstanceOf[js.Any])
    
    inline def setCertTypeNull: Self = StObject.set(x, "certType", null)
    
    inline def setCertTypeUndefined: Self = StObject.set(x, "certType", js.undefined)
    
    inline def setPassword(value: SchemaSecret): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setSshClientCert(value: SchemaSecret): Self = StObject.set(x, "sshClientCert", value.asInstanceOf[js.Any])
    
    inline def setSshClientCertPass(value: SchemaSecret): Self = StObject.set(x, "sshClientCertPass", value.asInstanceOf[js.Any])
    
    inline def setSshClientCertPassUndefined: Self = StObject.set(x, "sshClientCertPass", js.undefined)
    
    inline def setSshClientCertUndefined: Self = StObject.set(x, "sshClientCert", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameNull: Self = StObject.set(x, "username", null)
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
