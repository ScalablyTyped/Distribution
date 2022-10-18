package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchAroundZoomDelta extends StObject {
  
  var pinchAround: ^
  
  var zoomDelta: Double
}
object PinchAroundZoomDelta {
  
  inline def apply(pinchAround: ^, zoomDelta: Double): PinchAroundZoomDelta = {
    val __obj = js.Dynamic.literal(pinchAround = pinchAround.asInstanceOf[js.Any], zoomDelta = zoomDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchAroundZoomDelta]
  }
  
  extension [Self <: PinchAroundZoomDelta](x: Self) {
    
    inline def setPinchAround(value: ^): Self = StObject.set(x, "pinchAround", value.asInstanceOf[js.Any])
    
    inline def setZoomDelta(value: Double): Self = StObject.set(x, "zoomDelta", value.asInstanceOf[js.Any])
  }
}
