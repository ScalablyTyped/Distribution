package typings.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTenantProjectPolicy extends StObject {
  
  /**
    * Policy bindings to be applied to the tenant project, in addition to the 'roles/owner' role granted to the Service Consumer Management service account.
    */
  var policyBindings: js.UndefOr[js.Array[SchemaPolicyBinding]] = js.undefined
}
object SchemaTenantProjectPolicy {
  
  inline def apply(): SchemaTenantProjectPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenantProjectPolicy]
  }
  
  extension [Self <: SchemaTenantProjectPolicy](x: Self) {
    
    inline def setPolicyBindings(value: js.Array[SchemaPolicyBinding]): Self = StObject.set(x, "policyBindings", value.asInstanceOf[js.Any])
    
    inline def setPolicyBindingsUndefined: Self = StObject.set(x, "policyBindings", js.undefined)
    
    inline def setPolicyBindingsVarargs(value: SchemaPolicyBinding*): Self = StObject.set(x, "policyBindings", js.Array(value*))
  }
}
