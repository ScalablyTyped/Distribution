package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroMPU6050Option extends GyroGeneralOption {
  var sensitivity: Double
}

object GyroMPU6050Option {
  @scala.inline
  def apply(sensitivity: Double, controller: String = null): GyroMPU6050Option = {
    val __obj = js.Dynamic.literal(sensitivity = sensitivity)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    __obj.asInstanceOf[GyroMPU6050Option]
  }
}

