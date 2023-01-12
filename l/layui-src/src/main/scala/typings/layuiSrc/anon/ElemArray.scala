package typings.layuiSrc.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElemArray extends StObject {
  
  var elem: js.Array[Any]
}
object ElemArray {
  
  inline def apply(elem: js.Array[Any]): ElemArray = {
    val __obj = js.Dynamic.literal(elem = elem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElemArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElemArray] (val x: Self) extends AnyVal {
    
    inline def setElem(value: js.Array[Any]): Self = StObject.set(x, "elem", value.asInstanceOf[js.Any])
    
    inline def setElemVarargs(value: Any*): Self = StObject.set(x, "elem", js.Array(value*))
  }
}
