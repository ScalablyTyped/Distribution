package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Input only.  Device information collected from the job seeker, candidate,
  * or other entity conducting the job search. Providing this information
  * improves the quality of the search results across devices.
  */
@js.native
trait SchemaDeviceInfo extends js.Object {
  /**
    * Optional.  Type of the device.
    */
  var deviceType: js.UndefOr[String] = js.native
  /**
    * Optional.  A device-specific ID. The ID must be a unique identifier that
    * distinguishes the device from other devices.
    */
  var id: js.UndefOr[String] = js.native
}

object SchemaDeviceInfo {
  @scala.inline
  def apply(deviceType: String = null, id: String = null): SchemaDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (deviceType != null) __obj.updateDynamic("deviceType")(deviceType.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDeviceInfo]
  }
}

