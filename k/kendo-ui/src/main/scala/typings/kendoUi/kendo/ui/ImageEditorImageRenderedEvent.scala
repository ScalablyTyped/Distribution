package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
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
  implicit class ImageEditorImageRenderedEventMutableBuilder[Self <: ImageEditorImageRenderedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: HTMLElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    @scala.inline
    def setCtx(value: js.Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
