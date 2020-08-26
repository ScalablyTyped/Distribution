package typings.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeReturns extends js.Object {
  var days: Double = js.native
  var hours: Double = js.native
  var past: Boolean = js.native
  var seconds: Double = js.native
  var years: Double = js.native
}

object RelativeTimeReturns {
  @scala.inline
  def apply(days: Double, hours: Double, past: Boolean, seconds: Double, years: Double): RelativeTimeReturns = {
    val __obj = js.Dynamic.literal(days = days.asInstanceOf[js.Any], hours = hours.asInstanceOf[js.Any], past = past.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any], years = years.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelativeTimeReturns]
  }
  @scala.inline
  implicit class RelativeTimeReturnsOps[Self <: RelativeTimeReturns] (val x: Self) extends AnyVal {
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
    def setDays(value: Double): Self = this.set("days", value.asInstanceOf[js.Any])
    @scala.inline
    def setHours(value: Double): Self = this.set("hours", value.asInstanceOf[js.Any])
    @scala.inline
    def setPast(value: Boolean): Self = this.set("past", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeconds(value: Double): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setYears(value: Double): Self = this.set("years", value.asInstanceOf[js.Any])
  }
  
}

