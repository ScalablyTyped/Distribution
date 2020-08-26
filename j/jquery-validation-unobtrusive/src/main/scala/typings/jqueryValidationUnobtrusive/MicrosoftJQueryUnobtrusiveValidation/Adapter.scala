package typings.jqueryValidationUnobtrusive.MicrosoftJQueryUnobtrusiveValidation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Adapter extends js.Object {
  var adapt: js.Function = js.native
  var name: String = js.native
  var params: js.Array[String] = js.native
}

object Adapter {
  @scala.inline
  def apply(adapt: js.Function, name: String, params: js.Array[String]): Adapter = {
    val __obj = js.Dynamic.literal(adapt = adapt.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adapter]
  }
  @scala.inline
  implicit class AdapterOps[Self <: Adapter] (val x: Self) extends AnyVal {
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
    def setAdapt(value: js.Function): Self = this.set("adapt", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
  }
  
}

