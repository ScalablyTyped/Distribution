package typings.ibmDashMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BusyIndicatorOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentTextText: js.UndefOr[String] = js.undefined
  var contentTitle: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var notificationId: js.UndefOr[Double] = js.undefined
  var tickerText: js.UndefOr[String] = js.undefined
}

object BusyIndicatorOptions {
  @scala.inline
  def apply(
    className: String = null,
    contentTextText: String = null,
    contentTitle: String = null,
    icon: String = null,
    notificationId: Int | Double = null,
    tickerText: String = null
  ): BusyIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (contentTextText != null) __obj.updateDynamic("contentTextText")(contentTextText)
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId.asInstanceOf[js.Any])
    if (tickerText != null) __obj.updateDynamic("tickerText")(tickerText)
    __obj.asInstanceOf[BusyIndicatorOptions]
  }
}

