package typings.googlemaps.google.maps

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonOptions extends js.Object {
  /**
    * Indicates whether this Polygon handles mouse events. Defaults to true.
    */
  var clickable: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the user can drag this shape over the map.
    * The geodesic property defines the mode of dragging. Defaults to false.
    */
  var draggable: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the user can edit this shape by dragging the control
    * points shown at the vertices and on each segment. Defaults to false.
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[String] = js.native
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[Double] = js.native
  /**
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[Boolean] = js.native
  /** Map on which to display Polygon. */
  var map: js.UndefOr[Map[Element]] = js.native
  /**
    * The ordered sequence of coordinates that designates a closed loop. Unlike
    * polylines, a polygon may consist of one or more paths. As a result, the
    * paths property may specify one or more arrays of LatLng coordinates.
    * Paths are closed automatically; do not repeat the first vertex of the
    * path as the last vertex. Simple polygons may be defined using a single
    * array of LatLngs. More complex polygons may specify an array of arrays.
    * Any simple arrays are converted into MVCArrays. Inserting or removing
    * LatLngs from the MVCArray will automatically update the polygon on the
    * map.
    */
  var paths: js.UndefOr[
    (MVCArray[LatLng | MVCArray[LatLng]]) | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
  ] = js.native
  /**
    * The stroke color.
    * All CSS3 colors are supported except for extended named colors.
    */
  var strokeColor: js.UndefOr[String] = js.native
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[Double] = js.native
  /**
    * The stroke position. Defaults to CENTER.
    * This property is not supported on Internet Explorer 8 and earlier.
    */
  var strokePosition: js.UndefOr[StrokePosition] = js.native
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[Double] = js.native
  /** Whether this polygon is visible on the map. Defaults to true. */
  var visible: js.UndefOr[Boolean] = js.native
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[Double] = js.native
}

object PolygonOptions {
  @scala.inline
  def apply(): PolygonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonOptions]
  }
  @scala.inline
  implicit class PolygonOptionsOps[Self <: PolygonOptions] (val x: Self) extends AnyVal {
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
    def setClickable(value: Boolean): Self = this.set("clickable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickable: Self = this.set("clickable", js.undefined)
    @scala.inline
    def setDraggable(value: Boolean): Self = this.set("draggable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillColor: Self = this.set("fillColor", js.undefined)
    @scala.inline
    def setFillOpacity(value: Double): Self = this.set("fillOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFillOpacity: Self = this.set("fillOpacity", js.undefined)
    @scala.inline
    def setGeodesic(value: Boolean): Self = this.set("geodesic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGeodesic: Self = this.set("geodesic", js.undefined)
    @scala.inline
    def setMap(value: Map[Element]): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setPathsVarargs(value: ((js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral)*): Self = this.set("paths", js.Array(value :_*))
    @scala.inline
    def setPaths(
      value: (MVCArray[LatLng | MVCArray[LatLng]]) | (js.Array[(js.Array[LatLng | LatLngLiteral]) | LatLng | LatLngLiteral])
    ): Self = this.set("paths", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaths: Self = this.set("paths", js.undefined)
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    @scala.inline
    def setStrokeOpacity(value: Double): Self = this.set("strokeOpacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeOpacity: Self = this.set("strokeOpacity", js.undefined)
    @scala.inline
    def setStrokePosition(value: StrokePosition): Self = this.set("strokePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokePosition: Self = this.set("strokePosition", js.undefined)
    @scala.inline
    def setStrokeWeight(value: Double): Self = this.set("strokeWeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrokeWeight: Self = this.set("strokeWeight", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZIndex: Self = this.set("zIndex", js.undefined)
  }
  
}

