package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A single inspection rule to be applied to infoTypes, specified in
  * `InspectionRuleSet`.
  */
trait SchemaGooglePrivacyDlpV2InspectionRule extends StObject {
  
  /**
    * Exclusion rule.
    */
  var exclusionRule: js.UndefOr[SchemaGooglePrivacyDlpV2ExclusionRule] = js.undefined
  
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectionRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2InspectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclusionRule(value: SchemaGooglePrivacyDlpV2ExclusionRule): Self = StObject.set(x, "exclusionRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionRuleUndefined: Self = StObject.set(x, "exclusionRule", js.undefined)
    
    @scala.inline
    def setHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
