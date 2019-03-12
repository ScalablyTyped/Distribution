package typings
package atMaterialDashUiCoreLib.popoverPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopoverActions extends js.Object {
  def updatePosition(): scala.Unit
}

object PopoverActions {
  @scala.inline
  def apply(updatePosition: () => scala.Unit): PopoverActions = {
    val __obj = js.Dynamic.literal(updatePosition = js.Any.fromFunction0(updatePosition))
  
    __obj.asInstanceOf[PopoverActions]
  }
}

