package typings.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for iSDK to execute strong match flow for post-install attribution.
  * This is meant for iOS requests only. Requests from other platforms will not
  * be honored.
  */
@js.native
trait SchemaGetIosPostInstallAttributionRequest extends js.Object {
  /**
    * App installation epoch time (https://en.wikipedia.org/wiki/Unix_time).
    * This is a client signal for a more accurate weak match.
    */
  var appInstallationTime: js.UndefOr[String] = js.native
  /**
    * APP bundle ID.
    */
  var bundleId: js.UndefOr[String] = js.native
  /**
    * Device information.
    */
  var device: js.UndefOr[SchemaDeviceInfo] = js.native
  /**
    * iOS version, ie: 9.3.5. Consider adding &quot;build&quot;.
    */
  var iosVersion: js.UndefOr[String] = js.native
  /**
    * App post install attribution retrieval information. Disambiguates
    * mechanism (iSDK or developer invoked) to retrieve payload from clicked
    * link.
    */
  var retrievalMethod: js.UndefOr[String] = js.native
  /**
    * Google SDK version. Version takes the form
    * &quot;$major.$minor.$patch&quot;
    */
  var sdkVersion: js.UndefOr[String] = js.native
  /**
    * Possible unique matched link that server need to check before performing
    * fingerprint match. If passed link is short server need to expand the
    * link. If link is long server need to vslidate the link.
    */
  var uniqueMatchLinkToCheck: js.UndefOr[String] = js.native
  /**
    * Strong match page information. Disambiguates between default UI and
    * custom page to present when strong match succeeds/fails to find cookie.
    */
  var visualStyle: js.UndefOr[String] = js.native
}

object SchemaGetIosPostInstallAttributionRequest {
  @scala.inline
  def apply(
    appInstallationTime: String = null,
    bundleId: String = null,
    device: SchemaDeviceInfo = null,
    iosVersion: String = null,
    retrievalMethod: String = null,
    sdkVersion: String = null,
    uniqueMatchLinkToCheck: String = null,
    visualStyle: String = null
  ): SchemaGetIosPostInstallAttributionRequest = {
    val __obj = js.Dynamic.literal()
    if (appInstallationTime != null) __obj.updateDynamic("appInstallationTime")(appInstallationTime.asInstanceOf[js.Any])
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId.asInstanceOf[js.Any])
    if (device != null) __obj.updateDynamic("device")(device.asInstanceOf[js.Any])
    if (iosVersion != null) __obj.updateDynamic("iosVersion")(iosVersion.asInstanceOf[js.Any])
    if (retrievalMethod != null) __obj.updateDynamic("retrievalMethod")(retrievalMethod.asInstanceOf[js.Any])
    if (sdkVersion != null) __obj.updateDynamic("sdkVersion")(sdkVersion.asInstanceOf[js.Any])
    if (uniqueMatchLinkToCheck != null) __obj.updateDynamic("uniqueMatchLinkToCheck")(uniqueMatchLinkToCheck.asInstanceOf[js.Any])
    if (visualStyle != null) __obj.updateDynamic("visualStyle")(visualStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionRequest]
  }
}

