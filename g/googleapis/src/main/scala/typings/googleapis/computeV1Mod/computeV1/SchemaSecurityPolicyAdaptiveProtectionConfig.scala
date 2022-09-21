package typings.googleapis.computeV1Mod.computeV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyAdaptiveProtectionConfig extends StObject {
  
  /**
    * If set to true, enables Cloud Armor Machine Learning.
    */
  var layer7DdosDefenseConfig: js.UndefOr[SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig] = js.undefined
}
object SchemaSecurityPolicyAdaptiveProtectionConfig {
  
  inline def apply(): SchemaSecurityPolicyAdaptiveProtectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyAdaptiveProtectionConfig]
  }
  
  extension [Self <: SchemaSecurityPolicyAdaptiveProtectionConfig](x: Self) {
    
    inline def setLayer7DdosDefenseConfig(value: SchemaSecurityPolicyAdaptiveProtectionConfigLayer7DdosDefenseConfig): Self = StObject.set(x, "layer7DdosDefenseConfig", value.asInstanceOf[js.Any])
    
    inline def setLayer7DdosDefenseConfigUndefined: Self = StObject.set(x, "layer7DdosDefenseConfig", js.undefined)
  }
}
