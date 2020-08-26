package typings.knockout.mod.components

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var require: js.UndefOr[String] = js.native
  var synchronous: js.UndefOr[Boolean] = js.native
  var template: js.UndefOr[RequireConfig | TemplateConfig | js.Any] = js.native
  var viewModel: js.UndefOr[RequireConfig | ViewModelConfig | js.Any] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def setRequire(value: String): Self = this.set("require", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequire: Self = this.set("require", js.undefined)
    @scala.inline
    def setSynchronous(value: Boolean): Self = this.set("synchronous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSynchronous: Self = this.set("synchronous", js.undefined)
    @scala.inline
    def setTemplateVarargs(value: Node*): Self = this.set("template", js.Array(value :_*))
    @scala.inline
    def setTemplate(value: RequireConfig | TemplateConfig | js.Any): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    @scala.inline
    def setViewModel(value: RequireConfig | ViewModelConfig | js.Any): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
  }
  
}

