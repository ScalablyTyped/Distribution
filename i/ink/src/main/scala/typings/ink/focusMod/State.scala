package typings.ink.focusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends js.Object {
  
  var activeFocusId: js.UndefOr[String] = js.native
  
  var disabledFocusIds: js.Array[String] = js.native
  
  var focusIds: js.Array[String] = js.native
  
  var isFocusEnabled: Boolean = js.native
}
object State {
  
  @scala.inline
  def apply(disabledFocusIds: js.Array[String], focusIds: js.Array[String], isFocusEnabled: Boolean): State = {
    val __obj = js.Dynamic.literal(disabledFocusIds = disabledFocusIds.asInstanceOf[js.Any], focusIds = focusIds.asInstanceOf[js.Any], isFocusEnabled = isFocusEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    
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
    def setDisabledFocusIdsVarargs(value: String*): Self = this.set("disabledFocusIds", js.Array(value :_*))
    
    @scala.inline
    def setDisabledFocusIds(value: js.Array[String]): Self = this.set("disabledFocusIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusIdsVarargs(value: String*): Self = this.set("focusIds", js.Array(value :_*))
    
    @scala.inline
    def setFocusIds(value: js.Array[String]): Self = this.set("focusIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocusEnabled(value: Boolean): Self = this.set("isFocusEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveFocusId(value: String): Self = this.set("activeFocusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveFocusId: Self = this.set("activeFocusId", js.undefined)
  }
}
