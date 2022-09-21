package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceComplianceExecResourceOutput extends StObject {
  
  /**
    * Output from Enforcement phase output file (if run). Output size is limited to 100K bytes.
    */
  var enforcementOutput: js.UndefOr[String | Null] = js.undefined
}
object SchemaOSPolicyResourceComplianceExecResourceOutput {
  
  inline def apply(): SchemaOSPolicyResourceComplianceExecResourceOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceComplianceExecResourceOutput]
  }
  
  extension [Self <: SchemaOSPolicyResourceComplianceExecResourceOutput](x: Self) {
    
    inline def setEnforcementOutput(value: String): Self = StObject.set(x, "enforcementOutput", value.asInstanceOf[js.Any])
    
    inline def setEnforcementOutputNull: Self = StObject.set(x, "enforcementOutput", null)
    
    inline def setEnforcementOutputUndefined: Self = StObject.set(x, "enforcementOutput", js.undefined)
  }
}
