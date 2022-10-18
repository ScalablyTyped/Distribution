package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PinchAround extends StObject {
  
  var bearingDelta: Double
  
  var pinchAround: ^
}
object PinchAround {
  
  inline def apply(bearingDelta: Double, pinchAround: ^): PinchAround = {
    val __obj = js.Dynamic.literal(bearingDelta = bearingDelta.asInstanceOf[js.Any], pinchAround = pinchAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinchAround]
  }
  
  extension [Self <: PinchAround](x: Self) {
    
    inline def setBearingDelta(value: Double): Self = StObject.set(x, "bearingDelta", value.asInstanceOf[js.Any])
    
    inline def setPinchAround(value: ^): Self = StObject.set(x, "pinchAround", value.asInstanceOf[js.Any])
  }
}
