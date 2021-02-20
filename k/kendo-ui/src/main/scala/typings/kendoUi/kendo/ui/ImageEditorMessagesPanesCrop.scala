package typings.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesPanesCrop extends StObject {
  
  var aspectRatio: js.UndefOr[String] = js.native
  
  var aspectRatioItems: js.UndefOr[ImageEditorMessagesPanesCropAspectRatioItems] = js.native
  
  var landscape: js.UndefOr[String] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var portrait: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ImageEditorMessagesPanesCrop {
  
  @scala.inline
  def apply(): ImageEditorMessagesPanesCrop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesCrop]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesPanesCropMutableBuilder[Self <: ImageEditorMessagesPanesCrop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAspectRatio(value: String): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioItems(value: ImageEditorMessagesPanesCropAspectRatioItems): Self = StObject.set(x, "aspectRatioItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAspectRatioItemsUndefined: Self = StObject.set(x, "aspectRatioItems", js.undefined)
    
    @scala.inline
    def setAspectRatioUndefined: Self = StObject.set(x, "aspectRatio", js.undefined)
    
    @scala.inline
    def setLandscape(value: String): Self = StObject.set(x, "landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLandscapeUndefined: Self = StObject.set(x, "landscape", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    @scala.inline
    def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortraitUndefined: Self = StObject.set(x, "portrait", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
