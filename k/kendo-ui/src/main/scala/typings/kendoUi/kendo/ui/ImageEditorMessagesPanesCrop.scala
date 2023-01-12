package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEditorMessagesPanesCrop extends StObject {
  
  var aspectRatio: js.UndefOr[String] = js.undefined
  
  var aspectRatioItems: js.UndefOr[ImageEditorMessagesPanesCropAspectRatioItems] = js.undefined
  
  var landscape: js.UndefOr[String] = js.undefined
  
  var orientation: js.UndefOr[String] = js.undefined
  
  var portrait: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object ImageEditorMessagesPanesCrop {
  
  inline def apply(): ImageEditorMessagesPanesCrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesCrop]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageEditorMessagesPanesCrop] (val x: Self) extends AnyVal {
    
    inline def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioItems(value: ImageEditorMessagesPanesCropAspectRatioItems): Self = StObject.set(x, "aspectRatioItems", value.asInstanceOf[js.Any])
    
    inline def setAspectRatioItemsUndefined: Self = StObject.set(x, "aspectRatioItems", js.undefined)
    
    inline def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    inline def setLandscape(value: String): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    inline def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    inline def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
    
    inline def setPortraitUndefined: Self = StObject.set(x, "portrait", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
