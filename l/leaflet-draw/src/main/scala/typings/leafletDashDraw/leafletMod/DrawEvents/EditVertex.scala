package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.LayerGroup
import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditVertex extends LeafletEvent {
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup[_]
  var poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_]
}

object EditVertex {
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup[_],
    poly: (Polyline[LineString | MultiLineString, _]) | Polygon[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): EditVertex = {
    val __obj = js.Dynamic.literal(layer = layer, layers = layers, poly = poly.asInstanceOf[js.Any], propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EditVertex]
  }
}

