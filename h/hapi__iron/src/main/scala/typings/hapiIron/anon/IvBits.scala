package typings.hapiIron.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IvBits extends js.Object {
  
  var ivBits: Double = js.native
  
  var keyBits: Double = js.native
}
object IvBits {
  
  @scala.inline
  def apply(ivBits: Double, keyBits: Double): IvBits = {
    val __obj = js.Dynamic.literal(ivBits = ivBits.asInstanceOf[js.Any], keyBits = keyBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[IvBits]
  }
  
  @scala.inline
  implicit class IvBitsOps[Self <: IvBits] (val x: Self) extends AnyVal {
    
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
    def setIvBits(value: Double): Self = this.set("ivBits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyBits(value: Double): Self = this.set("keyBits", value.asInstanceOf[js.Any])
  }
}
