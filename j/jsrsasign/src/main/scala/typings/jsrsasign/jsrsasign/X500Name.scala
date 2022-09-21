package typings.jsrsasign.jsrsasign

import typings.jsrsasign.anon.Ds
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X500Name extends StObject {
  
  var array: js.Array[js.Array[Ds]]
  
  var str: String
}
object X500Name {
  
  inline def apply(array: js.Array[js.Array[Ds]], str: String): X500Name = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], str = str.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500Name]
  }
  
  extension [Self <: X500Name](x: Self) {
    
    inline def setArray(value: js.Array[js.Array[Ds]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: js.Array[Ds]*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setStr(value: String): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
  }
}
