package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `SetIamPolicy` method.
  */
trait SchemaGoogleIamV1SetIamPolicyRequest extends StObject {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaGoogleIamV1Policy] = js.undefined
}
object SchemaGoogleIamV1SetIamPolicyRequest {
  
  inline def apply(): SchemaGoogleIamV1SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIamV1SetIamPolicyRequest]
  }
  
  extension [Self <: SchemaGoogleIamV1SetIamPolicyRequest](x: Self) {
    
    inline def setPolicy(value: SchemaGoogleIamV1Policy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
