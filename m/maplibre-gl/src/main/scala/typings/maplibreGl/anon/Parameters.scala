package typings.maplibreGl.anon

import typings.maplibreGl.styleSpecMod.PropertyValueSpecification
import typings.maplibreGl.styleSpecMod.StylePropertySpecification
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
  
  extension [Self <: Parameters[?], T](x: Self & Parameters[T]) {
    
    inline def set_parameters(value: PropertyValueSpecification[T]): Self = StObject.set(x, "_parameters", value.asInstanceOf[js.Any])
    
    inline def set_specification(value: StylePropertySpecification): Self = StObject.set(x, "_specification", value.asInstanceOf[js.Any])
  }
}
