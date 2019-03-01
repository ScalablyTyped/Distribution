package typings
package leafletDashDrawLib.leafletMod.DrawOptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends PolylineOptions {
  /**
  			 * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
  			 *
  			 * Default value: {}
  			 */
  var precision: js.UndefOr[leafletDashDrawLib.leafletMod.PrecisionOptions] = js.undefined
  /**
  			 * Show the area of the drawn polygon in m², ha or km².
  			 * The area is only approximate and become less accurate the larger the polygon is.
  			 *
  			 * Default value: false
  			 */
  var showArea: js.UndefOr[scala.Boolean] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    allowIntersection: js.UndefOr[scala.Boolean] = js.undefined,
    drawError: DrawErrorOptions = null,
    factor: scala.Int | scala.Double = null,
    feet: js.UndefOr[scala.Boolean] = js.undefined,
    guidelineDistance: scala.Int | scala.Double = null,
    icon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    maxGuideLineLength: scala.Int | scala.Double = null,
    maxPoints: scala.Int | scala.Double = null,
    metric: js.UndefOr[scala.Boolean] = js.undefined,
    nautic: js.UndefOr[scala.Boolean] = js.undefined,
    precision: leafletDashDrawLib.leafletMod.PrecisionOptions = null,
    repeatMode: js.UndefOr[scala.Boolean] = js.undefined,
    shapeOptions: leafletLib.leafletMod.PathOptions = null,
    showArea: js.UndefOr[scala.Boolean] = js.undefined,
    showLength: js.UndefOr[scala.Boolean] = js.undefined,
    touchIcon: leafletLib.leafletMod.Icon[leafletLib.leafletMod.IconOptions] | leafletLib.leafletMod.DivIcon = null,
    zIndexOffset: scala.Int | scala.Double = null
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowIntersection)) __obj.updateDynamic("allowIntersection")(allowIntersection)
    if (drawError != null) __obj.updateDynamic("drawError")(drawError)
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(feet)) __obj.updateDynamic("feet")(feet)
    if (guidelineDistance != null) __obj.updateDynamic("guidelineDistance")(guidelineDistance.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxGuideLineLength != null) __obj.updateDynamic("maxGuideLineLength")(maxGuideLineLength.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric)
    if (!js.isUndefined(nautic)) __obj.updateDynamic("nautic")(nautic)
    if (precision != null) __obj.updateDynamic("precision")(precision)
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode)
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions)
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea)
    if (!js.isUndefined(showLength)) __obj.updateDynamic("showLength")(showLength)
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
}

