package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMUMPU6050Option extends IMUGeneralOption {
  var address: Double
}

object IMUMPU6050Option {
  @scala.inline
  def apply(address: Double, controller: String = null, freq: js.UndefOr[Double] = js.undefined): IMUMPU6050Option = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (!js.isUndefined(freq)) __obj.updateDynamic("freq")(freq.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUMPU6050Option]
  }
}

