package typings
package atMaterialDashUiCoreLib.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverPosition extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object PopoverPosition {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): PopoverPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[PopoverPosition]
  }
}

