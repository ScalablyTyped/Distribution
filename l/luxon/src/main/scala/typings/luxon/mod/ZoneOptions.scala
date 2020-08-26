package typings.luxon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneOptions extends js.Object {
  /**
    * @deprecated since 0.2.12. Use keepLocalTime instead
    */
  var keepCalendarTime: js.UndefOr[Boolean] = js.native
  var keepLocalTime: js.UndefOr[Boolean] = js.native
}

object ZoneOptions {
  @scala.inline
  def apply(): ZoneOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneOptions]
  }
  @scala.inline
  implicit class ZoneOptionsOps[Self <: ZoneOptions] (val x: Self) extends AnyVal {
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
    def setKeepCalendarTime(value: Boolean): Self = this.set("keepCalendarTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepCalendarTime: Self = this.set("keepCalendarTime", js.undefined)
    @scala.inline
    def setKeepLocalTime(value: Boolean): Self = this.set("keepLocalTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepLocalTime: Self = this.set("keepLocalTime", js.undefined)
  }
  
}

