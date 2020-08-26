package typings.jsreportCore.mod

import typings.jsreportCore.anon.PartialTemplate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Request extends js.Object {
  var data: js.Any = js.native
  var options: js.Object = js.native
  var template: PartialTemplate = js.native
}

object Request {
  @scala.inline
  def apply(data: js.Any, options: js.Object, template: PartialTemplate): Request = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  @scala.inline
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: PartialTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

