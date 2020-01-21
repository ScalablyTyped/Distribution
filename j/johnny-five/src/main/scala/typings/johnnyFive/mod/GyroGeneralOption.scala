package typings.johnnyFive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroGeneralOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
}

object GyroGeneralOption {
  @scala.inline
  def apply(controller: String = null): GyroGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroGeneralOption]
  }
}

