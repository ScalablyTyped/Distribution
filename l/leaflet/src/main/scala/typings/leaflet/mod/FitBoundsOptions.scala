package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.PanOptions because var conflicts: animate. Inlined duration, easeLinearity, noMoveStart */ trait FitBoundsOptions extends ZoomOptions {
  var duration: js.UndefOr[Double] = js.undefined
  var easeLinearity: js.UndefOr[Double] = js.undefined
  var maxZoom: js.UndefOr[Double] = js.undefined
  var noMoveStart: js.UndefOr[Boolean] = js.undefined
  var padding: js.UndefOr[PointExpression] = js.undefined
  var paddingBottomRight: js.UndefOr[PointExpression] = js.undefined
  var paddingTopLeft: js.UndefOr[PointExpression] = js.undefined
}

object FitBoundsOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    easeLinearity: js.UndefOr[Double] = js.undefined,
    maxZoom: js.UndefOr[Double] = js.undefined,
    noMoveStart: js.UndefOr[Boolean] = js.undefined,
    padding: PointExpression = null,
    paddingBottomRight: PointExpression = null,
    paddingTopLeft: PointExpression = null
  ): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(easeLinearity)) __obj.updateDynamic("easeLinearity")(easeLinearity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxZoom)) __obj.updateDynamic("maxZoom")(maxZoom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noMoveStart)) __obj.updateDynamic("noMoveStart")(noMoveStart.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (paddingBottomRight != null) __obj.updateDynamic("paddingBottomRight")(paddingBottomRight.asInstanceOf[js.Any])
    if (paddingTopLeft != null) __obj.updateDynamic("paddingTopLeft")(paddingTopLeft.asInstanceOf[js.Any])
    __obj.asInstanceOf[FitBoundsOptions]
  }
}

