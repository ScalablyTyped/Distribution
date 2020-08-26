package typings.intlMessageformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Minute extends js.Object {
  var hour: String = js.native
  var minute: String = js.native
  var second: String = js.native
}

object Minute {
  @scala.inline
  def apply(hour: String, minute: String, second: String): Minute = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[Minute]
  }
  @scala.inline
  implicit class MinuteOps[Self <: Minute] (val x: Self) extends AnyVal {
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
    def setHour(value: String): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: String): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: String): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

