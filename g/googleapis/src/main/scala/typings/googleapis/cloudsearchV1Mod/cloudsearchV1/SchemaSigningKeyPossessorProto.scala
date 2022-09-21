package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSigningKeyPossessorProto extends StObject {
  
  /**
    * This value must be from the KeyMetadata.Type enum in keymaster.proto.
    */
  var keymasterKeyType: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The actual verification key bytes corresponding to the above type.
    */
  var serializedVerificationKey: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The binary serialized Keymaster SerializedReader of a public keyset. The keyset must contain exactly one key. N.B.: If this field is populated, serialized_verification_key should be set to the empty string and keymaster_key_type should be set to zero.
    */
  var serializedVerificationKeyset: js.UndefOr[String | Null] = js.undefined
}
object SchemaSigningKeyPossessorProto {
  
  inline def apply(): SchemaSigningKeyPossessorProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSigningKeyPossessorProto]
  }
  
  extension [Self <: SchemaSigningKeyPossessorProto](x: Self) {
    
    inline def setKeymasterKeyType(value: Double): Self = StObject.set(x, "keymasterKeyType", value.asInstanceOf[js.Any])
    
    inline def setKeymasterKeyTypeNull: Self = StObject.set(x, "keymasterKeyType", null)
    
    inline def setKeymasterKeyTypeUndefined: Self = StObject.set(x, "keymasterKeyType", js.undefined)
    
    inline def setSerializedVerificationKey(value: String): Self = StObject.set(x, "serializedVerificationKey", value.asInstanceOf[js.Any])
    
    inline def setSerializedVerificationKeyNull: Self = StObject.set(x, "serializedVerificationKey", null)
    
    inline def setSerializedVerificationKeyUndefined: Self = StObject.set(x, "serializedVerificationKey", js.undefined)
    
    inline def setSerializedVerificationKeyset(value: String): Self = StObject.set(x, "serializedVerificationKeyset", value.asInstanceOf[js.Any])
    
    inline def setSerializedVerificationKeysetNull: Self = StObject.set(x, "serializedVerificationKeyset", null)
    
    inline def setSerializedVerificationKeysetUndefined: Self = StObject.set(x, "serializedVerificationKeyset", js.undefined)
  }
}
