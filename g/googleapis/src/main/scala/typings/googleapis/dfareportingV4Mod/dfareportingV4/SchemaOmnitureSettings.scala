package typings.googleapis.dfareportingV4Mod.dfareportingV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOmnitureSettings extends StObject {
  
  /**
    * Whether placement cost data will be sent to Omniture. This property can be enabled only if omnitureIntegrationEnabled is true.
    */
  var omnitureCostDataEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Omniture integration is enabled. This property can be enabled only when the "Advanced Ad Serving" account setting is enabled.
    */
  var omnitureIntegrationEnabled: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaOmnitureSettings {
  
  inline def apply(): SchemaOmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOmnitureSettings]
  }
  
  extension [Self <: SchemaOmnitureSettings](x: Self) {
    
    inline def setOmnitureCostDataEnabled(value: Boolean): Self = StObject.set(x, "omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureCostDataEnabledNull: Self = StObject.set(x, "omnitureCostDataEnabled", null)
    
    inline def setOmnitureCostDataEnabledUndefined: Self = StObject.set(x, "omnitureCostDataEnabled", js.undefined)
    
    inline def setOmnitureIntegrationEnabled(value: Boolean): Self = StObject.set(x, "omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureIntegrationEnabledNull: Self = StObject.set(x, "omnitureIntegrationEnabled", null)
    
    inline def setOmnitureIntegrationEnabledUndefined: Self = StObject.set(x, "omnitureIntegrationEnabled", js.undefined)
  }
}
