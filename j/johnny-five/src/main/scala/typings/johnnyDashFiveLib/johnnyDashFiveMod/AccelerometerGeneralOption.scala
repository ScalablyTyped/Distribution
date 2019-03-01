package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerGeneralOption extends js.Object {
  var controller: js.UndefOr[java.lang.String] = js.undefined
}

object AccelerometerGeneralOption {
  @scala.inline
  def apply(controller: java.lang.String = null): AccelerometerGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    __obj.asInstanceOf[AccelerometerGeneralOption]
  }
}

