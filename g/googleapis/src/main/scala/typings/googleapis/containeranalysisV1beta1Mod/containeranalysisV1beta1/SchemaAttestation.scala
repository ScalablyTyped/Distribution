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
  def apply(): SchemaAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestation]
  }
  @scala.inline
  implicit class SchemaAttestationOps[Self <: SchemaAttestation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGenericSignedAttestation(value: SchemaGenericSignedAttestation): Self = this.set("genericSignedAttestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenericSignedAttestation: Self = this.set("genericSignedAttestation", js.undefined)
    @scala.inline
    def setPgpSignedAttestation(value: SchemaPgpSignedAttestation): Self = this.set("pgpSignedAttestation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePgpSignedAttestation: Self = this.set("pgpSignedAttestation", js.undefined)
  }
  
}

