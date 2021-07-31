package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The rule that specifies conditions when findings of infoTypes specified in
  * `InspectionRuleSet` are removed from results.
  */
trait SchemaGooglePrivacyDlpV2ExclusionRule extends StObject {
  
  /**
    * Dictionary which defines the rule.
    */
  var dictionary: js.UndefOr[SchemaGooglePrivacyDlpV2Dictionary] = js.undefined
  
  /**
    * Set of infoTypes for which findings would affect this rule.
    */
  var excludeInfoTypes: js.UndefOr[SchemaGooglePrivacyDlpV2ExcludeInfoTypes] = js.undefined
  
  /**
    * How the rule is applied, see MatchingType documentation for details.
    */
  var matchingType: js.UndefOr[String] = js.undefined
  
  /**
    * Regular expression which defines the rule.
    */
  var regex: js.UndefOr[SchemaGooglePrivacyDlpV2Regex] = js.undefined
}
object SchemaGooglePrivacyDlpV2ExclusionRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2ExclusionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2ExclusionRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2ExclusionRuleMutableBuilder[Self <: SchemaGooglePrivacyDlpV2ExclusionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDictionary(value: SchemaGooglePrivacyDlpV2Dictionary): Self = StObject.set(x, "dictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDictionaryUndefined: Self = StObject.set(x, "dictionary", js.undefined)
    
    @scala.inline
    def setExcludeInfoTypes(value: SchemaGooglePrivacyDlpV2ExcludeInfoTypes): Self = StObject.set(x, "excludeInfoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeInfoTypesUndefined: Self = StObject.set(x, "excludeInfoTypes", js.undefined)
    
    @scala.inline
    def setMatchingType(value: String): Self = StObject.set(x, "matchingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchingTypeUndefined: Self = StObject.set(x, "matchingType", js.undefined)
    
    @scala.inline
    def setRegex(value: SchemaGooglePrivacyDlpV2Regex): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
  }
}
