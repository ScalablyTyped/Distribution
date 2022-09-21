package typings.googleapis.osconfigV1Mod.osconfigV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicyResourceExecResource extends StObject {
  
  /**
    * What to run to bring this resource into the desired state. An exit code of 100 indicates "success", any other exit code indicates a failure running enforce.
    */
  var enforce: js.UndefOr[SchemaOSPolicyResourceExecResourceExec] = js.undefined
  
  /**
    * Required. What to run to validate this resource is in the desired state. An exit code of 100 indicates "in desired state", and exit code of 101 indicates "not in desired state". Any other exit code indicates a failure running validate.
    */
  var validate: js.UndefOr[SchemaOSPolicyResourceExecResourceExec] = js.undefined
}
object SchemaOSPolicyResourceExecResource {
  
  inline def apply(): SchemaOSPolicyResourceExecResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicyResourceExecResource]
  }
  
  extension [Self <: SchemaOSPolicyResourceExecResource](x: Self) {
    
    inline def setEnforce(value: SchemaOSPolicyResourceExecResourceExec): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setValidate(value: SchemaOSPolicyResourceExecResourceExec): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
    
    inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
  }
}
