package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attestation extends StObject {
  
  var genericSignedAttestation: js.UndefOr[GenericSignedAttestation] = js.undefined
  
  /** A PGP signed attestation. */
  var pgpSignedAttestation: js.UndefOr[PgpSignedAttestation] = js.undefined
}
object Attestation {
  
  inline def apply(): Attestation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attestation]
  }
  
  extension [Self <: Attestation](x: Self) {
    
    inline def setGenericSignedAttestation(value: GenericSignedAttestation): Self = StObject.set(x, "genericSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setGenericSignedAttestationUndefined: Self = StObject.set(x, "genericSignedAttestation", js.undefined)
    
    inline def setPgpSignedAttestation(value: PgpSignedAttestation): Self = StObject.set(x, "pgpSignedAttestation", value.asInstanceOf[js.Any])
    
    inline def setPgpSignedAttestationUndefined: Self = StObject.set(x, "pgpSignedAttestation", js.undefined)
  }
}
