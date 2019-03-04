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
  def apply(
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    isEnabled: js.Function0[scala.Boolean]
  ): DoubleClickZoomHandler = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, isEnabled = isEnabled)
  
    __obj.asInstanceOf[DoubleClickZoomHandler]
  }
}

