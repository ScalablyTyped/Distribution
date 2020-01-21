package typings.gyronorm.mod

import typings.gyronorm.AnonAbsolute
import typings.gyronorm.AnonAlpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionAndOrientationPayload extends js.Object {
  var dm: AnonAlpha
  var `do`: AnonAbsolute
}

object MotionAndOrientationPayload {
  @scala.inline
  def apply(dm: AnonAlpha, `do`: AnonAbsolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm.asInstanceOf[js.Any])
    __obj.updateDynamic("do")(`do`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
}

