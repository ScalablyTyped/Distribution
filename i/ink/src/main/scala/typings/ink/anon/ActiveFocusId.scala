package typings.ink.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveFocusId extends js.Object {
  
  var activeFocusId: js.UndefOr[scala.Nothing] = js.native
  
  var error: js.UndefOr[scala.Nothing] = js.native
  
  var focusables: js.Array[scala.Nothing] = js.native
  
  var isFocusEnabled: Boolean = js.native
}
object ActiveFocusId {
  
  @scala.inline
  def apply(focusables: js.Array[scala.Nothing], isFocusEnabled: Boolean): ActiveFocusId = {
    val __obj = js.Dynamic.literal(focusables = focusables.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveFocusId]
  }
  
  @scala.inline
  implicit class ActiveFocusIdOps[Self <: ActiveFocusId] (val x: Self) extends AnyVal {
    
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
    def setFocusablesVarargs(value: scala.Nothing*): Self = this.set("focusables", js.Array(value :_*))
    
    @scala.inline
    def setFocusables(value: js.Array[scala.Nothing]): Self = this.set("focusables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusEnabled(value: Boolean): Self = this.set("isFocusEnabled", value.asInstanceOf[js.Any])
  }
}
