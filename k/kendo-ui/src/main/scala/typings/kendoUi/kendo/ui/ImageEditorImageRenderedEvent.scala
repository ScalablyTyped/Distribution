package typings.kendoUi.kendo.ui

import typings.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorImageRenderedEvent
  extends StObject
     with ImageEditorEvent {
  
  var canvas: js.UndefOr[HTMLElement] = js.undefined
  
  var ctx: js.UndefOr[Any] = js.undefined
  
  var image: js.UndefOr[Any] = js.undefined
}
object ImageEditorImageRenderedEvent {
  
  inline def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ImageEditor): ImageEditorImageRenderedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEditorImageRenderedEvent]
  }
  
  extension [Self <: ImageEditorImageRenderedEvent](x: Self) {
    
    inline def setCanvas(value: HTMLElement): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    inline def setCanvasUndefined: Self = StObject.set(x, "canvas", js.undefined)
    
    inline def setCtx(value: Any): Self = StObject.set(x, "ctx", value.asInstanceOf[js.Any])
    
    inline def setCtxUndefined: Self = StObject.set(x, "ctx", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
