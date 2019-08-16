package typings.leafletDashDraw.leafletMod.DrawEventsNs

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditVertex extends Event {
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup[_] = js.native
  var poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_] = js.native
}

