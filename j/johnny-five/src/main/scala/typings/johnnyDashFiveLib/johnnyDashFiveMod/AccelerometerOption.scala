package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerOption extends js.Object {
  var controller: java.lang.String
}

object AccelerometerOption {
  @scala.inline
  def apply(controller: java.lang.String): AccelerometerOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.asInstanceOf[AccelerometerOption]
  }
}

