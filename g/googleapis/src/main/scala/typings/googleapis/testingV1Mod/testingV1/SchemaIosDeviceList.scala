package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A list of iOS device configurations in which the test is to be executed.
  */
@js.native
trait SchemaIosDeviceList extends js.Object {
  /**
    * Required. A list of iOS devices.
    */
  var iosDevices: js.UndefOr[js.Array[SchemaIosDevice]] = js.native
}

object SchemaIosDeviceList {
  @scala.inline
  def apply(iosDevices: js.Array[SchemaIosDevice] = null): SchemaIosDeviceList = {
    val __obj = js.Dynamic.literal()
    if (iosDevices != null) __obj.updateDynamic("iosDevices")(iosDevices.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaIosDeviceList]
  }
}

