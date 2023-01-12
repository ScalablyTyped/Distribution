package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtnameString extends StObject {
  
  var array: js.UndefOr[js.Array[Any]] = js.undefined
  
  var extname: String
}
object ExtnameString {
  
  inline def apply(extname: String): ExtnameString = {
    val __obj = js.Dynamic.literal(extname = extname.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtnameString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtnameString] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Any]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: Any*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
  }
}
