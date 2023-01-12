package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.IdentityArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayIdentityArray extends StObject {
  
  var array: IdentityArray
}
object ArrayIdentityArray {
  
  inline def apply(array: IdentityArray): ArrayIdentityArray = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayIdentityArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayIdentityArray] (val x: Self) extends AnyVal {
    
    inline def setArray(value: IdentityArray): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
  }
}
