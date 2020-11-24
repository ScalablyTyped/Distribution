package typings.grommet.checkBoxGroupMod

import typings.grommet.checkBoxMod.CheckBoxProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnChangeEvent extends js.Object {
  
  var option: String | CheckBoxProps = js.native
  
  var value: String = js.native
}
object OnChangeEvent {
  
  @scala.inline
  def apply(option: String | CheckBoxProps, value: String): OnChangeEvent = {
    val __obj = js.Dynamic.literal(option = option.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChangeEvent]
  }
  
  @scala.inline
  implicit class OnChangeEventOps[Self <: OnChangeEvent] (val x: Self) extends AnyVal {
    
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
    def setOption(value: String | CheckBoxProps): Self = this.set("option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
