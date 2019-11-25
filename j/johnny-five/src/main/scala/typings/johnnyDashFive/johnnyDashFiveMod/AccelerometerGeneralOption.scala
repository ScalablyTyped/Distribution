package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerGeneralOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
}

object AccelerometerGeneralOption {
  @scala.inline
  def apply(controller: String = null): AccelerometerGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerGeneralOption]
  }
}

