package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGetIamPolicyRequest extends StObject {
  
  /**
    * OPTIONAL: A `GetPolicyOptions` object for specifying options to `GetIamPolicy`.
    */
  var options: js.UndefOr[SchemaGetPolicyOptions] = js.undefined
}
object SchemaGetIamPolicyRequest {
  
  inline def apply(): SchemaGetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIamPolicyRequest]
  }
  
  extension [Self <: SchemaGetIamPolicyRequest](x: Self) {
    
    inline def setOptions(value: SchemaGetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
