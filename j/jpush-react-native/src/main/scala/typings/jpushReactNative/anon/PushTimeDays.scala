package typings.jpushReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushTimeDays extends js.Object {
  var pushTimeDays: js.Array[Double]
  var pushTimeEndHour: Double
  var pushTimeStartHour: Double
}

object PushTimeDays {
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): PushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushTimeDays]
  }
}

