package typings.ibmMobilefirst.WL.TabBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemOptions extends js.Object {
  
  var badge: js.UndefOr[String] = js.native
  
  var image: String = js.native
  
   // for iOS
  var imageSelected: js.UndefOr[String] = js.native
}
object ItemOptions {
  
  @scala.inline
  def apply(image: String): ItemOptions = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemOptions]
  }
  
  @scala.inline
  implicit class ItemOptionsOps[Self <: ItemOptions] (val x: Self) extends AnyVal {
    
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
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadge(value: String): Self = this.set("badge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadge: Self = this.set("badge", js.undefined)
    
    @scala.inline
    def setImageSelected(value: String): Self = this.set("imageSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSelected: Self = this.set("imageSelected", js.undefined)
  }
}
