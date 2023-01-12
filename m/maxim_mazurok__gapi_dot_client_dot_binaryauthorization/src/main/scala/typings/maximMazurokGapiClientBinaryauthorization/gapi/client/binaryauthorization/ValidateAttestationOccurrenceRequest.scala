package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateAttestationOccurrenceRequest extends StObject {
  
  /**
    * Required. An AttestationOccurrence to be checked that it can be verified by the Attestor. It does not have to be an existing entity in Container Analysis. It must otherwise be a
    * valid AttestationOccurrence.
    */
  var attestation: js.UndefOr[AttestationOccurrence] = js.undefined
  
  /** Required. The resource name of the Note to which the containing Occurrence is associated. */
  var occurrenceNote: js.UndefOr[String] = js.undefined
  
  /** Required. The URI of the artifact (e.g. container image) that is the subject of the containing Occurrence. */
  var occurrenceResourceUri: js.UndefOr[String] = js.undefined
}
object ValidateAttestationOccurrenceRequest {
  
  inline def apply(): ValidateAttestationOccurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAttestationOccurrenceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateAttestationOccurrenceRequest] (val x: Self) extends AnyVal {
    
    inline def setAttestation(value: AttestationOccurrence): Self = StObject.set(x, "attestation", value.asInstanceOf[js.Any])
    
    inline def setAttestationUndefined: Self = StObject.set(x, "attestation", js.undefined)
    
    inline def setOccurrenceNote(value: String): Self = StObject.set(x, "occurrenceNote", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceNoteUndefined: Self = StObject.set(x, "occurrenceNote", js.undefined)
    
    inline def setOccurrenceResourceUri(value: String): Self = StObject.set(x, "occurrenceResourceUri", value.asInstanceOf[js.Any])
    
    inline def setOccurrenceResourceUriUndefined: Self = StObject.set(x, "occurrenceResourceUri", js.undefined)
  }
}
