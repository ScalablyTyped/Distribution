package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstanceOSPoliciesCompliance extends StObject {
  
  /**
    * Output only. Detailed compliance state of the VM. This field is populated only when compliance state is `UNKNOWN`. It may contain one of the following values: * `no-compliance-data`: Compliance data is not available for this VM. * `no-agent-detected`: OS Config agent is not detected for this VM. * `config-not-supported-by-agent`: The version of the OS Config agent running on this VM does not support configuration management. * `inactive`: VM is not running. * `internal-service-errors`: There were internal service errors encountered while enforcing compliance. * `agent-errors`: OS config agent encountered errors while enforcing compliance.
    */
  var detailedState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The reason for the `detailed_state` of the VM (if any).
    */
  var detailedStateReason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The Compute Engine VM instance name.
    */
  var instance: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Timestamp of the last compliance check for the VM.
    */
  var lastComplianceCheckTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Unique identifier for the last compliance run. This id will be logged by the OS config agent during a compliance run and can be used for debugging and tracing purpose.
    */
  var lastComplianceRunId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The `InstanceOSPoliciesCompliance` API resource name. Format: `projects/{project_number\}/locations/{location\}/instanceOSPoliciesCompliances/{instance_id\}`
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Compliance data for each `OSPolicy` that is applied to the VM.
    */
  var osPolicyCompliances: js.UndefOr[js.Array[SchemaInstanceOSPoliciesComplianceOSPolicyCompliance]] = js.undefined
  
  /**
    * Output only. Compliance state of the VM.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaInstanceOSPoliciesCompliance {
  
  inline def apply(): SchemaInstanceOSPoliciesCompliance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstanceOSPoliciesCompliance]
  }
  
  extension [Self <: SchemaInstanceOSPoliciesCompliance](x: Self) {
    
    inline def setDetailedState(value: String): Self = StObject.set(x, "detailedState", value.asInstanceOf[js.Any])
    
    inline def setDetailedStateNull: Self = StObject.set(x, "detailedState", null)
    
    inline def setDetailedStateReason(value: String): Self = StObject.set(x, "detailedStateReason", value.asInstanceOf[js.Any])
    
    inline def setDetailedStateReasonNull: Self = StObject.set(x, "detailedStateReason", null)
    
    inline def setDetailedStateReasonUndefined: Self = StObject.set(x, "detailedStateReason", js.undefined)
    
    inline def setDetailedStateUndefined: Self = StObject.set(x, "detailedState", js.undefined)
    
    inline def setInstance(value: String): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceNull: Self = StObject.set(x, "instance", null)
    
    inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
    
    inline def setLastComplianceCheckTime(value: String): Self = StObject.set(x, "lastComplianceCheckTime", value.asInstanceOf[js.Any])
    
    inline def setLastComplianceCheckTimeNull: Self = StObject.set(x, "lastComplianceCheckTime", null)
    
    inline def setLastComplianceCheckTimeUndefined: Self = StObject.set(x, "lastComplianceCheckTime", js.undefined)
    
    inline def setLastComplianceRunId(value: String): Self = StObject.set(x, "lastComplianceRunId", value.asInstanceOf[js.Any])
    
    inline def setLastComplianceRunIdNull: Self = StObject.set(x, "lastComplianceRunId", null)
    
    inline def setLastComplianceRunIdUndefined: Self = StObject.set(x, "lastComplianceRunId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOsPolicyCompliances(value: js.Array[SchemaInstanceOSPoliciesComplianceOSPolicyCompliance]): Self = StObject.set(x, "osPolicyCompliances", value.asInstanceOf[js.Any])
    
    inline def setOsPolicyCompliancesUndefined: Self = StObject.set(x, "osPolicyCompliances", js.undefined)
    
    inline def setOsPolicyCompliancesVarargs(value: SchemaInstanceOSPoliciesComplianceOSPolicyCompliance*): Self = StObject.set(x, "osPolicyCompliances", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
