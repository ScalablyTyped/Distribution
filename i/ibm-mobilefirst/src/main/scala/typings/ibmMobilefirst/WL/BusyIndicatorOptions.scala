package typings.ibmMobilefirst.WL

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusyIndicatorOptions extends js.Object {
  var className: js.UndefOr[String] = js.native
  var contentTextText: js.UndefOr[String] = js.native
  var contentTitle: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var notificationId: js.UndefOr[Double] = js.native
  var tickerText: js.UndefOr[String] = js.native
}

object BusyIndicatorOptions {
  @scala.inline
  def apply(): BusyIndicatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusyIndicatorOptions]
  }
  @scala.inline
  implicit class BusyIndicatorOptionsOps[Self <: BusyIndicatorOptions] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContentTextText(value: String): Self = this.set("contentTextText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTextText: Self = this.set("contentTextText", js.undefined)
    @scala.inline
    def setContentTitle(value: String): Self = this.set("contentTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentTitle: Self = this.set("contentTitle", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setNotificationId(value: Double): Self = this.set("notificationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationId: Self = this.set("notificationId", js.undefined)
    @scala.inline
    def setTickerText(value: String): Self = this.set("tickerText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTickerText: Self = this.set("tickerText", js.undefined)
  }
  
}

