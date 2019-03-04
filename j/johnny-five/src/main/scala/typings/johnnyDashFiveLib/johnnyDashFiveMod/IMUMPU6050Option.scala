package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMUMPU6050Option extends IMUGeneralOption {
  var address: scala.Double
}

object IMUMPU6050Option {
  @scala.inline
  def apply(address: scala.Double, controller: java.lang.String = null, freq: scala.Int | scala.Double = null): IMUMPU6050Option = {
    val __obj = js.Dynamic.literal(address = address)
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUMPU6050Option]
  }
}

