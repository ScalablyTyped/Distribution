package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGooglePrivacyDlpV2InspectionRuleSet extends StObject {
  
  /**
    * List of infoTypes this rule set is applied to.
    */
  var infoTypes: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InfoType]] = js.undefined
  
  /**
    * Set of rules to be applied to infoTypes. The rules are applied in order.
    */
  var rules: js.UndefOr[js.Array[SchemaGooglePrivacyDlpV2InspectionRule]] = js.undefined
}
object SchemaGooglePrivacyDlpV2InspectionRuleSet {
  
  inline def apply(): SchemaGooglePrivacyDlpV2InspectionRuleSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2InspectionRuleSet]
  }
  
  extension [Self <: SchemaGooglePrivacyDlpV2InspectionRuleSet](x: Self) {
    
    inline def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    inline def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    inline def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value*))
    
    inline def setRules(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaGooglePrivacyDlpV2InspectionRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
