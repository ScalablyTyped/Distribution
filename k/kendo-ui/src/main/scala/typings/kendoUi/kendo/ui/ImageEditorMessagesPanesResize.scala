package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageEditorMessagesPanesResize extends js.Object {
  
  var percents: js.UndefOr[String] = js.native
  
  var pixels: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ImageEditorMessagesPanesResize {
  
  @scala.inline
  def apply(): ImageEditorMessagesPanesResize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEditorMessagesPanesResize]
  }
  
  @scala.inline
  implicit class ImageEditorMessagesPanesResizeOps[Self <: ImageEditorMessagesPanesResize] (val x: Self) extends AnyVal {
    
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
    def setPercents(value: String): Self = this.set("percents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercents: Self = this.set("percents", js.undefined)
    
    @scala.inline
    def setPixels(value: String): Self = this.set("pixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePixels: Self = this.set("pixels", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
