package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.interval
import typings.maplibreGl.mod.CameraFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type[T]
  extends StObject
     with CameraFunctionSpecification[T]
     with typings.maplibreGl.distStyleSpecMod.CameraFunctionSpecification[T] {
  
  var stops: js.Array[js.Tuple2[Double, T]]
  
  var `type`: interval
}
object Type {
  
  inline def apply[T](stops: js.Array[js.Tuple2[Double, T]]): Type[T] = {
    val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[Type[T]]
  }
  
  extension [Self <: Type[?], T](x: Self & Type[T]) {
    
    inline def setStops(value: js.Array[js.Tuple2[Double, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: interval): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
