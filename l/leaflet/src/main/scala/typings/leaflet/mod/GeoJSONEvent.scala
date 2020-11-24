package typings.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONEvent extends LeafletEvent {
  
  var geometryType: String = js.native
  
  var id: String = js.native
  
  @JSName("layer")
  var layer_GeoJSONEvent: Layer = js.native
  
  var properties: js.Any = js.native
}
object GeoJSONEvent {
  
  @scala.inline
  def apply(
    geometryType: String,
    id: String,
    layer: Layer,
    propagatedFrom: js.Any,
    properties: js.Any,
    sourceTarget: js.Any,
    target: js.Any,
    `type`: String
  ): GeoJSONEvent = {
    val __obj = js.Dynamic.literal(geometryType = geometryType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoJSONEvent]
  }
  
  @scala.inline
  implicit class GeoJSONEventOps[Self <: GeoJSONEvent] (val x: Self) extends AnyVal {
    
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
    def setGeometryType(value: String): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = this.set("layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
  }
}
