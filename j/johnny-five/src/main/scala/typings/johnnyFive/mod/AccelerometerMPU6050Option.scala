package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerMPU6050Option extends AccelerometerGeneralOption {
  var sensitivity: js.UndefOr[Double] = js.undefined
}

object AccelerometerMPU6050Option {
  @scala.inline
  def apply(controller: String = null, sensitivity: js.UndefOr[Double] = js.undefined): AccelerometerMPU6050Option = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitivity)) __obj.updateDynamic("sensitivity")(sensitivity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerMPU6050Option]
  }
}

