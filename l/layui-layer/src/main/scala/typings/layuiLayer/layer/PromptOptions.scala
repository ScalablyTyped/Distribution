package typings.layuiLayer.layer

import typings.layuiLayer.layuiLayerNumbers.`0`
import typings.layuiLayer.layuiLayerNumbers.`1`
import typings.layuiLayer.layuiLayerNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromptOptions extends Options {
  /**
    * 输入框类型，支持0（文本）默认1（密码）2（多行文本）
    */
  var formType: js.UndefOr[`0` | `1` | `2`] = js.native
  /**
    * 可输入文本的最大长度
    * @default 500
    */
  var maxlength: js.UndefOr[Double] = js.native
  /**
    * 初始时的值
    * @default ''
    */
  var value: js.UndefOr[String] = js.native
}

object PromptOptions {
  @scala.inline
  def apply(): PromptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PromptOptions]
  }
  @scala.inline
  implicit class PromptOptionsOps[Self <: PromptOptions] (val x: Self) extends AnyVal {
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
    def setFormType(value: `0` | `1` | `2`): Self = this.set("formType", value.asInstanceOf[js.Any])
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

