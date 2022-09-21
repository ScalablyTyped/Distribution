package typings.googleapis.gameservicesV1betaMod.gameservicesV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRule extends StObject {
  
  /**
    * Required
    */
  var action: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional restrictions that must be met. All conditions must pass for the rule to match.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Human-readable description of the rule.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
    */
  var in: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * The config returned to callers of CheckPolicy for any entries that match the LOG action.
    */
  var logConfig: js.UndefOr[js.Array[SchemaLogConfig]] = js.undefined
  
  /**
    * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at in the Local IAM documentation (see go/local-iam#features).
    */
  var notIn: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs.
    */
  var permissions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object SchemaRule {
  
  inline def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  extension [Self <: SchemaRule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionNull: Self = StObject.set(x, "action", null)
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setConditions(value: js.Array[SchemaCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: SchemaCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIn(value: js.Array[String]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInNull: Self = StObject.set(x, "in", null)
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setInVarargs(value: String*): Self = StObject.set(x, "in", js.Array(value*))
    
    inline def setLogConfig(value: js.Array[SchemaLogConfig]): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setLogConfigVarargs(value: SchemaLogConfig*): Self = StObject.set(x, "logConfig", js.Array(value*))
    
    inline def setNotIn(value: js.Array[String]): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    inline def setNotInNull: Self = StObject.set(x, "notIn", null)
    
    inline def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    inline def setNotInVarargs(value: String*): Self = StObject.set(x, "notIn", js.Array(value*))
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsNull: Self = StObject.set(x, "permissions", null)
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}
