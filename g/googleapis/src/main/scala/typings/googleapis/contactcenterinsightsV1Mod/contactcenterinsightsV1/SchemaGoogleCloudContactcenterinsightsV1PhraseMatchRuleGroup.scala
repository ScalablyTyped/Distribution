package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup extends StObject {
  
  /**
    * A list of phase match rules that are included in this group.
    */
  var phraseMatchRules: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule]] = js.undefined
  
  /**
    * Required. The type of this phrase match rule group.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup](x: Self) {
    
    inline def setPhraseMatchRules(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule]): Self = StObject.set(x, "phraseMatchRules", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatchRulesUndefined: Self = StObject.set(x, "phraseMatchRules", js.undefined)
    
    inline def setPhraseMatchRulesVarargs(value: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule*): Self = StObject.set(x, "phraseMatchRules", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
