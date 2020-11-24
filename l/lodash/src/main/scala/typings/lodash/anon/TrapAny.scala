package typings.lodash.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrapAny extends js.Object {
  
  var __trapAny: js.Any = js.native
}
object TrapAny {
  
  @scala.inline
  def apply(__trapAny: js.Any): TrapAny = {
    val __obj = js.Dynamic.literal(__trapAny = __trapAny.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrapAny]
  }
  
  @scala.inline
  implicit class TrapAnyOps[Self <: TrapAny] (val x: Self) extends AnyVal {
    
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
    def set__trapAny(value: js.Any): Self = this.set("__trapAny", value.asInstanceOf[js.Any])
  }
}
