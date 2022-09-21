package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentReportOSPolicyCompliance extends StObject {
  
  /**
    * The compliance state of the OS policy.
    */
  var complianceState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The reason for the OS policy to be in an unknown compliance state. This field is always populated when `compliance_state` is `UNKNOWN`. If populated, the field can contain one of the following values: * `vm-not-running`: The VM was not running. * `os-policies-not-supported-by-agent`: The version of the OS Config agent running on the VM does not support running OS policies. * `no-agent-detected`: The OS Config agent is not detected for the VM. * `resource-execution-errors`: The OS Config agent encountered errors while executing one or more resources in the policy. See `os_policy_resource_compliances` for details. * `task-timeout`: The task sent to the agent to apply the policy timed out. * `unexpected-agent-state`: The OS Config agent did not report the final status of the task that attempted to apply the policy. Instead, the agent unexpectedly started working on a different task. This mostly happens when the agent or VM unexpectedly restarts while applying OS policies. * `internal-service-errors`: Internal service errors were encountered while attempting to apply the policy.
    */
  var complianceStateReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OS policy id
    */
  var osPolicyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compliance data for each resource within the policy that is applied to the VM.
    */
  var osPolicyResourceCompliances: js.UndefOr[
    js.Array[SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance]
  ] = js.undefined
}
object SchemaOSPolicyAssignmentReportOSPolicyCompliance {
  
  inline def apply(): SchemaOSPolicyAssignmentReportOSPolicyCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentReportOSPolicyCompliance]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentReportOSPolicyCompliance](x: Self) {
    
    inline def setComplianceState(value: String): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateNull: Self = StObject.set(x, "complianceState", null)
    
    inline def setComplianceStateReason(value: String): Self = StObject.set(x, "complianceStateReason", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateReasonNull: Self = StObject.set(x, "complianceStateReason", null)
    
    inline def setComplianceStateReasonUndefined: Self = StObject.set(x, "complianceStateReason", js.undefined)
    
    inline def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    inline def setOsPolicyId(value: String): Self = StObject.set(x, "osPolicyId", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyIdNull: Self = StObject.set(x, "osPolicyId", null)
    
    inline def setOsPolicyIdUndefined: Self = StObject.set(x, "osPolicyId", js.undefined)
    
    inline def setOsPolicyResourceCompliances(value: js.Array[SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance]): Self = StObject.set(x, "osPolicyResourceCompliances", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyResourceCompliancesUndefined: Self = StObject.set(x, "osPolicyResourceCompliances", js.undefined)
    
    inline def setOsPolicyResourceCompliancesVarargs(value: SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance*): Self = StObject.set(x, "osPolicyResourceCompliances", js.Array(value*))
  }
}
