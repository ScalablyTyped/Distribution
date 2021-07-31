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
  
  @scala.inline
  def apply(): ImageEditorMessagesPanesResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesResize]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesPanesResizeMutableBuilder[Self <: ImageEditorMessagesPanesResize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPercents(value: String): Self = StObject.set(x, "percents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentsUndefined: Self = StObject.set(x, "percents", js.undefined)
    
    @scala.inline
    def setPixels(value: String): Self = StObject.set(x, "pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsUndefined: Self = StObject.set(x, "pixels", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
