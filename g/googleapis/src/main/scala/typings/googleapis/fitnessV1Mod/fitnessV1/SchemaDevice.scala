package typings.googleapis.fitnessV1Mod.fitnessV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of an integrated device (such as a phone or a wearable) that
  * can hold sensors. Each sensor is exposed as a data source.  The main
  * purpose of the device information contained in this class is to identify
  * the hardware of a particular data source. This can be useful in different
  * ways, including:   - Distinguishing two similar sensors on different
  * devices (the step counter on two nexus 5 phones, for instance) - Display
  * the source of data to the user (by using the device make / model) - Treat
  * data differently depending on sensor type (accelerometers on a watch may
  * give different patterns than those on a phone) - Build different analysis
  * models for each device/version.
  */
@js.native
trait SchemaDevice extends js.Object {
  /**
    * Manufacturer of the product/hardware.
    */
  var manufacturer: js.UndefOr[String] = js.native
  /**
    * End-user visible model name for the device.
    */
  var model: js.UndefOr[String] = js.native
  /**
    * A constant representing the type of the device.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The serial number or other unique ID for the hardware. This field is
    * obfuscated when read by any REST or Android client that did not create
    * the data source. Only the data source creator will see the uid field in
    * clear and normal form.
    */
  var uid: js.UndefOr[String] = js.native
  /**
    * Version string for the device hardware/software.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaDevice {
  @scala.inline
  def apply(
    manufacturer: String = null,
    model: String = null,
    `type`: String = null,
    uid: String = null,
    version: String = null
  ): SchemaDevice = {
    val __obj = js.Dynamic.literal()
    if (manufacturer != null) __obj.updateDynamic("manufacturer")(manufacturer.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDevice]
  }
}

