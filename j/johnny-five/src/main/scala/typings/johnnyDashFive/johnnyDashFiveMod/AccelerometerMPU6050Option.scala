package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerMPU6050Option extends AccelerometerGeneralOption {
  var sensitivity: js.UndefOr[Double] = js.undefined
}

object AccelerometerMPU6050Option {
  @scala.inline
  def apply(controller: String = null, sensitivity: Int | Double = null): AccelerometerMPU6050Option = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (sensitivity != null) __obj.updateDynamic("sensitivity")(sensitivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerMPU6050Option]
  }
}

