package typings.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerMinutes extends js.Object {
  /** last displayed minute */
  var ends: js.UndefOr[Double] = js.native
  /** interval of displayed minutes */
  var interval: js.UndefOr[Double] = js.native
  /** first displayed minute */
  var starts: js.UndefOr[Double] = js.native
}

object TimePickerMinutes {
  @scala.inline
  def apply(): TimePickerMinutes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerMinutes]
  }
  @scala.inline
  implicit class TimePickerMinutesOps[Self <: TimePickerMinutes] (val x: Self) extends AnyVal {
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
    def setEnds(value: Double): Self = this.set("ends", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnds: Self = this.set("ends", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setStarts(value: Double): Self = this.set("starts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStarts: Self = this.set("starts", js.undefined)
  }
  
}

