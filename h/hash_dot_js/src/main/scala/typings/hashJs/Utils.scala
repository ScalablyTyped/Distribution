package typings.hashJs

import typings.hashJs.hashJsStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utils extends js.Object {
  
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
  implicit class UtilsOps[Self <: Utils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setToArray(value: (js.Any, hex) => js.Array[Double]): Self = this.set("toArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToHex(value: js.Any => String): Self = this.set("toHex", js.Any.fromFunction1(value))
  }
}
