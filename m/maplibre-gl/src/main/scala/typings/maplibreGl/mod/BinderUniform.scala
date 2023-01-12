package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BinderUniform extends StObject {
  
  var binding: Uniform[Any]
  
  var name: String
  
  var property: String
}
object BinderUniform {
  
  inline def apply(binding: Uniform[Any], name: String, property: String): BinderUniform = {
    val __obj = js.Dynamic.literal(binding = binding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any])
    __obj.asInstanceOf[BinderUniform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BinderUniform] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: Uniform[Any]): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
  }
}
