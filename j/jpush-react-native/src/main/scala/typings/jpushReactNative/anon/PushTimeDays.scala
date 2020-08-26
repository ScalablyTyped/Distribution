package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushTimeDays extends js.Object {
  var pushTimeDays: js.Array[Double] = js.native
  var pushTimeEndHour: Double = js.native
  var pushTimeStartHour: Double = js.native
}

object PushTimeDays {
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): PushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTimeDays]
  }
  @scala.inline
  implicit class PushTimeDaysOps[Self <: PushTimeDays] (val x: Self) extends AnyVal {
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
    def setPushTimeDaysVarargs(value: Double*): Self = this.set("pushTimeDays", js.Array(value :_*))
    @scala.inline
    def setPushTimeDays(value: js.Array[Double]): Self = this.set("pushTimeDays", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushTimeEndHour(value: Double): Self = this.set("pushTimeEndHour", value.asInstanceOf[js.Any])
    @scala.inline
    def setPushTimeStartHour(value: Double): Self = this.set("pushTimeStartHour", value.asInstanceOf[js.Any])
  }
  
}

