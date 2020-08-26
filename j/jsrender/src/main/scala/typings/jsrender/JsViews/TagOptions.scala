package typings.jsrender.JsViews

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagOptions extends TagOptionProps {
  /* Tag options hash */
  var template: js.UndefOr[TemplateSetter] = js.native
}

object TagOptions {
  @scala.inline
  def apply(): TagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagOptions]
  }
  @scala.inline
  implicit class TagOptionsOps[Self <: TagOptions] (val x: Self) extends AnyVal {
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
    def setTemplate(value: TemplateSetter): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
  
}

