package typings.leafletDashDraw.leafletMod.DrawOptions

import typings.leaflet.leafletMod.DivIcon
import typings.leaflet.leafletMod.Icon
import typings.leaflet.leafletMod.IconOptions
import typings.leafletDashDraw.Anon_Clickable
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
  var icon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
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
  var shapeOptions: js.UndefOr[typings.leaflet.leafletMod.PolylineOptions with Anon_Clickable] = js.undefined
  /**
    * Whether to display distance in the tooltip
    *
    * @default true
    */
  var showLength: js.UndefOr[Boolean] = js.undefined
  var touchIcon: js.UndefOr[Icon[IconOptions] | DivIcon] = js.undefined
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
    factor: Int | Double = null,
    feet: js.UndefOr[Boolean] = js.undefined,
    guidelineDistance: Int | Double = null,
    icon: Icon[IconOptions] | DivIcon = null,
    maxGuideLineLength: Int | Double = null,
    maxPoints: Int | Double = null,
    metric: js.UndefOr[Boolean] = js.undefined,
    nautic: js.UndefOr[Boolean] = js.undefined,
    repeatMode: js.UndefOr[Boolean] = js.undefined,
    shapeOptions: typings.leaflet.leafletMod.PolylineOptions with Anon_Clickable = null,
    showLength: js.UndefOr[Boolean] = js.undefined,
    touchIcon: Icon[IconOptions] | DivIcon = null,
    zIndexOffset: Int | Double = null
  ): PolylineOptions = {
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
    if (!js.isUndefined(repeatMode)) __obj.updateDynamic("repeatMode")(repeatMode.asInstanceOf[js.Any])
    if (shapeOptions != null) __obj.updateDynamic("shapeOptions")(shapeOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(showLength)) __obj.updateDynamic("showLength")(showLength.asInstanceOf[js.Any])
    if (touchIcon != null) __obj.updateDynamic("touchIcon")(touchIcon.asInstanceOf[js.Any])
    if (zIndexOffset != null) __obj.updateDynamic("zIndexOffset")(zIndexOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

