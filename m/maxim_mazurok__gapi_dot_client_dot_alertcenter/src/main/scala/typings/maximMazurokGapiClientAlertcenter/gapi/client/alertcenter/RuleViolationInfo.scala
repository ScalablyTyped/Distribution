package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleViolationInfo extends StObject {
  
  /** Source of the data. */
  var dataSource: js.UndefOr[String] = js.undefined
  
  /** List of matches that were found in the resource content. */
  var matchInfo: js.UndefOr[js.Array[MatchInfo]] = js.undefined
  
  /**
    * Resource recipients. For Drive, they are grantees that the Drive file was shared with at the time of rule triggering. Valid values include user emails, group emails, domains, or
    * 'anyone' if the file was publicly accessible. If the file was private the recipients list will be empty. For Gmail, they are emails of the users or groups that the Gmail message was
    * sent to.
    */
  var recipients: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Details of the resource which violated the rule. */
  var resourceInfo: js.UndefOr[ResourceInfo] = js.undefined
  
  /** Details of the violated rule. */
  var ruleInfo: js.UndefOr[RuleInfo] = js.undefined
  
  /** Actions suppressed due to other actions with higher priority. */
  var suppressedActionTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Trigger of the rule. */
  var trigger: js.UndefOr[String] = js.undefined
  
  /** Actions applied as a consequence of the rule being triggered. */
  var triggeredActionTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Email of the user who caused the violation. Value could be empty if not applicable, for example, a violation found by drive continuous scan. */
  var triggeringUserEmail: js.UndefOr[String] = js.undefined
}
object RuleViolationInfo {
  
  inline def apply(): RuleViolationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleViolationInfo]
  }
  
  extension [Self <: RuleViolationInfo](x: Self) {
    
    inline def setDataSource(value: String): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setMatchInfo(value: js.Array[MatchInfo]): Self = StObject.set(x, "matchInfo", value.asInstanceOf[js.Any])
    
    inline def setMatchInfoUndefined: Self = StObject.set(x, "matchInfo", js.undefined)
    
    inline def setMatchInfoVarargs(value: MatchInfo*): Self = StObject.set(x, "matchInfo", js.Array(value :_*))
    
    inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value :_*))
    
    inline def setResourceInfo(value: ResourceInfo): Self = StObject.set(x, "resourceInfo", value.asInstanceOf[js.Any])
    
    inline def setResourceInfoUndefined: Self = StObject.set(x, "resourceInfo", js.undefined)
    
    inline def setRuleInfo(value: RuleInfo): Self = StObject.set(x, "ruleInfo", value.asInstanceOf[js.Any])
    
    inline def setRuleInfoUndefined: Self = StObject.set(x, "ruleInfo", js.undefined)
    
    inline def setSuppressedActionTypes(value: js.Array[String]): Self = StObject.set(x, "suppressedActionTypes", value.asInstanceOf[js.Any])
    
    inline def setSuppressedActionTypesUndefined: Self = StObject.set(x, "suppressedActionTypes", js.undefined)
    
    inline def setSuppressedActionTypesVarargs(value: String*): Self = StObject.set(x, "suppressedActionTypes", js.Array(value :_*))
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggeredActionTypes(value: js.Array[String]): Self = StObject.set(x, "triggeredActionTypes", value.asInstanceOf[js.Any])
    
    inline def setTriggeredActionTypesUndefined: Self = StObject.set(x, "triggeredActionTypes", js.undefined)
    
    inline def setTriggeredActionTypesVarargs(value: String*): Self = StObject.set(x, "triggeredActionTypes", js.Array(value :_*))
    
    inline def setTriggeringUserEmail(value: String): Self = StObject.set(x, "triggeringUserEmail", value.asInstanceOf[js.Any])
    
    inline def setTriggeringUserEmailUndefined: Self = StObject.set(x, "triggeringUserEmail", js.undefined)
  }
}
