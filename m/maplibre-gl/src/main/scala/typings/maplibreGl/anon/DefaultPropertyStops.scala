package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.categorical
import typings.maplibreGl.mod.CompositeFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultPropertyStops[T]
  extends StObject
     with CompositeFunctionSpecification[T]
     with typings.maplibreGl.styleSpecMod.CompositeFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var stops: js.Array[js.Tuple2[Zoom, T]]
  
  var `type`: categorical
}
object DefaultPropertyStops {
  
  inline def apply[T](property: String, stops: js.Array[js.Tuple2[Zoom, T]]): DefaultPropertyStops[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[DefaultPropertyStops[T]]
  }
  
  extension [Self <: DefaultPropertyStops[?], T](x: Self & DefaultPropertyStops[T]) {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Tuple2[Zoom, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Zoom, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: categorical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
