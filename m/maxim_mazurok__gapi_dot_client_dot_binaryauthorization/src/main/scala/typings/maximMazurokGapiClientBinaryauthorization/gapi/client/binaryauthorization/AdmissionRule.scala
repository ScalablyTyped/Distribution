package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdmissionRule extends StObject {
  
  /** Required. The action when a pod creation is denied by the admission rule. */
  var enforcementMode: js.UndefOr[String] = js.undefined
  
  /** Required. How this admission rule will be evaluated. */
  var evaluationMode: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The resource names of the attestors that must attest to a container image, in the format `projects/ *‍/attestors/ *`. Each attestor must exist before a policy can reference
    * it. To add an attestor to a policy the principal issuing the policy change request must be able to read the attestor resource. Note: this field must be non-empty when the
    * evaluation_mode field specifies REQUIRE_ATTESTATION, otherwise it must be empty.
    */
  var requireAttestationsBy: js.UndefOr[js.Array[String]] = js.undefined
}
object AdmissionRule {
  
  inline def apply(): AdmissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdmissionRule]
  }
  
  extension [Self <: AdmissionRule](x: Self) {
    
    inline def setEnforcementMode(value: String): Self = StObject.set(x, "enforcementMode", value.asInstanceOf[js.Any])
    
    inline def setEnforcementModeUndefined: Self = StObject.set(x, "enforcementMode", js.undefined)
    
    inline def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    inline def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
    
    inline def setRequireAttestationsBy(value: js.Array[String]): Self = StObject.set(x, "requireAttestationsBy", value.asInstanceOf[js.Any])
    
    inline def setRequireAttestationsByUndefined: Self = StObject.set(x, "requireAttestationsBy", js.undefined)
    
    inline def setRequireAttestationsByVarargs(value: String*): Self = StObject.set(x, "requireAttestationsBy", js.Array(value*))
  }
}
