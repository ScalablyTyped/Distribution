package typings.googleapis.containeranalysisV1alpha1Mod.containeranalysisV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Occurrence that represents a single &quot;attestation&quot;.  The
  * authenticity of an Attestation can be verified using the attached
  * signature. If the verifier trusts the public key of the signer, then
  * verifying the signature is sufficient to establish trust.  In this
  * circumstance, the AttestationAuthority to which this Attestation is
  * attached is primarily useful for look-up (how to find this Attestation if
  * you already know the Authority and artifact to be verified) and intent
  * (which authority was this attestation intended to sign for).
  */
trait SchemaAttestation extends StObject {
  
  var pgpSignedAttestation: js.UndefOr[SchemaPgpSignedAttestation] = js.undefined
}
object SchemaAttestation {
  
  @scala.inline
  def apply(): SchemaAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestation]
  }
  
  @scala.inline
  implicit class SchemaAttestationMutableBuilder[Self <: SchemaAttestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPgpSignedAttestation(value: SchemaPgpSignedAttestation): Self = StObject.set(x, "pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPgpSignedAttestationUndefined: Self = StObject.set(x, "pgpSignedAttestation", js.undefined)
  }
}
