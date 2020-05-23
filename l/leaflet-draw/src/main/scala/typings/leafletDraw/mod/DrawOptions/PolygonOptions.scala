package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.anon.PolylineOptionsclickableb
import typings.leafletDraw.mod.PrecisionOptions
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
    factor: js.UndefOr[Double] = js.undefined,
    feet: js.UndefOr[Boolean] = js.undefined,
    guidelineDistance: js.UndefOr[Double] = js.undefined,
    icon: Icon_[IconOptions] | DivIcon_ = null,
    maxGuideLineLength: js.UndefOr[Double] = js.undefined,
    maxPoints: js.UndefOr[Double] = js.undefined,
    metric: js.UndefOr[Boolean] = js.undefined,
    nautic: js.UndefOr[Boolean] = js.undefined,
    precision: PrecisionOptions = null,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: PolylineOptionsclickableb = null,
    showArea: js.UndefOr[Boolean] = js.undefined,
    showLength: js.UndefOr[Boolean] = js.undefined,
    touchIcon: Icon_[IconOptions] | DivIcon_ = null,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowIntersection)) __obj.updateDynamic("allowIntersection")(allowIntersection.get.asInstanceOf[js.Any])
    if (drawError != null) __obj.updateDynamic("drawError")(drawError.asInstanceOf[js.Any])
    if (!js.isUndefined(factor)) __obj.updateDynamic("factor")(factor.get.asInstanceOf[js.Any])
    if (!js.isUndefined(feet)) __obj.updateDynamic("feet")(feet.get.asInstanceOf[js.Any])
    if (!js.isUndefined(guidelineDistance)) __obj.updateDynamic("guidelineDistance")(guidelineDistance.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(maxGuideLineLength)) __obj.updateDynamic("maxGuideLineLength")(maxGuideLineLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoints)) __obj.updateDynamic("maxPoints")(maxPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(metric)) __obj.updateDynamic("metric")(metric.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nautic)) __obj.updateDynamic("nautic")(nautic.get.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.get.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLength)) __obj.updateDynamic("showLength")(showLength.get.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonOptions]
  }
}

