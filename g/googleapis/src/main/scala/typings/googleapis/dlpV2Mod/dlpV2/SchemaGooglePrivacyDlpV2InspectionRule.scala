package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single inspection rule to be applied to infoTypes, specified in
  * `InspectionRuleSet`.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRule extends js.Object {
  
  /**
    * Exclusion rule.
    */
  var exclusionRule: js.UndefOr[SchemaGooglePrivacyDlpV2ExclusionRule] = js.native
  
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.native
}
object SchemaGooglePrivacyDlpV2InspectionRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleOps[Self <: SchemaGooglePrivacyDlpV2InspectionRule] (val x: Self) extends AnyVal {
    
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
    def setExclusionRule(value: SchemaGooglePrivacyDlpV2ExclusionRule): Self = this.set("exclusionRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusionRule: Self = this.set("exclusionRule", js.undefined)
    
    @scala.inline
    def setHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = this.set("hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHotwordRule: Self = this.set("hotwordRule", js.undefined)
  }
}
