package typings
package googlemapsLib.googleNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolylineOptions extends js.Object {
  /**
    * Indicates whether this Polyline handles mouse events. Defaults to true.
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
    * When true, edges of the polygon are interpreted as geodesic and will
    * follow the curvature of the Earth. When false, edges of the polygon are
    * rendered as straight lines in screen space. Note that the shape of a
    * geodesic polygon may appear to change when dragged, as the dimensions are
    * maintained relative to the surface of the earth. Defaults to false.
    */
  var geodesic: js.UndefOr[scala.Boolean] = js.undefined
  /** The icons to be rendered along the polyline. */
  var icons: js.UndefOr[js.Array[IconSequence]] = js.undefined
  /** Map on which to display Polyline. */
  var map: js.UndefOr[Map] = js.undefined
  /**
    * The ordered sequence of coordinates of the Polyline.
    * This path may be specified using either a simple array of LatLngs, or an
    * MVCArray of LatLngs. Note that if you pass a simple array, it will be
    * converted to an MVCArray Inserting or removing LatLngs in the MVCArray
    * will automatically update the polyline on the map.
    */
  var path: js.UndefOr[MVCArray[LatLng] | js.Array[LatLng] | js.Array[LatLngLiteral]] = js.undefined
  /**
    * The stroke color. All CSS3 colors are supported except for extended
    * named colors.
    */
  var strokeColor: js.UndefOr[java.lang.String] = js.undefined
  /** The stroke opacity between 0.0 and 1.0. */
  var strokeOpacity: js.UndefOr[scala.Double] = js.undefined
  /** The stroke width in pixels. */
  var strokeWeight: js.UndefOr[scala.Double] = js.undefined
  /** Whether this polyline is visible on the map. Defaults to true. */
  var visible: js.UndefOr[scala.Boolean] = js.undefined
  /** The zIndex compared to other polys. */
  var zIndex: js.UndefOr[scala.Double] = js.undefined
}

