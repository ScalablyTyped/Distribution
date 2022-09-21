package typings.googleapis.orgpolicyV2Mod.orgpolicyV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule extends StObject {
  
  /**
    * Setting this to true means that all values are allowed. This field can be set only in Policies for list constraints.
    */
  var allowAll: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * A condition which determines whether this rule is used in the evaluation of the policy. When set, the `expression` field in the `Expr' must include from 1 to 10 subexpressions, joined by the "||" or "&&" operators. Each subexpression must be of the form "resource.matchTag('/tag_key_short_name, 'tag_value_short_name')". or "resource.matchTagId('tagKeys/key_id', 'tagValues/value_id')". where key_name and value_name are the resource names for Label Keys and Values. These names are available from the Tag Manager Service. An example expression is: "resource.matchTag('123456789/environment, 'prod')". or "resource.matchTagId('tagKeys/123', 'tagValues/456')".
    */
  var condition: js.UndefOr[SchemaGoogleTypeExpr] = js.undefined
  
  /**
    * Setting this to true means that all values are denied. This field can be set only in Policies for list constraints.
    */
  var denyAll: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If `true`, then the `Policy` is enforced. If `false`, then any configuration is acceptable. This field can be set only in Policies for boolean constraints.
    */
  var enforce: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * List of values to be used for this PolicyRule. This field can be set only in Policies for list constraints.
    */
  var values: js.UndefOr[SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues] = js.undefined
}
object SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule {
  
  inline def apply(): SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule]
  }
  
  extension [Self <: SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRule](x: Self) {
    
    inline def setAllowAll(value: Boolean): Self = StObject.set(x, "allowAll", value.asInstanceOf[js.Any])
    
    inline def setAllowAllNull: Self = StObject.set(x, "allowAll", null)
    
    inline def setAllowAllUndefined: Self = StObject.set(x, "allowAll", js.undefined)
    
    inline def setCondition(value: SchemaGoogleTypeExpr): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setDenyAll(value: Boolean): Self = StObject.set(x, "denyAll", value.asInstanceOf[js.Any])
    
    inline def setDenyAllNull: Self = StObject.set(x, "denyAll", null)
    
    inline def setDenyAllUndefined: Self = StObject.set(x, "denyAll", js.undefined)
    
    inline def setEnforce(value: Boolean): Self = StObject.set(x, "enforce", value.asInstanceOf[js.Any])
    
    inline def setEnforceNull: Self = StObject.set(x, "enforce", null)
    
    inline def setEnforceUndefined: Self = StObject.set(x, "enforce", js.undefined)
    
    inline def setValues(value: SchemaGoogleCloudOrgpolicyV2PolicySpecPolicyRuleStringValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
