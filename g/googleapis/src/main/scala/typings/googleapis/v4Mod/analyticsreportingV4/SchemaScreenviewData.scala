package typings.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaScreenviewData extends js.Object {
  /**
    * The application name.
    */
  var appName: js.UndefOr[String] = js.native
  /**
    * Mobile manufacturer or branded name. Eg: &quot;Google&quot;,
    * &quot;Apple&quot; etc.
    */
  var mobileDeviceBranding: js.UndefOr[String] = js.native
  /**
    * Mobile device model. Eg: &quot;Pixel&quot;, &quot;iPhone&quot; etc.
    */
  var mobileDeviceModel: js.UndefOr[String] = js.native
  /**
    * The name of the screen.
    */
  var screenName: js.UndefOr[String] = js.native
}

object SchemaScreenviewData {
  @scala.inline
  def apply(
    appName: String = null,
    mobileDeviceBranding: String = null,
    mobileDeviceModel: String = null,
    screenName: String = null
  ): SchemaScreenviewData = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (mobileDeviceBranding != null) __obj.updateDynamic("mobileDeviceBranding")(mobileDeviceBranding.asInstanceOf[js.Any])
    if (mobileDeviceModel != null) __obj.updateDynamic("mobileDeviceModel")(mobileDeviceModel.asInstanceOf[js.Any])
    if (screenName != null) __obj.updateDynamic("screenName")(screenName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaScreenviewData]
  }
}

