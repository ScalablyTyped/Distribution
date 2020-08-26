package typings.jqueryUiDatetimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Time extends js.Object {
  var hour: js.UndefOr[Double] = js.native
  var millisecond: js.UndefOr[Double] = js.native
  var minute: js.UndefOr[Double] = js.native
  var second: js.UndefOr[Double] = js.native
  var timezone: js.UndefOr[String] = js.native
}

object Time {
  @scala.inline
  def apply(): Time = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHour: Self = this.set("hour", js.undefined)
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMillisecond: Self = this.set("millisecond", js.undefined)
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinute: Self = this.set("minute", js.undefined)
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("timezone", js.undefined)
  }
  
}

