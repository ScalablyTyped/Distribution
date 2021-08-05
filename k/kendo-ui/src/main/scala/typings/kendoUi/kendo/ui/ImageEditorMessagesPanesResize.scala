package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessagesPanesResize extends StObject {
  
  var percents: js.UndefOr[String] = js.undefined
  
  var pixels: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ImageEditorMessagesPanesResize {
  
  inline def apply(): ImageEditorMessagesPanesResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesResize]
  }
  
  extension [Self <: ImageEditorMessagesPanesResize](x: Self) {
    
    inline def setPercents(value: String): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
    
    inline def setPercentsUndefined: Self = StObject.set(x, "percents", js.undefined)
    
    inline def setPixels(value: String): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    inline def setPixelsUndefined: Self = StObject.set(x, "pixels", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
