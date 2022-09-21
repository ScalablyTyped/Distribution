package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SigningKeyPossessorProto extends StObject {
  
  /** This value must be from the KeyMetadata.Type enum in keymaster.proto. */
  var keymasterKeyType: js.UndefOr[Double] = js.undefined
  
  /** The actual verification key bytes corresponding to the above type. */
  var serializedVerificationKey: js.UndefOr[String] = js.undefined
  
  /**
    * The binary serialized Keymaster SerializedReader of a public keyset. The keyset must contain exactly one key. N.B.: If this field is populated, serialized_verification_key should be
    * set to the empty string and keymaster_key_type should be set to zero.
    */
  var serializedVerificationKeyset: js.UndefOr[String] = js.undefined
}
object SigningKeyPossessorProto {
  
  inline def apply(): SigningKeyPossessorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SigningKeyPossessorProto]
  }
  
  extension [Self <: SigningKeyPossessorProto](x: Self) {
    
    inline def setKeymasterKeyType(value: Double): Self = StObject.set(x, "keymasterKeyType", value.asInstanceOf[js.Any])
    
    inline def setKeymasterKeyTypeUndefined: Self = StObject.set(x, "keymasterKeyType", js.undefined)
    
    inline def setSerializedVerificationKey(value: String): Self = StObject.set(x, "serializedVerificationKey", value.asInstanceOf[js.Any])
    
    inline def setSerializedVerificationKeyUndefined: Self = StObject.set(x, "serializedVerificationKey", js.undefined)
    
    inline def setSerializedVerificationKeyset(value: String): Self = StObject.set(x, "serializedVerificationKeyset", value.asInstanceOf[js.Any])
    
    inline def setSerializedVerificationKeysetUndefined: Self = StObject.set(x, "serializedVerificationKeyset", js.undefined)
  }
}
