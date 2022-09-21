package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.exponential
import typings.maplibreGl.mod.CompositeFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PropertyStops[T]
  extends StObject
     with CompositeFunctionSpecification[T]
     with typings.maplibreGl.styleSpecMod.CompositeFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var stops: js.Array[js.Tuple2[Value, T]]
  
  var `type`: exponential
}
object PropertyStops {
  
  inline def apply[T](property: String, stops: js.Array[js.Tuple2[Value, T]]): PropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[PropertyStops[T]]
  }
  
  extension [Self <: PropertyStops[?], T](x: Self & PropertyStops[T]) {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Tuple2[Value, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Value, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: exponential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
