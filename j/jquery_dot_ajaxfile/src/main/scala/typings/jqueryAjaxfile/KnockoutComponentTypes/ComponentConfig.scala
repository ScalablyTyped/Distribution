package typings.jqueryAjaxfile.KnockoutComponentTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentConfig extends js.Object {
  var createViewModel: js.UndefOr[js.Any] = js.native
  var template: js.Any = js.native
}

object ComponentConfig {
  @scala.inline
  def apply(template: js.Any): ComponentConfig = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentConfig]
  }
  @scala.inline
  implicit class ComponentConfigOps[Self <: ComponentConfig] (val x: Self) extends AnyVal {
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
    def setTemplate(value: js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreateViewModel(value: js.Any): Self = this.set("createViewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreateViewModel: Self = this.set("createViewModel", js.undefined)
  }
  
}

