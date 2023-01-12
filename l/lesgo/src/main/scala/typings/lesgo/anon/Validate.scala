package typings.lesgo.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validate[T] extends StObject {
  
  var data: js.Array[/* keyof T */ String]
  
  var validate: Boolean
}
object Validate {
  
  inline def apply[T](data: js.Array[/* keyof T */ String], validate: Boolean): Validate[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], validate = validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validate[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validate[?], T] (val x: Self & Validate[T]) extends AnyVal {
    
    inline def setData(value: js.Array[/* keyof T */ String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (/* keyof T */ String)*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setValidate(value: Boolean): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
  }
}
