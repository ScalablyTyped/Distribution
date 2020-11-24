package typings.keygrip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Keygrip extends js.Object {
  
  def index(data: js.Any, digest: String): Double = js.native
  
  def sign(data: js.Any): String = js.native
  
  def verify(data: js.Any, digest: String): Boolean = js.native
}
object Keygrip {
  
  @scala.inline
  def apply(index: (js.Any, String) => Double, sign: js.Any => String, verify: (js.Any, String) => Boolean): Keygrip = {
    val __obj = js.Dynamic.literal(index = js.Any.fromFunction2(index), sign = js.Any.fromFunction1(sign), verify = js.Any.fromFunction2(verify))
    __obj.asInstanceOf[Keygrip]
  }
  
  @scala.inline
  implicit class KeygripOps[Self <: Keygrip] (val x: Self) extends AnyVal {
    
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
    def setIndex(value: (js.Any, String) => Double): Self = this.set("index", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSign(value: js.Any => String): Self = this.set("sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerify(value: (js.Any, String) => Boolean): Self = this.set("verify", js.Any.fromFunction2(value))
  }
}
