package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorImageRenderedEvent extends ImageEditorEvent {
  
  var canvas: js.UndefOr[HTMLElement] = js.native
  
  var ctx: js.UndefOr[js.Any] = js.native
  
  var image: js.UndefOr[js.Any] = js.native
}
object ImageEditorImageRenderedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ImageEditor): ImageEditorImageRenderedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEditorImageRenderedEvent]
  }
  
  @scala.inline
  implicit class ImageEditorImageRenderedEventOps[Self <: ImageEditorImageRenderedEvent] (val x: Self) extends AnyVal {
    
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
    def setCanvas(value: HTMLElement): Self = this.set("canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanvas: Self = this.set("canvas", js.undefined)
    
    @scala.inline
    def setCtx(value: js.Any): Self = this.set("ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCtx: Self = this.set("ctx", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
