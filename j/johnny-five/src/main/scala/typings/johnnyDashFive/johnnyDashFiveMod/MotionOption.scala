package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MotionOption extends js.Object {
  var pin: Double | String
}

object MotionOption {
  @scala.inline
  def apply(pin: Double | String): MotionOption = {
    val __obj = js.Dynamic.literal(pin = pin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MotionOption]
  }
}

