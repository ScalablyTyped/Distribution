package typings.googlemaps.google.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// TODO find source documentation
trait Attribution extends js.Object {
  var iosDeepLinkId: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var webUrl: js.UndefOr[String] = js.undefined
}

object Attribution {
  @scala.inline
  def apply(iosDeepLinkId: String = null, source: String = null, webUrl: String = null): Attribution = {
    val __obj = js.Dynamic.literal()
    if (iosDeepLinkId != null) __obj.updateDynamic("iosDeepLinkId")(iosDeepLinkId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (webUrl != null) __obj.updateDynamic("webUrl")(webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribution]
  }
}

