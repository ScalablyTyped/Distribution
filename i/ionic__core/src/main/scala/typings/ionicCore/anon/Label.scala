package typings.ionicCore.anon

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Label extends js.Object {
  
  var label: Element | Null = js.native
  
  var labelId: String = js.native
  
  var labelText: js.UndefOr[String | Null] = js.native
}
object Label {
  
  @scala.inline
  def apply(labelId: String): Label = {
    val __obj = js.Dynamic.literal(labelId = labelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
    
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
    def setLabelId(value: String): Self = this.set("labelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: Element): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setLabelText(value: String): Self = this.set("labelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelText: Self = this.set("labelText", js.undefined)
    
    @scala.inline
    def setLabelTextNull: Self = this.set("labelText", null)
  }
}
