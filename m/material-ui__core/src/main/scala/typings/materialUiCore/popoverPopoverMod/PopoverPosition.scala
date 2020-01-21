package typings.materialUiCore.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopoverPosition extends js.Object {
  var left: Double = js.native
  var top: Double = js.native
}

object PopoverPosition {
  @scala.inline
  def apply(left: Double, top: Double): PopoverPosition = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PopoverPosition]
  }
}

