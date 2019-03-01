package typings
package johnnyDashFiveLib.johnnyDashFiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShiftRegisterOption extends js.Object {
  var isAnode: js.UndefOr[scala.Boolean] = js.undefined
  var pins: js.Any
}

object ShiftRegisterOption {
  @scala.inline
  def apply(pins: js.Any, isAnode: js.UndefOr[scala.Boolean] = js.undefined): ShiftRegisterOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pins")(pins)
    if (!js.isUndefined(isAnode)) __obj.updateDynamic("isAnode")(isAnode)
    __obj.asInstanceOf[ShiftRegisterOption]
  }
}

