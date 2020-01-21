package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of an Android device tests may be run on.
  */
@js.native
trait SchemaAndroidModel extends js.Object {
  /**
    * The company that this device is branded with. Example:
    * &quot;Google&quot;, &quot;Samsung&quot;.
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * The name of the industrial design. This corresponds to
    * android.os.Build.DEVICE.
    */
  var codename: js.UndefOr[String] = js.native
  /**
    * Whether this device is virtual or physical.
    */
  var form: js.UndefOr[String] = js.native
  /**
    * Whether this device is a phone, tablet, wearable, etc.
    */
  var formFactor: js.UndefOr[String] = js.native
  /**
    * The unique opaque id for this model. Use this for invoking the
    * TestExecutionService.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * True if and only if tests with this model are recorded by stitching
    * together screenshots. See use_low_spec_video_recording in device config.
    */
  var lowFpsVideoRecording: js.UndefOr[Boolean] = js.native
  /**
    * The manufacturer of this device.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * The human-readable marketing name for this device model. Examples:
    * &quot;Nexus 5&quot;, &quot;Galaxy S5&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Screen density in DPI. This corresponds to ro.sf.lcd_density
    */
  var screenDensity: js.UndefOr[Double] = js.native
  /**
    * Screen size in the horizontal (X) dimension measured in pixels.
    */
  var screenX: js.UndefOr[Double] = js.native
  /**
    * Screen size in the vertical (Y) dimension measured in pixels.
    */
  var screenY: js.UndefOr[Double] = js.native
  /**
    * The list of supported ABIs for this device. This corresponds to either
    * android.os.Build.SUPPORTED_ABIS (for API level 21 and above) or
    * android.os.Build.CPU_ABI/CPU_ABI2. The most preferred ABI is the first
    * element in the list.  Elements are optionally prefixed by
    * &quot;version_id:&quot; (where version_id is the id of an
    * AndroidVersion), denoting an ABI that is supported only on a particular
    * version.
    */
  var supportedAbis: js.UndefOr[js.Array[String]] = js.native
  /**
    * The set of Android versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAndroidModel {
  @scala.inline
  def apply(
    brand: String = null,
    codename: String = null,
    form: String = null,
    formFactor: String = null,
    id: String = null,
    lowFpsVideoRecording: js.UndefOr[Boolean] = js.undefined,
    manufacturer: String = null,
    name: String = null,
    screenDensity: Int | Double = null,
    screenX: Int | Double = null,
    screenY: Int | Double = null,
    supportedAbis: js.Array[String] = null,
    supportedVersionIds: js.Array[String] = null,
    tags: js.Array[String] = null
  ): SchemaAndroidModel = {
    val __obj = js.Dynamic.literal()
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (codename != null) __obj.updateDynamic("codename")(codename.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (formFactor != null) __obj.updateDynamic("formFactor")(formFactor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(lowFpsVideoRecording)) __obj.updateDynamic("lowFpsVideoRecording")(lowFpsVideoRecording.asInstanceOf[js.Any])
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (screenDensity != null) __obj.updateDynamic("screenDensity")(screenDensity.asInstanceOf[js.Any])
    if (screenX != null) __obj.updateDynamic("screenX")(screenX.asInstanceOf[js.Any])
    if (screenY != null) __obj.updateDynamic("screenY")(screenY.asInstanceOf[js.Any])
    if (supportedAbis != null) __obj.updateDynamic("supportedAbis")(supportedAbis.asInstanceOf[js.Any])
    if (supportedVersionIds != null) __obj.updateDynamic("supportedVersionIds")(supportedVersionIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidModel]
  }
}

