package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatColorPickerMessages extends js.Object {
  
  @JSName("apply")
  var apply: js.UndefOr[String] = js.native
  
  var cancel: js.UndefOr[String] = js.native
}
object FlatColorPickerMessages {
  
  @scala.inline
  def apply(): FlatColorPickerMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatColorPickerMessages]
  }
  
  @scala.inline
  implicit class FlatColorPickerMessagesOps[Self <: FlatColorPickerMessages] (val x: Self) extends AnyVal {
    
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
    def setApply(value: String): Self = this.set("apply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApply: Self = this.set("apply", js.undefined)
    
    @scala.inline
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
  }
}
