package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchZoomRotateHandler extends js.Object {
  def disable(): scala.Unit
  def disableRotation(): scala.Unit
  def enable(): scala.Unit
  def enableRotation(): scala.Unit
  def isEnabled(): scala.Boolean
}

object TouchZoomRotateHandler {
  @scala.inline
  def apply(
    disable: () => scala.Unit,
    disableRotation: () => scala.Unit,
    enable: () => scala.Unit,
    enableRotation: () => scala.Unit,
    isEnabled: () => scala.Boolean
  ): TouchZoomRotateHandler = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), disableRotation = js.Any.fromFunction0(disableRotation), enable = js.Any.fromFunction0(enable), enableRotation = js.Any.fromFunction0(enableRotation), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[TouchZoomRotateHandler]
  }
}

