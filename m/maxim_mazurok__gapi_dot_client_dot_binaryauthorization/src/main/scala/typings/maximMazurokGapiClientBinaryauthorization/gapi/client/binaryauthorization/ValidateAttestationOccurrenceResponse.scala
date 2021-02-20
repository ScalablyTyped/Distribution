package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateAttestationOccurrenceResponse extends StObject {
  
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
  implicit class ValidateAttestationOccurrenceResponseMutableBuilder[Self <: ValidateAttestationOccurrenceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDenialReason(value: String): Self = StObject.set(x, "denialReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenialReasonUndefined: Self = StObject.set(x, "denialReason", js.undefined)
    
    @scala.inline
    def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
