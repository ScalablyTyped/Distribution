package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig extends StObject {
  
  /**
    * If set to true, enables CAAP for L7 DDoS detection.
    */
  var enable: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Rule visibility can be one of the following: STANDARD - opaque rules. (default) PREMIUM - transparent rules.
    */
  var ruleVisibility: js.UndefOr[String | Null] = js.undefined
}
object SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig {
  
  inline def apply(): SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig](x: Self) {
    
    inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setEnableNull: Self = StObject.set(x, "enable", null)
    
    inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
    
    inline def setRuleVisibility(value: String): Self = StObject.set(x, "ruleVisibility", value.asInstanceOf[js.Any])
    
    inline def setRuleVisibilityNull: Self = StObject.set(x, "ruleVisibility", null)
    
    inline def setRuleVisibilityUndefined: Self = StObject.set(x, "ruleVisibility", js.undefined)
  }
}
