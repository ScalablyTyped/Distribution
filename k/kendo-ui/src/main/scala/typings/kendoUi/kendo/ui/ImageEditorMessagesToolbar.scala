package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesToolbar extends js.Object {
  
  var crop: js.UndefOr[String] = js.native
  
  var open: js.UndefOr[String] = js.native
  
  var redo: js.UndefOr[String] = js.native
  
  var resize: js.UndefOr[String] = js.native
  
  var save: js.UndefOr[String] = js.native
  
  var undo: js.UndefOr[String] = js.native
  
  var zoomActualSize: js.UndefOr[String] = js.native
  
  var zoomDropdown: js.UndefOr[String] = js.native
  
  var zoomFitToScreen: js.UndefOr[String] = js.native
  
  var zoomIn: js.UndefOr[String] = js.native
  
  var zoomOut: js.UndefOr[String] = js.native
}
object ImageEditorMessagesToolbar {
  
  @scala.inline
  def apply(): ImageEditorMessagesToolbar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesToolbar]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesToolbarOps[Self <: ImageEditorMessagesToolbar] (val x: Self) extends AnyVal {
    
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
    def setCrop(value: String): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
    
    @scala.inline
    def setOpen(value: String): Self = this.set("open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setRedo(value: String): Self = this.set("redo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedo: Self = this.set("redo", js.undefined)
    
    @scala.inline
    def setResize(value: String): Self = this.set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResize: Self = this.set("resize", js.undefined)
    
    @scala.inline
    def setSave(value: String): Self = this.set("save", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSave: Self = this.set("save", js.undefined)
    
    @scala.inline
    def setUndo(value: String): Self = this.set("undo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndo: Self = this.set("undo", js.undefined)
    
    @scala.inline
    def setZoomActualSize(value: String): Self = this.set("zoomActualSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomActualSize: Self = this.set("zoomActualSize", js.undefined)
    
    @scala.inline
    def setZoomDropdown(value: String): Self = this.set("zoomDropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomDropdown: Self = this.set("zoomDropdown", js.undefined)
    
    @scala.inline
    def setZoomFitToScreen(value: String): Self = this.set("zoomFitToScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomFitToScreen: Self = this.set("zoomFitToScreen", js.undefined)
    
    @scala.inline
    def setZoomIn(value: String): Self = this.set("zoomIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomIn: Self = this.set("zoomIn", js.undefined)
    
    @scala.inline
    def setZoomOut(value: String): Self = this.set("zoomOut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOut: Self = this.set("zoomOut", js.undefined)
  }
}
