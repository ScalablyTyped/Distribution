package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.Circle
import typings.leaflet.leafletMod.CircleMarker
import typings.leaflet.leafletMod.Marker
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import typings.leaflet.leafletMod.Rectangle
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Created extends Event {
  /**
  			 * Layer that was just created.
  			 */
  var layer: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_] = js.native
  /**
  			 * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
  			 */
  var layerType: String = js.native
}

