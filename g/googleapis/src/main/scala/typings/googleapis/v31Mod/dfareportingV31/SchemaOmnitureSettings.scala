package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Omniture Integration Settings.
  */
@js.native
trait SchemaOmnitureSettings extends js.Object {
  
  /**
    * Whether placement cost data will be sent to Omniture. This property can
    * be enabled only if omnitureIntegrationEnabled is true.
    */
  var omnitureCostDataEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether Omniture integration is enabled. This property can be enabled
    * only when the &quot;Advanced Ad Serving&quot; account setting is enabled.
    */
  var omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.native
}
object SchemaOmnitureSettings {
  
  @scala.inline
  def apply(): SchemaOmnitureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOmnitureSettings]
  }
  
  @scala.inline
  implicit class SchemaOmnitureSettingsOps[Self <: SchemaOmnitureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOmnitureCostDataEnabled(value: Boolean): Self = this.set("omnitureCostDataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnitureCostDataEnabled: Self = this.set("omnitureCostDataEnabled", js.undefined)
    
    @scala.inline
    def setOmnitureIntegrationEnabled(value: Boolean): Self = this.set("omnitureIntegrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmnitureIntegrationEnabled: Self = this.set("omnitureIntegrationEnabled", js.undefined)
  }
}
