package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCustomerEncryptionKey extends StObject {
  
  /**
    * The name of the encryption key that is stored in Google Cloud KMS. For example: "kmsKeyName": "projects/kms_project_id/locations/region/keyRings/ key_region/cryptoKeys/key
    */
  var kmsKeyName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The service account being used for the encryption request for the given KMS key. If absent, the Compute Engine default service account is used. For example: "kmsKeyServiceAccount": "name@project_id.iam.gserviceaccount.com/
    */
  var kmsKeyServiceAccount: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies a 256-bit customer-supplied encryption key, encoded in RFC 4648 base64 to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rawKey": "SGVsbG8gZnJvbSBHb29nbGUgQ2xvdWQgUGxhdGZvcm0="
    */
  var rawKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Specifies an RFC 4648 base64 encoded, RSA-wrapped 2048-bit customer-supplied encryption key to either encrypt or decrypt this resource. You can provide either the rawKey or the rsaEncryptedKey. For example: "rsaEncryptedKey": "ieCx/NcW06PcT7Ep1X6LUTc/hLvUDYyzSZPPVCVPTVEohpeHASqC8uw5TzyO9U+Fka9JFH z0mBibXUInrC/jEk014kCK/NPjYgEMOyssZ4ZINPKxlUh2zn1bV+MCaTICrdmuSBTWlUUiFoD D6PYznLwh8ZNdaheCeZ8ewEXgFQ8V+sDroLaN3Xs3MDTXQEMMoNUXMCZEIpg9Vtp9x2oe==" The key must meet the following requirements before you can provide it to Compute Engine: 1. The key is wrapped using a RSA public key certificate provided by Google. 2. After being wrapped, the key must be encoded in RFC 4648 base64 encoding. Gets the RSA public key certificate provided by Google at: https://cloud-certs.storage.googleapis.com/google-cloud-csek-ingress.pem
    */
  var rsaEncryptedKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output only] The RFC 4648 base64 encoded SHA-256 hash of the customer-supplied encryption key that protects this resource.
    */
  var sha256: js.UndefOr[String | Null] = js.undefined
}
object SchemaCustomerEncryptionKey {
  
  inline def apply(): SchemaCustomerEncryptionKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomerEncryptionKey]
  }
  
  extension [Self <: SchemaCustomerEncryptionKey](x: Self) {
    
    inline def setKmsKeyName(value: String): Self = StObject.set(x, "kmsKeyName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyNameNull: Self = StObject.set(x, "kmsKeyName", null)
    
    inline def setKmsKeyNameUndefined: Self = StObject.set(x, "kmsKeyName", js.undefined)
    
    inline def setKmsKeyServiceAccount(value: String): Self = StObject.set(x, "kmsKeyServiceAccount", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyServiceAccountNull: Self = StObject.set(x, "kmsKeyServiceAccount", null)
    
    inline def setKmsKeyServiceAccountUndefined: Self = StObject.set(x, "kmsKeyServiceAccount", js.undefined)
    
    inline def setRawKey(value: String): Self = StObject.set(x, "rawKey", value.asInstanceOf[js.Any])
    
    inline def setRawKeyNull: Self = StObject.set(x, "rawKey", null)
    
    inline def setRawKeyUndefined: Self = StObject.set(x, "rawKey", js.undefined)
    
    inline def setRsaEncryptedKey(value: String): Self = StObject.set(x, "rsaEncryptedKey", value.asInstanceOf[js.Any])
    
    inline def setRsaEncryptedKeyNull: Self = StObject.set(x, "rsaEncryptedKey", null)
    
    inline def setRsaEncryptedKeyUndefined: Self = StObject.set(x, "rsaEncryptedKey", js.undefined)
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    
    inline def setSha256Null: Self = StObject.set(x, "sha256", null)
    
    inline def setSha256Undefined: Self = StObject.set(x, "sha256", js.undefined)
  }
}
