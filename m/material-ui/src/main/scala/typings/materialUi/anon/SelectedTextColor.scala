package typings.materialUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectedTextColor extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var selectedTextColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[String] = js.native
}
object SelectedTextColor {
  
  @scala.inline
  def apply(): SelectedTextColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedTextColor]
  }
  
  @scala.inline
  implicit class SelectedTextColorOps[Self <: SelectedTextColor] (val x: Self) extends AnyVal {
    
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
    def setSelectedTextColor(value: String): Self = this.set("selectedTextColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedTextColor: Self = this.set("selectedTextColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: String): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
  }
}
