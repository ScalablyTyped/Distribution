package typings.maplibreGl.anon

import typings.mapboxPointGeometry.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BearingDeltaPinchAround extends StObject {
  
  var bearingDelta: Double
  
  var pinchAround: ^
}
object BearingDeltaPinchAround {
  
  inline def apply(bearingDelta: Double, pinchAround: ^): BearingDeltaPinchAround = {
    val __obj = js.Dynamic.literal(bearingDelta = bearingDelta.asInstanceOf[js.Any], pinchAround = pinchAround.asInstanceOf[js.Any])
    __obj.asInstanceOf[BearingDeltaPinchAround]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BearingDeltaPinchAround] (val x: Self) extends AnyVal {
    
    inline def setBearingDelta(value: Double): Self = StObject.set(x, "bearingDelta", value.asInstanceOf[js.Any])
    
    inline def setPinchAround(value: ^): Self = StObject.set(x, "pinchAround", value.asInstanceOf[js.Any])
  }
}
