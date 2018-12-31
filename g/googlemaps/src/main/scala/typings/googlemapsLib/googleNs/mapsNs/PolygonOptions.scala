package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolygonOptions extends js.Object {
  /**
    * Indicates whether this Polygon handles mouse events. Defaults to true.
    */
  var clickable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, the user can drag this shape over the map.
    * The geodesic property defines the mode of dragging. Defaults to false.
    */
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, the user can edit this shape by dragging the control
    * points shown at the vertices and on each segment. Defaults to false.
    */
  var editable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The fill color. All CSS3 colors are supported except for extended named
    * colors.
    */
  var fillColor: js.UndefOr[java.lang.String] = js.undefined
  /** The fill opacity between 0.0 and 1.0 */
  var fillOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  /** Map on which to display Polygon. */
  var map: js.UndefOr[Map] = js.undefined
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
    MVCArray[MVCArray[LatLng]] | MVCArray[LatLng] | js.Array[js.Array[LatLng]] | js.Array[js.Array[LatLngLiteral]] | js.Array[LatLng] | js.Array[LatLngLiteral]
  ] = js.undefined
  /**
    * The stroke color.
    * All CSS3 colors are supported except for extended named colors.
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /** The stroke opacity between 0.0 and 1.0 */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * The stroke position. Defaults to CENTER.
    * This property is not supported on Internet Explorer 8 and earlier.
    */
  var strokePosition: js.UndefOr[StrokePosition] = js.undefined
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  /** Whether this polygon is visible on the map. Defaults to true. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

