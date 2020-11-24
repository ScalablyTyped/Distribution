package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BoxColor extends js.Object {
  
  var boxColor: js.UndefOr[String] = js.native
  
  var checkedColor: js.UndefOr[String] = js.native
  
  var disabledColor: js.UndefOr[String] = js.native
  
  var labelColor: js.UndefOr[String] = js.native
  
  var labelDisabledColor: js.UndefOr[String] = js.native
  
  var requiredColor: js.UndefOr[String] = js.native
}
object BoxColor {
  
  @scala.inline
  def apply(): BoxColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxColor]
  }
  
  @scala.inline
  implicit class BoxColorOps[Self <: BoxColor] (val x: Self) extends AnyVal {
    
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
    def setBoxColor(value: String): Self = this.set("boxColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxColor: Self = this.set("boxColor", js.undefined)
    
    @scala.inline
    def setCheckedColor(value: String): Self = this.set("checkedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedColor: Self = this.set("checkedColor", js.undefined)
    
    @scala.inline
    def setDisabledColor(value: String): Self = this.set("disabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabledColor: Self = this.set("disabledColor", js.undefined)
    
    @scala.inline
    def setLabelColor(value: String): Self = this.set("labelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelColor: Self = this.set("labelColor", js.undefined)
    
    @scala.inline
    def setLabelDisabledColor(value: String): Self = this.set("labelDisabledColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDisabledColor: Self = this.set("labelDisabledColor", js.undefined)
    
    @scala.inline
    def setRequiredColor(value: String): Self = this.set("requiredColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredColor: Self = this.set("requiredColor", js.undefined)
  }
}
