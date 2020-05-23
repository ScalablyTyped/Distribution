package typings.googlemaps.google.maps.drawing

import typings.googlemaps.google.maps.CircleOptions
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.MarkerOptions
import typings.googlemaps.google.maps.PolygonOptions
import typings.googlemaps.google.maps.PolylineOptions
import typings.googlemaps.google.maps.RectangleOptions
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Options for the drawing manager. */
trait DrawingManagerOptions extends js.Object {
  /**
    * Options to apply to any new circles created with this DrawingManager.
    * The center and radius properties are ignored, and the map property of a
    * new circle is always set to the DrawingManager's map.
    */
  var circleOptions: js.UndefOr[CircleOptions] = js.undefined
  /**
    * The enabled/disabled state of the drawing control. Defaults to true.
    */
  var drawingControl: js.UndefOr[Boolean] = js.undefined
  /** The display options for the drawing control. */
  var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.undefined
  /**
    * The DrawingManager's drawing mode, which defines the type of overlay to
    * be added on the map. Accepted values are 'marker', 'polygon',
    * 'polyline', 'rectangle', 'circle', or null. A drawing mode of null
    * means that the user can interact with the map as normal, and clicks do
    * not draw anything.
    */
  var drawingMode: js.UndefOr[OverlayType | Null] = js.undefined
  /**
    * The Map to which the DrawingManager is attached, which is the Map on
    * which the overlays created will be placed.
    */
  var map: js.UndefOr[Map[Element]] = js.undefined
  /**
    * Options to apply to any new markers created with this DrawingManager.
    * The position property is ignored, and the map property of a new marker
    * is always set to the DrawingManager's map.
    */
  var markerOptions: js.UndefOr[MarkerOptions] = js.undefined
  /**
    * Options to apply to any new polygons created with this DrawingManager.
    * The paths property is ignored, and the map property of a new polygon is
    * always set to the DrawingManager's map.
    */
  var polygonOptions: js.UndefOr[PolygonOptions] = js.undefined
  /**
    * Options to apply to any new polylines created with this DrawingManager.
    * The path property is ignored, and the map property of a new polyline is
    * always set to the DrawingManager's map.
    */
  var polylineOptions: js.UndefOr[PolylineOptions] = js.undefined
  /**
    * Options to apply to any new rectangles created with this
    * DrawingManager. The bounds property is ignored, and the map property of
    * a new rectangle is always set to the DrawingManager's map.
    */
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.undefined
}

object DrawingManagerOptions {
  @scala.inline
  def apply(
    circleOptions: CircleOptions = null,
    drawingControl: js.UndefOr[Boolean] = js.undefined,
    drawingControlOptions: DrawingControlOptions = null,
    drawingMode: js.UndefOr[Null | OverlayType] = js.undefined,
    map: Map[Element] = null,
    markerOptions: MarkerOptions = null,
    polygonOptions: PolygonOptions = null,
    polylineOptions: PolylineOptions = null,
    rectangleOptions: RectangleOptions = null
  ): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (circleOptions != null) __obj.updateDynamic("circleOptions")(circleOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(drawingControl)) __obj.updateDynamic("drawingControl")(drawingControl.get.asInstanceOf[js.Any])
    if (drawingControlOptions != null) __obj.updateDynamic("drawingControlOptions")(drawingControlOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(drawingMode)) __obj.updateDynamic("drawingMode")(drawingMode.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (markerOptions != null) __obj.updateDynamic("markerOptions")(markerOptions.asInstanceOf[js.Any])
    if (polygonOptions != null) __obj.updateDynamic("polygonOptions")(polygonOptions.asInstanceOf[js.Any])
    if (polylineOptions != null) __obj.updateDynamic("polylineOptions")(polylineOptions.asInstanceOf[js.Any])
    if (rectangleOptions != null) __obj.updateDynamic("rectangleOptions")(rectangleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawingManagerOptions]
  }
}

