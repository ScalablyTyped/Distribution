package typings.leafletDashGeosearch.leafletDashGeosearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BingProviderUserContextOptions extends js.Object {
  var ul: js.UndefOr[String] = js.undefined
  var umv: js.UndefOr[String] = js.undefined
  var ur: js.UndefOr[String] = js.undefined
  var userIp: js.UndefOr[String] = js.undefined
  var userLocation: js.UndefOr[String] = js.undefined
  var userMapView: js.UndefOr[String] = js.undefined
  var userRegion: js.UndefOr[String] = js.undefined
}

object BingProviderUserContextOptions {
  @scala.inline
  def apply(
    ul: String = null,
    umv: String = null,
    ur: String = null,
    userIp: String = null,
    userLocation: String = null,
    userMapView: String = null,
    userRegion: String = null
  ): BingProviderUserContextOptions = {
    val __obj = js.Dynamic.literal()
    if (ul != null) __obj.updateDynamic("ul")(ul.asInstanceOf[js.Any])
    if (umv != null) __obj.updateDynamic("umv")(umv.asInstanceOf[js.Any])
    if (ur != null) __obj.updateDynamic("ur")(ur.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (userLocation != null) __obj.updateDynamic("userLocation")(userLocation.asInstanceOf[js.Any])
    if (userMapView != null) __obj.updateDynamic("userMapView")(userMapView.asInstanceOf[js.Any])
    if (userRegion != null) __obj.updateDynamic("userRegion")(userRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[BingProviderUserContextOptions]
  }
}

