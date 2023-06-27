package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.maplibreMaplibreGlStyleSpecStrings.exponential
import typings.maplibreMaplibreGlStyleSpec.mod.SourceFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[T]
  extends StObject
     with SourceFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var stops: js.Array[js.Tuple2[Double, T]]
  
  var `type`: exponential
}
object Default {
  
  inline def apply[T](property: String, stops: js.Array[js.Tuple2[Double, T]]): Default[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("exponential")
    __obj.asInstanceOf[Default[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Default[?], T] (val x: Self & Default[T]) extends AnyVal {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Tuple2[Double, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[Double, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: exponential): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
