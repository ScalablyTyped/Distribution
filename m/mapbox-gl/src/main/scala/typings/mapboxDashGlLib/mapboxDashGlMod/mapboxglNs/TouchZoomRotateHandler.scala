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
    disable: js.Function0[scala.Unit],
    disableRotation: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    enableRotation: js.Function0[scala.Unit],
    isEnabled: js.Function0[scala.Boolean]
  ): TouchZoomRotateHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("disable")(disable)
    __obj.updateDynamic("disableRotation")(disableRotation)
    __obj.updateDynamic("enable")(enable)
    __obj.updateDynamic("enableRotation")(enableRotation)
    __obj.updateDynamic("isEnabled")(isEnabled)
    __obj.asInstanceOf[TouchZoomRotateHandler]
  }
}

