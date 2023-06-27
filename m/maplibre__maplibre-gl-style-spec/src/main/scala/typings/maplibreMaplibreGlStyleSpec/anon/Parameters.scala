package typings.maplibreMaplibreGlStyleSpec.anon

import typings.maplibreMaplibreGlStyleSpec.mod.PropertyValueSpecification
import typings.maplibreMaplibreGlStyleSpec.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parameters[T] extends StObject {
  
  var _parameters: PropertyValueSpecification[T]
  
  var _specification: StylePropertySpecification
}
object Parameters {
  
  inline def apply[T](_parameters: PropertyValueSpecification[T], _specification: StylePropertySpecification): Parameters[T] = {
    val __obj = js.Dynamic.literal(_parameters = _parameters.asInstanceOf[js.Any], _specification = _specification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parameters[?], T] (val x: Self & Parameters[T]) extends AnyVal {
    
    inline def set_parameters(value: PropertyValueSpecification[T]): Self = StObject.set(x, "_parameters", value.asInstanceOf[js.Any])
    
    inline def set_specification(value: StylePropertySpecification): Self = StObject.set(x, "_specification", value.asInstanceOf[js.Any])
  }
}
