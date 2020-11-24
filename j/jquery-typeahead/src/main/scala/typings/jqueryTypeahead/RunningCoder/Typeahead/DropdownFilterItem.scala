package typings.jqueryTypeahead.RunningCoder.Typeahead

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownFilterItem extends js.Object {
  
  var all: String = js.native
  
  var key: String = js.native
  
  var template: String | (js.Function1[/* item */ js.Any, String]) = js.native
  
  var value: String = js.native
}
object DropdownFilterItem {
  
  @scala.inline
  def apply(
    all: String,
    key: String,
    template: String | (js.Function1[/* item */ js.Any, String]),
    value: String
  ): DropdownFilterItem = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownFilterItem]
  }
  
  @scala.inline
  implicit class DropdownFilterItemOps[Self <: DropdownFilterItem] (val x: Self) extends AnyVal {
    
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
    def setAll(value: String): Self = this.set("all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateFunction1(value: /* item */ js.Any => String): Self = this.set("template", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTemplate(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
