package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroMPU6050Option extends GyroGeneralOption {
  var sensitivity: scala.Double
}

object GyroMPU6050Option {
  @scala.inline
  def apply(sensitivity: scala.Double, controller: java.lang.String = null): GyroMPU6050Option = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sensitivity")(sensitivity)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    __obj.asInstanceOf[GyroMPU6050Option]
  }
}

