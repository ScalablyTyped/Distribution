package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaTenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectPolicy]
  }
  
  @scala.inline
  implicit class SchemaTenantProjectPolicyOps[Self <: SchemaTenantProjectPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPolicyBindingsVarargs(value: SchemaPolicyBinding*): Self = this.set("policyBindings", js.Array(value :_*))
    
    @scala.inline
    def setPolicyBindings(value: js.Array[SchemaPolicyBinding]): Self = this.set("policyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicyBindings: Self = this.set("policyBindings", js.undefined)
  }
}
