package typings
package leafletLib.leafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- leafletLib.leafletMod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait FitBoundsOptions extends ZoomOptions {
  var duration: js.UndefOr[scala.Double] = js.undefined
  var easeLinearity: js.UndefOr[scala.Double] = js.undefined
  var maxZoom: js.UndefOr[scala.Double] = js.undefined
  var noMoveStart: js.UndefOr[scala.Boolean] = js.undefined
  var padding: js.UndefOr[PointExpression] = js.undefined
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}

object FitBoundsOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[scala.Boolean] = js.undefined,
    duration: scala.Int | scala.Double = null,
    easeLinearity: scala.Int | scala.Double = null,
    maxZoom: scala.Int | scala.Double = null,
    noMoveStart: js.UndefOr[scala.Boolean] = js.undefined,
    padding: PointExpression = null,
    paddingBottomRight: PointExpression = null,
    paddingTopLeft: PointExpression = null
  ): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easeLinearity != null) __obj.updateDynamic("easeLinearity")(easeLinearity.asInstanceOf[js.Any])
    if (maxZoom != null) __obj.updateDynamic("maxZoom")(maxZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottomRight != null) __obj.updateDynamic("paddingBottomRight")(paddingBottomRight.asInstanceOf[js.Any])
    if (paddingTopLeft != null) __obj.updateDynamic("paddingTopLeft")(paddingTopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoundsOptions]
  }
}

