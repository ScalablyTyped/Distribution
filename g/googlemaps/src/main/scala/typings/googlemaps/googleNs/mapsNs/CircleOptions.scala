package typings.googlemaps.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends js.Object {
  /** The center */
  var center: js.UndefOr[LatLng | LatLngLiteral] = js.undefined
  /** Indicates whether this Circle handles mouse events. Defaults to true. */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the user can drag this circle over the map. Defaults to
    * false.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the user can edit this circle by dragging the control
    * points shown at the center and around the circumference of the circle.
    * Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[String] = js.undefined
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  /** Map on which to display Circle. */
  var map: js.UndefOr[Map] = js.undefined
  /** The radius in meters on the Earth's surface */
  var radius: js.UndefOr[Double] = js.undefined
  /**
    * The stroke color. All CSS3 colors are supported except for extended
    * named colors.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /**
    * The stroke position. Defaults to CENTER. This property is not supported
    * on Internet Explorer 8 and earlier.
    */
  var strokePosition: js.UndefOr[StrokePosition] = js.undefined
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  /** Whether this circle is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object CircleOptions {
  @scala.inline
  def apply(
    center: LatLng | LatLngLiteral = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    fillColor: String = null,
    fillOpacity: Int | Double = null,
    map: Map = null,
    radius: Int | Double = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokePosition: StrokePosition = null,
    strokeWeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): CircleOptions = {
    val __obj = js.Dynamic.literal()
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable)
    if (fillColor != null) __obj.updateDynamic("fillColor")(fillColor)
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map)
    if (radius != null) __obj.updateDynamic("radius")(radius.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor)
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokePosition != null) __obj.updateDynamic("strokePosition")(strokePosition)
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircleOptions]
  }
}

