package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Ds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityResponse extends StObject {
  
  var array: IdentityArray
  
  var str: String
}
object IdentityResponse {
  
  inline def apply(array: IdentityArray, str: String): IdentityResponse = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityResponse] (val x: Self) extends AnyVal {
    
    inline def setArray(value: IdentityArray): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
