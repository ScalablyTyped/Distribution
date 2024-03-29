package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Value[U] extends StObject {
  
  var convert: Boolean
  
  var value: U
}
object Value {
  
  inline def apply[U](convert: Boolean, value: U): Value[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value[U]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Value[?], U] (val x: Self & Value[U]) extends AnyVal {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setValue(value: U): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
