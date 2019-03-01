package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait ZoomPanOptions extends ZoomOptions {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easeLinearity: js.UndefOr[scala.Double] = js.undefined
  var noMoveStart: js.UndefOr[scala.Boolean] = js.undefined
}

object ZoomPanOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easeLinearity: scala.Int | scala.Double = null,
    noMoveStart: js.UndefOr[scala.Boolean] = js.undefined
  ): ZoomPanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart)
    __obj.asInstanceOf[ZoomPanOptions]
  }
}

