package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Occurrence that represents a single &quot;attestation&quot;. The
  * authenticity of an attestation can be verified using the attached
  * signature. If the verifier trusts the public key of the signer, then
  * verifying the signature is sufficient to establish trust. In this
  * circumstance, the authority to which this attestation is attached is
  * primarily useful for look-up (how to find this attestation if you already
  * know the authority and artifact to be verified) and intent (which authority
  * was this attestation intended to sign for).
  */
@js.native
trait SchemaAttestation extends js.Object {
  var genericSignedAttestation: js.UndefOr[SchemaGenericSignedAttestation] = js.native
  /**
    * A PGP signed attestation.
    */
  var pgpSignedAttestation: js.UndefOr[SchemaPgpSignedAttestation] = js.native
}

object SchemaAttestation {
  @scala.inline
  def apply(
    genericSignedAttestation: SchemaGenericSignedAttestation = null,
    pgpSignedAttestation: SchemaPgpSignedAttestation = null
  ): SchemaAttestation = {
    val __obj = js.Dynamic.literal()
    if (genericSignedAttestation != null) __obj.updateDynamic("genericSignedAttestation")(genericSignedAttestation.asInstanceOf[js.Any])
    if (pgpSignedAttestation != null) __obj.updateDynamic("pgpSignedAttestation")(pgpSignedAttestation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAttestation]
  }
}

