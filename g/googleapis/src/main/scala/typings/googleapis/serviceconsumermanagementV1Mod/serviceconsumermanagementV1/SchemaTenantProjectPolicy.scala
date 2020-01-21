package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes policy settings that need to be applied to a newly created tenant
  * project.
  */
@js.native
trait SchemaTenantProjectPolicy extends js.Object {
  /**
    * Policy bindings to be applied to the tenant project, in addition to the
    * &#39;roles/owner&#39; role granted to the Service Consumer Management
    * service account. At least one binding must have the role `roles/owner`.
    * Among the list of members for `roles/owner`, at least one of them must be
    * either the `user` or `group` type.
    */
  var policyBindings: js.UndefOr[js.Array[SchemaPolicyBinding]] = js.native
}

object SchemaTenantProjectPolicy {
  @scala.inline
  def apply(policyBindings: js.Array[SchemaPolicyBinding] = null): SchemaTenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    if (policyBindings != null) __obj.updateDynamic("policyBindings")(policyBindings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTenantProjectPolicy]
  }
}

