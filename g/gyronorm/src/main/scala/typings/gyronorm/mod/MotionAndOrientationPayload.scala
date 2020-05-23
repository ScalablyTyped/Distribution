package typings.gyronorm.mod

import typings.gyronorm.anon.Absolute
import typings.gyronorm.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionAndOrientationPayload extends js.Object {
  var dm: Alpha
  var `do`: Absolute
}

object MotionAndOrientationPayload {
  @scala.inline
  def apply(dm: Alpha, `do`: Absolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
}

