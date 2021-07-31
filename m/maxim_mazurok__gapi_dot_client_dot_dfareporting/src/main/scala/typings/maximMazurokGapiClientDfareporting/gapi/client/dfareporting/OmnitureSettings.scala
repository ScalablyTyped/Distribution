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
  
  @scala.inline
  def apply(): OmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmnitureSettings]
  }
  
  @scala.inline
  implicit class OmnitureSettingsMutableBuilder[Self <: OmnitureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOmnitureCostDataEnabled(value: Boolean): Self = StObject.set(x, "omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmnitureCostDataEnabledUndefined: Self = StObject.set(x, "omnitureCostDataEnabled", js.undefined)
    
    @scala.inline
    def setOmnitureIntegrationEnabled(value: Boolean): Self = StObject.set(x, "omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmnitureIntegrationEnabledUndefined: Self = StObject.set(x, "omnitureIntegrationEnabled", js.undefined)
  }
}
