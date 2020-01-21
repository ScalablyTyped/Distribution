package typings.jpushReactNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPushTimeDays extends js.Object {
  var pushTimeDays: js.Array[Double]
  var pushTimeEndHour: Double
  var pushTimeStartHour: Double
}

object AnonPushTimeDays {
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): AnonPushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPushTimeDays]
  }
}

