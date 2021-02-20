package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends StObject {
  
  @JSName("toArray")
  def toArray_hex(msg: js.Any, enc: hex): js.Array[Double] = js.native
  
  def toHex(msg: js.Any): String = js.native
}
object Utils {
  
  @scala.inline
  def apply(toArray: (js.Any, hex) => js.Array[Double], toHex: js.Any => String): Utils = {
    val __obj = js.Dynamic.literal(toArray = js.Any.fromFunction2(toArray), toHex = js.Any.fromFunction1(toHex))
    __obj.asInstanceOf[Utils]
  }
  
  @scala.inline
  implicit class UtilsMutableBuilder[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setToArray(value: (js.Any, hex) => js.Array[Double]): Self = StObject.set(x, "toArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToHex(value: js.Any => String): Self = StObject.set(x, "toHex", js.Any.fromFunction1(value))
  }
}
