package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var array: js.Array[String]
  
  var hashalg: String
}
object Array {
  
  inline def apply(array: js.Array[String], hashalg: String): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], hashalg = hashalg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setHashalg(value: String): Self = StObject.set(x, "hashalg", value.asInstanceOf[js.Any])
  }
}
