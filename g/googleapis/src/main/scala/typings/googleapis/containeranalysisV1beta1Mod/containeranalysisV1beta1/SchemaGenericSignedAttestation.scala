package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGenericSignedAttestation extends StObject {
  
  /**
    * Type (for example schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (for example by validating a JSON schema).
    */
  var contentType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The serialized payload that is verified by one or more `signatures`. The encoding and semantic meaning of this payload must match what is set in `content_type`.
    */
  var serializedPayload: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One or more signatures over `serialized_payload`. Verifier implementations should consider this attestation message verified if at least one `signature` verifies `serialized_payload`. See `Signature` in common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[SchemaSignature]] = js.undefined
}
object SchemaGenericSignedAttestation {
  
  inline def apply(): SchemaGenericSignedAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenericSignedAttestation]
  }
  
  extension [Self <: SchemaGenericSignedAttestation](x: Self) {
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeNull: Self = StObject.set(x, "contentType", null)
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setSerializedPayload(value: String): Self = StObject.set(x, "serializedPayload", value.asInstanceOf[js.Any])
    
    inline def setSerializedPayloadNull: Self = StObject.set(x, "serializedPayload", null)
    
    inline def setSerializedPayloadUndefined: Self = StObject.set(x, "serializedPayload", js.undefined)
    
    inline def setSignatures(value: js.Array[SchemaSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    inline def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    inline def setSignaturesVarargs(value: SchemaSignature*): Self = StObject.set(x, "signatures", js.Array(value*))
  }
}
