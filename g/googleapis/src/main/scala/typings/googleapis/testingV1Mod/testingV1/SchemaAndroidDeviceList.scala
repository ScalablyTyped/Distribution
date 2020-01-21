package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of Android device configurations in which the test is to be
  * executed.
  */
@js.native
trait SchemaAndroidDeviceList extends js.Object {
  /**
    * Required. A list of Android devices.
    */
  var androidDevices: js.UndefOr[js.Array[SchemaAndroidDevice]] = js.native
}

object SchemaAndroidDeviceList {
  @scala.inline
  def apply(androidDevices: js.Array[SchemaAndroidDevice] = null): SchemaAndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    if (androidDevices != null) __obj.updateDynamic("androidDevices")(androidDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAndroidDeviceList]
  }
}

