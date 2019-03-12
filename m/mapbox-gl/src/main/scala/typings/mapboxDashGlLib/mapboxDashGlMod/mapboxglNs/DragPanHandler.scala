package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPanHandler extends js.Object {
  def disable(): scala.Unit
  def enable(): scala.Unit
  def isActive(): scala.Boolean
  def isEnabled(): scala.Boolean
}

object DragPanHandler {
  @scala.inline
  def apply(
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    isActive: () => scala.Boolean,
    isEnabled: () => scala.Boolean
  ): DragPanHandler = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isActive = js.Any.fromFunction0(isActive), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[DragPanHandler]
  }
}

