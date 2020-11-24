package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends js.Object {
  
  /** Required */
  var action: js.UndefOr[String] = js.native
  
  /** Additional restrictions that must be met. All conditions must pass for the rule to match. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.native
  
  /** Human-readable description of the rule. */
  var description: js.UndefOr[String] = js.native
  
  /** If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries. */
  var ins: js.UndefOr[js.Array[String]] = js.native
  
  /** The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action. */
  var logConfigs: js.UndefOr[js.Array[LogConfig]] = js.native
  
  /** If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. */
  var notIns: js.UndefOr[js.Array[String]] = js.native
  
  /** A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleOps[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditions: Self = this.set("conditions", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setInsVarargs(value: String*): Self = this.set("ins", js.Array(value :_*))
    
    @scala.inline
    def setIns(value: js.Array[String]): Self = this.set("ins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIns: Self = this.set("ins", js.undefined)
    
    @scala.inline
    def setLogConfigsVarargs(value: LogConfig*): Self = this.set("logConfigs", js.Array(value :_*))
    
    @scala.inline
    def setLogConfigs(value: js.Array[LogConfig]): Self = this.set("logConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogConfigs: Self = this.set("logConfigs", js.undefined)
    
    @scala.inline
    def setNotInsVarargs(value: String*): Self = this.set("notIns", js.Array(value :_*))
    
    @scala.inline
    def setNotIns(value: js.Array[String]): Self = this.set("notIns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotIns: Self = this.set("notIns", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
  }
}
