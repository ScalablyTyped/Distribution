package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchAround extends StObject {
  
  var pinchAround: ^
  
  var zoomDelta: Double
}
object PinchAround {
  
  inline def apply(pinchAround: ^, zoomDelta: Double): PinchAround = {
    val __obj = js.Dynamic.literal(pinchAround = pinchAround.asInstanceOf[js.Any], zoomDelta = zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchAround]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PinchAround] (val x: Self) extends AnyVal {
    
    inline def setPinchAround(value: ^): Self = StObject.set(x, "pinchAround", value.asInstanceOf[js.Any])
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
  }
}
