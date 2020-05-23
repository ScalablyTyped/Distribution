package typings.leafletDraw.mod.DrawOptions

import typings.leaflet.mod.DivIcon_
import typings.leaflet.mod.IconOptions
import typings.leaflet.mod.Icon_
import typings.leafletDraw.anon.PolylineOptionsclickableb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends SimpleShapeOptions {
  /**
    * Determines if line segments can cross.
    *
    * @default true
    */
  var allowIntersection: js.UndefOr[Boolean] = js.undefined
  /**
    * Configuration options for the error that displays if an intersection is detected.
    *
    * @default { color: '#b00b00', timeout: 2500 }
    */
  var drawError: js.UndefOr[DrawErrorOptions] = js.undefined
  /**
    * To change distance calculation
    *
    * @default 1
    */
  var factor: js.UndefOr[Double] = js.undefined
  /**
    * When not metric, to use feet instead of yards for display.
    *
    * @default true
    */
  var feet: js.UndefOr[Boolean] = js.undefined
  /**
    * Distance in pixels between each guide dash.
    *
    * @default 20
    */
  var guidelineDistance: js.UndefOr[Double] = js.undefined
  var icon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  /**
    * The maximum length of the guide line
    *
    * @default 4000
    */
  var maxGuideLineLength: js.UndefOr[Double] = js.undefined
  /**
    * Once this number of points are placed, finish shape
    *
    * @default 0
    */
  var maxPoints: js.UndefOr[Double] = js.undefined
  /**
    * Determines which measurement system (metric or imperial) is used.
    *
    * @default true
    */
  var metric: js.UndefOr[Boolean] = js.undefined
  /**
    * When not metric, not feet use nautic mile for display
    *
    * @default false
    */
  var nautic: js.UndefOr[Boolean] = js.undefined
  /**
    * The options used when drawing the polyline/polygon on the map.
    *
    * @default { stroke: true, color: '#3388ff', weight: 4, opacity: 0.5, fill: false, clickable: true }
    */
  var shapeOptions: js.UndefOr[PolylineOptionsclickableb] = js.undefined
  /**
    * Whether to display distance in the tooltip
    *
    * @default true
    */
  var showLength: js.UndefOr[Boolean] = js.undefined
  var touchIcon: js.UndefOr[Icon_[IconOptions] | DivIcon_] = js.undefined
  /**
    * This should be a high number to ensure that you can draw over all other layers on the map.
    *
    * @default 2000
    */
  var zIndexOffset: js.UndefOr[Double] = js.undefined
}

object PolylineOptions {
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
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: PolylineOptionsclickableb = null,
    showLength: js.UndefOr[Boolean] = js.undefined,
    touchIcon: Icon_[IconOptions] | DivIcon_ = null,
    zIndexOffset: js.UndefOr[Double] = js.undefined
  ): PolylineOptions = {
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
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.get.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showLength)) __obj.updateDynamic("showLength")(showLength.get.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(zIndexOffset)) __obj.updateDynamic("zIndexOffset")(zIndexOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

