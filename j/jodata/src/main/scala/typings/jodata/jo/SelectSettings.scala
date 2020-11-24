package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectSettings extends ISettings {
  
  var DefaultSelect: js.Array[String] = js.native
  
  var Select: js.Array[String] = js.native
}
object SelectSettings {
  
  @scala.inline
  def apply(DefaultSelect: js.Array[String], Select: js.Array[String], isSet: () => Boolean, reset: () => Unit): SelectSettings = {
    val __obj = js.Dynamic.literal(DefaultSelect = DefaultSelect.asInstanceOf[js.Any], Select = Select.asInstanceOf[js.Any], isSet = js.Any.fromFunction0(isSet), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[SelectSettings]
  }
  
  @scala.inline
  implicit class SelectSettingsOps[Self <: SelectSettings] (val x: Self) extends AnyVal {
    
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
    def setDefaultSelectVarargs(value: String*): Self = this.set("DefaultSelect", js.Array(value :_*))
    
    @scala.inline
    def setDefaultSelect(value: js.Array[String]): Self = this.set("DefaultSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectVarargs(value: String*): Self = this.set("Select", js.Array(value :_*))
    
    @scala.inline
    def setSelect(value: js.Array[String]): Self = this.set("Select", value.asInstanceOf[js.Any])
  }
}
