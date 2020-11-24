package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait B64 extends js.Object {
  
  var b64: String = js.native
}
object B64 {
  
  @scala.inline
  def apply(b64: String): B64 = {
    val __obj = js.Dynamic.literal(b64 = b64.asInstanceOf[js.Any])
    __obj.asInstanceOf[B64]
  }
  
  @scala.inline
  implicit class B64Ops[Self <: B64] (val x: Self) extends AnyVal {
    
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
    def setB64(value: String): Self = this.set("b64", value.asInstanceOf[js.Any])
  }
}
