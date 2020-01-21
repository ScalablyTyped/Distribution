package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of a test environment.
  */
@js.native
trait SchemaTestEnvironmentCatalog extends js.Object {
  /**
    * Supported Android devices.
    */
  var androidDeviceCatalog: js.UndefOr[SchemaAndroidDeviceCatalog] = js.native
  /**
    * Supported iOS devices.
    */
  var iosDeviceCatalog: js.UndefOr[SchemaIosDeviceCatalog] = js.native
  /**
    * Supported network configurations.
    */
  var networkConfigurationCatalog: js.UndefOr[SchemaNetworkConfigurationCatalog] = js.native
  /**
    * The software test environment provided by TestExecutionService.
    */
  var softwareCatalog: js.UndefOr[SchemaProvidedSoftwareCatalog] = js.native
}

object SchemaTestEnvironmentCatalog {
  @scala.inline
  def apply(
    androidDeviceCatalog: SchemaAndroidDeviceCatalog = null,
    iosDeviceCatalog: SchemaIosDeviceCatalog = null,
    networkConfigurationCatalog: SchemaNetworkConfigurationCatalog = null,
    softwareCatalog: SchemaProvidedSoftwareCatalog = null
  ): SchemaTestEnvironmentCatalog = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceCatalog != null) __obj.updateDynamic("androidDeviceCatalog")(androidDeviceCatalog.asInstanceOf[js.Any])
    if (iosDeviceCatalog != null) __obj.updateDynamic("iosDeviceCatalog")(iosDeviceCatalog.asInstanceOf[js.Any])
    if (networkConfigurationCatalog != null) __obj.updateDynamic("networkConfigurationCatalog")(networkConfigurationCatalog.asInstanceOf[js.Any])
    if (softwareCatalog != null) __obj.updateDynamic("softwareCatalog")(softwareCatalog.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTestEnvironmentCatalog]
  }
}

