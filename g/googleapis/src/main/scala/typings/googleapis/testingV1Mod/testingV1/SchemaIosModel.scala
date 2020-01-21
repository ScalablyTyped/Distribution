package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A description of an iOS device tests may be run on.
  */
@js.native
trait SchemaIosModel extends js.Object {
  /**
    * Device capabilities. Copied from
    * https://developer.apple.com/library/archive/documentation/DeviceInformation/Reference/iOSDeviceCompatibility/DeviceCompatibilityMatrix/DeviceCompatibilityMatrix.html
    */
  var deviceCapabilities: js.UndefOr[js.Array[String]] = js.native
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
    * The human-readable name for this device model. Examples: &quot;iPhone
    * 4s&quot;, &quot;iPad Mini 2&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The set of iOS major software versions this device supports.
    */
  var supportedVersionIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Tags for this dimension. Examples: &quot;default&quot;,
    * &quot;preview&quot;, &quot;deprecated&quot;.
    */
  var tags: js.UndefOr[js.Array[String]] = js.native
}

object SchemaIosModel {
  @scala.inline
  def apply(
    deviceCapabilities: js.Array[String] = null,
    formFactor: String = null,
    id: String = null,
    name: String = null,
    supportedVersionIds: js.Array[String] = null,
    tags: js.Array[String] = null
  ): SchemaIosModel = {
    val __obj = js.Dynamic.literal()
    if (deviceCapabilities != null) __obj.updateDynamic("deviceCapabilities")(deviceCapabilities.asInstanceOf[js.Any])
    if (formFactor != null) __obj.updateDynamic("formFactor")(formFactor.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (supportedVersionIds != null) __obj.updateDynamic("supportedVersionIds")(supportedVersionIds.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosModel]
  }
}

