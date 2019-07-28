package typings.gyronorm.gyronormMod

import typings.gyronorm.Anon_Absolute
import typings.gyronorm.Anon_Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionAndOrientationPayload extends js.Object {
  var dm: Anon_Alpha
  var `do`: Anon_Absolute
}

object MotionAndOrientationPayload {
  @scala.inline
  def apply(dm: Anon_Alpha, `do`: Anon_Absolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm)
    __obj.updateDynamic("do")(`do`)
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
}

