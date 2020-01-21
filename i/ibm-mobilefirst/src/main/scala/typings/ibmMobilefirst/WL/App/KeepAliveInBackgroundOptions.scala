package typings.ibmMobilefirst.WL.App

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeepAliveInBackgroundOptions extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var contentTextText: js.UndefOr[String] = js.undefined
  var contentTitle: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var notificationId: js.UndefOr[Double] = js.undefined
  var tickerText: js.UndefOr[String] = js.undefined
}

object KeepAliveInBackgroundOptions {
  @scala.inline
  def apply(
    className: String = null,
    contentTextText: String = null,
    contentTitle: String = null,
    icon: String = null,
    notificationId: Int | Double = null,
    tickerText: String = null
  ): KeepAliveInBackgroundOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (contentTextText != null) __obj.updateDynamic("contentTextText")(contentTextText.asInstanceOf[js.Any])
    if (contentTitle != null) __obj.updateDynamic("contentTitle")(contentTitle.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId.asInstanceOf[js.Any])
    if (tickerText != null) __obj.updateDynamic("tickerText")(tickerText.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeepAliveInBackgroundOptions]
  }
}

