package typings.leafletDraw.mod.DrawEvents

import typings.geojson.mod.LineString
import typings.geojson.mod.MultiLineString
import typings.leaflet.mod.LayerGroup_
import typings.leaflet.mod.LeafletEvent
import typings.leaflet.mod.Polygon_
import typings.leaflet.mod.Polyline_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditVertex extends LeafletEvent {
  
  /**
    * List of all layers just being edited from the map.
    */
  var layers: LayerGroup_[_] = js.native
  
  var poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_] = js.native
}
object EditVertex {
  
  @scala.inline
  def apply(
    layer: js.Any,
    layers: LayerGroup_[_],
    poly: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_],
    propagatedFrom: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): EditVertex = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], poly = poly.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditVertex]
  }
  
  @scala.inline
  implicit class EditVertexOps[Self <: EditVertex] (val x: Self) extends AnyVal {
    
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
    def setLayers(value: LayerGroup_[_]): Self = this.set("layers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoly(value: (Polyline_[LineString | MultiLineString, _]) | Polygon_[_]): Self = this.set("poly", value.asInstanceOf[js.Any])
  }
}
