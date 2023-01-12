package typings.maplibreGl.anon

import typings.maplibreGl.maplibreGlStrings.categorical
import typings.maplibreGl.mod.SourceFunctionSpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProperty[T]
  extends StObject
     with SourceFunctionSpecification[T]
     with typings.maplibreGl.distStyleSpecMod.SourceFunctionSpecification[T] {
  
  var default: js.UndefOr[T] = js.undefined
  
  var property: String
  
  var stops: js.Array[js.Tuple2[String | Double | Boolean, T]]
  
  var `type`: categorical
}
object DefaultProperty {
  
  inline def apply[T](property: String, stops: js.Array[js.Tuple2[String | Double | Boolean, T]]): DefaultProperty[T] = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("categorical")
    __obj.asInstanceOf[DefaultProperty[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DefaultProperty[?], T] (val x: Self & DefaultProperty[T]) extends AnyVal {
    
    inline def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[js.Tuple2[String | Double | Boolean, T]]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: (js.Tuple2[String | Double | Boolean, T])*): Self = StObject.set(x, "stops", js.Array(value*))
    
    inline def setType(value: categorical): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
