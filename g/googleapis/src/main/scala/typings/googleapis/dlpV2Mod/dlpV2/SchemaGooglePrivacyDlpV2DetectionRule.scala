package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule for modifying a CustomInfoType to alter behavior under certain
  * circumstances, depending on the specific details of the rule. Not supported
  * for the `surrogate_type` custom info type.
  */
trait SchemaGooglePrivacyDlpV2DetectionRule extends StObject {
  
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.undefined
}
object SchemaGooglePrivacyDlpV2DetectionRule {
  
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DetectionRule]
  }
  
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2DetectionRuleMutableBuilder[Self <: SchemaGooglePrivacyDlpV2DetectionRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
