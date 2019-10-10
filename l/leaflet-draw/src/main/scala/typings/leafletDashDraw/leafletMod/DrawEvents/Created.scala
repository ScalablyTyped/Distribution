package typings.leafletDashDraw.leafletMod.DrawEvents

import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.leaflet.leafletMod.Circle
import typings.leaflet.leafletMod.CircleMarker
import typings.leaflet.leafletMod.LeafletEvent
import typings.leaflet.leafletMod.Marker
import typings.leaflet.leafletMod.Polygon
import typings.leaflet.leafletMod.Polyline
import typings.leaflet.leafletMod.Rectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created extends LeafletEvent {
  /**
    * The type of layer this is. One of: polyline, polygon, rectangle, circle, marker.
    */
  var layerType: String
  /**
    * Layer that was just created.
    */
  @JSName("layer")
  var layer_Created: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_]
}

object Created {
  @scala.inline
  def apply(
    layer: Circle[_] | CircleMarker[_] | Marker[_] | Polygon[_] | (Polyline[LineString | MultiLineString, _]) | Rectangle[_],
    layerType: String,
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): Created = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layerType = layerType, propagatedFrom = propagatedFrom, sourceTarget = sourceTarget, target = target)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Created]
  }
}

