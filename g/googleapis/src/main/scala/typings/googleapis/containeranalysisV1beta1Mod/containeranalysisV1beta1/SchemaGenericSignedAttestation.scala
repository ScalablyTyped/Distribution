package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An attestation wrapper that uses the Grafeas `Signature` message. This
  * attestation must define the `serialized_payload` that the `signatures`
  * verify and any metadata necessary to interpret that plaintext.  The
  * signatures should always be over the `serialized_payload` bytestring.
  */
@js.native
trait SchemaGenericSignedAttestation extends js.Object {
  /**
    * Type (for example schema) of the attestation payload that was signed. The
    * verifier must ensure that the provided type is one that the verifier
    * supports, and that the attestation payload is a valid instantiation of
    * that type (for example by validating a JSON schema).
    */
  var contentType: js.UndefOr[String] = js.native
  /**
    * The serialized payload that is verified by one or more `signatures`. The
    * encoding and semantic meaning of this payload must match what is set in
    * `content_type`.
    */
  var serializedPayload: js.UndefOr[String] = js.native
  /**
    * One or more signatures over `serialized_payload`.  Verifier
    * implementations should consider this attestation message verified if at
    * least one `signature` verifies `serialized_payload`.  See `Signature` in
    * common.proto for more details on signature structure and verification.
    */
  var signatures: js.UndefOr[js.Array[SchemaSignature]] = js.native
}

object SchemaGenericSignedAttestation {
  @scala.inline
  def apply(
    contentType: String = null,
    serializedPayload: String = null,
    signatures: js.Array[SchemaSignature] = null
  ): SchemaGenericSignedAttestation = {
    val __obj = js.Dynamic.literal()
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (serializedPayload != null) __obj.updateDynamic("serializedPayload")(serializedPayload.asInstanceOf[js.Any])
    if (signatures != null) __obj.updateDynamic("signatures")(signatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGenericSignedAttestation]
  }
}

