package typings.leafletEditable.mod

import typings.leaflet.mod.LeafletEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VertexEvent
  extends StObject
     with LeafletEvent {
  
  /**
    * The vertex that fired the event.
    */
  var vertex: VertexMarker
}
object VertexEvent {
  
  inline def apply(
    layer: Any,
    popup: Any,
    propagatedFrom: Any,
    sourceTarget: Any,
    target: Any,
    `type`: String,
    vertex: VertexMarker
  ): VertexEvent = {
    val __obj = js.Dynamic.literal(layer = layer.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], propagatedFrom = propagatedFrom.asInstanceOf[js.Any], sourceTarget = sourceTarget.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexEvent]
  }
  
  extension [Self <: VertexEvent](x: Self) {
    
    inline def setVertex(value: VertexMarker): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
  }
}
