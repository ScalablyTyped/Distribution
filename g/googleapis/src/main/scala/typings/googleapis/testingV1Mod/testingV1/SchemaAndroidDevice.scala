package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single Android device.
  */
@js.native
trait SchemaAndroidDevice extends js.Object {
  /**
    * Required. The id of the Android device to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidModelId: js.UndefOr[String] = js.native
  /**
    * Required. The id of the Android OS version to be used. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var androidVersionId: js.UndefOr[String] = js.native
  /**
    * Required. The locale the test device used for testing. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * Required. How the device is oriented during the test. Use the
    * TestEnvironmentDiscoveryService to get supported options.
    */
  var orientation: js.UndefOr[String] = js.native
}

object SchemaAndroidDevice {
  @scala.inline
  def apply(): SchemaAndroidDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidDevice]
  }
  @scala.inline
  implicit class SchemaAndroidDeviceOps[Self <: SchemaAndroidDevice] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAndroidModelId(value: String): Self = this.set("androidModelId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidModelId: Self = this.set("androidModelId", js.undefined)
    @scala.inline
    def setAndroidVersionId(value: String): Self = this.set("androidVersionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidVersionId: Self = this.set("androidVersionId", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

