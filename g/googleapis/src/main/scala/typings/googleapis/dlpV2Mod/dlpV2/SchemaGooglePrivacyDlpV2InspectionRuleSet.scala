package typings.googleapis.dlpV2Mod.dlpV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Rule set for modifying a set of infoTypes to alter behavior under certain
  * circumstances, depending on the specific details of the rules within the
  * set.
  */
@js.native
trait SchemaGooglePrivacyDlpV2InspectionRuleSet extends StObject {
  
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
  implicit class SchemaGooglePrivacyDlpV2InspectionRuleSetMutableBuilder[Self <: SchemaGooglePrivacyDlpV2InspectionRuleSet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoTypes(value: js.Array[SchemaGooglePrivacyDlpV2InfoType]): Self = StObject.set(x, "infoTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoTypesUndefined: Self = StObject.set(x, "infoTypes", js.undefined)
    
    @scala.inline
    def setInfoTypesVarargs(value: SchemaGooglePrivacyDlpV2InfoType*): Self = StObject.set(x, "infoTypes", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[SchemaGooglePrivacyDlpV2InspectionRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: SchemaGooglePrivacyDlpV2InspectionRule*): Self = StObject.set(x, "rules", js.Array(value :_*))
  }
}
