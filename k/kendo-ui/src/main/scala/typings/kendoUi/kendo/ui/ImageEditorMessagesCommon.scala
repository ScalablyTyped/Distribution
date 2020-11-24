package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesCommon extends js.Object {
  
  var cancel: js.UndefOr[String] = js.native
  
  var confirm: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[String] = js.native
  
  var lockAspectRatio: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[String] = js.native
}
object ImageEditorMessagesCommon {
  
  @scala.inline
  def apply(): ImageEditorMessagesCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesCommon]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesCommonOps[Self <: ImageEditorMessagesCommon] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: String): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setConfirm(value: String): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfirm: Self = this.set("confirm", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setLockAspectRatio(value: String): Self = this.set("lockAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockAspectRatio: Self = this.set("lockAspectRatio", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
