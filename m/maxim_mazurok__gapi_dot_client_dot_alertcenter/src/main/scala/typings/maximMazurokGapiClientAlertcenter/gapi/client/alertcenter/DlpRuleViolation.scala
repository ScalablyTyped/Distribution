package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DlpRuleViolation extends js.Object {
  
  /**
    * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP
    * detectors in this violation if any will be captured in the MatchInfo.predefined_detector.
    */
  var ruleViolationInfo: js.UndefOr[RuleViolationInfo] = js.native
}
object DlpRuleViolation {
  
  @scala.inline
  def apply(): DlpRuleViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DlpRuleViolation]
  }
  
  @scala.inline
  implicit class DlpRuleViolationOps[Self <: DlpRuleViolation] (val x: Self) extends AnyVal {
    
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
    def setRuleViolationInfo(value: RuleViolationInfo): Self = this.set("ruleViolationInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleViolationInfo: Self = this.set("ruleViolationInfo", js.undefined)
  }
}
