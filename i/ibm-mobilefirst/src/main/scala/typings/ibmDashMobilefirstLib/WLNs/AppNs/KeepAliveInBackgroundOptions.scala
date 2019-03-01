package typings
package ibmDashMobilefirstLib.WLNs.AppNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAliveInBackgroundOptions extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var contentTextText: js.UndefOr[java.lang.String] = js.undefined
  var contentTitle: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var notificationId: js.UndefOr[scala.Double] = js.undefined
  var tickerText: js.UndefOr[java.lang.String] = js.undefined
}

object KeepAliveInBackgroundOptions {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    contentTextText: java.lang.String = null,
    contentTitle: java.lang.String = null,
    icon: java.lang.String = null,
    notificationId: scala.Int | scala.Double = null,
    tickerText: java.lang.String = null
  ): KeepAliveInBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentTextText != null) __obj.updateDynamic("contentTextText")(contentTextText)
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId.asInstanceOf[js.Any])
    if (tickerText != null) __obj.updateDynamic("tickerText")(tickerText)
    __obj.asInstanceOf[KeepAliveInBackgroundOptions]
  }
}

