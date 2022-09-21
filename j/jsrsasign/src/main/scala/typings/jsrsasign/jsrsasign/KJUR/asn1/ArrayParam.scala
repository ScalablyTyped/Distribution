package typings.jsrsasign.jsrsasign.KJUR.asn1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayParam[T] extends StObject {
  
  var array: js.Array[T]
}
object ArrayParam {
  
  inline def apply[T](array: js.Array[T]): ArrayParam[T] = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayParam[T]]
  }
  
  extension [Self <: ArrayParam[?], T](x: Self & ArrayParam[T]) {
    
    inline def setArray(value: js.Array[T]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: T*): Self = StObject.set(x, "array", js.Array(value*))
  }
}
