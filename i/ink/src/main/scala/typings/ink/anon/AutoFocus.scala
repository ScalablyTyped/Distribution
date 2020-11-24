package typings.ink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoFocus extends js.Object {
  
  var autoFocus: Boolean = js.native
}
object AutoFocus {
  
  @scala.inline
  def apply(autoFocus: Boolean): AutoFocus = {
    val __obj = js.Dynamic.literal(autoFocus = autoFocus.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFocus]
  }
  
  @scala.inline
  implicit class AutoFocusOps[Self <: AutoFocus] (val x: Self) extends AnyVal {
    
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
    def setAutoFocus(value: Boolean): Self = this.set("autoFocus", value.asInstanceOf[js.Any])
  }
}
