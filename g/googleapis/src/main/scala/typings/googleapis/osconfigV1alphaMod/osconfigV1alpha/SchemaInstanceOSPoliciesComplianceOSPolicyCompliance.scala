package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceOSPoliciesComplianceOSPolicyCompliance extends StObject {
  
  /**
    * Reference to the `OSPolicyAssignment` API resource that the `OSPolicy` belongs to. Format: `projects/{project_number\}/locations/{location\}/osPolicyAssignments/{os_policy_assignment_id@revision_id\}`
    */
  var osPolicyAssignment: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OS policy id
    */
  var osPolicyId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Compliance data for each `OSPolicyResource` that is applied to the VM.
    */
  var osPolicyResourceCompliances: js.UndefOr[js.Array[SchemaOSPolicyResourceCompliance]] = js.undefined
  
  /**
    * Compliance state of the OS policy.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceOSPoliciesComplianceOSPolicyCompliance {
  
  inline def apply(): SchemaInstanceOSPoliciesComplianceOSPolicyCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceOSPoliciesComplianceOSPolicyCompliance]
  }
  
  extension [Self <: SchemaInstanceOSPoliciesComplianceOSPolicyCompliance](x: Self) {
    
    inline def setOsPolicyAssignment(value: String): Self = StObject.set(x, "osPolicyAssignment", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyAssignmentNull: Self = StObject.set(x, "osPolicyAssignment", null)
    
    inline def setOsPolicyAssignmentUndefined: Self = StObject.set(x, "osPolicyAssignment", js.undefined)
    
    inline def setOsPolicyId(value: String): Self = StObject.set(x, "osPolicyId", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyIdNull: Self = StObject.set(x, "osPolicyId", null)
    
    inline def setOsPolicyIdUndefined: Self = StObject.set(x, "osPolicyId", js.undefined)
    
    inline def setOsPolicyResourceCompliances(value: js.Array[SchemaOSPolicyResourceCompliance]): Self = StObject.set(x, "osPolicyResourceCompliances", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyResourceCompliancesUndefined: Self = StObject.set(x, "osPolicyResourceCompliances", js.undefined)
    
    inline def setOsPolicyResourceCompliancesVarargs(value: SchemaOSPolicyResourceCompliance*): Self = StObject.set(x, "osPolicyResourceCompliances", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
