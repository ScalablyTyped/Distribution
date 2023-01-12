package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomerEncryptionKey extends StObject {
  
  /** The name of the encryption key that is stored in Google Cloud KMS. */
  var kmsKeyName: js.UndefOr[String] = js.undefined
  
  /** The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. */
  var kmsKeyServiceAccount: js.UndefOr[String] = js.undefined
  
  /** Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. */
  var rawKey: js.UndefOr[String] = js.undefined
  
  /** [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource. */
  var sha256: js.UndefOr[String] = js.undefined
}
object CustomerEncryptionKey {
  
  inline def apply(): CustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomerEncryptionKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomerEncryptionKey] (val x: Self) extends AnyVal {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setKmsKeyServiceAccount(value: String): Self = StObject.set(x, "kmsKeyServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyServiceAccountUndefined: Self = StObject.set(x, "kmsKeyServiceAccount", js.undefined)
    
    inline def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
    
    inline def setRawKeyUndefined: Self = StObject.set(x, "rawKey", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
