package typings.googleapis.v1beta1Mod.alertcenterV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detailed information of a single MDM device compromised event.
  */
@js.native
trait SchemaDeviceCompromisedSecurityDetail extends js.Object {
  /**
    * The device compromised state. Possible values are
    * &quot;`Compromised`&quot; or &quot;`Not Compromised`&quot;.
    */
  var deviceCompromisedState: js.UndefOr[String] = js.native
  /**
    * Required. The device ID.
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * The model of the device.
    */
  var deviceModel: js.UndefOr[String] = js.native
  /**
    * The type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Required for iOS, empty for others.
    */
  var iosVendorId: js.UndefOr[String] = js.native
  /**
    * The device resource ID.
    */
  var resourceId: js.UndefOr[String] = js.native
  /**
    * The serial number of the device.
    */
  var serialNumber: js.UndefOr[String] = js.native
}

object SchemaDeviceCompromisedSecurityDetail {
  @scala.inline
  def apply(
    deviceCompromisedState: String = null,
    deviceId: String = null,
    deviceModel: String = null,
    deviceType: String = null,
    iosVendorId: String = null,
    resourceId: String = null,
    serialNumber: String = null
  ): SchemaDeviceCompromisedSecurityDetail = {
    val __obj = js.Dynamic.literal()
    if (deviceCompromisedState != null) __obj.updateDynamic("deviceCompromisedState")(deviceCompromisedState.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (deviceModel != null) __obj.updateDynamic("deviceModel")(deviceModel.asInstanceOf[js.Any])
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (iosVendorId != null) __obj.updateDynamic("iosVendorId")(iosVendorId.asInstanceOf[js.Any])
    if (resourceId != null) __obj.updateDynamic("resourceId")(resourceId.asInstanceOf[js.Any])
    if (serialNumber != null) __obj.updateDynamic("serialNumber")(serialNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceCompromisedSecurityDetail]
  }
}

