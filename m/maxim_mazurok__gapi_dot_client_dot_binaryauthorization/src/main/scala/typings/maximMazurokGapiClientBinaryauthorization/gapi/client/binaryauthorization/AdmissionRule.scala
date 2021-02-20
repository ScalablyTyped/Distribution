package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdmissionRule extends StObject {
  
  /** Required. The action when a pod creation is denied by the admission rule. */
  var enforcementMode: js.UndefOr[String] = js.native
  
  /** Required. How this admission rule will be evaluated. */
  var evaluationMode: js.UndefOr[String] = js.native
  
  /**
    * Optional. The resource names of the attestors that must attest to a container image, in the format `projects/∗/attestors/ *`. Each attestor must exist before a policy can reference
    * it. To add an attestor to a policy the principal issuing the policy change request must be able to read the attestor resource. Note: this field must be non-empty when the
    * evaluation_mode field specifies REQUIRE_ATTESTATION, otherwise it must be empty.
    */
  var requireAttestationsBy: js.UndefOr[js.Array[String]] = js.native
}
object AdmissionRule {
  
  @scala.inline
  def apply(): AdmissionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdmissionRule]
  }
  
  @scala.inline
  implicit class AdmissionRuleMutableBuilder[Self <: AdmissionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforcementMode(value: String): Self = StObject.set(x, "enforcementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcementModeUndefined: Self = StObject.set(x, "enforcementMode", js.undefined)
    
    @scala.inline
    def setEvaluationMode(value: String): Self = StObject.set(x, "evaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationModeUndefined: Self = StObject.set(x, "evaluationMode", js.undefined)
    
    @scala.inline
    def setRequireAttestationsBy(value: js.Array[String]): Self = StObject.set(x, "requireAttestationsBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireAttestationsByUndefined: Self = StObject.set(x, "requireAttestationsBy", js.undefined)
    
    @scala.inline
    def setRequireAttestationsByVarargs(value: String*): Self = StObject.set(x, "requireAttestationsBy", js.Array(value :_*))
  }
}
