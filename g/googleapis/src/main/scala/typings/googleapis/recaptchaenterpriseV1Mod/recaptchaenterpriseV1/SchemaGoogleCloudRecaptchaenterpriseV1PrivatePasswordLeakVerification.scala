package typings.googleapis.recaptchaenterpriseV1Mod.recaptchaenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification extends StObject {
  
  /**
    * Output only. List of prefixes of the encrypted potential password leaks that matched the given parameters. They must be compared with the client-side decryption prefix of `reencrypted_user_credentials_hash`
    */
  var encryptedLeakMatchPrefixes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Optional. Encrypted Scrypt hash of the canonicalized username+password. It is re-encrypted by the server and returned through `reencrypted_user_credentials_hash`.
    */
  var encryptedUserCredentialsHash: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Optional. Exactly 26-bit prefix of the SHA-256 hash of the canonicalized username. It is used to look up password leaks associated with that hash prefix.
    */
  var lookupHashPrefix: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Corresponds to the re-encryption of the `encrypted_user_credentials_hash` field. It is used to match potential password leaks within `encrypted_leak_match_prefixes`.
    */
  var reencryptedUserCredentialsHash: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification {
  
  inline def apply(): SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification]
  }
  
  extension [Self <: SchemaGoogleCloudRecaptchaenterpriseV1PrivatePasswordLeakVerification](x: Self) {
    
    inline def setEncryptedLeakMatchPrefixes(value: js.Array[String]): Self = StObject.set(x, "encryptedLeakMatchPrefixes", value.asInstanceOf[js.Any])
    
    inline def setEncryptedLeakMatchPrefixesNull: Self = StObject.set(x, "encryptedLeakMatchPrefixes", null)
    
    inline def setEncryptedLeakMatchPrefixesUndefined: Self = StObject.set(x, "encryptedLeakMatchPrefixes", js.undefined)
    
    inline def setEncryptedLeakMatchPrefixesVarargs(value: String*): Self = StObject.set(x, "encryptedLeakMatchPrefixes", js.Array(value*))
    
    inline def setEncryptedUserCredentialsHash(value: String): Self = StObject.set(x, "encryptedUserCredentialsHash", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUserCredentialsHashNull: Self = StObject.set(x, "encryptedUserCredentialsHash", null)
    
    inline def setEncryptedUserCredentialsHashUndefined: Self = StObject.set(x, "encryptedUserCredentialsHash", js.undefined)
    
    inline def setLookupHashPrefix(value: String): Self = StObject.set(x, "lookupHashPrefix", value.asInstanceOf[js.Any])
    
    inline def setLookupHashPrefixNull: Self = StObject.set(x, "lookupHashPrefix", null)
    
    inline def setLookupHashPrefixUndefined: Self = StObject.set(x, "lookupHashPrefix", js.undefined)
    
    inline def setReencryptedUserCredentialsHash(value: String): Self = StObject.set(x, "reencryptedUserCredentialsHash", value.asInstanceOf[js.Any])
    
    inline def setReencryptedUserCredentialsHashNull: Self = StObject.set(x, "reencryptedUserCredentialsHash", null)
    
    inline def setReencryptedUserCredentialsHashUndefined: Self = StObject.set(x, "reencryptedUserCredentialsHash", js.undefined)
  }
}
