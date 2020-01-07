package typings.jpushDashReactDashNative

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PushTimeDays extends js.Object {
  var pushTimeDays: js.Array[Double]
  var pushTimeEndHour: Double
  var pushTimeStartHour: Double
}

object Anon_PushTimeDays {
  @scala.inline
  def apply(pushTimeDays: js.Array[Double], pushTimeEndHour: Double, pushTimeStartHour: Double): Anon_PushTimeDays = {
    val __obj = js.Dynamic.literal(pushTimeDays = pushTimeDays.asInstanceOf[js.Any], pushTimeEndHour = pushTimeEndHour.asInstanceOf[js.Any], pushTimeStartHour = pushTimeStartHour.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PushTimeDays]
  }
}

