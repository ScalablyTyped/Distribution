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
@js.native
trait DrawingManagerOptions extends js.Object {
  /**
    * Options to apply to any new circles created with this DrawingManager.
    * The center and radius properties are ignored, and the map property of a
    * new circle is always set to the DrawingManager's map.
    */
  var circleOptions: js.UndefOr[CircleOptions] = js.native
  /**
    * The enabled/disabled state of the drawing control. Defaults to true.
    */
  var drawingControl: js.UndefOr[Boolean] = js.native
  /** The display options for the drawing control. */
  var drawingControlOptions: js.UndefOr[DrawingControlOptions] = js.native
  /**
    * The DrawingManager's drawing mode, which defines the type of overlay to
    * be added on the map. Accepted values are 'marker', 'polygon',
    * 'polyline', 'rectangle', 'circle', or null. A drawing mode of null
    * means that the user can interact with the map as normal, and clicks do
    * not draw anything.
    */
  var drawingMode: js.UndefOr[OverlayType | Null] = js.native
  /**
    * The Map to which the DrawingManager is attached, which is the Map on
    * which the overlays created will be placed.
    */
  var map: js.UndefOr[Map[Element]] = js.native
  /**
    * Options to apply to any new markers created with this DrawingManager.
    * The position property is ignored, and the map property of a new marker
    * is always set to the DrawingManager's map.
    */
  var markerOptions: js.UndefOr[MarkerOptions] = js.native
  /**
    * Options to apply to any new polygons created with this DrawingManager.
    * The paths property is ignored, and the map property of a new polygon is
    * always set to the DrawingManager's map.
    */
  var polygonOptions: js.UndefOr[PolygonOptions] = js.native
  /**
    * Options to apply to any new polylines created with this DrawingManager.
    * The path property is ignored, and the map property of a new polyline is
    * always set to the DrawingManager's map.
    */
  var polylineOptions: js.UndefOr[PolylineOptions] = js.native
  /**
    * Options to apply to any new rectangles created with this
    * DrawingManager. The bounds property is ignored, and the map property of
    * a new rectangle is always set to the DrawingManager's map.
    */
  var rectangleOptions: js.UndefOr[RectangleOptions] = js.native
}

object DrawingManagerOptions {
  @scala.inline
  def apply(): DrawingManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrawingManagerOptions]
  }
  @scala.inline
  implicit class DrawingManagerOptionsOps[Self <: DrawingManagerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCircleOptions(value: CircleOptions): Self = this.set("circleOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircleOptions: Self = this.set("circleOptions", js.undefined)
    @scala.inline
    def setDrawingControl(value: Boolean): Self = this.set("drawingControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingControl: Self = this.set("drawingControl", js.undefined)
    @scala.inline
    def setDrawingControlOptions(value: DrawingControlOptions): Self = this.set("drawingControlOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingControlOptions: Self = this.set("drawingControlOptions", js.undefined)
    @scala.inline
    def setDrawingMode(value: OverlayType): Self = this.set("drawingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawingMode: Self = this.set("drawingMode", js.undefined)
    @scala.inline
    def setDrawingModeNull: Self = this.set("drawingMode", null)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setMarkerOptions(value: MarkerOptions): Self = this.set("markerOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerOptions: Self = this.set("markerOptions", js.undefined)
    @scala.inline
    def setPolygonOptions(value: PolygonOptions): Self = this.set("polygonOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolygonOptions: Self = this.set("polygonOptions", js.undefined)
    @scala.inline
    def setPolylineOptions(value: PolylineOptions): Self = this.set("polylineOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolylineOptions: Self = this.set("polylineOptions", js.undefined)
    @scala.inline
    def setRectangleOptions(value: RectangleOptions): Self = this.set("rectangleOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRectangleOptions: Self = this.set("rectangleOptions", js.undefined)
  }
  
}

