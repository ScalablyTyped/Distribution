package typings.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rule that specifies conditions when findings of infoTypes specified in
  * `InspectionRuleSet` are removed from results.
  */
@js.native
trait SchemaGooglePrivacyDlpV2ExclusionRule extends js.Object {
  
  /**
    * Dictionary which defines the rule.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.native
  
  /**
    * Set of infoTypes for which findings would affect this rule.
    */
  var excludeInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2ExcludeInfoTypes] = js.native
  
  /**
    * How the rule is applied, see MatchingType documentation for details.
    */
  var matchingType: js.UndefOr[String] = js.native
  
  /**
    * Regular expression which defines the rule.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.native
}
object SchemaGooglePrivacyDlpV2ExclusionRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExclusionRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExclusionRuleOps[Self <: SchemaGooglePrivacyDlpV2ExclusionRule] (val x: Self) extends AnyVal {
    
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
    def setDictionary(value: SchemaGooglePrivacyDlpV2Dictionary): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDictionary: Self = this.set("dictionary", js.undefined)
    
    @scala.inline
    def setExcludeInfoTypes(value: SchemaGooglePrivacyDlpV2ExcludeInfoTypes): Self = this.set("excludeInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludeInfoTypes: Self = this.set("excludeInfoTypes", js.undefined)
    
    @scala.inline
    def setMatchingType(value: String): Self = this.set("matchingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchingType: Self = this.set("matchingType", js.undefined)
    
    @scala.inline
    def setRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
  }
}
