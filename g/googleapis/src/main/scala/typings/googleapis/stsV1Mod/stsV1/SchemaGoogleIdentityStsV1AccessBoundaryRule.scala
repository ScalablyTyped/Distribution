package typings.googleapis.stsV1Mod.stsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleIdentityStsV1AccessBoundaryRule extends StObject {
  
  /**
    * The availability condition further constrains the access allowed by the access boundary rule. If the condition evaluates to `true`, then this access boundary rule will provide access to the specified resource, assuming the principal has the required permissions for the resource. If the condition does not evaluate to `true`, then access to the specified resource will not be available. Note that all access boundary rules in an access boundary are evaluated together as a union. As such, another access boundary rule may allow access to the resource, even if this access boundary rule does not allow access. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies). The maximum length of the `expression` field is 2048 characters.
    */
  var availabilityCondition: js.UndefOr[SchemaGoogleTypeExpr] = js.undefined
  
  /**
    * A list of permissions that may be allowed for use on the specified resource. The only supported values in the list are IAM roles, following the format of google.iam.v1.Binding.role. Example value: `inRole:roles/logging.viewer` for predefined roles and `inRole:organizations/{ORGANIZATION_ID\}/roles/logging.viewer` for custom roles.
    */
  var availablePermissions: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The full resource name of a Google Cloud resource entity. The format definition is at https://cloud.google.com/apis/design/resource_names. Example value: `//cloudresourcemanager.googleapis.com/projects/my-project`.
    */
  var availableResource: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleIdentityStsV1AccessBoundaryRule {
  
  inline def apply(): SchemaGoogleIdentityStsV1AccessBoundaryRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleIdentityStsV1AccessBoundaryRule]
  }
  
  extension [Self <: SchemaGoogleIdentityStsV1AccessBoundaryRule](x: Self) {
    
    inline def setAvailabilityCondition(value: SchemaGoogleTypeExpr): Self = StObject.set(x, "availabilityCondition", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityConditionUndefined: Self = StObject.set(x, "availabilityCondition", js.undefined)
    
    inline def setAvailablePermissions(value: js.Array[String]): Self = StObject.set(x, "availablePermissions", value.asInstanceOf[js.Any])
    
    inline def setAvailablePermissionsNull: Self = StObject.set(x, "availablePermissions", null)
    
    inline def setAvailablePermissionsUndefined: Self = StObject.set(x, "availablePermissions", js.undefined)
    
    inline def setAvailablePermissionsVarargs(value: String*): Self = StObject.set(x, "availablePermissions", js.Array(value*))
    
    inline def setAvailableResource(value: String): Self = StObject.set(x, "availableResource", value.asInstanceOf[js.Any])
    
    inline def setAvailableResourceNull: Self = StObject.set(x, "availableResource", null)
    
    inline def setAvailableResourceUndefined: Self = StObject.set(x, "availableResource", js.undefined)
  }
}
