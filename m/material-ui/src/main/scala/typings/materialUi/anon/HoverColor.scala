package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoverColor extends js.Object {
  
  var borderColor: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
  
  var stripeColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object HoverColor {
  
  @scala.inline
  def apply(): HoverColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HoverColor]
  }
  
  @scala.inline
  implicit class HoverColorOps[Self <: HoverColor] (val x: Self) extends AnyVal {
    
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
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
    
    @scala.inline
    def setStripeColor(value: String): Self = this.set("stripeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripeColor: Self = this.set("stripeColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
