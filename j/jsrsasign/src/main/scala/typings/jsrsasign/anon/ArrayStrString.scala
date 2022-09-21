package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.IdentityArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayStrString extends StObject {
  
  var array: js.UndefOr[IdentityArray] = js.undefined
  
  var str: String
}
object ArrayStrString {
  
  inline def apply(str: String): ArrayStrString = {
    val __obj = js.Dynamic.literal(str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayStrString]
  }
  
  extension [Self <: ArrayStrString](x: Self) {
    
    inline def setArray(value: IdentityArray): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
