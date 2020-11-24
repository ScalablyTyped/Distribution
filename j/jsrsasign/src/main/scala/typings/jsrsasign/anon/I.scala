package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.BigInteger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I extends js.Object {
  
  var i: Double = js.native
  
  var r: BigInteger = js.native
  
  var s: BigInteger = js.native
}
object I {
  
  @scala.inline
  def apply(i: Double, r: BigInteger, s: BigInteger): I = {
    val __obj = js.Dynamic.literal(i = i.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any])
    __obj.asInstanceOf[I]
  }
  
  @scala.inline
  implicit class IOps[Self <: I] (val x: Self) extends AnyVal {
    
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
    def setI(value: Double): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: BigInteger): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: BigInteger): Self = this.set("s", value.asInstanceOf[js.Any])
  }
}
