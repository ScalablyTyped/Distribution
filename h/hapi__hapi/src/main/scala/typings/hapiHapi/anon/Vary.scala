package typings.hapiHapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vary extends js.Object {
  
  var vary: Boolean = js.native
  
  var weak: Boolean = js.native
}
object Vary {
  
  @scala.inline
  def apply(vary: Boolean, weak: Boolean): Vary = {
    val __obj = js.Dynamic.literal(vary = vary.asInstanceOf[js.Any], weak = weak.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vary]
  }
  
  @scala.inline
  implicit class VaryOps[Self <: Vary] (val x: Self) extends AnyVal {
    
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
    def setVary(value: Boolean): Self = this.set("vary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeak(value: Boolean): Self = this.set("weak", value.asInstanceOf[js.Any])
  }
}
