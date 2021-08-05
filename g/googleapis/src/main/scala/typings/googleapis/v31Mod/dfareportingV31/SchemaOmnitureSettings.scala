package typings.googleapis.v31Mod.dfareportingV31

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Omniture Integration Settings.
  */
trait SchemaOmnitureSettings extends StObject {
  
  /**
    * Whether placement cost data will be sent to Omniture. This property can
    * be enabled only if omnitureIntegrationEnabled is true.
    */
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether Omniture integration is enabled. This property can be enabled
    * only when the &quot;Advanced Ad Serving&quot; account setting is enabled.
    */
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.undefined
}
object SchemaOmnitureSettings {
  
  inline def apply(): SchemaOmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOmnitureSettings]
  }
  
  extension [Self <: SchemaOmnitureSettings](x: Self) {
    
    inline def setOmnitureCostDataEnabled(value: Boolean): Self = StObject.set(x, "omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureCostDataEnabledUndefined: Self = StObject.set(x, "omnitureCostDataEnabled", js.undefined)
    
    inline def setOmnitureIntegrationEnabled(value: Boolean): Self = StObject.set(x, "omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureIntegrationEnabledUndefined: Self = StObject.set(x, "omnitureIntegrationEnabled", js.undefined)
  }
}
