package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessagesPanes extends StObject {
  
  var crop: js.UndefOr[ImageEditorMessagesPanesCrop] = js.undefined
  
  var resize: js.UndefOr[ImageEditorMessagesPanesResize] = js.undefined
}
object ImageEditorMessagesPanes {
  
  @scala.inline
  def apply(): ImageEditorMessagesPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanes]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesPanesMutableBuilder[Self <: ImageEditorMessagesPanes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCrop(value: ImageEditorMessagesPanesCrop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    @scala.inline
    def setResize(value: ImageEditorMessagesPanesResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
