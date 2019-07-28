package typings.leaflet.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.leaflet.leafletMod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait ZoomPanOptions extends ZoomOptions {
  var duration: js.UndefOr[Double] = js.undefined
  var easeLinearity: js.UndefOr[Double] = js.undefined
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
}

object ZoomPanOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: Int | Double = null,
    easeLinearity: Int | Double = null,
    noMoveStart: js.UndefOr[Boolean] = js.undefined
  ): ZoomPanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart)
    __obj.asInstanceOf[ZoomPanOptions]
  }
}

