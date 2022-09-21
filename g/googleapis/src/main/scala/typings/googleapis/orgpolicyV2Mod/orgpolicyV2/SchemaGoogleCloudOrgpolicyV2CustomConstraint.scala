package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2CustomConstraint extends StObject {
  
  /**
    * Allow or deny type.
    */
  var actionType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Org policy condition/expression. For example: `resource.instanceName.matches("[production|test]_.*_(\d)+")'` or, `resource.management.auto_upgrade == true`
    */
  var condition: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Detailed information about this custom policy constraint.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * One line display name for the UI.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * All the operations being applied for this constraint.
    */
  var methodTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Immutable. Name of the constraint. This is unique within the organization. Format of the name should be * `organizations/{organization_id\}/customConstraints/{custom_constraint_id\}` Example : "organizations/123/customConstraints/custom.createOnlyE2TypeVms"
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Immutable. The Resource Instance type on which this policy applies to. Format will be of the form : "/" Example: * `compute.googleapis.com/Instance`.
    */
  var resourceTypes: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2CustomConstraint {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2CustomConstraint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2CustomConstraint]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2CustomConstraint](x: Self) {
    
    inline def setActionType(value: String): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeNull: Self = StObject.set(x, "actionType", null)
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setCondition(value: String): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionNull: Self = StObject.set(x, "condition", null)
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMethodTypes(value: js.Array[String]): Self = StObject.set(x, "methodTypes", value.asInstanceOf[js.Any])
    
    inline def setMethodTypesNull: Self = StObject.set(x, "methodTypes", null)
    
    inline def setMethodTypesUndefined: Self = StObject.set(x, "methodTypes", js.undefined)
    
    inline def setMethodTypesVarargs(value: String*): Self = StObject.set(x, "methodTypes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceTypes(value: js.Array[String]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    inline def setResourceTypesNull: Self = StObject.set(x, "resourceTypes", null)
    
    inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    inline def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "resourceTypes", js.Array(value*))
  }
}
