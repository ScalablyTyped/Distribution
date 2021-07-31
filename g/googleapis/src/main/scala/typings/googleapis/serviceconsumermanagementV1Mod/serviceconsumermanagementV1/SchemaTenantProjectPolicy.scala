package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes policy settings that need to be applied to a newly created tenant
  * project.
  */
trait SchemaTenantProjectPolicy extends StObject {
  
  /**
    * Policy bindings to be applied to the tenant project, in addition to the
    * &#39;roles/owner&#39; role granted to the Service Consumer Management
    * service account. At least one binding must have the role `roles/owner`.
    * Among the list of members for `roles/owner`, at least one of them must be
    * either the `user` or `group` type.
    */
  var policyBindings: js.UndefOr[js.Array[SchemaPolicyBinding]] = js.undefined
}
object SchemaTenantProjectPolicy {
  
  @scala.inline
  def apply(): SchemaTenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectPolicy]
  }
  
  @scala.inline
  implicit class SchemaTenantProjectPolicyMutableBuilder[Self <: SchemaTenantProjectPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyBindings(value: js.Array[SchemaPolicyBinding]): Self = StObject.set(x, "policyBindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyBindingsUndefined: Self = StObject.set(x, "policyBindings", js.undefined)
    
    @scala.inline
    def setPolicyBindingsVarargs(value: SchemaPolicyBinding*): Self = StObject.set(x, "policyBindings", js.Array(value :_*))
  }
}
