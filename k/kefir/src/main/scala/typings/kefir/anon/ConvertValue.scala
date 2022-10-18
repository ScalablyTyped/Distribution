package typings.kefir.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertValue[U] extends StObject {
  
  var convert: Boolean
  
  var value: U
}
object ConvertValue {
  
  inline def apply[U](convert: Boolean, value: U): ConvertValue[U] = {
    val __obj = js.Dynamic.literal(convert = convert.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertValue[U]]
  }
  
  extension [Self <: ConvertValue[?], U](x: Self & ConvertValue[U]) {
    
    inline def setConvert(value: Boolean): Self = StObject.set(x, "convert", value.asInstanceOf[js.Any])
    
    inline def setValue(value: U): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
