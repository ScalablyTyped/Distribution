package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2PolicySpec extends StObject {
  
  /**
    * An opaque tag indicating the current version of the `Policy`, used for concurrency control. This field is ignored if used in a `CreatePolicy` request. When the `Policy` is returned from either a `GetPolicy` or a `ListPolicies` request, this `etag` indicates the version of the current `Policy` to use when executing a read-modify-write loop. When the `Policy` is returned from a `GetEffectivePolicy` request, the `etag` will be unset.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines the inheritance behavior for this `Policy`. If `inherit_from_parent` is true, PolicyRules set higher up in the hierarchy (up to the closest root) are inherited and present in the effective policy. If it is false, then no rules are inherited, and this Policy becomes the new root for evaluation. This field can be set only for Policies which configure list constraints.
    */
  var inheritFromParent: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Ignores policies set above this resource and restores the `constraint_default` enforcement behavior of the specific `Constraint` at this resource. This field can be set in policies for either list or boolean constraints. If set, `rules` must be empty and `inherit_from_parent` must be set to false.
    */
  var reset: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Up to 10 PolicyRules are allowed. In Policies for boolean constraints, the following requirements apply: - There must be one and only one PolicyRule where condition is unset. - BooleanPolicyRules with conditions must set `enforced` to the opposite of the PolicyRule without a condition. - During policy evaluation, PolicyRules with conditions that are true for a target resource take precedence.
    */
  var rules: js.UndefOr[js.Array[SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule]] = js.undefined
  
  /**
    * Output only. The time stamp this was previously updated. This represents the last time a call to `CreatePolicy` or `UpdatePolicy` was made for that `Policy`.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2PolicySpec {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2PolicySpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2PolicySpec]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2PolicySpec](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setInheritFromParent(value: Boolean): Self = StObject.set(x, "inheritFromParent", value.asInstanceOf[js.Any])
    
    inline def setInheritFromParentNull: Self = StObject.set(x, "inheritFromParent", null)
    
    inline def setInheritFromParentUndefined: Self = StObject.set(x, "inheritFromParent", js.undefined)
    
    inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetNull: Self = StObject.set(x, "reset", null)
    
    inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    
    inline def setRules(value: js.Array[SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
  }
}
