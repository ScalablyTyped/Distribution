package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalSetPolicyRequest extends StObject {
  
  /**
    * Optional. Set the field as true when we would like to disable the onboarding notification.
    */
  var disableNotification: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The policy to be applied to the `resource`.
    */
  var policy: js.UndefOr[SchemaSasPortalPolicy] = js.undefined
  
  /**
    * Required. The resource for which the policy is being specified. This policy replaces any existing policy.
    */
  var resource: js.UndefOr[String | Null] = js.undefined
}
object SchemaSasPortalSetPolicyRequest {
  
  inline def apply(): SchemaSasPortalSetPolicyRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalSetPolicyRequest]
  }
  
  extension [Self <: SchemaSasPortalSetPolicyRequest](x: Self) {
    
    inline def setDisableNotification(value: Boolean): Self = StObject.set(x, "disableNotification", value.asInstanceOf[js.Any])
    
    inline def setDisableNotificationNull: Self = StObject.set(x, "disableNotification", null)
    
    inline def setDisableNotificationUndefined: Self = StObject.set(x, "disableNotification", js.undefined)
    
    inline def setPolicy(value: SchemaSasPortalPolicy): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
    
    inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceNull: Self = StObject.set(x, "resource", null)
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
  }
}
