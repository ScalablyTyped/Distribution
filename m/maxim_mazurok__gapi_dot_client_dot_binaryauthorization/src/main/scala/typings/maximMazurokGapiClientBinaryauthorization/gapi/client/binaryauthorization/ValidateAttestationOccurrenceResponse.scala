package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateAttestationOccurrenceResponse extends StObject {
  
  /** The reason for denial if the Attestation couldn't be validated. */
  var denialReason: js.UndefOr[String] = js.undefined
  
  /** The result of the Attestation validation. */
  var result: js.UndefOr[String] = js.undefined
}
object ValidateAttestationOccurrenceResponse {
  
  inline def apply(): ValidateAttestationOccurrenceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateAttestationOccurrenceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateAttestationOccurrenceResponse] (val x: Self) extends AnyVal {
    
    inline def setDenialReason(value: String): Self = StObject.set(x, "denialReason", value.asInstanceOf[js.Any])
    
    inline def setDenialReasonUndefined: Self = StObject.set(x, "denialReason", js.undefined)
    
    inline def setResult(value: String): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
