package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateAttestationOccurrenceResponse extends js.Object {
  
  /** The reason for denial if the Attestation couldn't be validated. */
  var denialReason: js.UndefOr[String] = js.native
  
  /** The result of the Attestation validation. */
  var result: js.UndefOr[String] = js.native
}
object ValidateAttestationOccurrenceResponse {
  
  @scala.inline
  def apply(): ValidateAttestationOccurrenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAttestationOccurrenceResponse]
  }
  
  @scala.inline
  implicit class ValidateAttestationOccurrenceResponseOps[Self <: ValidateAttestationOccurrenceResponse] (val x: Self) extends AnyVal {
    
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
    def setDenialReason(value: String): Self = this.set("denialReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDenialReason: Self = this.set("denialReason", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
  }
}
