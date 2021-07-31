package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An attestation wrapper that uses the Grafeas `Signature` message. This
  * attestation must define the `serialized_payload` that the `signatures`
  * verify and any metadata necessary to interpret that plaintext.  The
  * signatures should always be over the `serialized_payload` bytestring.
  */
trait SchemaGenericSignedAttestation extends StObject {
  
  /**
    * Type (for example schema) of the attestation payload that was signed. The
    * verifier must ensure that the provided type is one that the verifier
    * supports, and that the attestation payload is a valid instantiation of
    * that type (for example by validating a JSON schema).
    */
  var contentType: js.UndefOr[String] = js.undefined
  
  /**
    * The serialized payload that is verified by one or more `signatures`. The
    * encoding and semantic meaning of this payload must match what is set in
    * `content_type`.
    */
  var serializedPayload: js.UndefOr[String] = js.undefined
  
  /**
    * One or more signatures over `serialized_payload`.  Verifier
    * implementations should consider this attestation message verified if at
    * least one `signature` verifies `serialized_payload`.  See `Signature` in
    * common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[SchemaSignature]] = js.undefined
}
object SchemaGenericSignedAttestation {
  
  @scala.inline
  def apply(): SchemaGenericSignedAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenericSignedAttestation]
  }
  
  @scala.inline
  implicit class SchemaGenericSignedAttestationMutableBuilder[Self <: SchemaGenericSignedAttestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setSerializedPayload(value: String): Self = StObject.set(x, "serializedPayload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializedPayloadUndefined: Self = StObject.set(x, "serializedPayload", js.undefined)
    
    @scala.inline
    def setSignatures(value: js.Array[SchemaSignature]): Self = StObject.set(x, "signatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignaturesUndefined: Self = StObject.set(x, "signatures", js.undefined)
    
    @scala.inline
    def setSignaturesVarargs(value: SchemaSignature*): Self = StObject.set(x, "signatures", js.Array(value :_*))
  }
}
