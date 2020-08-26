package typings.layuiSrc.layui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerPromptOptions extends LayerOptions {
  @JSName("area")
  var area_LayerPromptOptions: js.UndefOr[js.Array[String]] = js.native
  var formType: js.UndefOr[Double] = js.native
  var maxlength: js.UndefOr[Double] = js.native
  var value: js.UndefOr[String] = js.native
}

object LayerPromptOptions {
  @scala.inline
  def apply(): LayerPromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerPromptOptions]
  }
  @scala.inline
  implicit class LayerPromptOptionsOps[Self <: LayerPromptOptions] (val x: Self) extends AnyVal {
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
    def setAreaVarargs(value: String*): Self = this.set("area", js.Array(value :_*))
    @scala.inline
    def setArea(value: js.Array[String]): Self = this.set("area", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArea: Self = this.set("area", js.undefined)
    @scala.inline
    def setFormType(value: Double): Self = this.set("formType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormType: Self = this.set("formType", js.undefined)
    @scala.inline
    def setMaxlength(value: Double): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

