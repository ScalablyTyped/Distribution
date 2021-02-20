package typings.googlemaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolyMouseEvent extends MouseEvent {
  
  var edge: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[Double] = js.native
  
  var vertex: js.UndefOr[Double] = js.native
}
object PolyMouseEvent {
  
  @scala.inline
  def apply(latLng: LatLng, stop: () => Unit): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any], stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[PolyMouseEvent]
  }
  
  @scala.inline
  implicit class PolyMouseEventMutableBuilder[Self <: PolyMouseEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEdge(value: Double): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    @scala.inline
    def setPath(value: Double): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setVertex(value: Double): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexUndefined: Self = StObject.set(x, "vertex", js.undefined)
  }
}
