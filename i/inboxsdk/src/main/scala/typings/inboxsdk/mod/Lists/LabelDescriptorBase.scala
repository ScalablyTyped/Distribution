package typings.inboxsdk.mod.Lists

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelDescriptorBase extends js.Object {
  
  var backgroundColor: js.UndefOr[String] = js.native
  
  var foregroundColor: js.UndefOr[String] = js.native
  
  var iconBackgroundColor: js.UndefOr[String] = js.native
  
  var title: String = js.native
}
object LabelDescriptorBase {
  
  @scala.inline
  def apply(title: String): LabelDescriptorBase = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelDescriptorBase]
  }
  
  @scala.inline
  implicit class LabelDescriptorBaseOps[Self <: LabelDescriptorBase] (val x: Self) extends AnyVal {
    
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
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForegroundColor: Self = this.set("foregroundColor", js.undefined)
    
    @scala.inline
    def setIconBackgroundColor(value: String): Self = this.set("iconBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconBackgroundColor: Self = this.set("iconBackgroundColor", js.undefined)
  }
}
