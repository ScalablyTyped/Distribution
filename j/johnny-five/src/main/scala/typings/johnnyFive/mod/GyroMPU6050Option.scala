package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroMPU6050Option extends GyroGeneralOption {
  var sensitivity: Double
}

object GyroMPU6050Option {
  @scala.inline
  def apply(sensitivity: Double, controller: String = null): GyroMPU6050Option = {
    val __obj = js.Dynamic.literal(sensitivity = sensitivity.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroMPU6050Option]
  }
}

