package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleViolationInfo extends js.Object {
  
  /** Source of the data. */
  var dataSource: js.UndefOr[String] = js.native
  
  /** List of matches that were found in the resource content. */
  var matchInfo: js.UndefOr[js.Array[MatchInfo]] = js.native
  
  /**
    * Resource recipients. For Drive, they are grantees that the Drive file was shared with at the time of rule triggering. Valid values include user emails, group emails, domains, or
    * 'anyone' if the file was publicly accessible. If the file was private the recipients list will be empty. For Gmail, they are emails of the users or groups that the Gmail message was
    * sent to.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.native
  
  /** Details of the resource which violated the rule. */
  var resourceInfo: js.UndefOr[ResourceInfo] = js.native
  
  /** Details of the violated rule. */
  var ruleInfo: js.UndefOr[RuleInfo] = js.native
  
  /** Actions suppressed due to other actions with higher priority. */
  var suppressedActionTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Trigger of the rule. */
  var trigger: js.UndefOr[String] = js.native
  
  /** Actions applied as a consequence of the rule being triggered. */
  var triggeredActionTypes: js.UndefOr[js.Array[String]] = js.native
  
  /** Email of the user who caused the violation. Value could be empty if not applicable, for example, a violation found by drive continuous scan. */
  var triggeringUserEmail: js.UndefOr[String] = js.native
}
object RuleViolationInfo {
  
  @scala.inline
  def apply(): RuleViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleViolationInfo]
  }
  
  @scala.inline
  implicit class RuleViolationInfoOps[Self <: RuleViolationInfo] (val x: Self) extends AnyVal {
    
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
    def setDataSource(value: String): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setMatchInfoVarargs(value: MatchInfo*): Self = this.set("matchInfo", js.Array(value :_*))
    
    @scala.inline
    def setMatchInfo(value: js.Array[MatchInfo]): Self = this.set("matchInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchInfo: Self = this.set("matchInfo", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(value: String*): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(value: js.Array[String]): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setResourceInfo(value: ResourceInfo): Self = this.set("resourceInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceInfo: Self = this.set("resourceInfo", js.undefined)
    
    @scala.inline
    def setRuleInfo(value: RuleInfo): Self = this.set("ruleInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleInfo: Self = this.set("ruleInfo", js.undefined)
    
    @scala.inline
    def setSuppressedActionTypesVarargs(value: String*): Self = this.set("suppressedActionTypes", js.Array(value :_*))
    
    @scala.inline
    def setSuppressedActionTypes(value: js.Array[String]): Self = this.set("suppressedActionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressedActionTypes: Self = this.set("suppressedActionTypes", js.undefined)
    
    @scala.inline
    def setTrigger(value: String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setTriggeredActionTypesVarargs(value: String*): Self = this.set("triggeredActionTypes", js.Array(value :_*))
    
    @scala.inline
    def setTriggeredActionTypes(value: js.Array[String]): Self = this.set("triggeredActionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggeredActionTypes: Self = this.set("triggeredActionTypes", js.undefined)
    
    @scala.inline
    def setTriggeringUserEmail(value: String): Self = this.set("triggeringUserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggeringUserEmail: Self = this.set("triggeringUserEmail", js.undefined)
  }
}
