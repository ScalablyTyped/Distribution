package typings.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlatColorPickerOptions extends js.Object {
  
  var autoupdate: js.UndefOr[Boolean] = js.native
  
  var buttons: js.UndefOr[Boolean] = js.native
  
  var change: js.UndefOr[js.Function1[/* e */ FlatColorPickerChangeEvent, Unit]] = js.native
  
  var messages: js.UndefOr[FlatColorPickerMessages] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var opacity: js.UndefOr[Boolean] = js.native
  
  var preview: js.UndefOr[Boolean] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object FlatColorPickerOptions {
  
  @scala.inline
  def apply(): FlatColorPickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlatColorPickerOptions]
  }
  
  @scala.inline
  implicit class FlatColorPickerOptionsOps[Self <: FlatColorPickerOptions] (val x: Self) extends AnyVal {
    
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
    def setAutoupdate(value: Boolean): Self = this.set("autoupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoupdate: Self = this.set("autoupdate", js.undefined)
    
    @scala.inline
    def setButtons(value: Boolean): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ FlatColorPickerChangeEvent => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setMessages(value: FlatColorPickerMessages): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOpacity(value: Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
