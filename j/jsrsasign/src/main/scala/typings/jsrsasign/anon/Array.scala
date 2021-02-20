package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Array extends StObject {
  
  var array: js.Array[String] = js.native
  
  var hashalg: String = js.native
}
object Array {
  
  @scala.inline
  def apply(array: js.Array[String], hashalg: String): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], hashalg = hashalg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  @scala.inline
  implicit class ArrayMutableBuilder[Self <: Array] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArray(value: js.Array[String]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArrayVarargs(value: String*): Self = StObject.set(x, "array", js.Array(value :_*))
    
    @scala.inline
    def setHashalg(value: String): Self = StObject.set(x, "hashalg", value.asInstanceOf[js.Any])
  }
}
