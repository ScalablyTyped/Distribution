package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMUMPU6050Option extends IMUGeneralOption {
  var address: Double
}

object IMUMPU6050Option {
  @scala.inline
  def apply(address: Double, controller: String = null, freq: Int | Double = null): IMUMPU6050Option = {
    val __obj = js.Dynamic.literal(address = address)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUMPU6050Option]
  }
}

