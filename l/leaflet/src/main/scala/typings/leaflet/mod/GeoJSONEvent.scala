package typings.leaflet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONEvent
  extends StObject
     with LeafletEvent {
  
  var geometryType: String
  
  var id: String
  
  @JSName("layer")
  var layer_GeoJSONEvent: Layer
  
  var properties: js.Any
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
  implicit class GeoJSONEventMutableBuilder[Self <: GeoJSONEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeometryType(value: String): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
