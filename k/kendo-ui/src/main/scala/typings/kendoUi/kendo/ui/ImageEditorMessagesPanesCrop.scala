package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesPanesCrop extends js.Object {
  
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
  implicit class ImageEditorMessagesPanesCropOps[Self <: ImageEditorMessagesPanesCrop] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: String): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setAspectRatioItems(value: ImageEditorMessagesPanesCropAspectRatioItems): Self = this.set("aspectRatioItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatioItems: Self = this.set("aspectRatioItems", js.undefined)
    
    @scala.inline
    def setLandscape(value: String): Self = this.set("landscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLandscape: Self = this.set("landscape", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setPortrait(value: String): Self = this.set("portrait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortrait: Self = this.set("portrait", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
