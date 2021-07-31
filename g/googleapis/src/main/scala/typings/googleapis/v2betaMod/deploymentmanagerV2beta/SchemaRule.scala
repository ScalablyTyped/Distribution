package typings.googleapis.v2betaMod.deploymentmanagerV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rule to be applied in a Policy.
  */
trait SchemaRule extends StObject {
  
  /**
    * Required
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Additional restrictions that must be met. All conditions must pass for
    * the rule to match.
    */
  var conditions: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Human-readable description of the rule.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If one or more &#39;in&#39; clauses are specified, the rule matches if
    * the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries.
    */
  var ins: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The config returned to callers of tech.iam.IAM.CheckPolicy for any
    * entries that match the LOG action.
    */
  var logConfigs: js.UndefOr[js.Array[SchemaLogConfig]] = js.undefined
  
  /**
    * If one or more &#39;not_in&#39; clauses are specified, the rule matches
    * if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries.
    */
  var notIns: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * A permission is a string of form &#39;..&#39; (e.g.,
    * &#39;storage.buckets.list&#39;). A value of &#39;*&#39; matches all
    * permissions, and a verb part of &#39;*&#39; (e.g.,
    * &#39;storage.buckets.*&#39;) matches all verbs.
    */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object SchemaRule {
  
  @scala.inline
  def apply(): SchemaRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRule]
  }
  
  @scala.inline
  implicit class SchemaRuleMutableBuilder[Self <: SchemaRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[SchemaCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: SchemaCondition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIns(value: js.Array[String]): Self = StObject.set(x, "ins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsUndefined: Self = StObject.set(x, "ins", js.undefined)
    
    @scala.inline
    def setInsVarargs(value: String*): Self = StObject.set(x, "ins", js.Array(value :_*))
    
    @scala.inline
    def setLogConfigs(value: js.Array[SchemaLogConfig]): Self = StObject.set(x, "logConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigsUndefined: Self = StObject.set(x, "logConfigs", js.undefined)
    
    @scala.inline
    def setLogConfigsVarargs(value: SchemaLogConfig*): Self = StObject.set(x, "logConfigs", js.Array(value :_*))
    
    @scala.inline
    def setNotIns(value: js.Array[String]): Self = StObject.set(x, "notIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInsUndefined: Self = StObject.set(x, "notIns", js.undefined)
    
    @scala.inline
    def setNotInsVarargs(value: String*): Self = StObject.set(x, "notIns", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}
