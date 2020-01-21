package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The matrix of environments in which the test is to be executed.
  */
@js.native
trait SchemaEnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[SchemaAndroidDeviceList] = js.native
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[SchemaAndroidMatrix] = js.native
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[SchemaIosDeviceList] = js.native
}

object SchemaEnvironmentMatrix {
  @scala.inline
  def apply(
    androidDeviceList: SchemaAndroidDeviceList = null,
    androidMatrix: SchemaAndroidMatrix = null,
    iosDeviceList: SchemaIosDeviceList = null
  ): SchemaEnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    if (androidDeviceList != null) __obj.updateDynamic("androidDeviceList")(androidDeviceList.asInstanceOf[js.Any])
    if (androidMatrix != null) __obj.updateDynamic("androidMatrix")(androidMatrix.asInstanceOf[js.Any])
    if (iosDeviceList != null) __obj.updateDynamic("iosDeviceList")(iosDeviceList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironmentMatrix]
  }
}

