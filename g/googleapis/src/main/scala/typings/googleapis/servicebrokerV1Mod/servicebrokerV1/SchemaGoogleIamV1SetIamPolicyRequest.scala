package typings.googleapis.servicebrokerV1Mod.servicebrokerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for `SetIamPolicy` method.
  */
@js.native
trait SchemaGoogleIamV1SetIamPolicyRequest extends js.Object {
  /**
    * REQUIRED: The complete policy to be applied to the `resource`. The size
    * of the policy is limited to a few 10s of KB. An empty policy is a valid
    * policy but certain Cloud Platform services (such as Projects) might
    * reject them.
    */
  var policy: js.UndefOr[SchemaGoogleIamV1Policy] = js.native
}

object SchemaGoogleIamV1SetIamPolicyRequest {
  @scala.inline
  def apply(policy: SchemaGoogleIamV1Policy = null): SchemaGoogleIamV1SetIamPolicyRequest = {
    val __obj = js.Dynamic.literal()
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleIamV1SetIamPolicyRequest]
  }
}

