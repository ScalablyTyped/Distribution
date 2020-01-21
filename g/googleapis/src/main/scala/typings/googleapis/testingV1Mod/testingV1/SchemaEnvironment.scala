package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The environment in which the test is run.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * An Android device which must be used with an Android test.
    */
  var androidDevice: js.UndefOr[SchemaAndroidDevice] = js.native
  /**
    * An iOS device which must be used with an iOS test.
    */
  var iosDevice: js.UndefOr[SchemaIosDevice] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(androidDevice: SchemaAndroidDevice = null, iosDevice: SchemaIosDevice = null): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    if (androidDevice != null) __obj.updateDynamic("androidDevice")(androidDevice.asInstanceOf[js.Any])
    if (iosDevice != null) __obj.updateDynamic("iosDevice")(iosDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaEnvironment]
  }
}

