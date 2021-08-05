package typings.maximMazurokGapiClientAlertcenter.gapi.client.alertcenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DlpRuleViolation extends StObject {
  
  /**
    * Details about the violated DLP rule. Admins can use the predefined detectors provided by Google Cloud DLP https://cloud.google.com/dlp/ when setting up a DLP rule. Matched Cloud DLP
    * detectors in this violation if any will be captured in the MatchInfo.predefined_detector.
    */
  var ruleViolationInfo: js.UndefOr[RuleViolationInfo] = js.undefined
}
object DlpRuleViolation {
  
  inline def apply(): DlpRuleViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DlpRuleViolation]
  }
  
  extension [Self <: DlpRuleViolation](x: Self) {
    
    inline def setRuleViolationInfo(value: RuleViolationInfo): Self = StObject.set(x, "ruleViolationInfo", value.asInstanceOf[js.Any])
    
    inline def setRuleViolationInfoUndefined: Self = StObject.set(x, "ruleViolationInfo", js.undefined)
  }
}
