package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    omnitureCostDataEnabled: js.UndefOr[Boolean] = js.undefined,
    omnitureIntegrationEnabled: js.UndefOr[Boolean] = js.undefined
  ): SchemaOmnitureSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(omnitureCostDataEnabled)) __obj.updateDynamic("omnitureCostDataEnabled")(omnitureCostDataEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(omnitureIntegrationEnabled)) __obj.updateDynamic("omnitureIntegrationEnabled")(omnitureIntegrationEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOmnitureSettings]
  }
}

