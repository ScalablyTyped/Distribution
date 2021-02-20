package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityRule extends StObject {
  
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
  implicit class ActivityRuleMutableBuilder[Self <: ActivityRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionNames(value: js.Array[String]): Self = StObject.set(x, "actionNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionNamesUndefined: Self = StObject.set(x, "actionNames", js.undefined)
    
    @scala.inline
    def setActionNamesVarargs(value: String*): Self = StObject.set(x, "actionNames", js.Array(value :_*))
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSupersededAlerts(value: js.Array[String]): Self = StObject.set(x, "supersededAlerts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupersededAlertsUndefined: Self = StObject.set(x, "supersededAlerts", js.undefined)
    
    @scala.inline
    def setSupersededAlertsVarargs(value: String*): Self = StObject.set(x, "supersededAlerts", js.Array(value :_*))
    
    @scala.inline
    def setSupersedingAlert(value: String): Self = StObject.set(x, "supersedingAlert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupersedingAlertUndefined: Self = StObject.set(x, "supersedingAlert", js.undefined)
    
    @scala.inline
    def setThreshold(value: String): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    
    @scala.inline
    def setTriggerSource(value: String): Self = StObject.set(x, "triggerSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerSourceUndefined: Self = StObject.set(x, "triggerSource", js.undefined)
    
    @scala.inline
    def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    @scala.inline
    def setWindowSize(value: String): Self = StObject.set(x, "windowSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowSizeUndefined: Self = StObject.set(x, "windowSize", js.undefined)
  }
}
