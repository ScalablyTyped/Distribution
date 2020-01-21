package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A set of Android device configuration permutations is defined by the the
  * cross-product of the given axes. Internally, the given AndroidMatrix will
  * be expanded into a set of AndroidDevices.  Only supported permutations will
  * be instantiated.  Invalid permutations (e.g., incompatible models/versions)
  * are ignored.
  */
@js.native
trait SchemaAndroidMatrix extends js.Object {
  /**
    * Required. The ids of the set of Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The ids of the set of Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of locales the test device will enable for testing. Use
    * the TestEnvironmentDiscoveryService to get supported options.
    */
  var locales: js.UndefOr[js.Array[String]] = js.native
  /**
    * Required. The set of orientations to test with. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientations: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidMatrix {
  @scala.inline
  def apply(
    androidModelIds: js.Array[String] = null,
    androidVersionIds: js.Array[String] = null,
    locales: js.Array[String] = null,
    orientations: js.Array[String] = null
  ): SchemaAndroidMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidModelIds != null) __obj.updateDynamic("androidModelIds")(androidModelIds.asInstanceOf[js.Any])
    if (androidVersionIds != null) __obj.updateDynamic("androidVersionIds")(androidVersionIds.asInstanceOf[js.Any])
    if (locales != null) __obj.updateDynamic("locales")(locales.asInstanceOf[js.Any])
    if (orientations != null) __obj.updateDynamic("orientations")(orientations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidMatrix]
  }
}

