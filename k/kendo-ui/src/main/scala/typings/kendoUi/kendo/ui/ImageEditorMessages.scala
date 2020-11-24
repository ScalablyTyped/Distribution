package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessages extends js.Object {
  
  var common: js.UndefOr[ImageEditorMessagesCommon] = js.native
  
  var panes: js.UndefOr[ImageEditorMessagesPanes] = js.native
  
  var toolbar: js.UndefOr[ImageEditorMessagesToolbar] = js.native
}
object ImageEditorMessages {
  
  @scala.inline
  def apply(): ImageEditorMessages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessages]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesOps[Self <: ImageEditorMessages] (val x: Self) extends AnyVal {
    
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
    def setCommon(value: ImageEditorMessagesCommon): Self = this.set("common", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommon: Self = this.set("common", js.undefined)
    
    @scala.inline
    def setPanes(value: ImageEditorMessagesPanes): Self = this.set("panes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePanes: Self = this.set("panes", js.undefined)
    
    @scala.inline
    def setToolbar(value: ImageEditorMessagesToolbar): Self = this.set("toolbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbar: Self = this.set("toolbar", js.undefined)
  }
}
