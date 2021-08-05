package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /** Required */
  var action: js.UndefOr[String] = js.undefined
  
  /** Additional restrictions that must be met. All conditions must pass for the rule to match. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** Human-readable description of the rule. */
  var description: js.UndefOr[String] = js.undefined
  
  /** If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries. */
  var ins: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action. */
  var logConfigs: js.UndefOr[js.Array[LogConfig]] = js.undefined
  
  /** If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. */
  var notIns: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
    
    inline def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
    
    inline def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
    
    inline def setLogConfigs(value: js.Array[LogConfig]): Self = StObject.set(x, "logConfigs", value.asInstanceOf[js.Any])
    
    inline def setLogConfigsUndefined: Self = StObject.set(x, "logConfigs", js.undefined)
    
    inline def setLogConfigsVarargs(value: LogConfig*): Self = StObject.set(x, "logConfigs", js.Array(value :_*))
    
    inline def setNotIns(value: js.Array[String]): Self = StObject.set(x, "notIns", value.asInstanceOf[js.Any])
    
    inline def setNotInsUndefined: Self = StObject.set(x, "notIns", js.undefined)
    
    inline def setNotInsVarargs(value: String*): Self = StObject.set(x, "notIns", js.Array(value :_*))
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
