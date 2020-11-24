package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityRule extends js.Object {
  
  /** List of action names associated with the rule threshold. */
  var actionNames: js.UndefOr[js.Array[String]] = js.native
  
  /** Rule create timestamp. */
  var createTime: js.UndefOr[String] = js.native
  
  /** Description of the rule. */
  var description: js.UndefOr[String] = js.native
  
  /** Alert display name. */
  var displayName: js.UndefOr[String] = js.native
  
  /** Rule name. */
  var name: js.UndefOr[String] = js.native
  
  /** Query that is used to get the data from the associated source. */
  var query: js.UndefOr[String] = js.native
  
  /**
    * List of alert IDs superseded by this alert. It is used to indicate that this alert is essentially extension of superseded alerts and we found the relationship after creating these
    * alerts.
    */
  var supersededAlerts: js.UndefOr[js.Array[String]] = js.native
  
  /** Alert ID superseding this alert. It is used to indicate that superseding alert is essentially extension of this alert and we found the relationship after creating both alerts. */
  var supersedingAlert: js.UndefOr[String] = js.native
  
  /** Alert threshold is for example “COUNT > 5”. */
  var threshold: js.UndefOr[String] = js.native
  
  /** The trigger sources for this rule. * GMAIL_EVENTS * DEVICE_EVENTS * USER_EVENTS */
  var triggerSource: js.UndefOr[String] = js.native
  
  /** The timestamp of the last update to the rule. */
  var updateTime: js.UndefOr[String] = js.native
  
  /** Rule window size. Possible values are 1 hour or 24 hours. */
  var windowSize: js.UndefOr[String] = js.native
}
object ActivityRule {
  
  @scala.inline
  def apply(): ActivityRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityRule]
  }
  
  @scala.inline
  implicit class ActivityRuleOps[Self <: ActivityRule] (val x: Self) extends AnyVal {
    
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
    def setActionNamesVarargs(value: String*): Self = this.set("actionNames", js.Array(value :_*))
    
    @scala.inline
    def setActionNames(value: js.Array[String]): Self = this.set("actionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionNames: Self = this.set("actionNames", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSupersededAlertsVarargs(value: String*): Self = this.set("supersededAlerts", js.Array(value :_*))
    
    @scala.inline
    def setSupersededAlerts(value: js.Array[String]): Self = this.set("supersededAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupersededAlerts: Self = this.set("supersededAlerts", js.undefined)
    
    @scala.inline
    def setSupersedingAlert(value: String): Self = this.set("supersedingAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupersedingAlert: Self = this.set("supersedingAlert", js.undefined)
    
    @scala.inline
    def setThreshold(value: String): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
    
    @scala.inline
    def setTriggerSource(value: String): Self = this.set("triggerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerSource: Self = this.set("triggerSource", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = this.set("updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateTime: Self = this.set("updateTime", js.undefined)
    
    @scala.inline
    def setWindowSize(value: String): Self = this.set("windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWindowSize: Self = this.set("windowSize", js.undefined)
  }
}
