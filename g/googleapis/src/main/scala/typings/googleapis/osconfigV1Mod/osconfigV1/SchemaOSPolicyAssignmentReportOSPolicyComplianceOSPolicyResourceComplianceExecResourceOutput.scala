package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput extends StObject {
  
  /**
    * Output from enforcement phase output file (if run). Output size is limited to 100K bytes.
    */
  var enforcementOutput: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput {
  
  inline def apply(): SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput]
  }
  
  extension [Self <: SchemaOSPolicyAssignmentReportOSPolicyComplianceOSPolicyResourceComplianceExecResourceOutput](x: Self) {
    
    inline def setEnforcementOutput(value: String): Self = StObject.set(x, "enforcementOutput", value.asInstanceOf[js.Any])
    
    inline def setEnforcementOutputNull: Self = StObject.set(x, "enforcementOutput", null)
    
    inline def setEnforcementOutputUndefined: Self = StObject.set(x, "enforcementOutput", js.undefined)
  }
}
