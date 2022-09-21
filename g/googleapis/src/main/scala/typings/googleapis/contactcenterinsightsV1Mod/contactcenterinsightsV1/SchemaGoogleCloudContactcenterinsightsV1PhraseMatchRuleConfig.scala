package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig extends StObject {
  
  /**
    * The configuration for the exact match rule.
    */
  var exactMatchConfig: js.UndefOr[SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleConfig](x: Self) {
    
    inline def setExactMatchConfig(value: SchemaGoogleCloudContactcenterinsightsV1ExactMatchConfig): Self = StObject.set(x, "exactMatchConfig", value.asInstanceOf[js.Any])
    
    inline def setExactMatchConfigUndefined: Self = StObject.set(x, "exactMatchConfig", js.undefined)
  }
}
