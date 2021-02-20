package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait SchemaSetIamPolicyRequest extends StObject {
  
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaPolicy] = js.native
}
object SchemaSetIamPolicyRequest {
  
  @scala.inline
  def apply(): SchemaSetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetIamPolicyRequest]
  }
  
  @scala.inline
  implicit class SchemaSetIamPolicyRequestMutableBuilder[Self <: SchemaSetIamPolicyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicy(value: SchemaPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
  }
}
