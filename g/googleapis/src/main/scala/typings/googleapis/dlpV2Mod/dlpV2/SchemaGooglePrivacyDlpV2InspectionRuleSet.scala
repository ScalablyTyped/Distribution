package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule set for modifying a set of infoTypes to alter behavior under certain
  * circumstances, depending on the specific details of the rules within the
  * set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRuleSet extends js.Object {
  
  /**
    * List of infoTypes this rule set is applied to.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.native
  
  /**
    * Set of rules to be applied to infoTypes. The rules are applied in order.
    */
  var rules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRule]] = js.native
}
object SchemaGooglePrivacyDlpV2InspectionRuleSet {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRuleSet]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleSetOps[Self <: SchemaGooglePrivacyDlpV2InspectionRuleSet] (val x: Self) extends AnyVal {
    
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
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = this.set("infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = this.set("infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInfoTypes: Self = this.set("infoTypes", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaGooglePrivacyDlpV2InspectionRule*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
