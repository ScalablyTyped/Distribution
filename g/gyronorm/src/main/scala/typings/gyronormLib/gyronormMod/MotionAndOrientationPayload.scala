package typings
package gyronormLib.gyronormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionAndOrientationPayload extends js.Object {
  var dm: gyronormLib.Anon_Alpha
  var `do`: gyronormLib.Anon_Absolute
}

object MotionAndOrientationPayload {
  @scala.inline
  def apply(dm: gyronormLib.Anon_Alpha, `do`: gyronormLib.Anon_Absolute): MotionAndOrientationPayload = {
    val __obj = js.Dynamic.literal(dm = dm)
    __obj.updateDynamic("do")(`do`)
    __obj.asInstanceOf[MotionAndOrientationPayload]
  }
}

