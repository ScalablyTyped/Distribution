package typings.kendoUi.kendo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateOptions extends js.Object {
  var paramName: js.UndefOr[String] = js.native
  var useWithBlock: js.UndefOr[Boolean] = js.native
}

object TemplateOptions {
  @scala.inline
  def apply(): TemplateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemplateOptions]
  }
  @scala.inline
  implicit class TemplateOptionsOps[Self <: TemplateOptions] (val x: Self) extends AnyVal {
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
    def setParamName(value: String): Self = this.set("paramName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParamName: Self = this.set("paramName", js.undefined)
    @scala.inline
    def setUseWithBlock(value: Boolean): Self = this.set("useWithBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseWithBlock: Self = this.set("useWithBlock", js.undefined)
  }
  
}

