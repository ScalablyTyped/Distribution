package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SilenceTimeEndHour extends js.Object {
  var silenceTimeEndHour: Double = js.native
  var silenceTimeEndMinute: Double = js.native
  var silenceTimeStartHour: Double = js.native
  var silenceTimeStartMinute: Double = js.native
}

object SilenceTimeEndHour {
  @scala.inline
  def apply(
    silenceTimeEndHour: Double,
    silenceTimeEndMinute: Double,
    silenceTimeStartHour: Double,
    silenceTimeStartMinute: Double
  ): SilenceTimeEndHour = {
    val __obj = js.Dynamic.literal(silenceTimeEndHour = silenceTimeEndHour.asInstanceOf[js.Any], silenceTimeEndMinute = silenceTimeEndMinute.asInstanceOf[js.Any], silenceTimeStartHour = silenceTimeStartHour.asInstanceOf[js.Any], silenceTimeStartMinute = silenceTimeStartMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[SilenceTimeEndHour]
  }
  @scala.inline
  implicit class SilenceTimeEndHourOps[Self <: SilenceTimeEndHour] (val x: Self) extends AnyVal {
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
    def setSilenceTimeEndHour(value: Double): Self = this.set("silenceTimeEndHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilenceTimeEndMinute(value: Double): Self = this.set("silenceTimeEndMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilenceTimeStartHour(value: Double): Self = this.set("silenceTimeStartHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setSilenceTimeStartMinute(value: Double): Self = this.set("silenceTimeStartMinute", value.asInstanceOf[js.Any])
  }
  
}

