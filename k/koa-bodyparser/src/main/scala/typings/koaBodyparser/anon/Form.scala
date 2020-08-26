package typings.koaBodyparser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Form extends js.Object {
  var form: js.UndefOr[js.Array[String]] = js.native
  var json: js.UndefOr[js.Array[String]] = js.native
  var text: js.UndefOr[js.Array[String]] = js.native
}

object Form {
  @scala.inline
  def apply(): Form = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Form]
  }
  @scala.inline
  implicit class FormOps[Self <: Form] (val x: Self) extends AnyVal {
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
    def setFormVarargs(value: String*): Self = this.set("form", js.Array(value :_*))
    @scala.inline
    def setForm(value: js.Array[String]): Self = this.set("form", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForm: Self = this.set("form", js.undefined)
    @scala.inline
    def setJsonVarargs(value: String*): Self = this.set("json", js.Array(value :_*))
    @scala.inline
    def setJson(value: js.Array[String]): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setTextVarargs(value: String*): Self = this.set("text", js.Array(value :_*))
    @scala.inline
    def setText(value: js.Array[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

