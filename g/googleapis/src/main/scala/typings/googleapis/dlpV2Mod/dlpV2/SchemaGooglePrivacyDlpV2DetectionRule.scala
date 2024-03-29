package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2DetectionRule extends StObject {
  
  /**
    * Hotword-based detection rule.
    */
  var hotwordRule: js.UndefOr[SchemaGooglePrivacyDlpV2HotwordRule] = js.undefined
}
object SchemaGooglePrivacyDlpV2DetectionRule {
  
  inline def apply(): SchemaGooglePrivacyDlpV2DetectionRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2DetectionRule]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2DetectionRule](x: Self) {
    
    inline def setHotwordRule(value: SchemaGooglePrivacyDlpV2HotwordRule): Self = StObject.set(x, "hotwordRule", value.asInstanceOf[js.Any])
    
    inline def setHotwordRuleUndefined: Self = StObject.set(x, "hotwordRule", js.undefined)
  }
}
