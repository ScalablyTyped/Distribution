package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User specified settings that are attached to the Cloud Security Command
  * Center (Cloud SCC) organization.
  */
@js.native
trait SchemaOrganizationSettings extends js.Object {
  /**
    * The configuration used for Asset Discovery runs.
    */
  var assetDiscoveryConfig: js.UndefOr[SchemaAssetDiscoveryConfig] = js.native
  /**
    * A flag that indicates if Asset Discovery should be enabled. If the flag
    * is set to `true`, then discovery of assets will occur. If it is set to
    * `false, all historical assets will remain, but discovery of future assets
    * will not occur.
    */
  var enableAssetDiscovery: js.UndefOr[Boolean] = js.native
  /**
    * The relative resource name of the settings. See:
    * https://cloud.google.com/apis/design/resource_names#relative_resource_name
    * Example: &quot;organizations/123/organizationSettings&quot;.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaOrganizationSettings {
  @scala.inline
  def apply(
    assetDiscoveryConfig: SchemaAssetDiscoveryConfig = null,
    enableAssetDiscovery: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): SchemaOrganizationSettings = {
    val __obj = js.Dynamic.literal()
    if (assetDiscoveryConfig != null) __obj.updateDynamic("assetDiscoveryConfig")(assetDiscoveryConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAssetDiscovery)) __obj.updateDynamic("enableAssetDiscovery")(enableAssetDiscovery.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrganizationSettings]
  }
}

