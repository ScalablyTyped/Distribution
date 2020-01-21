package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Android device.
  */
@js.native
trait SchemaAndroidDevice extends js.Object {
  /**
    * Required. The id of the Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelId: js.UndefOr[String] = js.native
  /**
    * Required. The id of the Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionId: js.UndefOr[String] = js.native
  /**
    * Required. The locale the test device used for testing. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Required. How the device is oriented during the test. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String] = js.native
}

object SchemaAndroidDevice {
  @scala.inline
  def apply(
    androidModelId: String = null,
    androidVersionId: String = null,
    locale: String = null,
    orientation: String = null
  ): SchemaAndroidDevice = {
    val __obj = js.Dynamic.literal()
    if (androidModelId != null) __obj.updateDynamic("androidModelId")(androidModelId.asInstanceOf[js.Any])
    if (androidVersionId != null) __obj.updateDynamic("androidVersionId")(androidVersionId.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidDevice]
  }
}

