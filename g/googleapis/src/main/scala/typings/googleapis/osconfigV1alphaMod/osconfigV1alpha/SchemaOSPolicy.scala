package typings.googleapis.osconfigV1alphaMod.osconfigV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOSPolicy extends StObject {
  
  /**
    * This flag determines the OS policy compliance status when none of the resource groups within the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported as compliant even if the policy has nothing to validate or enforce.
    */
  var allowNoResourceGroupMatch: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Policy description. Length of the description is limited to 1024 characters.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The id of the OS policy with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the assignment.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. Policy mode
    */
  var mode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. List of resource groups for the policy. For a particular VM, resource groups are evaluated in the order specified and the first resource group that is applicable is selected and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag `allow_no_resource_group_match`
    */
  var resourceGroups: js.UndefOr[js.Array[SchemaOSPolicyResourceGroup]] = js.undefined
}
object SchemaOSPolicy {
  
  inline def apply(): SchemaOSPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOSPolicy]
  }
  
  extension [Self <: SchemaOSPolicy](x: Self) {
    
    inline def setAllowNoResourceGroupMatch(value: Boolean): Self = StObject.set(x, "allowNoResourceGroupMatch", value.asInstanceOf[js.Any])
    
    inline def setAllowNoResourceGroupMatchNull: Self = StObject.set(x, "allowNoResourceGroupMatch", null)
    
    inline def setAllowNoResourceGroupMatchUndefined: Self = StObject.set(x, "allowNoResourceGroupMatch", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeNull: Self = StObject.set(x, "mode", null)
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setResourceGroups(value: js.Array[SchemaOSPolicyResourceGroup]): Self = StObject.set(x, "resourceGroups", value.asInstanceOf[js.Any])
    
    inline def setResourceGroupsUndefined: Self = StObject.set(x, "resourceGroups", js.undefined)
    
    inline def setResourceGroupsVarargs(value: SchemaOSPolicyResourceGroup*): Self = StObject.set(x, "resourceGroups", js.Array(value*))
  }
}
