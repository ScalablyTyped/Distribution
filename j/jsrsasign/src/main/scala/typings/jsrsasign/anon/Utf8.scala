package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utf8 extends js.Object {
  
  var utf8: String = js.native
}
object Utf8 {
  
  @scala.inline
  def apply(utf8: String): Utf8 = {
    val __obj = js.Dynamic.literal(utf8 = utf8.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utf8]
  }
  
  @scala.inline
  implicit class Utf8Ops[Self <: Utf8] (val x: Self) extends AnyVal {
    
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
    def setUtf8(value: String): Self = this.set("utf8", value.asInstanceOf[js.Any])
  }
}
