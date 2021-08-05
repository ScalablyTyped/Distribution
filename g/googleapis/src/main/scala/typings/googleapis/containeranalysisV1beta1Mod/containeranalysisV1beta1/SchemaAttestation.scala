package typings.googleapis.containeranalysisV1beta1Mod.containeranalysisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait SchemaAttestation extends StObject {
  
  var genericSignedAttestation: js.UndefOr[SchemaGenericSignedAttestation] = js.undefined
  
  /**
    * A PGP signed attestation.
    */
  var pgpSignedAttestation: js.UndefOr[SchemaPgpSignedAttestation] = js.undefined
}
object SchemaAttestation {
  
  inline def apply(): SchemaAttestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAttestation]
  }
  
  extension [Self <: SchemaAttestation](x: Self) {
    
    inline def setGenericSignedAttestation(value: SchemaGenericSignedAttestation): Self = StObject.set(x, "genericSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setGenericSignedAttestationUndefined: Self = StObject.set(x, "genericSignedAttestation", js.undefined)
    
    inline def setPgpSignedAttestation(value: SchemaPgpSignedAttestation): Self = StObject.set(x, "pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setPgpSignedAttestationUndefined: Self = StObject.set(x, "pgpSignedAttestation", js.undefined)
  }
}
