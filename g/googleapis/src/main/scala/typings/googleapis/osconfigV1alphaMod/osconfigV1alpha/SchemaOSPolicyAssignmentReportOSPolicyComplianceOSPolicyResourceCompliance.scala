package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance extends StObject {
  
  /**
    * The compliance state of the resource.
    */
  var complianceState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A reason for the resource to be in the given compliance state. This field is always populated when `compliance_state` is `UNKNOWN`. The following values are supported when `compliance_state == UNKNOWN` * `execution-errors`: Errors were encountered by the agent while executing the resource and the compliance state couldn't be determined. * `execution-skipped-by-agent`: Resource execution was skipped by the agent because errors were encountered while executing prior resources in the OS policy. * `os-policy-execution-attempt-failed`: The execution of the OS policy containing this resource failed and the compliance state couldn't be determined.
    */
  var complianceStateReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Ordered list of configuration completed by the agent for the OS policy resource.
    */
  var configSteps: js.UndefOr[
    js.Array[
      SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceOSPolicyResourceConfigStep
    ]
  ] = js.undefined
  
  /**
    * ExecResource specific output.
    */
  var execResourceOutput: js.UndefOr[
    SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput
  ] = js.undefined
  
  /**
    * The ID of the OS policy resource.
    */
  var osPolicyResourceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance {
  
  inline def apply(): SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceCompliance](x: Self) {
    
    inline def setComplianceState(value: String): Self = StObject.set(x, "complianceState", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateNull: Self = StObject.set(x, "complianceState", null)
    
    inline def setComplianceStateReason(value: String): Self = StObject.set(x, "complianceStateReason", value.asInstanceOf[js.Any])
    
    inline def setComplianceStateReasonNull: Self = StObject.set(x, "complianceStateReason", null)
    
    inline def setComplianceStateReasonUndefined: Self = StObject.set(x, "complianceStateReason", js.undefined)
    
    inline def setComplianceStateUndefined: Self = StObject.set(x, "complianceState", js.undefined)
    
    inline def setConfigSteps(
      value: js.Array[
          SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceOSPolicyResourceConfigStep
        ]
    ): Self = StObject.set(x, "configSteps", value.asInstanceOf[js.Any])
    
    inline def setConfigStepsUndefined: Self = StObject.set(x, "configSteps", js.undefined)
    
    inline def setConfigStepsVarargs(
      value: SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceOSPolicyResourceConfigStep*
    ): Self = StObject.set(x, "configSteps", js.Array(value*))
    
    inline def setExecResourceOutput(
      value: SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput
    ): Self = StObject.set(x, "execResourceOutput", value.asInstanceOf[js.Any])
    
    inline def setExecResourceOutputUndefined: Self = StObject.set(x, "execResourceOutput", js.undefined)
    
    inline def setOsPolicyResourceId(value: String): Self = StObject.set(x, "osPolicyResourceId", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyResourceIdNull: Self = StObject.set(x, "osPolicyResourceId", null)
    
    inline def setOsPolicyResourceIdUndefined: Self = StObject.set(x, "osPolicyResourceId", js.undefined)
  }
}
