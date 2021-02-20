package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attestation extends StObject {
  
  var genericSignedAttestation: js.UndefOr[GenericSignedAttestation] = js.native
  
  /** A PGP signed attestation. */
  var pgpSignedAttestation: js.UndefOr[PgpSignedAttestation] = js.native
}
object Attestation {
  
  @scala.inline
  def apply(): Attestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestation]
  }
  
  @scala.inline
  implicit class AttestationMutableBuilder[Self <: Attestation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenericSignedAttestation(value: GenericSignedAttestation): Self = StObject.set(x, "genericSignedAttestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenericSignedAttestationUndefined: Self = StObject.set(x, "genericSignedAttestation", js.undefined)
    
    @scala.inline
    def setPgpSignedAttestation(value: PgpSignedAttestation): Self = StObject.set(x, "pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPgpSignedAttestationUndefined: Self = StObject.set(x, "pgpSignedAttestation", js.undefined)
  }
}
