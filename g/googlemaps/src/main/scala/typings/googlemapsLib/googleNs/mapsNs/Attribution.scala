package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/***** Save to Google Maps *****/
trait Attribution extends js.Object {
  var iosDeepLinkId: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var webUrl: js.UndefOr[java.lang.String] = js.undefined
}

object Attribution {
  @scala.inline
  def apply(
    iosDeepLinkId: java.lang.String = null,
    source: java.lang.String = null,
    webUrl: java.lang.String = null
  ): Attribution = {
    val __obj = js.Dynamic.literal()
    if (iosDeepLinkId != null) __obj.updateDynamic("iosDeepLinkId")(iosDeepLinkId)
    if (source != null) __obj.updateDynamic("source")(source)
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl)
    __obj.asInstanceOf[Attribution]
  }
}

