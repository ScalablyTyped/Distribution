package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateAttestationOccurrenceRequest extends js.Object {
  
  /**
    * Required. An AttestationOccurrence to be checked that it can be verified by the Attestor. It does not have to be an existing entity in Container Analysis. It must otherwise be a
    * valid AttestationOccurrence.
    */
  var attestation: js.UndefOr[AttestationOccurrence] = js.native
  
  /** Required. The resource name of the Note to which the containing Occurrence is associated. */
  var occurrenceNote: js.UndefOr[String] = js.native
  
  /** Required. The URI of the artifact (e.g. container image) that is the subject of the containing Occurrence. */
  var occurrenceResourceUri: js.UndefOr[String] = js.native
}
object ValidateAttestationOccurrenceRequest {
  
  @scala.inline
  def apply(): ValidateAttestationOccurrenceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAttestationOccurrenceRequest]
  }
  
  @scala.inline
  implicit class ValidateAttestationOccurrenceRequestOps[Self <: ValidateAttestationOccurrenceRequest] (val x: Self) extends AnyVal {
    
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
    def setAttestation(value: AttestationOccurrence): Self = this.set("attestation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttestation: Self = this.set("attestation", js.undefined)
    
    @scala.inline
    def setOccurrenceNote(value: String): Self = this.set("occurrenceNote", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceNote: Self = this.set("occurrenceNote", js.undefined)
    
    @scala.inline
    def setOccurrenceResourceUri(value: String): Self = this.set("occurrenceResourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOccurrenceResourceUri: Self = this.set("occurrenceResourceUri", js.undefined)
  }
}
