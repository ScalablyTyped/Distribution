package typings.jqueryTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupSetting extends js.Object {
  
  var key: String = js.native
  
  var template: String | (js.Function1[/* item */ js.Any, String]) = js.native
}
object GroupSetting {
  
  @scala.inline
  def apply(key: String, template: String | (js.Function1[/* item */ js.Any, String])): GroupSetting = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSetting]
  }
  
  @scala.inline
  implicit class GroupSettingOps[Self <: GroupSetting] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction1(value: /* item */ js.Any => String): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("template", value.asInstanceOf[js.Any])
  }
}
