package typings.mapboxGl.anon

import typings.mapboxGl.mapboxGlStrings.exponential
import typings.mapboxGl.mod.CameraFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stops[T]
  extends StObject
     with CameraFunctionSpecification[T] {
  
  var stops: js.Array[js.Tuple2[Double, T]]
  
  var `type`: exponential
}
object Stops {
  
  inline def apply[T](stops: js.Array[js.Tuple2[Double, T]]): Stops[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[Stops[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Stops[?], T] (val x: Self & Stops[T]) extends AnyVal {
    
    inline def setStops(value: js.Array[js.Tuple2[Double, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: exponential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
