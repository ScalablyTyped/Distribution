package typings.googleapis.identitytoolkitV2Mod.identitytoolkitV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIamV1GetIamPolicyRequest extends StObject {
  
  /**
    * OPTIONAL: A `GetPolicyOptions` object for specifying options to `GetIamPolicy`.
    */
  var options: js.UndefOr[SchemaGoogleIamV1GetPolicyOptions] = js.undefined
}
object SchemaGoogleIamV1GetIamPolicyRequest {
  
  inline def apply(): SchemaGoogleIamV1GetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1GetIamPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleIamV1GetIamPolicyRequest](x: Self) {
    
    inline def setOptions(value: SchemaGoogleIamV1GetPolicyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
