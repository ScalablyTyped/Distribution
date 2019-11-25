package typings.leafletDashDraw.leafletMod.DrawOptions

import typings.leaflet.leafletMod.DivIcon
import typings.leaflet.leafletMod.Icon
import typings.leaflet.leafletMod.IconOptions
import typings.leafletDashDraw.Anon_Clickable
import typings.leafletDashDraw.leafletMod.PrecisionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends PolylineOptions {
  /**
    * Defines the precision for each type of unit (e.g. {km: 2, ft: 0}
    *
    * @default {}
    */
  var precision: js.UndefOr[PrecisionOptions] = js.undefined
  /**
    * Show the area of the drawn polygon in m², ha or km².
    * The area is only approximate and become less accurate the larger the polygon is.
    *
    * @default false
    */
  var showArea: js.UndefOr[Boolean] = js.undefined
}

object PolygonOptions {
  @scala.inline
  def apply(
    allowIntersection: js.UndefOr[Boolean] = js.undefined,
    drawError: DrawErrorOptions = null,
    factor: Int | Double = null,
    feet: js.UndefOr[Boolean] = js.undefined,
    guidelineDistance: Int | Double = null,
    icon: Icon[IconOptions] | DivIcon = null,
    maxGuideLineLength: Int | Double = null,
    maxPoints: Int | Double = null,
    metric: js.UndefOr[Boolean] = js.undefined,
    nautic: js.UndefOr[Boolean] = js.undefined,
    precision: PrecisionOptions = null,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: typings.leaflet.leafletMod.PolylineOptions with Anon_Clickable = null,
    showArea: js.UndefOr[Boolean] = js.undefined,
    showLength: js.UndefOr[Boolean] = js.undefined,
    touchIcon: Icon[IconOptions] | DivIcon = null,
    zIndexOffset: Int | Double = null
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowIntersection)) __obj.updateDynamic("allowIntersection")(allowIntersection.asInstanceOf[js.Any])
    if (drawError != null) __obj.updateDynamic("drawError")(drawError.asInstanceOf[js.Any])
    if (factor != null) __obj.updateDynamic("factor")(factor.asInstanceOf[js.Any])
    if (!js.isUndefined(feet)) __obj.updateDynamic("feet")(feet.asInstanceOf[js.Any])
    if (guidelineDistance != null) __obj.updateDynamic("guidelineDistance")(guidelineDistance.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (maxGuideLineLength != null) __obj.updateDynamic("maxGuideLineLength")(maxGuideLineLength.asInstanceOf[js.Any])
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    if (!js.isUndefined(nautic)) __obj.updateDynamic("nautic")(nautic.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea.asInstanceOf[js.Any])
    if (!js.isUndefined(showLength)) __obj.updateDynamic("showLength")(showLength.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
}

