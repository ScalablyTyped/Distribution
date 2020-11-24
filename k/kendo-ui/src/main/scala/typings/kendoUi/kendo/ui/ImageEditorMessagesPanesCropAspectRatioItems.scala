package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesPanesCropAspectRatioItems extends js.Object {
  
  var originalRatio: js.UndefOr[String] = js.native
}
object ImageEditorMessagesPanesCropAspectRatioItems {
  
  @scala.inline
  def apply(): ImageEditorMessagesPanesCropAspectRatioItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesCropAspectRatioItems]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesPanesCropAspectRatioItemsOps[Self <: ImageEditorMessagesPanesCropAspectRatioItems] (val x: Self) extends AnyVal {
    
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
    def setOriginalRatio(value: String): Self = this.set("originalRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalRatio: Self = this.set("originalRatio", js.undefined)
  }
}
