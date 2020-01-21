package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information of a single MDM suspicious activity event.
  */
@js.native
trait SchemaSuspiciousActivitySecurityDetail extends js.Object {
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  /**
    * The device property which was changed.
    */
  var deviceProperty: js.UndefOr[String] = js.native
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  /**
    * The new value of the device property after the change.
    */
  var newValue: js.UndefOr[String] = js.native
  /**
    * The old value of the device property before the change.
    */
  var oldValue: js.UndefOr[String] = js.native
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaSuspiciousActivitySecurityDetail {
  @scala.inline
  def apply(
    deviceId: String = null,
    deviceModel: String = null,
    deviceProperty: String = null,
    deviceType: String = null,
    iosVendorId: String = null,
    newValue: String = null,
    oldValue: String = null,
    resourceId: String = null,
    serialNumber: String = null
  ): SchemaSuspiciousActivitySecurityDetail = {
    val __obj = js.Dynamic.literal()
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (deviceProperty != null) __obj.updateDynamic("deviceProperty")(deviceProperty.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (iosVendorId != null) __obj.updateDynamic("iosVendorId")(iosVendorId.asInstanceOf[js.Any])
    if (newValue != null) __obj.updateDynamic("newValue")(newValue.asInstanceOf[js.Any])
    if (oldValue != null) __obj.updateDynamic("oldValue")(oldValue.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSuspiciousActivitySecurityDetail]
  }
}

