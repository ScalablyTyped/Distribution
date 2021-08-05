package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessagesPanes extends StObject {
  
  var crop: js.UndefOr[ImageEditorMessagesPanesCrop] = js.undefined
  
  var resize: js.UndefOr[ImageEditorMessagesPanesResize] = js.undefined
}
object ImageEditorMessagesPanes {
  
  inline def apply(): ImageEditorMessagesPanes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanes]
  }
  
  extension [Self <: ImageEditorMessagesPanes](x: Self) {
    
    inline def setCrop(value: ImageEditorMessagesPanesCrop): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setResize(value: ImageEditorMessagesPanesResize): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
  }
}
