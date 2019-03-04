package typings
package mapboxDashGlLib.mapboxDashGlMod.mapboxglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyboardHandler extends js.Object {
  def disable(): scala.Unit
  def enable(): scala.Unit
  def isEnabled(): scala.Boolean
}

object KeyboardHandler {
  @scala.inline
  def apply(
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    isEnabled: js.Function0[scala.Boolean]
  ): KeyboardHandler = {
    val __obj = js.Dynamic.literal(disable = disable, enable = enable, isEnabled = isEnabled)
  
    __obj.asInstanceOf[KeyboardHandler]
  }
}

