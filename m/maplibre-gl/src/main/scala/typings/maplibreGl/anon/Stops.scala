package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.exponential
import typings.maplibreGl.mod.CameraFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stops[T]
  extends StObject
     with CameraFunctionSpecification[T]
     with typings.maplibreGl.styleSpecMod.CameraFunctionSpecification[T] {
  
  var stops: js.Array[js.Tuple2[Double, T]]
  
  var `type`: exponential
}
object Stops {
  
  inline def apply[T](stops: js.Array[js.Tuple2[Double, T]]): Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[Stops[T]]
  }
  
  extension [Self <: Stops[?], T](x: Self & Stops[T]) {
    
    inline def setStops(value: js.Array[js.Tuple2[Double, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: exponential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
