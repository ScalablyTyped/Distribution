package typings.johnnyDashFive.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMUGeneralOption extends js.Object {
  var controller: js.UndefOr[String] = js.undefined
  var freq: js.UndefOr[Double] = js.undefined
}

object IMUGeneralOption {
  @scala.inline
  def apply(controller: String = null, freq: Int | Double = null): IMUGeneralOption = {
    val __obj = js.Dynamic.literal()
    if (controller != null) __obj.updateDynamic("controller")(controller)
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMUGeneralOption]
  }
}

