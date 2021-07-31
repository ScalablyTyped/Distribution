package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorImageLoadedEvent
  extends StObject
     with ImageEditorEvent {
  
  var image: js.UndefOr[js.Any] = js.undefined
}
object ImageEditorImageLoadedEvent {
  
  @scala.inline
  def apply(isDefaultPrevented: () => Boolean, preventDefault: js.Function, sender: ImageEditor): ImageEditorImageLoadedEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = js.Any.fromFunction0(isDefaultPrevented), preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageEditorImageLoadedEvent]
  }
  
  @scala.inline
  implicit class ImageEditorImageLoadedEventMutableBuilder[Self <: ImageEditorImageLoadedEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImage(value: js.Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
  }
}
