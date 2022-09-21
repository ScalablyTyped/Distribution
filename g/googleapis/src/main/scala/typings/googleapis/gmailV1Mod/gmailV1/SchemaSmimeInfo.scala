package typings.googleapis.gmailV1Mod.gmailV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSmimeInfo extends StObject {
  
  /**
    * Encrypted key password, when key is encrypted.
    */
  var encryptedKeyPassword: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When the certificate expires (in milliseconds since epoch).
    */
  var expiration: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The immutable ID for the SmimeInfo.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether this SmimeInfo is the default one for this user's send-as address.
    */
  var isDefault: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The S/MIME certificate issuer's common name.
    */
  var issuerCn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PEM formatted X509 concatenated certificate string (standard base64 encoding). Format used for returning key, which includes public key as well as certificate chain (not private key).
    */
  var pem: js.UndefOr[String | Null] = js.undefined
  
  /**
    * PKCS#12 format containing a single private/public key pair and certificate chain. This format is only accepted from client for creating a new SmimeInfo and is never returned, because the private key is not intended to be exported. PKCS#12 may be encrypted, in which case encryptedKeyPassword should be set appropriately.
    */
  var pkcs12: js.UndefOr[String | Null] = js.undefined
}
object SchemaSmimeInfo {
  
  inline def apply(): SchemaSmimeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSmimeInfo]
  }
  
  extension [Self <: SchemaSmimeInfo](x: Self) {
    
    inline def setEncryptedKeyPassword(value: String): Self = StObject.set(x, "encryptedKeyPassword", value.asInstanceOf[js.Any])
    
    inline def setEncryptedKeyPasswordNull: Self = StObject.set(x, "encryptedKeyPassword", null)
    
    inline def setEncryptedKeyPasswordUndefined: Self = StObject.set(x, "encryptedKeyPassword", js.undefined)
    
    inline def setExpiration(value: String): Self = StObject.set(x, "expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationNull: Self = StObject.set(x, "expiration", null)
    
    inline def setExpirationUndefined: Self = StObject.set(x, "expiration", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultNull: Self = StObject.set(x, "isDefault", null)
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setIssuerCn(value: String): Self = StObject.set(x, "issuerCn", value.asInstanceOf[js.Any])
    
    inline def setIssuerCnNull: Self = StObject.set(x, "issuerCn", null)
    
    inline def setIssuerCnUndefined: Self = StObject.set(x, "issuerCn", js.undefined)
    
    inline def setPem(value: String): Self = StObject.set(x, "pem", value.asInstanceOf[js.Any])
    
    inline def setPemNull: Self = StObject.set(x, "pem", null)
    
    inline def setPemUndefined: Self = StObject.set(x, "pem", js.undefined)
    
    inline def setPkcs12(value: String): Self = StObject.set(x, "pkcs12", value.asInstanceOf[js.Any])
    
    inline def setPkcs12Null: Self = StObject.set(x, "pkcs12", null)
    
    inline def setPkcs12Undefined: Self = StObject.set(x, "pkcs12", js.undefined)
  }
}
