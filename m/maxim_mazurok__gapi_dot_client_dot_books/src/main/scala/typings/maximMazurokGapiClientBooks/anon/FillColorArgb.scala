package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillColorArgb extends js.Object {
  
  var fillColorArgb: js.UndefOr[String] = js.native
  
  var imageUrl: js.UndefOr[String] = js.native
  
  var maskColorArgb: js.UndefOr[String] = js.native
  
  var moreButtonText: js.UndefOr[String] = js.native
  
  var moreButtonUrl: js.UndefOr[String] = js.native
  
  var textColorArgb: js.UndefOr[String] = js.native
}
object FillColorArgb {
  
  @scala.inline
  def apply(): FillColorArgb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillColorArgb]
  }
  
  @scala.inline
  implicit class FillColorArgbOps[Self <: FillColorArgb] (val x: Self) extends AnyVal {
    
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
    def setFillColorArgb(value: String): Self = this.set("fillColorArgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFillColorArgb: Self = this.set("fillColorArgb", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    
    @scala.inline
    def setMaskColorArgb(value: String): Self = this.set("maskColorArgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskColorArgb: Self = this.set("maskColorArgb", js.undefined)
    
    @scala.inline
    def setMoreButtonText(value: String): Self = this.set("moreButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreButtonText: Self = this.set("moreButtonText", js.undefined)
    
    @scala.inline
    def setMoreButtonUrl(value: String): Self = this.set("moreButtonUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoreButtonUrl: Self = this.set("moreButtonUrl", js.undefined)
    
    @scala.inline
    def setTextColorArgb(value: String): Self = this.set("textColorArgb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColorArgb: Self = this.set("textColorArgb", js.undefined)
  }
}
