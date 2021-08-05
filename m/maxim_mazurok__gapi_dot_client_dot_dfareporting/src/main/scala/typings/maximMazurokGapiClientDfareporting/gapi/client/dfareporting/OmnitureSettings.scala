package typings.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmnitureSettings extends StObject {
  
  /** Whether placement cost data will be sent to Omniture. This property can be enabled only if omnitureIntegrationEnabled is true. */
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined
  
  /** Whether Omniture integration is enabled. This property can be enabled only when the "Advanced Ad Serving" account setting is enabled. */
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.undefined
}
object OmnitureSettings {
  
  inline def apply(): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmnitureSettings]
  }
  
  extension [Self <: OmnitureSettings](x: Self) {
    
    inline def setOmnitureCostDataEnabled(value: Boolean): Self = StObject.set(x, "omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureCostDataEnabledUndefined: Self = StObject.set(x, "omnitureCostDataEnabled", js.undefined)
    
    inline def setOmnitureIntegrationEnabled(value: Boolean): Self = StObject.set(x, "omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    inline def setOmnitureIntegrationEnabledUndefined: Self = StObject.set(x, "omnitureIntegrationEnabled", js.undefined)
  }
}
