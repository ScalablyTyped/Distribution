package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolyMouseEvent
  extends StObject
     with MouseEvent {
  
  var edge: js.UndefOr[Double] = js.undefined
  
  var path: js.UndefOr[Double] = js.undefined
  
  var vertex: js.UndefOr[Double] = js.undefined
}
object PolyMouseEvent {
  
  inline def apply(latLng: LatLng, stop: () => Unit): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[PolyMouseEvent]
  }
  
  extension [Self <: PolyMouseEvent](x: Self) {
    
    inline def setEdge(value: Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setVertex(value: Double): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
