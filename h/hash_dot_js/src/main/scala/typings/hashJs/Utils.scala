package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Utils extends StObject {
  
  @JSName("toArray")
  def toArray_hex(msg: js.Any, enc: hex): js.Array[Double]
  
  def toHex(msg: js.Any): String
}
object Utils {
  
  inline def apply(toArray: (js.Any, hex) => js.Array[Double], toHex: js.Any => String): Utils = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction2(toArray), toHex = js.Any.fromFunction1(toHex))
    __obj.asInstanceOf[Utils]
  }
  
  extension [Self <: Utils](x: Self) {
    
    inline def setToArray(value: (js.Any, hex) => js.Array[Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction2(value))
    
    inline def setToHex(value: js.Any => String): Self = StObject.set(x, "toHex", js.Any.fromFunction1(value))
  }
}
