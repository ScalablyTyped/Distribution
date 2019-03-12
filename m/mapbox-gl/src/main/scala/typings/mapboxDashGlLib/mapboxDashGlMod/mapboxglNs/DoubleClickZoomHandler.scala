package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickZoomHandler extends js.Object {
  def disable(): scala.Unit
  def enable(): scala.Unit
  def isEnabled(): scala.Boolean
}

object DoubleClickZoomHandler {
  @scala.inline
  def apply(disable: () => scala.Unit, enable: () => scala.Unit, isEnabled: () => scala.Boolean): DoubleClickZoomHandler = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[DoubleClickZoomHandler]
  }
}

