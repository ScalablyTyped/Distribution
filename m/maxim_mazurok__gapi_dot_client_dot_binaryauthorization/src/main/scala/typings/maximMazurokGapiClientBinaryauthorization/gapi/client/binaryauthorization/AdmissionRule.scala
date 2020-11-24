package typings.maximMazurokGapiClientBinaryauthorization.gapi.client.binaryauthorization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdmissionRule extends js.Object {
  
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
  implicit class AdmissionRuleOps[Self <: AdmissionRule] (val x: Self) extends AnyVal {
    
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
    def setEnforcementMode(value: String): Self = this.set("enforcementMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforcementMode: Self = this.set("enforcementMode", js.undefined)
    
    @scala.inline
    def setEvaluationMode(value: String): Self = this.set("evaluationMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvaluationMode: Self = this.set("evaluationMode", js.undefined)
    
    @scala.inline
    def setRequireAttestationsByVarargs(value: String*): Self = this.set("requireAttestationsBy", js.Array(value :_*))
    
    @scala.inline
    def setRequireAttestationsBy(value: js.Array[String]): Self = this.set("requireAttestationsBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireAttestationsBy: Self = this.set("requireAttestationsBy", js.undefined)
  }
}
