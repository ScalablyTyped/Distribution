package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule extends StObject {
  
  /**
    * Provides additional information about the rule that specifies how to apply the rule.
    */
  var config: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig] = js.undefined
  
  /**
    * Specifies whether the phrase must be missing from the transcript segment or present in the transcript segment.
    */
  var negated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The phrase to be matched.
    */
  var query: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRule](x: Self) {
    
    inline def setConfig(value: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setNegatedNull: Self = StObject.set(x, "negated", null)
    
    inline def setNegatedUndefined: Self = StObject.set(x, "negated", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryNull: Self = StObject.set(x, "query", null)
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
