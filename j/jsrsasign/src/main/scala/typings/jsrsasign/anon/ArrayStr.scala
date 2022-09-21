package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayStr extends StObject {
  
  var array: js.UndefOr[js.Array[js.Array[Ds]]] = js.undefined
  
  var str: String
}
object ArrayStr {
  
  inline def apply(str: String): ArrayStr = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayStr]
  }
  
  extension [Self <: ArrayStr](x: Self) {
    
    inline def setArray(value: js.Array[js.Array[Ds]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
