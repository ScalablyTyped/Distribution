package typings.inboxsdk.mod.NavMenu

import typings.inboxsdk.inboxsdkStrings.DROPDOWN_BUTTON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownButtonAccessoryDescriptor extends js.Object {
  
  var buttonBackgroundColor: String = js.native
  
  var buttonForegroundColor: String = js.native
  
  def onClick(event: DropdownButtonClickEvent): Unit = js.native
  
  var `type`: DROPDOWN_BUTTON = js.native
}
object DropdownButtonAccessoryDescriptor {
  
  @scala.inline
  def apply(
    buttonBackgroundColor: String,
    buttonForegroundColor: String,
    onClick: DropdownButtonClickEvent => Unit,
    `type`: DROPDOWN_BUTTON
  ): DropdownButtonAccessoryDescriptor = {
    val __obj = js.Dynamic.literal(buttonBackgroundColor = buttonBackgroundColor.asInstanceOf[js.Any], buttonForegroundColor = buttonForegroundColor.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonAccessoryDescriptor]
  }
  
  @scala.inline
  implicit class DropdownButtonAccessoryDescriptorOps[Self <: DropdownButtonAccessoryDescriptor] (val x: Self) extends AnyVal {
    
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
    def setButtonBackgroundColor(value: String): Self = this.set("buttonBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonForegroundColor(value: String): Self = this.set("buttonForegroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: DropdownButtonClickEvent => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setType(value: DROPDOWN_BUTTON): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
