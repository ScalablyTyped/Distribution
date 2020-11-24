package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisabledTextColor extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var borderColor: js.UndefOr[String] = js.native
  
  var disabledTextColor: js.UndefOr[String] = js.native
  
  var errorColor: js.UndefOr[String] = js.native
  
  var floatingLabelColor: js.UndefOr[String] = js.native
  
  var focusColor: js.UndefOr[String] = js.native
  
  var hintColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object DisabledTextColor {
  
  @scala.inline
  def apply(): DisabledTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisabledTextColor]
  }
  
  @scala.inline
  implicit class DisabledTextColorOps[Self <: DisabledTextColor] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBorderColor(value: String): Self = this.set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorderColor: Self = this.set("borderColor", js.undefined)
    
    @scala.inline
    def setDisabledTextColor(value: String): Self = this.set("disabledTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledTextColor: Self = this.set("disabledTextColor", js.undefined)
    
    @scala.inline
    def setErrorColor(value: String): Self = this.set("errorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorColor: Self = this.set("errorColor", js.undefined)
    
    @scala.inline
    def setFloatingLabelColor(value: String): Self = this.set("floatingLabelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingLabelColor: Self = this.set("floatingLabelColor", js.undefined)
    
    @scala.inline
    def setFocusColor(value: String): Self = this.set("focusColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusColor: Self = this.set("focusColor", js.undefined)
    
    @scala.inline
    def setHintColor(value: String): Self = this.set("hintColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintColor: Self = this.set("hintColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
