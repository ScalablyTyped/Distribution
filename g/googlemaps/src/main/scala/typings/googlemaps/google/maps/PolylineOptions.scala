package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  /**
    * Indicates whether this Polyline handles mouse events. Defaults to true.
    */
  var clickable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the user can drag this shape over the map.
    * The geodesic property defines the mode of dragging. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, the user can edit this shape by dragging the control
    * points shown at the vertices and on each segment. Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  /**
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[Boolean] = js.undefined
  /** The icons to be rendered along the polyline. */
  var icons: js.UndefOr[js.Array[IconSequence]] = js.undefined
  /** Map on which to display Polyline. */
  var map: js.UndefOr[Map[Element]] = js.undefined
  /**
    * The ordered sequence of coordinates of the Polyline.
    * This path may be specified using either a simple array of LatLngs, or an
    * MVCArray of LatLngs. Note that if you pass a simple array, it will be
    * converted to an MVCArray Inserting or removing LatLngs in the MVCArray
    * will automatically update the polyline on the map.
    */
  var path: js.UndefOr[MVCArray[LatLng] | (js.Array[LatLng | LatLngLiteral])] = js.undefined
  /**
    * The stroke color. All CSS3 colors are supported except for extended
    * named colors.
    */
  var strokeColor: js.UndefOr[String] = js.undefined
  /** The stroke opacity between 0.0 and 1.0. */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.undefined
  /** Whether this polyline is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.undefined
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object PolylineOptions {
  @scala.inline
  def apply(
    clickable: js.UndefOr[Boolean] = js.undefined,
    draggable: js.UndefOr[Boolean] = js.undefined,
    editable: js.UndefOr[Boolean] = js.undefined,
    geodesic: js.UndefOr[Boolean] = js.undefined,
    icons: js.Array[IconSequence] = null,
    map: Map[Element] = null,
    path: MVCArray[LatLng] | (js.Array[LatLng | LatLngLiteral]) = null,
    strokeColor: String = null,
    strokeOpacity: Int | Double = null,
    strokeWeight: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    zIndex: Int | Double = null
  ): PolylineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(geodesic)) __obj.updateDynamic("geodesic")(geodesic.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (strokeColor != null) __obj.updateDynamic("strokeColor")(strokeColor.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWeight != null) __obj.updateDynamic("strokeWeight")(strokeWeight.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineOptions]
  }
}

