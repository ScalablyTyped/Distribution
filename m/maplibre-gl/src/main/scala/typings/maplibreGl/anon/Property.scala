package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.interval
import typings.maplibreGl.mod.SourceFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Property[T]
  extends StObject
     with SourceFunctionSpecification[T]
     with typings.maplibreGl.styleSpecMod.SourceFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var stops: js.Array[js.Tuple2[Double, T]]
  
  var `type`: interval
}
object Property {
  
  inline def apply[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): Property[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("interval")
    __obj.asInstanceOf[Property[T]]
  }
  
  extension [Self <: Property[?], T](x: Self & Property[T]) {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Tuple2[Double, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: interval): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
